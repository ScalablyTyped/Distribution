package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartImageBuilderRequest extends js.Object {
  /**
    * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.AppstreamAgentVersion] = js.undefined
  /**
    * The name of the image builder.
    */
  var Name: String
}

object StartImageBuilderRequest {
  @scala.inline
  def apply(Name: String, AppstreamAgentVersion: AppstreamAgentVersion = null): StartImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (AppstreamAgentVersion != null) __obj.updateDynamic("AppstreamAgentVersion")(AppstreamAgentVersion)
    __obj.asInstanceOf[StartImageBuilderRequest]
  }
}

