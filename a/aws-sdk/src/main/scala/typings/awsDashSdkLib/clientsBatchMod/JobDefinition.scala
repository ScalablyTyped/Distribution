package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDefinition extends js.Object {
  /**
    * An object with various properties specific to container-based jobs. 
    */
  var containerProperties: js.UndefOr[ContainerProperties] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the job definition. 
    */
  var jobDefinitionArn: String
  /**
    * The name of the job definition. 
    */
  var jobDefinitionName: String
  /**
    * An object with various properties specific to multi-node parallel jobs.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
  /**
    * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition. For more information about specifying parameters, see Job Definition Parameters in the AWS Batch User Guide.
    */
  var parameters: js.UndefOr[ParametersMap] = js.undefined
  /**
    * The retry strategy to use for failed jobs that are submitted with this job definition.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
  /**
    * The revision of the job definition.
    */
  var revision: Integer
  /**
    * The status of the job definition.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout duration after which AWS Batch terminates your jobs if they have not finished.
    */
  var timeout: js.UndefOr[JobTimeout] = js.undefined
  /**
    * The type of job definition.
    */
  var `type`: String
}

object JobDefinition {
  @scala.inline
  def apply(
    jobDefinitionArn: String,
    jobDefinitionName: String,
    revision: Integer,
    `type`: String,
    containerProperties: ContainerProperties = null,
    nodeProperties: NodeProperties = null,
    parameters: ParametersMap = null,
    retryStrategy: RetryStrategy = null,
    status: String = null,
    timeout: JobTimeout = null
  ): JobDefinition = {
    val __obj = js.Dynamic.literal(jobDefinitionArn = jobDefinitionArn, jobDefinitionName = jobDefinitionName, revision = revision)
    __obj.updateDynamic("type")(`type`)
    if (containerProperties != null) __obj.updateDynamic("containerProperties")(containerProperties)
    if (nodeProperties != null) __obj.updateDynamic("nodeProperties")(nodeProperties)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(retryStrategy)
    if (status != null) __obj.updateDynamic("status")(status)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[JobDefinition]
  }
}

