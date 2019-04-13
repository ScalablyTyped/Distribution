package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCodeConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the code content type.
    */
  var CodeContentTypeUpdate: js.UndefOr[CodeContentType] = js.undefined
  /**
    * Describes updates to the code content of an application.
    */
  var CodeContentUpdate: js.UndefOr[CodeContentUpdate] = js.undefined
}

object ApplicationCodeConfigurationUpdate {
  @scala.inline
  def apply(CodeContentTypeUpdate: CodeContentType = null, CodeContentUpdate: CodeContentUpdate = null): ApplicationCodeConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (CodeContentTypeUpdate != null) __obj.updateDynamic("CodeContentTypeUpdate")(CodeContentTypeUpdate.asInstanceOf[js.Any])
    if (CodeContentUpdate != null) __obj.updateDynamic("CodeContentUpdate")(CodeContentUpdate)
    __obj.asInstanceOf[ApplicationCodeConfigurationUpdate]
  }
}

