package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebuildEnvironmentMessage extends js.Object {
  /**
    * The ID of the environment to rebuild.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  /**
    * The name of the environment to rebuild.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
}

object RebuildEnvironmentMessage {
  @scala.inline
  def apply(EnvironmentId: EnvironmentId = null, EnvironmentName: EnvironmentName = null): RebuildEnvironmentMessage = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    __obj.asInstanceOf[RebuildEnvironmentMessage]
  }
}

