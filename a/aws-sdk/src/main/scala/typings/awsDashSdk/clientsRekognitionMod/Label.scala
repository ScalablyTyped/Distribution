package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  /**
    * Level of confidence.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * If Label represents an object, Instances contains the bounding boxes for each instance of the detected object. Bounding boxes are returned for common object labels such as people, cars, furniture, apparel or pets.
    */
  var Instances: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Instances] = js.native
  /**
    * The name (label) of the object or scene.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The parent labels for a label. The response includes all ancestor labels.
    */
  var Parents: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Parents] = js.native
}

object Label {
  @scala.inline
  def apply(
    Confidence: Int | Double = null,
    Instances: Instances = null,
    Name: String = null,
    Parents: Parents = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Parents != null) __obj.updateDynamic("Parents")(Parents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

