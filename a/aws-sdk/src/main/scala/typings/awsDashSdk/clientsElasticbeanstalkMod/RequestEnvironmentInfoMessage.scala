package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestEnvironmentInfoMessage extends js.Object {
  /**
    * The ID of the environment of the requested data. If no such environment is found, RequestEnvironmentInfo returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  /**
    * The name of the environment of the requested data. If no such environment is found, RequestEnvironmentInfo returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  /**
    * The type of information to request.
    */
  var InfoType: EnvironmentInfoType
}

object RequestEnvironmentInfoMessage {
  @scala.inline
  def apply(
    InfoType: EnvironmentInfoType,
    EnvironmentId: EnvironmentId = null,
    EnvironmentName: EnvironmentName = null
  ): RequestEnvironmentInfoMessage = {
    val __obj = js.Dynamic.literal(InfoType = InfoType.asInstanceOf[js.Any])
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    __obj.asInstanceOf[RequestEnvironmentInfoMessage]
  }
}

