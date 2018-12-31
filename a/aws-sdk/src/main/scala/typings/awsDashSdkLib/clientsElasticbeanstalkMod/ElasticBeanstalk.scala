package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticBeanstalk
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ElasticBeanstalk: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ClientConfiguration = js.native
  /**
    * Cancels in-progress environment configuration update or application version deployment.
    */
  def abortEnvironmentUpdate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def abortEnvironmentUpdate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels in-progress environment configuration update or application version deployment.
    */
  def abortEnvironmentUpdate(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.AbortEnvironmentUpdateMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def abortEnvironmentUpdate(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.AbortEnvironmentUpdateMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a scheduled managed action immediately. A managed action can be applied only if its status is Scheduled. Get the status and action ID of a managed action with DescribeEnvironmentManagedActions.
    */
  def applyEnvironmentManagedAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplyEnvironmentManagedActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def applyEnvironmentManagedAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplyEnvironmentManagedActionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplyEnvironmentManagedActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies a scheduled managed action immediately. A managed action can be applied only if its status is Scheduled. Get the status and action ID of a managed action with DescribeEnvironmentManagedActions.
    */
  def applyEnvironmentManagedAction(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplyEnvironmentManagedActionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplyEnvironmentManagedActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def applyEnvironmentManagedAction(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplyEnvironmentManagedActionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplyEnvironmentManagedActionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplyEnvironmentManagedActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Checks if the specified CNAME is available.
    */
  def checkDNSAvailability(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CheckDNSAvailabilityResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def checkDNSAvailability(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CheckDNSAvailabilityResultMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CheckDNSAvailabilityResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Checks if the specified CNAME is available.
    */
  def checkDNSAvailability(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CheckDNSAvailabilityMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CheckDNSAvailabilityResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def checkDNSAvailability(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CheckDNSAvailabilityMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CheckDNSAvailabilityResultMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CheckDNSAvailabilityResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create or update a group of environments that each run a separate component of a single application. Takes a list of version labels that specify application source bundles for each of the environments to create or update. The name of each environment and other required information must be included in the source bundles in an environment manifest named env.yaml. See Compose Environments for details.
    */
  def composeEnvironments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def composeEnvironments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create or update a group of environments that each run a separate component of a single application. Takes a list of version labels that specify application source bundles for each of the environments to create or update. The name of each environment and other required information must be included in the source bundles in an environment manifest named env.yaml. See Compose Environments for details.
    */
  def composeEnvironments(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ComposeEnvironmentsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def composeEnvironments(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ComposeEnvironmentsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Creates an application that has one configuration template named default and no application versions. 
    */
  def createApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Creates an application that has one configuration template named default and no application versions. 
    */
  def createApplication(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateApplicationMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplication(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateApplicationMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an application version for the specified application. You can create an application version from a source bundle in Amazon S3, a commit in AWS CodeCommit, or the output of an AWS CodeBuild build as follows: Specify a commit in an AWS CodeCommit repository with SourceBuildInformation. Specify a build in an AWS CodeBuild with SourceBuildInformation and BuildConfiguration. Specify a source bundle in S3 with SourceBundle  Omit both SourceBuildInformation and SourceBundle to use the default sample application.  Once you create an application version with a specified Amazon S3 bucket and key location, you cannot change that Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an environment from the application version. 
    */
  def createApplicationVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplicationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an application version for the specified application. You can create an application version from a source bundle in Amazon S3, a commit in AWS CodeCommit, or the output of an AWS CodeBuild build as follows: Specify a commit in an AWS CodeCommit repository with SourceBuildInformation. Specify a build in an AWS CodeBuild with SourceBuildInformation and BuildConfiguration. Specify a source bundle in S3 with SourceBundle  Omit both SourceBuildInformation and SourceBundle to use the default sample application.  Once you create an application version with a specified Amazon S3 bucket and key location, you cannot change that Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an environment from the application version. 
    */
  def createApplicationVersion(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateApplicationVersionMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplicationVersion(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateApplicationVersionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a configuration template. Templates are associated with a specific application and are used to deploy different versions of the application with the same configuration settings. Templates aren't associated with any environment. The EnvironmentName response element is always null. Related Topics    DescribeConfigurationOptions     DescribeConfigurationSettings     ListAvailableSolutionStacks   
    */
  def createConfigurationTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a configuration template. Templates are associated with a specific application and are used to deploy different versions of the application with the same configuration settings. Templates aren't associated with any environment. The EnvironmentName response element is always null. Related Topics    DescribeConfigurationOptions     DescribeConfigurationSettings     ListAvailableSolutionStacks   
    */
  def createConfigurationTemplate(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateConfigurationTemplateMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationTemplate(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateConfigurationTemplateMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Launches an environment for the specified application using the specified configuration.
    */
  def createEnvironment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEnvironment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Launches an environment for the specified application using the specified configuration.
    */
  def createEnvironment(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateEnvironmentMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEnvironment(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateEnvironmentMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new version of your custom platform.
    */
  def createPlatformVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreatePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPlatformVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreatePlatformVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreatePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new version of your custom platform.
    */
  def createPlatformVersion(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreatePlatformVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreatePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPlatformVersion(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreatePlatformVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreatePlatformVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreatePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a bucket in Amazon S3 to store application versions, logs, and other files used by Elastic Beanstalk environments. The Elastic Beanstalk console and EB CLI call this API the first time you create an environment in a region. If the storage location already exists, CreateStorageLocation still returns the bucket name but does not create a new bucket.
    */
  def createStorageLocation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateStorageLocationResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStorageLocation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateStorageLocationResultMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.CreateStorageLocationResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified application along with all associated versions and configurations. The application versions will not be deleted from your Amazon S3 bucket.  You cannot delete an application that has a running environment. 
    */
  def deleteApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApplication(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified application along with all associated versions and configurations. The application versions will not be deleted from your Amazon S3 bucket.  You cannot delete an application that has a running environment. 
    */
  def deleteApplication(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeleteApplicationMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApplication(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeleteApplicationMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified version from the specified application.  You cannot delete an application version that is associated with a running environment. 
    */
  def deleteApplicationVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApplicationVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified version from the specified application.  You cannot delete an application version that is associated with a running environment. 
    */
  def deleteApplicationVersion(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeleteApplicationVersionMessage
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApplicationVersion(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeleteApplicationVersionMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified configuration template.  When you launch an environment using a configuration template, the environment gets a copy of the template. You can delete or modify the environment's copy of the template without affecting the running environment. 
    */
  def deleteConfigurationTemplate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConfigurationTemplate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified configuration template.  When you launch an environment using a configuration template, the environment gets a copy of the template. You can delete or modify the environment's copy of the template without affecting the running environment. 
    */
  def deleteConfigurationTemplate(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeleteConfigurationTemplateMessage
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConfigurationTemplate(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeleteConfigurationTemplateMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the draft configuration associated with the running environment. Updating a running environment with any configuration changes creates a draft configuration set. You can get the draft configuration using DescribeConfigurationSettings while the update is in progress or if the update fails. The DeploymentStatus for the draft configuration indicates whether the deployment is in process or has failed. The draft configuration remains in existence until it is deleted with this action.
    */
  def deleteEnvironmentConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEnvironmentConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the draft configuration associated with the running environment. Updating a running environment with any configuration changes creates a draft configuration set. You can get the draft configuration using DescribeConfigurationSettings while the update is in progress or if the update fails. The DeploymentStatus for the draft configuration indicates whether the deployment is in process or has failed. The draft configuration remains in existence until it is deleted with this action.
    */
  def deleteEnvironmentConfiguration(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeleteEnvironmentConfigurationMessage
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEnvironmentConfiguration(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeleteEnvironmentConfigurationMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified version of a custom platform.
    */
  def deletePlatformVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeletePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePlatformVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeletePlatformVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeletePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified version of a custom platform.
    */
  def deletePlatformVersion(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeletePlatformVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeletePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePlatformVersion(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeletePlatformVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeletePlatformVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DeletePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns attributes related to AWS Elastic Beanstalk that are associated with the calling AWS account. The result currently has one set of attributes—resource quotas.
    */
  def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeAccountAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeAccountAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeAccountAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a list of application versions.
    */
  def describeApplicationVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeApplicationVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a list of application versions.
    */
  def describeApplicationVersions(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeApplicationVersionsMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeApplicationVersions(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeApplicationVersionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the descriptions of existing applications.
    */
  def describeApplications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the descriptions of existing applications.
    */
  def describeApplications(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeApplicationsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeApplications(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeApplicationsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the configuration options that are used in a particular configuration template or environment, or that a specified solution stack defines. The description includes the values the options, their default values, and an indication of the required action on a running environment if an option value is changed.
    */
  def describeConfigurationOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationOptionsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationOptionsDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationOptionsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the configuration options that are used in a particular configuration template or environment, or that a specified solution stack defines. The description includes the values the options, their default values, and an indication of the required action on a running environment if an option value is changed.
    */
  def describeConfigurationOptions(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeConfigurationOptionsMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationOptionsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationOptions(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeConfigurationOptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationOptionsDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationOptionsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a description of the settings for the specified configuration set, that is, either a configuration template or the configuration set associated with a running environment. When describing the settings for the configuration set associated with a running environment, it is possible to receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft configuration of an environment that is either in the process of deployment or that failed to deploy. Related Topics    DeleteEnvironmentConfiguration   
    */
  def describeConfigurationSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescriptions, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescriptions, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescriptions, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a description of the settings for the specified configuration set, that is, either a configuration template or the configuration set associated with a running environment. When describing the settings for the configuration set associated with a running environment, it is possible to receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft configuration of an environment that is either in the process of deployment or that failed to deploy. Related Topics    DeleteEnvironmentConfiguration   
    */
  def describeConfigurationSettings(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeConfigurationSettingsMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescriptions, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationSettings(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeConfigurationSettingsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescriptions, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescriptions, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the overall health of the specified environment. The DescribeEnvironmentHealth operation is only available with AWS Elastic Beanstalk Enhanced Health.
    */
  def describeEnvironmentHealth(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentHealthResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentHealth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentHealthResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentHealthResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the overall health of the specified environment. The DescribeEnvironmentHealth operation is only available with AWS Elastic Beanstalk Enhanced Health.
    */
  def describeEnvironmentHealth(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentHealthRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentHealthResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentHealth(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentHealthRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentHealthResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentHealthResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists an environment's completed and failed managed actions.
    */
  def describeEnvironmentManagedActionHistory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentManagedActionHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionHistoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists an environment's completed and failed managed actions.
    */
  def describeEnvironmentManagedActionHistory(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionHistoryRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentManagedActionHistory(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionHistoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionHistoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionHistoryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists an environment's upcoming and in-progress managed actions.
    */
  def describeEnvironmentManagedActions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentManagedActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists an environment's upcoming and in-progress managed actions.
    */
  def describeEnvironmentManagedActions(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentManagedActions(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentManagedActionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns AWS resources for this environment.
    */
  def describeEnvironmentResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentResourceDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentResourceDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentResourceDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns AWS resources for this environment.
    */
  def describeEnvironmentResources(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentResourcesMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentResourceDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentResources(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentResourcesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentResourceDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentResourceDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns descriptions for existing environments.
    */
  def describeEnvironments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns descriptions for existing environments.
    */
  def describeEnvironments(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironments(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEnvironmentsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns list of event descriptions matching criteria up to the last 6 weeks.  This action returns the most recent 1,000 events from the specified NextToken. 
    */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EventDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EventDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EventDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns list of event descriptions matching criteria up to the last 6 weeks.  This action returns the most recent 1,000 events from the specified NextToken. 
    */
  def describeEvents(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EventDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeEventsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EventDescriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EventDescriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves detailed information about the health of instances in your AWS Elastic Beanstalk. This operation requires enhanced health reporting.
    */
  def describeInstancesHealth(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeInstancesHealthResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstancesHealth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeInstancesHealthResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeInstancesHealthResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves detailed information about the health of instances in your AWS Elastic Beanstalk. This operation requires enhanced health reporting.
    */
  def describeInstancesHealth(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeInstancesHealthRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeInstancesHealthResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstancesHealth(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeInstancesHealthRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeInstancesHealthResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribeInstancesHealthResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the version of the platform.
    */
  def describePlatformVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePlatformVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribePlatformVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the version of the platform.
    */
  def describePlatformVersion(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribePlatformVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePlatformVersion(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribePlatformVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribePlatformVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.DescribePlatformVersionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the available solution stack names, with the public version first and then in reverse chronological order.
    */
  def listAvailableSolutionStacks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListAvailableSolutionStacksResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAvailableSolutionStacks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListAvailableSolutionStacksResultMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListAvailableSolutionStacksResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the available platforms.
    */
  def listPlatformVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListPlatformVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPlatformVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListPlatformVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListPlatformVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the available platforms.
    */
  def listPlatformVersions(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListPlatformVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListPlatformVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPlatformVersions(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListPlatformVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListPlatformVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListPlatformVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the tags applied to an AWS Elastic Beanstalk resource. The response contains a list of tag key-value pairs. Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about environment tagging, see Tagging Resources in Your Elastic Beanstalk Environment.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ResourceTagsDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ResourceTagsDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ResourceTagsDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the tags applied to an AWS Elastic Beanstalk resource. The response contains a list of tag key-value pairs. Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about environment tagging, see Tagging Resources in Your Elastic Beanstalk Environment.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ResourceTagsDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ListTagsForResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ResourceTagsDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ResourceTagsDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a specified environment and forces a restart.
    */
  def rebuildEnvironment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebuildEnvironment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a specified environment and forces a restart.
    */
  def rebuildEnvironment(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RebuildEnvironmentMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebuildEnvironment(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RebuildEnvironmentMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a request to compile the specified type of information of the deployed environment.  Setting the InfoType to tail compiles the last lines from the application server log files of every Amazon EC2 instance in your environment.   Setting the InfoType to bundle compresses the application server log files for every Amazon EC2 instance into a .zip file. Legacy and .NET containers do not support bundle logs.   Use RetrieveEnvironmentInfo to obtain the set of logs.  Related Topics    RetrieveEnvironmentInfo   
    */
  def requestEnvironmentInfo(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def requestEnvironmentInfo(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a request to compile the specified type of information of the deployed environment.  Setting the InfoType to tail compiles the last lines from the application server log files of every Amazon EC2 instance in your environment.   Setting the InfoType to bundle compresses the application server log files for every Amazon EC2 instance into a .zip file. Legacy and .NET containers do not support bundle logs.   Use RetrieveEnvironmentInfo to obtain the set of logs.  Related Topics    RetrieveEnvironmentInfo   
    */
  def requestEnvironmentInfo(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RequestEnvironmentInfoMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def requestEnvironmentInfo(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RequestEnvironmentInfoMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Causes the environment to restart the application container server running on each Amazon EC2 instance.
    */
  def restartAppServer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restartAppServer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Causes the environment to restart the application container server running on each Amazon EC2 instance.
    */
  def restartAppServer(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RestartAppServerMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restartAppServer(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RestartAppServerMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the compiled information from a RequestEnvironmentInfo request. Related Topics    RequestEnvironmentInfo   
    */
  def retrieveEnvironmentInfo(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RetrieveEnvironmentInfoResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def retrieveEnvironmentInfo(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RetrieveEnvironmentInfoResultMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RetrieveEnvironmentInfoResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the compiled information from a RequestEnvironmentInfo request. Related Topics    RequestEnvironmentInfo   
    */
  def retrieveEnvironmentInfo(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RetrieveEnvironmentInfoMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RetrieveEnvironmentInfoResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def retrieveEnvironmentInfo(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RetrieveEnvironmentInfoMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RetrieveEnvironmentInfoResultMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.RetrieveEnvironmentInfoResultMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Swaps the CNAMEs of two environments.
    */
  def swapEnvironmentCNAMEs(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def swapEnvironmentCNAMEs(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Swaps the CNAMEs of two environments.
    */
  def swapEnvironmentCNAMEs(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.SwapEnvironmentCNAMEsMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def swapEnvironmentCNAMEs(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.SwapEnvironmentCNAMEsMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Terminates the specified environment.
    */
  def terminateEnvironment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateEnvironment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Terminates the specified environment.
    */
  def terminateEnvironment(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.TerminateEnvironmentMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateEnvironment(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.TerminateEnvironmentMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified application to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear these properties, specify an empty string. 
    */
  def updateApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified application to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear these properties, specify an empty string. 
    */
  def updateApplication(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateApplicationMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplication(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateApplicationMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies lifecycle settings for an application.
    */
  def updateApplicationResourceLifecycle(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationResourceLifecycleDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplicationResourceLifecycle(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationResourceLifecycleDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationResourceLifecycleDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies lifecycle settings for an application.
    */
  def updateApplicationResourceLifecycle(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateApplicationResourceLifecycleMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationResourceLifecycleDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplicationResourceLifecycle(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateApplicationResourceLifecycleMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationResourceLifecycleDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationResourceLifecycleDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified application version to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear properties, specify an empty string. 
    */
  def updateApplicationVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplicationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified application version to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear properties, specify an empty string. 
    */
  def updateApplicationVersion(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateApplicationVersionMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplicationVersion(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateApplicationVersionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationVersionDescriptionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified configuration template to have the specified properties or configuration option values.  If a property (for example, ApplicationName) is not provided, its value remains unchanged. To clear such properties, specify an empty string.  Related Topics    DescribeConfigurationOptions   
    */
  def updateConfigurationTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConfigurationTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified configuration template to have the specified properties or configuration option values.  If a property (for example, ApplicationName) is not provided, its value remains unchanged. To clear such properties, specify an empty string.  Related Topics    DescribeConfigurationOptions   
    */
  def updateConfigurationTemplate(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateConfigurationTemplateMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConfigurationTemplate(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateConfigurationTemplateMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the environment description, deploys a new application version, updates the configuration settings to an entirely new configuration template, or updates select configuration option values in the running environment.  Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an InvalidParameterCombination error.   When updating the configuration settings to a new template or individual settings, a draft configuration is created and DescribeConfigurationSettings for this environment returns two setting descriptions with different DeploymentStatus values. 
    */
  def updateEnvironment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEnvironment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the environment description, deploys a new application version, updates the configuration settings to an entirely new configuration template, or updates select configuration option values in the running environment.  Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an InvalidParameterCombination error.   When updating the configuration settings to a new template or individual settings, a draft configuration is created and DescribeConfigurationSettings for this environment returns two setting descriptions with different DeploymentStatus values. 
    */
  def updateEnvironment(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateEnvironmentMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEnvironment(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateEnvironmentMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists can be passed: TagsToAdd for tags to add or update, and TagsToRemove. Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about environment tagging, see Tagging Resources in Your Elastic Beanstalk Environment. If you create a custom IAM user policy to control permission to this operation, specify one of the following two virtual actions (or both) instead of the API operation name:  elasticbeanstalk:AddTags  Controls permission to call UpdateTagsForResource and pass a list of tags to add in the TagsToAdd parameter.  elasticbeanstalk:RemoveTags  Controls permission to call UpdateTagsForResource and pass a list of tag keys to remove in the TagsToRemove parameter.   For details about creating a custom user policy, see Creating a Custom User Policy.
    */
  def updateTagsForResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTagsForResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists can be passed: TagsToAdd for tags to add or update, and TagsToRemove. Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about environment tagging, see Tagging Resources in Your Elastic Beanstalk Environment. If you create a custom IAM user policy to control permission to this operation, specify one of the following two virtual actions (or both) instead of the API operation name:  elasticbeanstalk:AddTags  Controls permission to call UpdateTagsForResource and pass a list of tags to add in the TagsToAdd parameter.  elasticbeanstalk:RemoveTags  Controls permission to call UpdateTagsForResource and pass a list of tag keys to remove in the TagsToRemove parameter.   For details about creating a custom user policy, see Creating a Custom User Policy.
    */
  def updateTagsForResource(params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTagsForResource(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.UpdateTagsForResourceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Takes a set of configuration settings and either a configuration template or environment, and determines whether those values are valid. This action returns a list of messages indicating any errors or warnings associated with the selection of option values.
    */
  def validateConfigurationSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsValidationMessages, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def validateConfigurationSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsValidationMessages, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsValidationMessages, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Takes a set of configuration settings and either a configuration template or environment, and determines whether those values are valid. This action returns a list of messages indicating any errors or warnings associated with the selection of option values.
    */
  def validateConfigurationSettings(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ValidateConfigurationSettingsMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsValidationMessages, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def validateConfigurationSettings(
    params: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ValidateConfigurationSettingsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsValidationMessages, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ConfigurationSettingsValidationMessages, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

