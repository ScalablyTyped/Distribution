package typings.awsSdk.appconfigMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppConfig extends Service {
  @JSName("config")
  var config_AppConfig: ConfigBase with ClientConfiguration = js.native
  /**
    * An application in AppConfig is a logical unit of code that provides capabilities for your customers. For example, an application can be a microservice that runs on Amazon EC2 instances, a mobile application installed by your users, a serverless application using Amazon API Gateway and AWS Lambda, or any system you run on behalf of others.
    */
  def createApplication(): Request[Application, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ Application, Unit]): Request[Application, AWSError] = js.native
  /**
    * An application in AppConfig is a logical unit of code that provides capabilities for your customers. For example, an application can be a microservice that runs on Amazon EC2 instances, a mobile application installed by your users, a serverless application using Amazon API Gateway and AWS Lambda, or any system you run on behalf of others.
    */
  def createApplication(params: CreateApplicationRequest): Request[Application, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Application, Unit]
  ): Request[Application, AWSError] = js.native
  /**
    * Information that enables AppConfig to access the configuration source. Valid configuration sources include Systems Manager (SSM) documents, SSM Parameter Store parameters, and Amazon S3 objects. A configuration profile includes the following information.   The Uri location of the configuration data.   The AWS Identity and Access Management (IAM) role that provides access to the configuration data.   A validator for the configuration data. Available validators include either a JSON Schema or an AWS Lambda function.   For more information, see Create a Configuration and a Configuration Profile in the AWS AppConfig User Guide.
    */
  def createConfigurationProfile(): Request[ConfigurationProfile, AWSError] = js.native
  def createConfigurationProfile(callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfile, Unit]): Request[ConfigurationProfile, AWSError] = js.native
  /**
    * Information that enables AppConfig to access the configuration source. Valid configuration sources include Systems Manager (SSM) documents, SSM Parameter Store parameters, and Amazon S3 objects. A configuration profile includes the following information.   The Uri location of the configuration data.   The AWS Identity and Access Management (IAM) role that provides access to the configuration data.   A validator for the configuration data. Available validators include either a JSON Schema or an AWS Lambda function.   For more information, see Create a Configuration and a Configuration Profile in the AWS AppConfig User Guide.
    */
  def createConfigurationProfile(params: CreateConfigurationProfileRequest): Request[ConfigurationProfile, AWSError] = js.native
  def createConfigurationProfile(
    params: CreateConfigurationProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfile, Unit]
  ): Request[ConfigurationProfile, AWSError] = js.native
  /**
    * A deployment strategy defines important criteria for rolling out your configuration to the designated targets. A deployment strategy includes: the overall duration required, a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage grows, and bake time.
    */
  def createDeploymentStrategy(): Request[DeploymentStrategy, AWSError] = js.native
  def createDeploymentStrategy(callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategy, Unit]): Request[DeploymentStrategy, AWSError] = js.native
  /**
    * A deployment strategy defines important criteria for rolling out your configuration to the designated targets. A deployment strategy includes: the overall duration required, a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage grows, and bake time.
    */
  def createDeploymentStrategy(params: CreateDeploymentStrategyRequest): Request[DeploymentStrategy, AWSError] = js.native
  def createDeploymentStrategy(
    params: CreateDeploymentStrategyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategy, Unit]
  ): Request[DeploymentStrategy, AWSError] = js.native
  /**
    * For each application, you define one or more environments. An environment is a logical deployment group of AppConfig targets, such as applications in a Beta or Production environment. You can also define environments for application subcomponents such as the Web, Mobile and Back-end components for your application. You can configure Amazon CloudWatch alarms for each environment. The system monitors alarms during a configuration deployment. If an alarm is triggered, the system rolls back the configuration.
    */
  def createEnvironment(): Request[Environment, AWSError] = js.native
  def createEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ Environment, Unit]): Request[Environment, AWSError] = js.native
  /**
    * For each application, you define one or more environments. An environment is a logical deployment group of AppConfig targets, such as applications in a Beta or Production environment. You can also define environments for application subcomponents such as the Web, Mobile and Back-end components for your application. You can configure Amazon CloudWatch alarms for each environment. The system monitors alarms during a configuration deployment. If an alarm is triggered, the system rolls back the configuration.
    */
  def createEnvironment(params: CreateEnvironmentRequest): Request[Environment, AWSError] = js.native
  def createEnvironment(
    params: CreateEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Environment, Unit]
  ): Request[Environment, AWSError] = js.native
  /**
    * Delete an application. Deleting an application does not delete a configuration from a host.
    */
  def deleteApplication(): Request[js.Object, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an application. Deleting an application does not delete a configuration from a host.
    */
  def deleteApplication(params: DeleteApplicationRequest): Request[js.Object, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Delete a configuration profile. Deleting a configuration profile does not delete a configuration from a host.
    */
  def deleteConfigurationProfile(): Request[js.Object, AWSError] = js.native
  def deleteConfigurationProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a configuration profile. Deleting a configuration profile does not delete a configuration from a host.
    */
  def deleteConfigurationProfile(params: DeleteConfigurationProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteConfigurationProfile(
    params: DeleteConfigurationProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Delete a deployment strategy. Deleting a deployment strategy does not delete a configuration from a host.
    */
  def deleteDeploymentStrategy(): Request[js.Object, AWSError] = js.native
  def deleteDeploymentStrategy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a deployment strategy. Deleting a deployment strategy does not delete a configuration from a host.
    */
  def deleteDeploymentStrategy(params: DeleteDeploymentStrategyRequest): Request[js.Object, AWSError] = js.native
  def deleteDeploymentStrategy(
    params: DeleteDeploymentStrategyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Delete an environment. Deleting an environment does not delete a configuration from a host.
    */
  def deleteEnvironment(): Request[js.Object, AWSError] = js.native
  def deleteEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an environment. Deleting an environment does not delete a configuration from a host.
    */
  def deleteEnvironment(params: DeleteEnvironmentRequest): Request[js.Object, AWSError] = js.native
  def deleteEnvironment(
    params: DeleteEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Retrieve information about an application.
    */
  def getApplication(): Request[Application, AWSError] = js.native
  def getApplication(callback: js.Function2[/* err */ AWSError, /* data */ Application, Unit]): Request[Application, AWSError] = js.native
  /**
    * Retrieve information about an application.
    */
  def getApplication(params: GetApplicationRequest): Request[Application, AWSError] = js.native
  def getApplication(
    params: GetApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Application, Unit]
  ): Request[Application, AWSError] = js.native
  /**
    * Receive information about a configuration.  AWS AppConfig uses the value of the ClientConfigurationVersion parameter to identify the configuration version on your clients. If you don’t send ClientConfigurationVersion with each call to GetConfiguration, your clients receive the current configuration. You are charged each time your clients receive a configuration. To avoid excess charges, we recommend that you include the ClientConfigurationVersion value with every call to GetConfiguration. This value must be saved on your client. Subsequent calls to GetConfiguration must pass this value by using the ClientConfigurationVersion parameter.  
    */
  def getConfiguration(): Request[Configuration, AWSError] = js.native
  def getConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ Configuration, Unit]): Request[Configuration, AWSError] = js.native
  /**
    * Receive information about a configuration.  AWS AppConfig uses the value of the ClientConfigurationVersion parameter to identify the configuration version on your clients. If you don’t send ClientConfigurationVersion with each call to GetConfiguration, your clients receive the current configuration. You are charged each time your clients receive a configuration. To avoid excess charges, we recommend that you include the ClientConfigurationVersion value with every call to GetConfiguration. This value must be saved on your client. Subsequent calls to GetConfiguration must pass this value by using the ClientConfigurationVersion parameter.  
    */
  def getConfiguration(params: GetConfigurationRequest): Request[Configuration, AWSError] = js.native
  def getConfiguration(
    params: GetConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Configuration, Unit]
  ): Request[Configuration, AWSError] = js.native
  /**
    * Retrieve information about a configuration profile.
    */
  def getConfigurationProfile(): Request[ConfigurationProfile, AWSError] = js.native
  def getConfigurationProfile(callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfile, Unit]): Request[ConfigurationProfile, AWSError] = js.native
  /**
    * Retrieve information about a configuration profile.
    */
  def getConfigurationProfile(params: GetConfigurationProfileRequest): Request[ConfigurationProfile, AWSError] = js.native
  def getConfigurationProfile(
    params: GetConfigurationProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfile, Unit]
  ): Request[ConfigurationProfile, AWSError] = js.native
  /**
    * Retrieve information about a configuration deployment.
    */
  def getDeployment(): Request[Deployment, AWSError] = js.native
  def getDeployment(callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]): Request[Deployment, AWSError] = js.native
  /**
    * Retrieve information about a configuration deployment.
    */
  def getDeployment(params: GetDeploymentRequest): Request[Deployment, AWSError] = js.native
  def getDeployment(
    params: GetDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]
  ): Request[Deployment, AWSError] = js.native
  /**
    * Retrieve information about a deployment strategy. A deployment strategy defines important criteria for rolling out your configuration to the designated targets. A deployment strategy includes: the overall duration required, a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage grows, and bake time.
    */
  def getDeploymentStrategy(): Request[DeploymentStrategy, AWSError] = js.native
  def getDeploymentStrategy(callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategy, Unit]): Request[DeploymentStrategy, AWSError] = js.native
  /**
    * Retrieve information about a deployment strategy. A deployment strategy defines important criteria for rolling out your configuration to the designated targets. A deployment strategy includes: the overall duration required, a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage grows, and bake time.
    */
  def getDeploymentStrategy(params: GetDeploymentStrategyRequest): Request[DeploymentStrategy, AWSError] = js.native
  def getDeploymentStrategy(
    params: GetDeploymentStrategyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategy, Unit]
  ): Request[DeploymentStrategy, AWSError] = js.native
  /**
    * Retrieve information about an environment. An environment is a logical deployment group of AppConfig applications, such as applications in a Production environment or in an EU_Region environment. Each configuration deployment targets an environment. You can enable one or more Amazon CloudWatch alarms for an environment. If an alarm is triggered during a deployment, AppConfig roles back the configuration.
    */
  def getEnvironment(): Request[Environment, AWSError] = js.native
  def getEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ Environment, Unit]): Request[Environment, AWSError] = js.native
  /**
    * Retrieve information about an environment. An environment is a logical deployment group of AppConfig applications, such as applications in a Production environment or in an EU_Region environment. Each configuration deployment targets an environment. You can enable one or more Amazon CloudWatch alarms for an environment. If an alarm is triggered during a deployment, AppConfig roles back the configuration.
    */
  def getEnvironment(params: GetEnvironmentRequest): Request[Environment, AWSError] = js.native
  def getEnvironment(
    params: GetEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Environment, Unit]
  ): Request[Environment, AWSError] = js.native
  /**
    * List all applications in your AWS account.
    */
  def listApplications(): Request[Applications, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ Applications, Unit]): Request[Applications, AWSError] = js.native
  /**
    * List all applications in your AWS account.
    */
  def listApplications(params: ListApplicationsRequest): Request[Applications, AWSError] = js.native
  def listApplications(
    params: ListApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Applications, Unit]
  ): Request[Applications, AWSError] = js.native
  /**
    * Lists the configuration profiles for an application.
    */
  def listConfigurationProfiles(): Request[ConfigurationProfiles, AWSError] = js.native
  def listConfigurationProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfiles, Unit]): Request[ConfigurationProfiles, AWSError] = js.native
  /**
    * Lists the configuration profiles for an application.
    */
  def listConfigurationProfiles(params: ListConfigurationProfilesRequest): Request[ConfigurationProfiles, AWSError] = js.native
  def listConfigurationProfiles(
    params: ListConfigurationProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfiles, Unit]
  ): Request[ConfigurationProfiles, AWSError] = js.native
  /**
    * List deployment strategies.
    */
  def listDeploymentStrategies(): Request[DeploymentStrategies, AWSError] = js.native
  def listDeploymentStrategies(callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategies, Unit]): Request[DeploymentStrategies, AWSError] = js.native
  /**
    * List deployment strategies.
    */
  def listDeploymentStrategies(params: ListDeploymentStrategiesRequest): Request[DeploymentStrategies, AWSError] = js.native
  def listDeploymentStrategies(
    params: ListDeploymentStrategiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategies, Unit]
  ): Request[DeploymentStrategies, AWSError] = js.native
  /**
    * Lists the deployments for an environment.
    */
  def listDeployments(): Request[Deployments, AWSError] = js.native
  def listDeployments(callback: js.Function2[/* err */ AWSError, /* data */ Deployments, Unit]): Request[Deployments, AWSError] = js.native
  /**
    * Lists the deployments for an environment.
    */
  def listDeployments(params: ListDeploymentsRequest): Request[Deployments, AWSError] = js.native
  def listDeployments(
    params: ListDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Deployments, Unit]
  ): Request[Deployments, AWSError] = js.native
  /**
    * List the environments for an application.
    */
  def listEnvironments(): Request[Environments, AWSError] = js.native
  def listEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ Environments, Unit]): Request[Environments, AWSError] = js.native
  /**
    * List the environments for an application.
    */
  def listEnvironments(params: ListEnvironmentsRequest): Request[Environments, AWSError] = js.native
  def listEnvironments(
    params: ListEnvironmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Environments, Unit]
  ): Request[Environments, AWSError] = js.native
  /**
    * Retrieves the list of key-value tags assigned to the resource.
    */
  def listTagsForResource(): Request[ResourceTags, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ResourceTags, Unit]): Request[ResourceTags, AWSError] = js.native
  /**
    * Retrieves the list of key-value tags assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ResourceTags, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResourceTags, Unit]
  ): Request[ResourceTags, AWSError] = js.native
  /**
    * Starts a deployment.
    */
  def startDeployment(): Request[Deployment, AWSError] = js.native
  def startDeployment(callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]): Request[Deployment, AWSError] = js.native
  /**
    * Starts a deployment.
    */
  def startDeployment(params: StartDeploymentRequest): Request[Deployment, AWSError] = js.native
  def startDeployment(
    params: StartDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]
  ): Request[Deployment, AWSError] = js.native
  /**
    * Stops a deployment. This API action works only on deployments that have a status of DEPLOYING. This action moves the deployment to a status of ROLLED_BACK.
    */
  def stopDeployment(): Request[Deployment, AWSError] = js.native
  def stopDeployment(callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]): Request[Deployment, AWSError] = js.native
  /**
    * Stops a deployment. This API action works only on deployments that have a status of DEPLOYING. This action moves the deployment to a status of ROLLED_BACK.
    */
  def stopDeployment(params: StopDeploymentRequest): Request[Deployment, AWSError] = js.native
  def stopDeployment(
    params: StopDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]
  ): Request[Deployment, AWSError] = js.native
  /**
    * Metadata to assign to an AppConfig resource. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define. You can specify a maximum of 50 tags for a resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Metadata to assign to an AppConfig resource. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define. You can specify a maximum of 50 tags for a resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a tag key and value from an AppConfig resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a tag key and value from an AppConfig resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates an application.
    */
  def updateApplication(): Request[Application, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ Application, Unit]): Request[Application, AWSError] = js.native
  /**
    * Updates an application.
    */
  def updateApplication(params: UpdateApplicationRequest): Request[Application, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Application, Unit]
  ): Request[Application, AWSError] = js.native
  /**
    * Updates a configuration profile.
    */
  def updateConfigurationProfile(): Request[ConfigurationProfile, AWSError] = js.native
  def updateConfigurationProfile(callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfile, Unit]): Request[ConfigurationProfile, AWSError] = js.native
  /**
    * Updates a configuration profile.
    */
  def updateConfigurationProfile(params: UpdateConfigurationProfileRequest): Request[ConfigurationProfile, AWSError] = js.native
  def updateConfigurationProfile(
    params: UpdateConfigurationProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfile, Unit]
  ): Request[ConfigurationProfile, AWSError] = js.native
  /**
    * Updates a deployment strategy.
    */
  def updateDeploymentStrategy(): Request[DeploymentStrategy, AWSError] = js.native
  def updateDeploymentStrategy(callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategy, Unit]): Request[DeploymentStrategy, AWSError] = js.native
  /**
    * Updates a deployment strategy.
    */
  def updateDeploymentStrategy(params: UpdateDeploymentStrategyRequest): Request[DeploymentStrategy, AWSError] = js.native
  def updateDeploymentStrategy(
    params: UpdateDeploymentStrategyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategy, Unit]
  ): Request[DeploymentStrategy, AWSError] = js.native
  /**
    * Updates an environment.
    */
  def updateEnvironment(): Request[Environment, AWSError] = js.native
  def updateEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ Environment, Unit]): Request[Environment, AWSError] = js.native
  /**
    * Updates an environment.
    */
  def updateEnvironment(params: UpdateEnvironmentRequest): Request[Environment, AWSError] = js.native
  def updateEnvironment(
    params: UpdateEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Environment, Unit]
  ): Request[Environment, AWSError] = js.native
  /**
    * Uses the validators in a configuration profile to validate a configuration.
    */
  def validateConfiguration(): Request[js.Object, AWSError] = js.native
  def validateConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Uses the validators in a configuration profile to validate a configuration.
    */
  def validateConfiguration(params: ValidateConfigurationRequest): Request[js.Object, AWSError] = js.native
  def validateConfiguration(
    params: ValidateConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}

