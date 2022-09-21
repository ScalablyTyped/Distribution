package typings.awsSdk.appconfigMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppConfig extends Service {
  
  @JSName("config")
  var config_AppConfig: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an application. In AppConfig, an application is simply an organizational construct like a folder. This organizational construct has a relationship with some unit of executable code. For example, you could create an application called MyMobileApp to organize and manage configuration data for a mobile application installed by your users.
    */
  def createApplication(): Request[Application, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ Application, Unit]): Request[Application, AWSError] = js.native
  /**
    * Creates an application. In AppConfig, an application is simply an organizational construct like a folder. This organizational construct has a relationship with some unit of executable code. For example, you could create an application called MyMobileApp to organize and manage configuration data for a mobile application installed by your users.
    */
  def createApplication(params: CreateApplicationRequest): Request[Application, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Application, Unit]
  ): Request[Application, AWSError] = js.native
  
  /**
    * Creates a configuration profile, which is information that enables AppConfig to access the configuration source. Valid configuration sources include the AppConfig hosted configuration store, Amazon Web Services Systems Manager (SSM) documents, SSM Parameter Store parameters, Amazon S3 objects, or any integration source action supported by CodePipeline. A configuration profile includes the following information:   The URI location of the configuration data.   The Identity and Access Management (IAM) role that provides access to the configuration data.   A validator for the configuration data. Available validators include either a JSON Schema or an Amazon Web Services Lambda function.   For more information, see Create a Configuration and a Configuration Profile in the AppConfig User Guide.
    */
  def createConfigurationProfile(): Request[ConfigurationProfile, AWSError] = js.native
  def createConfigurationProfile(callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfile, Unit]): Request[ConfigurationProfile, AWSError] = js.native
  /**
    * Creates a configuration profile, which is information that enables AppConfig to access the configuration source. Valid configuration sources include the AppConfig hosted configuration store, Amazon Web Services Systems Manager (SSM) documents, SSM Parameter Store parameters, Amazon S3 objects, or any integration source action supported by CodePipeline. A configuration profile includes the following information:   The URI location of the configuration data.   The Identity and Access Management (IAM) role that provides access to the configuration data.   A validator for the configuration data. Available validators include either a JSON Schema or an Amazon Web Services Lambda function.   For more information, see Create a Configuration and a Configuration Profile in the AppConfig User Guide.
    */
  def createConfigurationProfile(params: CreateConfigurationProfileRequest): Request[ConfigurationProfile, AWSError] = js.native
  def createConfigurationProfile(
    params: CreateConfigurationProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfile, Unit]
  ): Request[ConfigurationProfile, AWSError] = js.native
  
  /**
    * Creates a deployment strategy that defines important criteria for rolling out your configuration to the designated targets. A deployment strategy includes the overall duration required, a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage grows, and bake time.
    */
  def createDeploymentStrategy(): Request[DeploymentStrategy, AWSError] = js.native
  def createDeploymentStrategy(callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategy, Unit]): Request[DeploymentStrategy, AWSError] = js.native
  /**
    * Creates a deployment strategy that defines important criteria for rolling out your configuration to the designated targets. A deployment strategy includes the overall duration required, a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage grows, and bake time.
    */
  def createDeploymentStrategy(params: CreateDeploymentStrategyRequest): Request[DeploymentStrategy, AWSError] = js.native
  def createDeploymentStrategy(
    params: CreateDeploymentStrategyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategy, Unit]
  ): Request[DeploymentStrategy, AWSError] = js.native
  
  /**
    * Creates an environment. For each application, you define one or more environments. An environment is a deployment group of AppConfig targets, such as applications in a Beta or Production environment. You can also define environments for application subcomponents such as the Web, Mobile and Back-end components for your application. You can configure Amazon CloudWatch alarms for each environment. The system monitors alarms during a configuration deployment. If an alarm is triggered, the system rolls back the configuration.
    */
  def createEnvironment(): Request[Environment, AWSError] = js.native
  def createEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ Environment, Unit]): Request[Environment, AWSError] = js.native
  /**
    * Creates an environment. For each application, you define one or more environments. An environment is a deployment group of AppConfig targets, such as applications in a Beta or Production environment. You can also define environments for application subcomponents such as the Web, Mobile and Back-end components for your application. You can configure Amazon CloudWatch alarms for each environment. The system monitors alarms during a configuration deployment. If an alarm is triggered, the system rolls back the configuration.
    */
  def createEnvironment(params: CreateEnvironmentRequest): Request[Environment, AWSError] = js.native
  def createEnvironment(
    params: CreateEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Environment, Unit]
  ): Request[Environment, AWSError] = js.native
  
  /**
    * Creates an AppConfig extension. An extension augments your ability to inject logic or behavior at different points during the AppConfig workflow of creating or deploying a configuration. You can create your own extensions or use the Amazon Web Services-authored extensions provided by AppConfig. For most use-cases, to create your own extension, you must create an Lambda function to perform any computation and processing defined in the extension. For more information about extensions, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def createExtension(): Request[Extension, AWSError] = js.native
  def createExtension(callback: js.Function2[/* err */ AWSError, /* data */ Extension, Unit]): Request[Extension, AWSError] = js.native
  /**
    * Creates an AppConfig extension. An extension augments your ability to inject logic or behavior at different points during the AppConfig workflow of creating or deploying a configuration. You can create your own extensions or use the Amazon Web Services-authored extensions provided by AppConfig. For most use-cases, to create your own extension, you must create an Lambda function to perform any computation and processing defined in the extension. For more information about extensions, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def createExtension(params: CreateExtensionRequest): Request[Extension, AWSError] = js.native
  def createExtension(
    params: CreateExtensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Extension, Unit]
  ): Request[Extension, AWSError] = js.native
  
  /**
    * When you create an extension or configure an Amazon Web Services-authored extension, you associate the extension with an AppConfig application, environment, or configuration profile. For example, you can choose to run the AppConfig deployment events to Amazon SNS Amazon Web Services-authored extension and receive notifications on an Amazon SNS topic anytime a configuration deployment is started for a specific application. Defining which extension to associate with an AppConfig resource is called an extension association. An extension association is a specified relationship between an extension and an AppConfig resource, such as an application or a configuration profile. For more information about extensions and associations, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def createExtensionAssociation(): Request[ExtensionAssociation, AWSError] = js.native
  def createExtensionAssociation(callback: js.Function2[/* err */ AWSError, /* data */ ExtensionAssociation, Unit]): Request[ExtensionAssociation, AWSError] = js.native
  /**
    * When you create an extension or configure an Amazon Web Services-authored extension, you associate the extension with an AppConfig application, environment, or configuration profile. For example, you can choose to run the AppConfig deployment events to Amazon SNS Amazon Web Services-authored extension and receive notifications on an Amazon SNS topic anytime a configuration deployment is started for a specific application. Defining which extension to associate with an AppConfig resource is called an extension association. An extension association is a specified relationship between an extension and an AppConfig resource, such as an application or a configuration profile. For more information about extensions and associations, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def createExtensionAssociation(params: CreateExtensionAssociationRequest): Request[ExtensionAssociation, AWSError] = js.native
  def createExtensionAssociation(
    params: CreateExtensionAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExtensionAssociation, Unit]
  ): Request[ExtensionAssociation, AWSError] = js.native
  
  /**
    * Creates a new configuration in the AppConfig hosted configuration store.
    */
  def createHostedConfigurationVersion(): Request[HostedConfigurationVersion, AWSError] = js.native
  def createHostedConfigurationVersion(callback: js.Function2[/* err */ AWSError, /* data */ HostedConfigurationVersion, Unit]): Request[HostedConfigurationVersion, AWSError] = js.native
  /**
    * Creates a new configuration in the AppConfig hosted configuration store.
    */
  def createHostedConfigurationVersion(params: CreateHostedConfigurationVersionRequest): Request[HostedConfigurationVersion, AWSError] = js.native
  def createHostedConfigurationVersion(
    params: CreateHostedConfigurationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ HostedConfigurationVersion, Unit]
  ): Request[HostedConfigurationVersion, AWSError] = js.native
  
  /**
    * Deletes an application. Deleting an application does not delete a configuration from a host.
    */
  def deleteApplication(): Request[js.Object, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an application. Deleting an application does not delete a configuration from a host.
    */
  def deleteApplication(params: DeleteApplicationRequest): Request[js.Object, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a configuration profile. Deleting a configuration profile does not delete a configuration from a host.
    */
  def deleteConfigurationProfile(): Request[js.Object, AWSError] = js.native
  def deleteConfigurationProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a configuration profile. Deleting a configuration profile does not delete a configuration from a host.
    */
  def deleteConfigurationProfile(params: DeleteConfigurationProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteConfigurationProfile(
    params: DeleteConfigurationProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a deployment strategy. Deleting a deployment strategy does not delete a configuration from a host.
    */
  def deleteDeploymentStrategy(): Request[js.Object, AWSError] = js.native
  def deleteDeploymentStrategy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a deployment strategy. Deleting a deployment strategy does not delete a configuration from a host.
    */
  def deleteDeploymentStrategy(params: DeleteDeploymentStrategyRequest): Request[js.Object, AWSError] = js.native
  def deleteDeploymentStrategy(
    params: DeleteDeploymentStrategyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an environment. Deleting an environment does not delete a configuration from a host.
    */
  def deleteEnvironment(): Request[js.Object, AWSError] = js.native
  def deleteEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an environment. Deleting an environment does not delete a configuration from a host.
    */
  def deleteEnvironment(params: DeleteEnvironmentRequest): Request[js.Object, AWSError] = js.native
  def deleteEnvironment(
    params: DeleteEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an AppConfig extension. You must delete all associations to an extension before you delete the extension.
    */
  def deleteExtension(): Request[js.Object, AWSError] = js.native
  def deleteExtension(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an AppConfig extension. You must delete all associations to an extension before you delete the extension.
    */
  def deleteExtension(params: DeleteExtensionRequest): Request[js.Object, AWSError] = js.native
  def deleteExtension(
    params: DeleteExtensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an extension association. This action doesn't delete extensions defined in the association.
    */
  def deleteExtensionAssociation(): Request[js.Object, AWSError] = js.native
  def deleteExtensionAssociation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an extension association. This action doesn't delete extensions defined in the association.
    */
  def deleteExtensionAssociation(params: DeleteExtensionAssociationRequest): Request[js.Object, AWSError] = js.native
  def deleteExtensionAssociation(
    params: DeleteExtensionAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a version of a configuration from the AppConfig hosted configuration store.
    */
  def deleteHostedConfigurationVersion(): Request[js.Object, AWSError] = js.native
  def deleteHostedConfigurationVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a version of a configuration from the AppConfig hosted configuration store.
    */
  def deleteHostedConfigurationVersion(params: DeleteHostedConfigurationVersionRequest): Request[js.Object, AWSError] = js.native
  def deleteHostedConfigurationVersion(
    params: DeleteHostedConfigurationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Retrieves information about an application.
    */
  def getApplication(): Request[Application, AWSError] = js.native
  def getApplication(callback: js.Function2[/* err */ AWSError, /* data */ Application, Unit]): Request[Application, AWSError] = js.native
  /**
    * Retrieves information about an application.
    */
  def getApplication(params: GetApplicationRequest): Request[Application, AWSError] = js.native
  def getApplication(
    params: GetApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Application, Unit]
  ): Request[Application, AWSError] = js.native
  
  /**
    * Retrieves the latest deployed configuration.  Note the following important information.   This API action has been deprecated. Calls to receive configuration data should use the StartConfigurationSession and GetLatestConfiguration APIs instead.     GetConfiguration is a priced call. For more information, see Pricing.   AppConfig uses the value of the ClientConfigurationVersion parameter to identify the configuration version on your clients. If you don’t send ClientConfigurationVersion with each call to GetConfiguration, your clients receive the current configuration. You are charged each time your clients receive a configuration. To avoid excess charges, we recommend you use the StartConfigurationSession and GetLatestConfiguration APIs, which track the client configuration version on your behalf. If you choose to continue using GetConfiguration, we recommend that you include the ClientConfigurationVersion value with every call to GetConfiguration. The value to use for ClientConfigurationVersion comes from the ConfigurationVersion attribute returned by GetConfiguration when there is new or updated data, and should be saved for subsequent calls to GetConfiguration.   
    */
  def getConfiguration(): Request[Configuration, AWSError] = js.native
  def getConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ Configuration, Unit]): Request[Configuration, AWSError] = js.native
  /**
    * Retrieves the latest deployed configuration.  Note the following important information.   This API action has been deprecated. Calls to receive configuration data should use the StartConfigurationSession and GetLatestConfiguration APIs instead.     GetConfiguration is a priced call. For more information, see Pricing.   AppConfig uses the value of the ClientConfigurationVersion parameter to identify the configuration version on your clients. If you don’t send ClientConfigurationVersion with each call to GetConfiguration, your clients receive the current configuration. You are charged each time your clients receive a configuration. To avoid excess charges, we recommend you use the StartConfigurationSession and GetLatestConfiguration APIs, which track the client configuration version on your behalf. If you choose to continue using GetConfiguration, we recommend that you include the ClientConfigurationVersion value with every call to GetConfiguration. The value to use for ClientConfigurationVersion comes from the ConfigurationVersion attribute returned by GetConfiguration when there is new or updated data, and should be saved for subsequent calls to GetConfiguration.   
    */
  def getConfiguration(params: GetConfigurationRequest): Request[Configuration, AWSError] = js.native
  def getConfiguration(
    params: GetConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Configuration, Unit]
  ): Request[Configuration, AWSError] = js.native
  
  /**
    * Retrieves information about a configuration profile.
    */
  def getConfigurationProfile(): Request[ConfigurationProfile, AWSError] = js.native
  def getConfigurationProfile(callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfile, Unit]): Request[ConfigurationProfile, AWSError] = js.native
  /**
    * Retrieves information about a configuration profile.
    */
  def getConfigurationProfile(params: GetConfigurationProfileRequest): Request[ConfigurationProfile, AWSError] = js.native
  def getConfigurationProfile(
    params: GetConfigurationProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigurationProfile, Unit]
  ): Request[ConfigurationProfile, AWSError] = js.native
  
  /**
    * Retrieves information about a configuration deployment.
    */
  def getDeployment(): Request[Deployment, AWSError] = js.native
  def getDeployment(callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]): Request[Deployment, AWSError] = js.native
  /**
    * Retrieves information about a configuration deployment.
    */
  def getDeployment(params: GetDeploymentRequest): Request[Deployment, AWSError] = js.native
  def getDeployment(
    params: GetDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]
  ): Request[Deployment, AWSError] = js.native
  
  /**
    * Retrieves information about a deployment strategy. A deployment strategy defines important criteria for rolling out your configuration to the designated targets. A deployment strategy includes the overall duration required, a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage grows, and bake time.
    */
  def getDeploymentStrategy(): Request[DeploymentStrategy, AWSError] = js.native
  def getDeploymentStrategy(callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategy, Unit]): Request[DeploymentStrategy, AWSError] = js.native
  /**
    * Retrieves information about a deployment strategy. A deployment strategy defines important criteria for rolling out your configuration to the designated targets. A deployment strategy includes the overall duration required, a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage grows, and bake time.
    */
  def getDeploymentStrategy(params: GetDeploymentStrategyRequest): Request[DeploymentStrategy, AWSError] = js.native
  def getDeploymentStrategy(
    params: GetDeploymentStrategyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategy, Unit]
  ): Request[DeploymentStrategy, AWSError] = js.native
  
  /**
    * Retrieves information about an environment. An environment is a deployment group of AppConfig applications, such as applications in a Production environment or in an EU_Region environment. Each configuration deployment targets an environment. You can enable one or more Amazon CloudWatch alarms for an environment. If an alarm is triggered during a deployment, AppConfig roles back the configuration.
    */
  def getEnvironment(): Request[Environment, AWSError] = js.native
  def getEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ Environment, Unit]): Request[Environment, AWSError] = js.native
  /**
    * Retrieves information about an environment. An environment is a deployment group of AppConfig applications, such as applications in a Production environment or in an EU_Region environment. Each configuration deployment targets an environment. You can enable one or more Amazon CloudWatch alarms for an environment. If an alarm is triggered during a deployment, AppConfig roles back the configuration.
    */
  def getEnvironment(params: GetEnvironmentRequest): Request[Environment, AWSError] = js.native
  def getEnvironment(
    params: GetEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Environment, Unit]
  ): Request[Environment, AWSError] = js.native
  
  /**
    * Returns information about an AppConfig extension.
    */
  def getExtension(): Request[Extension, AWSError] = js.native
  def getExtension(callback: js.Function2[/* err */ AWSError, /* data */ Extension, Unit]): Request[Extension, AWSError] = js.native
  /**
    * Returns information about an AppConfig extension.
    */
  def getExtension(params: GetExtensionRequest): Request[Extension, AWSError] = js.native
  def getExtension(
    params: GetExtensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Extension, Unit]
  ): Request[Extension, AWSError] = js.native
  
  /**
    * Returns information about an AppConfig extension association. For more information about extensions and associations, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def getExtensionAssociation(): Request[ExtensionAssociation, AWSError] = js.native
  def getExtensionAssociation(callback: js.Function2[/* err */ AWSError, /* data */ ExtensionAssociation, Unit]): Request[ExtensionAssociation, AWSError] = js.native
  /**
    * Returns information about an AppConfig extension association. For more information about extensions and associations, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def getExtensionAssociation(params: GetExtensionAssociationRequest): Request[ExtensionAssociation, AWSError] = js.native
  def getExtensionAssociation(
    params: GetExtensionAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExtensionAssociation, Unit]
  ): Request[ExtensionAssociation, AWSError] = js.native
  
  /**
    * Retrieves information about a specific configuration version.
    */
  def getHostedConfigurationVersion(): Request[HostedConfigurationVersion, AWSError] = js.native
  def getHostedConfigurationVersion(callback: js.Function2[/* err */ AWSError, /* data */ HostedConfigurationVersion, Unit]): Request[HostedConfigurationVersion, AWSError] = js.native
  /**
    * Retrieves information about a specific configuration version.
    */
  def getHostedConfigurationVersion(params: GetHostedConfigurationVersionRequest): Request[HostedConfigurationVersion, AWSError] = js.native
  def getHostedConfigurationVersion(
    params: GetHostedConfigurationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ HostedConfigurationVersion, Unit]
  ): Request[HostedConfigurationVersion, AWSError] = js.native
  
  /**
    * Lists all applications in your Amazon Web Services account.
    */
  def listApplications(): Request[Applications, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ Applications, Unit]): Request[Applications, AWSError] = js.native
  /**
    * Lists all applications in your Amazon Web Services account.
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
    * Lists deployment strategies.
    */
  def listDeploymentStrategies(): Request[DeploymentStrategies, AWSError] = js.native
  def listDeploymentStrategies(callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategies, Unit]): Request[DeploymentStrategies, AWSError] = js.native
  /**
    * Lists deployment strategies.
    */
  def listDeploymentStrategies(params: ListDeploymentStrategiesRequest): Request[DeploymentStrategies, AWSError] = js.native
  def listDeploymentStrategies(
    params: ListDeploymentStrategiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeploymentStrategies, Unit]
  ): Request[DeploymentStrategies, AWSError] = js.native
  
  /**
    * Lists the deployments for an environment in descending deployment number order.
    */
  def listDeployments(): Request[Deployments, AWSError] = js.native
  def listDeployments(callback: js.Function2[/* err */ AWSError, /* data */ Deployments, Unit]): Request[Deployments, AWSError] = js.native
  /**
    * Lists the deployments for an environment in descending deployment number order.
    */
  def listDeployments(params: ListDeploymentsRequest): Request[Deployments, AWSError] = js.native
  def listDeployments(
    params: ListDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Deployments, Unit]
  ): Request[Deployments, AWSError] = js.native
  
  /**
    * Lists the environments for an application.
    */
  def listEnvironments(): Request[Environments, AWSError] = js.native
  def listEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ Environments, Unit]): Request[Environments, AWSError] = js.native
  /**
    * Lists the environments for an application.
    */
  def listEnvironments(params: ListEnvironmentsRequest): Request[Environments, AWSError] = js.native
  def listEnvironments(
    params: ListEnvironmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Environments, Unit]
  ): Request[Environments, AWSError] = js.native
  
  /**
    * Lists all AppConfig extension associations in the account. For more information about extensions and associations, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def listExtensionAssociations(): Request[ExtensionAssociations, AWSError] = js.native
  def listExtensionAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ExtensionAssociations, Unit]): Request[ExtensionAssociations, AWSError] = js.native
  /**
    * Lists all AppConfig extension associations in the account. For more information about extensions and associations, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def listExtensionAssociations(params: ListExtensionAssociationsRequest): Request[ExtensionAssociations, AWSError] = js.native
  def listExtensionAssociations(
    params: ListExtensionAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExtensionAssociations, Unit]
  ): Request[ExtensionAssociations, AWSError] = js.native
  
  /**
    * Lists all custom and Amazon Web Services-authored AppConfig extensions in the account. For more information about extensions, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def listExtensions(): Request[Extensions, AWSError] = js.native
  def listExtensions(callback: js.Function2[/* err */ AWSError, /* data */ Extensions, Unit]): Request[Extensions, AWSError] = js.native
  /**
    * Lists all custom and Amazon Web Services-authored AppConfig extensions in the account. For more information about extensions, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def listExtensions(params: ListExtensionsRequest): Request[Extensions, AWSError] = js.native
  def listExtensions(
    params: ListExtensionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Extensions, Unit]
  ): Request[Extensions, AWSError] = js.native
  
  /**
    * Lists configurations stored in the AppConfig hosted configuration store by version.
    */
  def listHostedConfigurationVersions(): Request[HostedConfigurationVersions, AWSError] = js.native
  def listHostedConfigurationVersions(callback: js.Function2[/* err */ AWSError, /* data */ HostedConfigurationVersions, Unit]): Request[HostedConfigurationVersions, AWSError] = js.native
  /**
    * Lists configurations stored in the AppConfig hosted configuration store by version.
    */
  def listHostedConfigurationVersions(params: ListHostedConfigurationVersionsRequest): Request[HostedConfigurationVersions, AWSError] = js.native
  def listHostedConfigurationVersions(
    params: ListHostedConfigurationVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ HostedConfigurationVersions, Unit]
  ): Request[HostedConfigurationVersions, AWSError] = js.native
  
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
    * Assigns metadata to an AppConfig resource. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define. You can specify a maximum of 50 tags for a resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns metadata to an AppConfig resource. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define. You can specify a maximum of 50 tags for a resource.
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
    * Updates an AppConfig extension. For more information about extensions, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def updateExtension(): Request[Extension, AWSError] = js.native
  def updateExtension(callback: js.Function2[/* err */ AWSError, /* data */ Extension, Unit]): Request[Extension, AWSError] = js.native
  /**
    * Updates an AppConfig extension. For more information about extensions, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def updateExtension(params: UpdateExtensionRequest): Request[Extension, AWSError] = js.native
  def updateExtension(
    params: UpdateExtensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Extension, Unit]
  ): Request[Extension, AWSError] = js.native
  
  /**
    * Updates an association. For more information about extensions and associations, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def updateExtensionAssociation(): Request[ExtensionAssociation, AWSError] = js.native
  def updateExtensionAssociation(callback: js.Function2[/* err */ AWSError, /* data */ ExtensionAssociation, Unit]): Request[ExtensionAssociation, AWSError] = js.native
  /**
    * Updates an association. For more information about extensions and associations, see Working with AppConfig extensions in the AppConfig User Guide.
    */
  def updateExtensionAssociation(params: UpdateExtensionAssociationRequest): Request[ExtensionAssociation, AWSError] = js.native
  def updateExtensionAssociation(
    params: UpdateExtensionAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExtensionAssociation, Unit]
  ): Request[ExtensionAssociation, AWSError] = js.native
  
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
