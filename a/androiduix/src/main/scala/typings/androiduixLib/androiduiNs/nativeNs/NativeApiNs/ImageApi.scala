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
    createImage: scala.Double => scala.Unit,
    getPixels: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    loadImage: (scala.Double, java.lang.String) => scala.Unit,
    recycleImage: scala.Double => scala.Unit
  ): ImageApi = {
    val __obj = js.Dynamic.literal(createImage = js.Any.fromFunction1(createImage), getPixels = js.Any.fromFunction6(getPixels), loadImage = js.Any.fromFunction2(loadImage), recycleImage = js.Any.fromFunction1(recycleImage))
  
    __obj.asInstanceOf[ImageApi]
  }
}

