package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitJobRequest extends js.Object {
  
  /**
    * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. For more information, see Array Jobs in the AWS Batch User Guide.
    */
  var arrayProperties: js.UndefOr[ArrayProperties] = js.native
  
  /**
    * A list of container overrides in JSON format that specify the name of a container in the specified job definition and the overrides it should receive. You can override the default command for a container (that is specified in the job definition or the Docker image) with a command override. You can also override existing environment variables (that are specified in the job definition or Docker image) on a container or add new environment variables to it with an environment override.
    */
  var containerOverrides: js.UndefOr[ContainerOverrides] = js.native
  
  /**
    * A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a SEQUENTIAL type dependency without specifying a job ID for array jobs so that each child array job completes sequentially, starting at index 0. You can also specify an N_TO_N type dependency with a job ID for array jobs. In that case, each index child of this job must wait for the corresponding index child of each dependency to complete before it can begin.
    */
  var dependsOn: js.UndefOr[JobDependencyList] = js.native
  
  /**
    * The job definition used by this job. This value can be one of name, name:revision, or the Amazon Resource Name (ARN) for the job definition. If name is specified without a revision then the latest active revision is used.
    */
  var jobDefinition: String = js.native
  
  /**
    * The name of the job. The first character must be alphanumeric, and up to 128 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
    */
  var jobName: String = js.native
  
  /**
    * The job queue into which the job is submitted. You can specify either the name or the Amazon Resource Name (ARN) of the queue.
    */
  var jobQueue: String = js.native
  
  /**
    * A list of node overrides in JSON format that specify the node range to target and the container overrides for that node range.
    */
  var nodeOverrides: js.UndefOr[NodeOverrides] = js.native
  
  /**
    * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job definition. Parameters are specified as a key and value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * The retry strategy to use for failed jobs from this SubmitJob operation. When a retry strategy is specified here, it overrides the retry strategy defined in the job definition.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  
  /**
    * The tags that you apply to the job request to help you categorize and organize your resources. Each tag consists of a key and an optional value. For more information, see Tagging AWS Resources in AWS General Reference.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.native
  
  /**
    * The timeout configuration for this SubmitJob operation. You can specify a timeout duration after which AWS Batch terminates your jobs if they have not finished. If a job is terminated due to a timeout, it is not retried. The minimum value for the timeout is 60 seconds. This configuration overrides any timeout configuration specified in the job definition. For array jobs, child jobs have the same timeout configuration as the parent job. For more information, see Job Timeouts in the Amazon Elastic Container Service Developer Guide.
    */
  var timeout: js.UndefOr[JobTimeout] = js.native
}
object SubmitJobRequest {
  
  @scala.inline
  def apply(jobDefinition: String, jobName: String, jobQueue: String): SubmitJobRequest = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobQueue = jobQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitJobRequest]
  }
  
  @scala.inline
  implicit class SubmitJobRequestOps[Self <: SubmitJobRequest] (val x: Self) extends AnyVal {
    
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
    def setJobDefinition(value: String): Self = this.set("jobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobQueue(value: String): Self = this.set("jobQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayProperties(value: ArrayProperties): Self = this.set("arrayProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayProperties: Self = this.set("arrayProperties", js.undefined)
    
    @scala.inline
    def setContainerOverrides(value: ContainerOverrides): Self = this.set("containerOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerOverrides: Self = this.set("containerOverrides", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: JobDependency*): Self = this.set("dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setDependsOn(value: JobDependencyList): Self = this.set("dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependsOn: Self = this.set("dependsOn", js.undefined)
    
    @scala.inline
    def setNodeOverrides(value: NodeOverrides): Self = this.set("nodeOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeOverrides: Self = this.set("nodeOverrides", js.undefined)
    
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
