package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHumanTaskUiRequest extends js.Object {
  /**
    * The name of the user interface you are creating.
    */
  var HumanTaskUiName: typings.awsDashSdk.clientsSagemakerMod.HumanTaskUiName = js.native
  /**
    * An array of key-value pairs that contain metadata to help you categorize and organize a human review workflow user interface. Each tag consists of a key and a value, both of which you define.
    */
  var Tags: js.UndefOr[TagList] = js.native
  var UiTemplate: typings.awsDashSdk.clientsSagemakerMod.UiTemplate = js.native
}

object CreateHumanTaskUiRequest {
  @scala.inline
  def apply(HumanTaskUiName: HumanTaskUiName, UiTemplate: UiTemplate, Tags: TagList = null): CreateHumanTaskUiRequest = {
    val __obj = js.Dynamic.literal(HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any], UiTemplate = UiTemplate.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHumanTaskUiRequest]
  }
}

