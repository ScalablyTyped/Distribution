package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageQuality extends js.Object {
  /**
    * Value representing brightness of the face. The service returns a value between 0 and 100 (inclusive). A higher value indicates a brighter face image.
    */
  var Brightness: js.UndefOr[Float] = js.undefined
  /**
    * Value representing sharpness of the face. The service returns a value between 0 and 100 (inclusive). A higher value indicates a sharper face image.
    */
  var Sharpness: js.UndefOr[Float] = js.undefined
}

object ImageQuality {
  @scala.inline
  def apply(Brightness: js.UndefOr[Float] = js.undefined, Sharpness: js.UndefOr[Float] = js.undefined): ImageQuality = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Brightness)) __obj.updateDynamic("Brightness")(Brightness)
    if (!js.isUndefined(Sharpness)) __obj.updateDynamic("Sharpness")(Sharpness)
    __obj.asInstanceOf[ImageQuality]
  }
}

