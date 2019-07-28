package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveEnvironmentInfoResultMessage extends js.Object {
  /**
    *  The EnvironmentInfoDescription of the environment. 
    */
  var EnvironmentInfo: js.UndefOr[EnvironmentInfoDescriptionList] = js.undefined
}

object RetrieveEnvironmentInfoResultMessage {
  @scala.inline
  def apply(EnvironmentInfo: EnvironmentInfoDescriptionList = null): RetrieveEnvironmentInfoResultMessage = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentInfo != null) __obj.updateDynamic("EnvironmentInfo")(EnvironmentInfo)
    __obj.asInstanceOf[RetrieveEnvironmentInfoResultMessage]
  }
}

