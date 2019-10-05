package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentDescription extends js.Object {
  /**
    * Indicates if there is an in-progress environment configuration update or application version deployment that you can cancel.  true: There is an update in progress.   false: There are no updates currently in progress. 
    */
  var AbortableOperationInProgress: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.AbortableOperationInProgress] = js.undefined
  /**
    * The name of the application associated with this environment.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * The URL to the CNAME for this environment.
    */
  var CNAME: js.UndefOr[DNSCname] = js.undefined
  /**
    * The creation date for this environment.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.undefined
  /**
    * The last modified date for this environment.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
  /**
    * Describes this environment.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  /**
    * For load-balanced, autoscaling environments, the URL to the LoadBalancer. For single-instance environments, the IP address of the instance.
    */
  var EndpointURL: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EndpointURL] = js.undefined
  /**
    * The environment's Amazon Resource Name (ARN), which can be used in other API requests that require an ARN.
    */
  var EnvironmentArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentArn] = js.undefined
  /**
    * The ID of this environment.
    */
  var EnvironmentId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  /**
    * A list of links to other environments in the same group.
    */
  var EnvironmentLinks: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentLinks] = js.undefined
  /**
    * The name of this environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  /**
    * Describes the health status of the environment. AWS Elastic Beanstalk indicates the failure levels for a running environment:    Red: Indicates the environment is not responsive. Occurs when three or more consecutive failures occur for an environment.    Yellow: Indicates that something is wrong. Occurs when two consecutive failures occur for an environment.    Green: Indicates the environment is healthy and fully functional.    Grey: Default health for a new environment. The environment is not fully launched and health checks have not started or health checks are suspended during an UpdateEnvironment or RestartEnvironment request.    Default: Grey 
    */
  var Health: js.UndefOr[EnvironmentHealth] = js.undefined
  /**
    * Returns the health status of the application running in your environment. For more information, see Health Colors and Statuses.
    */
  var HealthStatus: js.UndefOr[EnvironmentHealthStatus] = js.undefined
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  /**
    * The description of the AWS resources used by this environment.
    */
  var Resources: js.UndefOr[EnvironmentResourcesDescription] = js.undefined
  /**
    *  The name of the SolutionStack deployed with this environment. 
    */
  var SolutionStackName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.undefined
  /**
    * The current operational status of the environment:    Launching: Environment is in the process of initial deployment.    Updating: Environment is in the process of updating its configuration settings or application version.    Ready: Environment is available to have an action performed on it, such as update or terminate.    Terminating: Environment is in the shut-down process.    Terminated: Environment is not running.  
    */
  var Status: js.UndefOr[EnvironmentStatus] = js.undefined
  /**
    * The name of the configuration template used to originally launch this environment.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  /**
    * Describes the current tier of this environment.
    */
  var Tier: js.UndefOr[EnvironmentTier] = js.undefined
  /**
    * The application version deployed in this environment.
    */
  var VersionLabel: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}

object EnvironmentDescription {
  @scala.inline
  def apply(
    AbortableOperationInProgress: js.UndefOr[Boolean] = js.undefined,
    ApplicationName: ApplicationName = null,
    CNAME: DNSCname = null,
    DateCreated: CreationDate = null,
    DateUpdated: UpdateDate = null,
    Description: Description = null,
    EndpointURL: EndpointURL = null,
    EnvironmentArn: EnvironmentArn = null,
    EnvironmentId: EnvironmentId = null,
    EnvironmentLinks: EnvironmentLinks = null,
    EnvironmentName: EnvironmentName = null,
    Health: EnvironmentHealth = null,
    HealthStatus: EnvironmentHealthStatus = null,
    PlatformArn: PlatformArn = null,
    Resources: EnvironmentResourcesDescription = null,
    SolutionStackName: SolutionStackName = null,
    Status: EnvironmentStatus = null,
    TemplateName: ConfigurationTemplateName = null,
    Tier: EnvironmentTier = null,
    VersionLabel: VersionLabel = null
  ): EnvironmentDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AbortableOperationInProgress)) __obj.updateDynamic("AbortableOperationInProgress")(AbortableOperationInProgress)
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (CNAME != null) __obj.updateDynamic("CNAME")(CNAME)
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated)
    if (DateUpdated != null) __obj.updateDynamic("DateUpdated")(DateUpdated)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EndpointURL != null) __obj.updateDynamic("EndpointURL")(EndpointURL)
    if (EnvironmentArn != null) __obj.updateDynamic("EnvironmentArn")(EnvironmentArn)
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentLinks != null) __obj.updateDynamic("EnvironmentLinks")(EnvironmentLinks)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (Health != null) __obj.updateDynamic("Health")(Health.asInstanceOf[js.Any])
    if (HealthStatus != null) __obj.updateDynamic("HealthStatus")(HealthStatus.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier)
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel)
    __obj.asInstanceOf[EnvironmentDescription]
  }
}

