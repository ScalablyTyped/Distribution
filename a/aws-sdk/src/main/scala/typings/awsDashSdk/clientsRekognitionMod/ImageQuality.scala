package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageQuality extends js.Object {
  /**
    * Value representing brightness of the face. The service returns a value between 0 and 100 (inclusive). A higher value indicates a brighter face image.
    */
  var Brightness: js.UndefOr[Float] = js.native
  /**
    * Value representing sharpness of the face. The service returns a value between 0 and 100 (inclusive). A higher value indicates a sharper face image.
    */
  var Sharpness: js.UndefOr[Float] = js.native
}

object ImageQuality {
  @scala.inline
  def apply(Brightness: Int | Double = null, Sharpness: Int | Double = null): ImageQuality = {
    val __obj = js.Dynamic.literal()
    if (Brightness != null) __obj.updateDynamic("Brightness")(Brightness.asInstanceOf[js.Any])
    if (Sharpness != null) __obj.updateDynamic("Sharpness")(Sharpness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageQuality]
  }
}

