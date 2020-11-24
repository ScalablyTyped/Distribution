package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterJobDefinitionRequest extends js.Object {
  
  /**
    * An object with various properties specific to single-node container-based jobs. If the job definition's type parameter is container, then you must specify either containerProperties or nodeProperties.
    */
  var containerProperties: js.UndefOr[ContainerProperties] = js.native
  
  /**
    * The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
    */
  var jobDefinitionName: String = js.native
  
  /**
    * An object with various properties specific to multi-node parallel jobs. If you specify node properties for a job, it becomes a multi-node parallel job. For more information, see Multi-node Parallel Jobs in the AWS Batch User Guide. If the job definition's type parameter is container, then you must specify either containerProperties or nodeProperties.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.native
  
  /**
    * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that is specified during a SubmitJob operation overrides the retry strategy defined here. If a job is terminated due to a timeout, it is not retried.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  
  /**
    * The tags that you apply to the job definition to help you categorize and organize your resources. Each tag consists of a key and an optional value. For more information, see Tagging AWS Resources in AWS General Reference.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.native
  
  /**
    * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates your jobs if they have not finished. If a job is terminated due to a timeout, it is not retried. The minimum value for the timeout is 60 seconds. Any timeout configuration that is specified during a SubmitJob operation overrides the timeout configuration defined here. For more information, see Job Timeouts in the Amazon Elastic Container Service Developer Guide.
    */
  var timeout: js.UndefOr[JobTimeout] = js.native
  
  /**
    * The type of job definition.
    */
  var `type`: JobDefinitionType = js.native
}
object RegisterJobDefinitionRequest {
  
  @scala.inline
  def apply(jobDefinitionName: String, `type`: JobDefinitionType): RegisterJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterJobDefinitionRequest]
  }
  
  @scala.inline
  implicit class RegisterJobDefinitionRequestOps[Self <: RegisterJobDefinitionRequest] (val x: Self) extends AnyVal {
    
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
    def setJobDefinitionName(value: String): Self = this.set("jobDefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JobDefinitionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
    def setTags(value: TagrisTagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: JobTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
