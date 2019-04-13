package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveEnvironmentInfoMessage extends js.Object {
  /**
    * The ID of the data's environment. If no such environment is found, returns an InvalidParameterValue error. Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error.
    */
  var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
  /**
    * The name of the data's environment.  If no such environment is found, returns an InvalidParameterValue error.   Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  /**
    * The type of information to retrieve.
    */
  var InfoType: EnvironmentInfoType
}

object RetrieveEnvironmentInfoMessage {
  @scala.inline
  def apply(
    InfoType: EnvironmentInfoType,
    EnvironmentId: EnvironmentId = null,
    EnvironmentName: EnvironmentName = null
  ): RetrieveEnvironmentInfoMessage = {
    val __obj = js.Dynamic.literal(InfoType = InfoType.asInstanceOf[js.Any])
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    __obj.asInstanceOf[RetrieveEnvironmentInfoMessage]
  }
}

