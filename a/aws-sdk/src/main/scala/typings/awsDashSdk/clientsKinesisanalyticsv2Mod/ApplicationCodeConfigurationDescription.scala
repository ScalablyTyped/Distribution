package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCodeConfigurationDescription extends js.Object {
  /**
    * Describes details about the location and format of the application code.
    */
  var CodeContentDescription: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CodeContentDescription] = js.native
  /**
    * Specifies whether the code content is in text or zip format.
    */
  var CodeContentType: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CodeContentType = js.native
}

object ApplicationCodeConfigurationDescription {
  @scala.inline
  def apply(CodeContentType: CodeContentType, CodeContentDescription: CodeContentDescription = null): ApplicationCodeConfigurationDescription = {
    val __obj = js.Dynamic.literal(CodeContentType = CodeContentType.asInstanceOf[js.Any])
    if (CodeContentDescription != null) __obj.updateDynamic("CodeContentDescription")(CodeContentDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCodeConfigurationDescription]
  }
}

