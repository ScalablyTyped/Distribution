package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLabel extends js.Object {
  /**
    * The confidence that the model has in the detection of the custom label. The range is 0-100. A higher value indicates a higher confidence.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The location of the detected object on the image that corresponds to the custom label. Includes an axis aligned coarse bounding box surrounding the object and a finer grain polygon for more accurate spatial information.
    */
  var Geometry: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Geometry] = js.native
  /**
    * The name of the custom label.
    */
  var Name: js.UndefOr[String] = js.native
}

object CustomLabel {
  @scala.inline
  def apply(Confidence: Int | Double = null, Geometry: Geometry = null, Name: String = null): CustomLabel = {
    val __obj = js.Dynamic.literal()
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (Geometry != null) __obj.updateDynamic("Geometry")(Geometry.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLabel]
  }
}

