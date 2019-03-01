package typings
package androiduixLib.androiduiNs.nativeNs.NativeApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageApi extends js.Object {
  def createImage(imageId: scala.Double): scala.Unit
  def getPixels(
    imageId: scala.Double,
    callbackIndex: scala.Double,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double
  ): scala.Unit
  def loadImage(imageId: scala.Double, src: java.lang.String): scala.Unit
  def recycleImage(imageId: scala.Double): scala.Unit
}

object ImageApi {
  @scala.inline
  def apply(
    createImage: js.Function1[scala.Double, scala.Unit],
    getPixels: js.Function6[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    loadImage: js.Function2[scala.Double, java.lang.String, scala.Unit],
    recycleImage: js.Function1[scala.Double, scala.Unit]
  ): ImageApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createImage")(createImage)
    __obj.updateDynamic("getPixels")(getPixels)
    __obj.updateDynamic("loadImage")(loadImage)
    __obj.updateDynamic("recycleImage")(recycleImage)
    __obj.asInstanceOf[ImageApi]
  }
}

