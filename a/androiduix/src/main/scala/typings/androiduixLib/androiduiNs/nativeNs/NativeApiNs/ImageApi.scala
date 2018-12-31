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

