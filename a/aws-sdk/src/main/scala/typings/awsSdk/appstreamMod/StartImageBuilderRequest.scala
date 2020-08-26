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
  def apply(Name: String): StartImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImageBuilderRequest]
  }
  @scala.inline
  implicit class StartImageBuilderRequestOps[Self <: StartImageBuilderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppstreamAgentVersion(value: AppstreamAgentVersion): Self = this.set("AppstreamAgentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppstreamAgentVersion: Self = this.set("AppstreamAgentVersion", js.undefined)
  }
  
}

