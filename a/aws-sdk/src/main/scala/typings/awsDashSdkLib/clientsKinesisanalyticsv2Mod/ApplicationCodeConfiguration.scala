package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCodeConfiguration extends js.Object {
  /**
    * The location and type of the application code.
    */
  var CodeContent: js.UndefOr[CodeContent] = js.undefined
  /**
    * Specifies whether the code content is in text or zip format.
    */
  var CodeContentType: awsDashSdkLib.clientsKinesisanalyticsv2Mod.CodeContentType
}

object ApplicationCodeConfiguration {
  @scala.inline
  def apply(CodeContentType: CodeContentType, CodeContent: CodeContent = null): ApplicationCodeConfiguration = {
    val __obj = js.Dynamic.literal(CodeContentType = CodeContentType.asInstanceOf[js.Any])
    if (CodeContent != null) __obj.updateDynamic("CodeContent")(CodeContent)
    __obj.asInstanceOf[ApplicationCodeConfiguration]
  }
}

