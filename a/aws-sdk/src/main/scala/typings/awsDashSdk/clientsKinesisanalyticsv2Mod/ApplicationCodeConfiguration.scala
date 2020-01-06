package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCodeConfiguration extends js.Object {
  /**
    * The location and type of the application code.
    */
  var CodeContent: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CodeContent] = js.native
  /**
    * Specifies whether the code content is in text or zip format.
    */
  var CodeContentType: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.CodeContentType = js.native
}

object ApplicationCodeConfiguration {
  @scala.inline
  def apply(CodeContentType: CodeContentType, CodeContent: CodeContent = null): ApplicationCodeConfiguration = {
    val __obj = js.Dynamic.literal(CodeContentType = CodeContentType.asInstanceOf[js.Any])
    if (CodeContent != null) __obj.updateDynamic("CodeContent")(CodeContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCodeConfiguration]
  }
}

