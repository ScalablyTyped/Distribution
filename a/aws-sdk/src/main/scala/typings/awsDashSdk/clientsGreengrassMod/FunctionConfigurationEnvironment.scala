package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionConfigurationEnvironment extends js.Object {
  /**
    * If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda function needs to read device information from /sys. This setting applies only when you run the Lambda function in a Greengrass container.
    */
  var AccessSysfs: js.UndefOr[__boolean] = js.undefined
  /**
    * Configuration related to executing the Lambda function
    */
  var Execution: js.UndefOr[FunctionExecutionConfig] = js.undefined
  /**
    * A list of the resources, with their permissions, to which the Lambda function will be granted access. A Lambda function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda function in a Greengrass container.
    */
  var ResourceAccessPolicies: js.UndefOr[__listOfResourceAccessPolicy] = js.undefined
  /**
    * Environment variables for the Lambda function's configuration.
    */
  var Variables: js.UndefOr[__mapOf__string] = js.undefined
}

object FunctionConfigurationEnvironment {
  @scala.inline
  def apply(
    AccessSysfs: js.UndefOr[__boolean] = js.undefined,
    Execution: FunctionExecutionConfig = null,
    ResourceAccessPolicies: __listOfResourceAccessPolicy = null,
    Variables: __mapOf__string = null
  ): FunctionConfigurationEnvironment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AccessSysfs)) __obj.updateDynamic("AccessSysfs")(AccessSysfs)
    if (Execution != null) __obj.updateDynamic("Execution")(Execution)
    if (ResourceAccessPolicies != null) __obj.updateDynamic("ResourceAccessPolicies")(ResourceAccessPolicies)
    if (Variables != null) __obj.updateDynamic("Variables")(Variables)
    __obj.asInstanceOf[FunctionConfigurationEnvironment]
  }
}

