package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /**
    * Level of confidence.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * If Label represents an object, Instances contains the bounding boxes for each instance of the detected object. Bounding boxes are returned for common object labels such as people, cars, furniture, apparel or pets.
    */
  var Instances: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Instances] = js.undefined
  /**
    * The name (label) of the object or scene.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The parent labels for a label. The response includes all ancestor labels.
    */
  var Parents: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Parents] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    Confidence: js.UndefOr[Percent] = js.undefined,
    Instances: Instances = null,
    Name: String = null,
    Parents: Parents = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence)
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Parents != null) __obj.updateDynamic("Parents")(Parents)
    __obj.asInstanceOf[Label]
  }
}

