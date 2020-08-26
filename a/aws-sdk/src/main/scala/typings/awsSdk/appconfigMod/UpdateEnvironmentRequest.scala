package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnvironmentRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * A description of the environment.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * The environment ID.
    */
  var EnvironmentId: Id = js.native
  /**
    * Amazon CloudWatch alarms to monitor during the deployment process.
    */
  var Monitors: js.UndefOr[MonitorList] = js.native
  /**
    * The name of the environment.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.native
}

object UpdateEnvironmentRequest {
  @scala.inline
  def apply(ApplicationId: Id, EnvironmentId: Id): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
  @scala.inline
  implicit class UpdateEnvironmentRequestOps[Self <: UpdateEnvironmentRequest] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: Id): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentId(value: Id): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setMonitorsVarargs(value: Monitor*): Self = this.set("Monitors", js.Array(value :_*))
    @scala.inline
    def setMonitors(value: MonitorList): Self = this.set("Monitors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitors: Self = this.set("Monitors", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

