package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinition extends js.Object {
  /**
    * An object with various properties specific to container-based jobs.
    */
  var containerProperties: js.UndefOr[ContainerProperties] = js.native
  /**
    * The Amazon Resource Name (ARN) for the job definition.
    */
  var jobDefinitionArn: String = js.native
  /**
    * The name of the job definition.
    */
  var jobDefinitionName: String = js.native
  /**
    * An object with various properties specific to multi-node parallel jobs.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.native
  /**
    * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition. For more information about specifying parameters, see Job Definition Parameters in the AWS Batch User Guide.
    */
  var parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * The retry strategy to use for failed jobs that are submitted with this job definition.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  /**
    * The revision of the job definition.
    */
  var revision: Integer = js.native
  /**
    * The status of the job definition.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout duration after which AWS Batch terminates your jobs if they have not finished.
    */
  var timeout: js.UndefOr[JobTimeout] = js.native
  /**
    * The type of job definition.
    */
  var `type`: String = js.native
}

object JobDefinition {
  @scala.inline
  def apply(jobDefinitionArn: String, jobDefinitionName: String, revision: Integer, `type`: String): JobDefinition = {
    val __obj = js.Dynamic.literal(jobDefinitionArn = jobDefinitionArn.asInstanceOf[js.Any], jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinition]
  }
  @scala.inline
  implicit class JobDefinitionOps[Self <: JobDefinition] (val x: Self) extends AnyVal {
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
    def setJobDefinitionArn(value: String): Self = this.set("jobDefinitionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobDefinitionName(value: String): Self = this.set("jobDefinitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Integer): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerProperties(value: ContainerProperties): Self = this.set("containerProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerProperties: Self = this.set("containerProperties", js.undefined)
    @scala.inline
    def setNodeProperties(value: NodeProperties): Self = this.set("nodeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeProperties: Self = this.set("nodeProperties", js.undefined)
    @scala.inline
    def setParameters(value: ParametersMap): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setRetryStrategy(value: RetryStrategy): Self = this.set("retryStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryStrategy: Self = this.set("retryStrategy", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTimeout(value: JobTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

