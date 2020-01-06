package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSessionRequest extends js.Object {
  /**
    * The name of the SSM document to define the parameters and plugin settings for the session. For example, SSM-SessionManagerRunShell. If no document name is provided, a shell to the instance is launched by default.
    */
  var DocumentName: js.UndefOr[DocumentARN] = js.native
  /**
    * Reserved for future use.
    */
  var Parameters: js.UndefOr[SessionManagerParameters] = js.native
  /**
    * The instance to connect to for the session.
    */
  var Target: SessionTarget = js.native
}

object StartSessionRequest {
  @scala.inline
  def apply(
    Target: SessionTarget,
    DocumentName: DocumentARN = null,
    Parameters: SessionManagerParameters = null
  ): StartSessionRequest = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSessionRequest]
  }
}

