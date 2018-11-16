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
     * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS. Each ReplicationRun will result in the creation of an AWS AMI.
     */
  def createReplicationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS. Each ReplicationRun will result in the creation of an AWS AMI.
     */
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
     * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS. Each ReplicationRun will result in the creation of an AWS AMI.
     */
  def createReplicationJob(params: awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.CreateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS. Each ReplicationRun will result in the creation of an AWS AMI.
     */
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
     * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by the SMS service.
     */
  def deleteReplicationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by the SMS service.
     */
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
     * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by the SMS service.
     */
  def deleteReplicationJob(params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by the SMS service.
     */
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
     * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no longer be accessible to the Server Migration Service.
     */
  def deleteServerCatalog(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no longer be accessible to the Server Migration Service.
     */
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
     * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no longer be accessible to the Server Migration Service.
     */
  def deleteServerCatalog(params: awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DeleteServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no longer be accessible to the Server Migration Service.
     */
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
     * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it unavailable to support replication jobs.
     */
  def disassociateConnector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it unavailable to support replication jobs.
     */
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
     * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it unavailable to support replication jobs.
     */
  def disassociateConnector(params: awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.DisassociateConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it unavailable to support replication jobs.
     */
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
     * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
     */
  def getConnectors(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
     */
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
     * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
     */
  def getConnectors(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetConnectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
     */
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
     * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
     */
  def getReplicationJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
     */
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
     * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
     */
  def getReplicationJobs(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
     */
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
     * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a ReplicationJob.
     */
  def getReplicationRuns(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a ReplicationJob.
     */
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
     * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a ReplicationJob.
     */
  def getReplicationRuns(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetReplicationRunsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a ReplicationJob.
     */
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
     * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must previously have called ImportServerCatalog.
     */
  def getServers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must previously have called ImportServerCatalog.
     */
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
     * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must previously have called ImportServerCatalog.
     */
  def getServers(params: awsDashSdkLib.clientsSmsMod.SMSNs.GetServersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.GetServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must previously have called ImportServerCatalog.
     */
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
     * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API call requires connectors to be installed and monitoring all servers you would like imported. This API call returns immediately, but may take some time to retrieve all of the servers.
     */
  def importServerCatalog(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API call requires connectors to be installed and monitoring all servers you would like imported. This API call returns immediately, but may take some time to retrieve all of the servers.
     */
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
     * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API call requires connectors to be installed and monitoring all servers you would like imported. This API call returns immediately, but may take some time to retrieve all of the servers.
     */
  def importServerCatalog(params: awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.ImportServerCatalogResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API call requires connectors to be installed and monitoring all servers you would like imported. This API call returns immediately, but may take some time to retrieve all of the servers.
     */
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
     * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
     */
  def startOnDemandReplicationRun(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
     */
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
     * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
     */
  def startOnDemandReplicationRun(params: awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.StartOnDemandReplicationRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
     */
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
     * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
     */
  def updateReplicationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
     */
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
     * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
     */
  def updateReplicationJob(params: awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSmsMod.SMSNs.UpdateReplicationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
     */
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

