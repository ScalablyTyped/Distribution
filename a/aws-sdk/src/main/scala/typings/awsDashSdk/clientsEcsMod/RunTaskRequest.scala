package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunTaskRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * The number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks per call.
    */
  var count: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see Tagging Your Amazon ECS Resources in the Amazon Elastic Container Service Developer Guide.
    */
  var enableECSManagedTags: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the task group to associate with the task. The default value is the family name of the task definition (for example, family:my-family-name).
    */
  var group: js.UndefOr[String] = js.undefined
  /**
    * The launch type on which to run your task. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  /**
    * The network configuration for the task. This parameter is required for task definitions that use the awsvpc network mode to receive their own elastic network interface, and it is not supported for other network modes. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  /**
    * A list of container overrides in JSON format that specify the name of a container in the specified task definition and the overrides it should receive. You can override the default command for a container (that is specified in the task definition or Docker image) with a command override. You can also override existing environment variables (that are specified in the task definition or Docker image) on a container or add new environment variables to it with an environment override.  A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the override structure. 
    */
  var overrides: js.UndefOr[TaskOverride] = js.undefined
  /**
    * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime).
    */
  var placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined
  /**
    * The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
    */
  var placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined
  /**
    * The platform version the task should run. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after task creation, use the TagResource API action.  An error will be received if you specify the SERVICE option when running a task. 
    */
  var propagateTags: js.UndefOr[PropagateTags] = js.undefined
  /**
    * An optional tag specified when a task is started. For example, if you automatically trigger a task to run a batch process job, you could apply a unique identifier for that job to your task with the startedBy parameter. You can then identify which tasks belong to that job by filtering the results of a ListTasks call with the startedBy value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. If a task is started by an Amazon ECS service, then the startedBy parameter contains the deployment ID of the service that starts it.
    */
  var startedBy: js.UndefOr[String] = js.undefined
  /**
    * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    * The family and revision (family:revision) or full ARN of the task definition to run. If a revision is not specified, the latest ACTIVE revision is used.
    */
  var taskDefinition: String
}

object RunTaskRequest {
  @scala.inline
  def apply(
    taskDefinition: String,
    cluster: String = null,
    count: js.UndefOr[BoxedInteger] = js.undefined,
    enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    launchType: LaunchType = null,
    networkConfiguration: NetworkConfiguration = null,
    overrides: TaskOverride = null,
    placementConstraints: PlacementConstraints = null,
    placementStrategy: PlacementStrategies = null,
    platformVersion: String = null,
    propagateTags: PropagateTags = null,
    startedBy: String = null,
    tags: Tags = null
  ): RunTaskRequest = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (!js.isUndefined(enableECSManagedTags)) __obj.updateDynamic("enableECSManagedTags")(enableECSManagedTags)
    if (group != null) __obj.updateDynamic("group")(group)
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (placementConstraints != null) __obj.updateDynamic("placementConstraints")(placementConstraints)
    if (placementStrategy != null) __obj.updateDynamic("placementStrategy")(placementStrategy)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (propagateTags != null) __obj.updateDynamic("propagateTags")(propagateTags.asInstanceOf[js.Any])
    if (startedBy != null) __obj.updateDynamic("startedBy")(startedBy)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[RunTaskRequest]
  }
}

