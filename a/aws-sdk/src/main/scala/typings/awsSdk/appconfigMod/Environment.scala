package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.native
  /**
    * The description of the environment.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * The environment ID.
    */
  var Id: js.UndefOr[typings.awsSdk.appconfigMod.Id] = js.native
  /**
    * Amazon CloudWatch alarms monitored during the deployment.
    */
  var Monitors: js.UndefOr[MonitorList] = js.native
  /**
    * The name of the environment.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.native
  /**
    * The state of the environment. An environment can be in one of the following states: READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK, or ROLLED_BACK 
    */
  var State: js.UndefOr[EnvironmentState] = js.native
}

object Environment {
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
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
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
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
    @scala.inline
    def setState(value: EnvironmentState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

