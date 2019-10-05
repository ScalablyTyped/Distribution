package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateEnvironmentMessage extends js.Object {
  /**
    * The ID of the environment to terminate.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  /**
    * The name of the environment to terminate.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  /**
    * Terminates the target environment even if another environment in the same group is dependent on it.
    */
  var ForceTerminate: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ForceTerminate] = js.undefined
  /**
    * Indicates whether the associated AWS resources should shut down when the environment is terminated:    true: The specified environment as well as the associated AWS resources, such as Auto Scaling group and LoadBalancer, are terminated.    false: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS resources continue to operate.    For more information, see the  AWS Elastic Beanstalk User Guide.    Default: true   Valid Values: true | false 
    */
  var TerminateResources: js.UndefOr[TerminateEnvironmentResources] = js.undefined
}

object TerminateEnvironmentMessage {
  @scala.inline
  def apply(
    EnvironmentId: EnvironmentId = null,
    EnvironmentName: EnvironmentName = null,
    ForceTerminate: js.UndefOr[Boolean] = js.undefined,
    TerminateResources: js.UndefOr[Boolean] = js.undefined
  ): TerminateEnvironmentMessage = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (!js.isUndefined(ForceTerminate)) __obj.updateDynamic("ForceTerminate")(ForceTerminate)
    if (!js.isUndefined(TerminateResources)) __obj.updateDynamic("TerminateResources")(TerminateResources)
    __obj.asInstanceOf[TerminateEnvironmentMessage]
  }
}

