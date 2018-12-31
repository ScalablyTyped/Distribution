package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SMS: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsSmsMod.SMSNs.ClientConfiguration = js.native
  /**
    * Creates an application. An application consists of one or more server groups. Each server group contain one or more servers.
    */
  def createApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.CreateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.CreateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.CreateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an application. An application consists of one or more server groups. Each server group contain one or more servers.
    */
  def createApp(params: awsDashSdkLib.clientsSmsMod.SMSNs.CreateAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.CreateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApp(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.CreateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.CreateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.CreateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to AWS. Each replication run creates an Amazon Machine Image (AMI).
    */
  def createReplicationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReplicationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to AWS. Each replication run creates an Amazon Machine Image (AMI).
    */
  def createReplicationJob(params: awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReplicationJob(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing application. Optionally deletes the launched stack associated with the application and all AWS SMS replication jobs for servers in the application.
    */
  def deleteApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing application. Optionally deletes the launched stack associated with the application and all AWS SMS replication jobs for servers in the application.
    */
  def deleteApp(params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApp(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes existing launch configuration for an application.
    */
  def deleteAppLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAppLaunchConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes existing launch configuration for an application.
    */
  def deleteAppLaunchConfiguration(params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppLaunchConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAppLaunchConfiguration(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppLaunchConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes existing replication configuration for an application.
    */
  def deleteAppReplicationConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAppReplicationConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes existing replication configuration for an application.
    */
  def deleteAppReplicationConfiguration(params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppReplicationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAppReplicationConfiguration(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppReplicationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified replication job. After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
    */
  def deleteReplicationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReplicationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified replication job. After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
    */
  def deleteReplicationJob(params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReplicationJob(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes all servers from your server catalog.
    */
  def deleteServerCatalog(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteServerCatalog(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes all servers from your server catalog.
    */
  def deleteServerCatalog(params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteServerCatalog(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified connector from AWS SMS. After you disassociate a connector, it is no longer available to support replication jobs.
    */
  def disassociateConnector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified connector from AWS SMS. After you disassociate a connector, it is no longer available to support replication jobs.
    */
  def disassociateConnector(params: awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateConnector(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateChangeSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GenerateChangeSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def generateChangeSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GenerateChangeSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GenerateChangeSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateChangeSet(params: awsDashSdkLib.clientsSmsMod.SMSNs.GenerateChangeSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GenerateChangeSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def generateChangeSet(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.GenerateChangeSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GenerateChangeSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GenerateChangeSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GenerateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def generateTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GenerateTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GenerateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateTemplate(params: awsDashSdkLib.clientsSmsMod.SMSNs.GenerateTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GenerateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def generateTemplate(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.GenerateTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GenerateTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GenerateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve information about an application.
    */
  def getApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve information about an application.
    */
  def getApp(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getApp(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.GetAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the application launch configuration associated with an application.
    */
  def getAppLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAppLaunchConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the application launch configuration associated with an application.
    */
  def getAppLaunchConfiguration(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetAppLaunchConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAppLaunchConfiguration(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.GetAppLaunchConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves an application replication configuration associatd with an application.
    */
  def getAppReplicationConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAppReplicationConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves an application replication configuration associatd with an application.
    */
  def getAppReplicationConfiguration(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetAppReplicationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAppReplicationConfiguration(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.GetAppReplicationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the connectors registered with the AWS SMS.
    */
  def getConnectors(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConnectors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the connectors registered with the AWS SMS.
    */
  def getConnectors(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConnectors(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified replication job or all of your replication jobs.
    */
  def getReplicationJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getReplicationJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified replication job or all of your replication jobs.
    */
  def getReplicationJobs(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getReplicationJobs(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the replication runs for the specified replication job.
    */
  def getReplicationRuns(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getReplicationRuns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the replication runs for the specified replication job.
    */
  def getReplicationRuns(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getReplicationRuns(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the servers in your server catalog. Before you can describe your servers, you must import them using ImportServerCatalog.
    */
  def getServers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getServers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetServersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the servers in your server catalog. Before you can describe your servers, you must import them using ImportServerCatalog.
    */
  def getServers(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetServersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getServers(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.GetServersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.GetServersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you want to import. This call returns immediately, but might take additional time to retrieve all the servers.
    */
  def importServerCatalog(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importServerCatalog(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you want to import. This call returns immediately, but might take additional time to retrieve all the servers.
    */
  def importServerCatalog(params: awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importServerCatalog(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Launches an application stack.
    */
  def launchApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.LaunchAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def launchApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.LaunchAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.LaunchAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Launches an application stack.
    */
  def launchApp(params: awsDashSdkLib.clientsSmsMod.SMSNs.LaunchAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.LaunchAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def launchApp(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.LaunchAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.LaunchAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.LaunchAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of summaries for all applications.
    */
  def listApps(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.ListAppsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listApps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.ListAppsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.ListAppsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of summaries for all applications.
    */
  def listApps(params: awsDashSdkLib.clientsSmsMod.SMSNs.ListAppsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.ListAppsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listApps(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.ListAppsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.ListAppsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.ListAppsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a launch configuration for an application.
    */
  def putAppLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.PutAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAppLaunchConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.PutAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.PutAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a launch configuration for an application.
    */
  def putAppLaunchConfiguration(params: awsDashSdkLib.clientsSmsMod.SMSNs.PutAppLaunchConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.PutAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAppLaunchConfiguration(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.PutAppLaunchConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.PutAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.PutAppLaunchConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates or updates a replication configuration for an application.
    */
  def putAppReplicationConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.PutAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAppReplicationConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.PutAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.PutAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates or updates a replication configuration for an application.
    */
  def putAppReplicationConfiguration(params: awsDashSdkLib.clientsSmsMod.SMSNs.PutAppReplicationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.PutAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAppReplicationConfiguration(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.PutAppReplicationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.PutAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.PutAppReplicationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts replicating an application.
    */
  def startAppReplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StartAppReplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startAppReplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.StartAppReplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StartAppReplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts replicating an application.
    */
  def startAppReplication(params: awsDashSdkLib.clientsSmsMod.SMSNs.StartAppReplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StartAppReplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startAppReplication(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.StartAppReplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.StartAppReplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StartAppReplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an on-demand replication run for the specified replication job. This replication run starts immediately. This replication run is in addition to the ones already scheduled. There is a limit on the number of on-demand replications runs you can request in a 24-hour period.
    */
  def startOnDemandReplicationRun(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startOnDemandReplicationRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an on-demand replication run for the specified replication job. This replication run starts immediately. This replication run is in addition to the ones already scheduled. There is a limit on the number of on-demand replications runs you can request in a 24-hour period.
    */
  def startOnDemandReplicationRun(params: awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startOnDemandReplicationRun(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops replicating an application.
    */
  def stopAppReplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StopAppReplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopAppReplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.StopAppReplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StopAppReplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops replicating an application.
    */
  def stopAppReplication(params: awsDashSdkLib.clientsSmsMod.SMSNs.StopAppReplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StopAppReplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopAppReplication(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.StopAppReplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.StopAppReplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StopAppReplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Terminates the stack for an application.
    */
  def terminateApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.TerminateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.TerminateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.TerminateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Terminates the stack for an application.
    */
  def terminateApp(params: awsDashSdkLib.clientsSmsMod.SMSNs.TerminateAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.TerminateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateApp(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.TerminateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.TerminateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.TerminateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an application.
    */
  def updateApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.UpdateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.UpdateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.UpdateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an application.
    */
  def updateApp(params: awsDashSdkLib.clientsSmsMod.SMSNs.UpdateAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.UpdateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApp(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.UpdateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.UpdateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.UpdateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified settings for the specified replication job.
    */
  def updateReplicationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateReplicationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified settings for the specified replication job.
    */
  def updateReplicationJob(params: awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateReplicationJob(
    params: awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

