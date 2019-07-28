package typings.androiduix.androiduiNs.nativeNs.NativeApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageApi extends js.Object {
  def createImage(imageId: Double): Unit
  def getPixels(imageId: Double, callbackIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Unit
  def loadImage(imageId: Double, src: String): Unit
  def recycleImage(imageId: Double): Unit
}

object ImageApi {
  @scala.inline
  def apply(
    createImage: Double => Unit,
    getPixels: (Double, Double, Double, Double, Double, Double) => Unit,
    loadImage: (Double, String) => Unit,
    recycleImage: Double => Unit
  ): ImageApi = {
    val __obj = js.Dynamic.literal(createImage = js.Any.fromFunction1(createImage), getPixels = js.Any.fromFunction6(getPixels), loadImage = js.Any.fromFunction2(loadImage), recycleImage = js.Any.fromFunction1(recycleImage))
  
    __obj.asInstanceOf[ImageApi]
  }
}

