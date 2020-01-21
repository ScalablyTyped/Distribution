package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImageBuilderRequest extends js.Object {
  /**
    * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsSdk.appstreamMod.AppstreamAgentVersion] = js.native
  /**
    * The name of the image builder.
    */
  var Name: String = js.native
}

object StartImageBuilderRequest {
  @scala.inline
  def apply(Name: String, AppstreamAgentVersion: AppstreamAgentVersion = null): StartImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (AppstreamAgentVersion != null) __obj.updateDynamic("AppstreamAgentVersion")(AppstreamAgentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImageBuilderRequest]
  }
}

