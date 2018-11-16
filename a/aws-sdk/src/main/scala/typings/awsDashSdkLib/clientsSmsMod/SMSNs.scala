package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/sms", "SMS")
@js.native
object SMSNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Connector extends js.Object {
    var associatedOn: js.UndefOr[Timestamp] = js.undefined
    var capabilityList: js.UndefOr[ConnectorCapabilityList] = js.undefined
    var connectorId: js.UndefOr[ConnectorId] = js.undefined
    var ipAddress: js.UndefOr[IpAddress] = js.undefined
    var macAddress: js.UndefOr[MacAddress] = js.undefined
    var status: js.UndefOr[ConnectorStatus] = js.undefined
    var version: js.UndefOr[ConnectorVersion] = js.undefined
    var vmManagerId: js.UndefOr[VmManagerId] = js.undefined
    var vmManagerName: js.UndefOr[VmManagerName] = js.undefined
    var vmManagerType: js.UndefOr[VmManagerType] = js.undefined
  }
  
  
  trait CreateReplicationJobRequest extends js.Object {
    var description: js.UndefOr[Description] = js.undefined
    var frequency: Frequency
    var licenseType: js.UndefOr[LicenseType] = js.undefined
    var roleName: js.UndefOr[RoleName] = js.undefined
    var seedReplicationTime: Timestamp
    var serverId: ServerId
  }
  
  
  trait CreateReplicationJobResponse extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
  }
  
  
  trait DeleteReplicationJobRequest extends js.Object {
    var replicationJobId: ReplicationJobId
  }
  
  
  trait DeleteReplicationJobResponse extends js.Object
  
  
  trait DeleteServerCatalogRequest extends js.Object
  
  
  trait DeleteServerCatalogResponse extends js.Object
  
  
  trait DisassociateConnectorRequest extends js.Object {
    var connectorId: ConnectorId
  }
  
  
  trait DisassociateConnectorResponse extends js.Object
  
  
  trait GetConnectorsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetConnectorsResponse extends js.Object {
    var connectorList: js.UndefOr[ConnectorList] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetReplicationJobsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
    var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
  }
  
  
  trait GetReplicationJobsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken] = js.undefined
    var replicationJobList: js.UndefOr[ReplicationJobList] = js.undefined
  }
  
  
  trait GetReplicationRunsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
    var replicationJobId: ReplicationJobId
  }
  
  
  trait GetReplicationRunsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken] = js.undefined
    var replicationJob: js.UndefOr[ReplicationJob] = js.undefined
    var replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined
  }
  
  
  trait GetServersRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetServersResponse extends js.Object {
    var lastModifiedOn: js.UndefOr[Timestamp] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
    var serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.undefined
    var serverList: js.UndefOr[ServerList] = js.undefined
  }
  
  
  trait ImportServerCatalogRequest extends js.Object
  
  
  trait ImportServerCatalogResponse extends js.Object
  
  
  trait ReplicationJob extends js.Object {
    var description: js.UndefOr[Description] = js.undefined
    var frequency: js.UndefOr[Frequency] = js.undefined
    var latestAmiId: js.UndefOr[AmiId] = js.undefined
    var licenseType: js.UndefOr[LicenseType] = js.undefined
    var nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined
    var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
    var replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined
    var roleName: js.UndefOr[RoleName] = js.undefined
    var seedReplicationTime: js.UndefOr[Timestamp] = js.undefined
    var serverId: js.UndefOr[ServerId] = js.undefined
    var serverType: js.UndefOr[ServerType] = js.undefined
    var state: js.UndefOr[ReplicationJobState] = js.undefined
    var statusMessage: js.UndefOr[ReplicationJobStatusMessage] = js.undefined
    var vmServer: js.UndefOr[VmServer] = js.undefined
  }
  
  
  trait ReplicationRun extends js.Object {
    var amiId: js.UndefOr[AmiId] = js.undefined
    var completedTime: js.UndefOr[Timestamp] = js.undefined
    var description: js.UndefOr[Description] = js.undefined
    var replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
    var scheduledStartTime: js.UndefOr[Timestamp] = js.undefined
    var state: js.UndefOr[ReplicationRunState] = js.undefined
    var statusMessage: js.UndefOr[ReplicationRunStatusMessage] = js.undefined
    var `type`: js.UndefOr[ReplicationRunType] = js.undefined
  }
  
  
  trait Server extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
    var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.undefined
    var serverId: js.UndefOr[ServerId] = js.undefined
    var serverType: js.UndefOr[ServerType] = js.undefined
    var vmServer: js.UndefOr[VmServer] = js.undefined
  }
  
  
  trait StartOnDemandReplicationRunRequest extends js.Object {
    var description: js.UndefOr[Description] = js.undefined
    var replicationJobId: ReplicationJobId
  }
  
  
  trait StartOnDemandReplicationRunResponse extends js.Object {
    var replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS. Each ReplicationRun will result in the creation of an AWS AMI.
       */
    def createReplicationJob(): awsDashSdkLib.libRequestMod.Request[CreateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS. Each ReplicationRun will result in the creation of an AWS AMI.
       */
    def createReplicationJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReplicationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS. Each ReplicationRun will result in the creation of an AWS AMI.
       */
    def createReplicationJob(params: CreateReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[CreateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS. Each ReplicationRun will result in the creation of an AWS AMI.
       */
    def createReplicationJob(
      params: CreateReplicationJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReplicationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by the SMS service.
       */
    def deleteReplicationJob(): awsDashSdkLib.libRequestMod.Request[DeleteReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by the SMS service.
       */
    def deleteReplicationJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReplicationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by the SMS service.
       */
    def deleteReplicationJob(params: DeleteReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[DeleteReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by the SMS service.
       */
    def deleteReplicationJob(
      params: DeleteReplicationJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReplicationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no longer be accessible to the Server Migration Service.
       */
    def deleteServerCatalog(): awsDashSdkLib.libRequestMod.Request[DeleteServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no longer be accessible to the Server Migration Service.
       */
    def deleteServerCatalog(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteServerCatalogResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no longer be accessible to the Server Migration Service.
       */
    def deleteServerCatalog(params: DeleteServerCatalogRequest): awsDashSdkLib.libRequestMod.Request[DeleteServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no longer be accessible to the Server Migration Service.
       */
    def deleteServerCatalog(
      params: DeleteServerCatalogRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteServerCatalogResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it unavailable to support replication jobs.
       */
    def disassociateConnector(): awsDashSdkLib.libRequestMod.Request[DisassociateConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it unavailable to support replication jobs.
       */
    def disassociateConnector(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it unavailable to support replication jobs.
       */
    def disassociateConnector(params: DisassociateConnectorRequest): awsDashSdkLib.libRequestMod.Request[DisassociateConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it unavailable to support replication jobs.
       */
    def disassociateConnector(
      params: DisassociateConnectorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
       */
    def getConnectors(): awsDashSdkLib.libRequestMod.Request[GetConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
       */
    def getConnectors(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConnectorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
       */
    def getConnectors(params: GetConnectorsRequest): awsDashSdkLib.libRequestMod.Request[GetConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
       */
    def getConnectors(
      params: GetConnectorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConnectorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
       */
    def getReplicationJobs(): awsDashSdkLib.libRequestMod.Request[GetReplicationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
       */
    def getReplicationJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReplicationJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReplicationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
       */
    def getReplicationJobs(params: GetReplicationJobsRequest): awsDashSdkLib.libRequestMod.Request[GetReplicationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
       */
    def getReplicationJobs(
      params: GetReplicationJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReplicationJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReplicationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a ReplicationJob.
       */
    def getReplicationRuns(): awsDashSdkLib.libRequestMod.Request[GetReplicationRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a ReplicationJob.
       */
    def getReplicationRuns(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReplicationRunsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReplicationRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a ReplicationJob.
       */
    def getReplicationRuns(params: GetReplicationRunsRequest): awsDashSdkLib.libRequestMod.Request[GetReplicationRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a ReplicationJob.
       */
    def getReplicationRuns(
      params: GetReplicationRunsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReplicationRunsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReplicationRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must previously have called ImportServerCatalog.
       */
    def getServers(): awsDashSdkLib.libRequestMod.Request[GetServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must previously have called ImportServerCatalog.
       */
    def getServers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must previously have called ImportServerCatalog.
       */
    def getServers(params: GetServersRequest): awsDashSdkLib.libRequestMod.Request[GetServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must previously have called ImportServerCatalog.
       */
    def getServers(
      params: GetServersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API call requires connectors to be installed and monitoring all servers you would like imported. This API call returns immediately, but may take some time to retrieve all of the servers.
       */
    def importServerCatalog(): awsDashSdkLib.libRequestMod.Request[ImportServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API call requires connectors to be installed and monitoring all servers you would like imported. This API call returns immediately, but may take some time to retrieve all of the servers.
       */
    def importServerCatalog(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportServerCatalogResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API call requires connectors to be installed and monitoring all servers you would like imported. This API call returns immediately, but may take some time to retrieve all of the servers.
       */
    def importServerCatalog(params: ImportServerCatalogRequest): awsDashSdkLib.libRequestMod.Request[ImportServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API call requires connectors to be installed and monitoring all servers you would like imported. This API call returns immediately, but may take some time to retrieve all of the servers.
       */
    def importServerCatalog(
      params: ImportServerCatalogRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportServerCatalogResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
       */
    def startOnDemandReplicationRun(): awsDashSdkLib.libRequestMod.Request[StartOnDemandReplicationRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
       */
    def startOnDemandReplicationRun(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartOnDemandReplicationRunResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartOnDemandReplicationRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
       */
    def startOnDemandReplicationRun(params: StartOnDemandReplicationRunRequest): awsDashSdkLib.libRequestMod.Request[StartOnDemandReplicationRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
       */
    def startOnDemandReplicationRun(
      params: StartOnDemandReplicationRunRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartOnDemandReplicationRunResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartOnDemandReplicationRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
       */
    def updateReplicationJob(): awsDashSdkLib.libRequestMod.Request[UpdateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
       */
    def updateReplicationJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateReplicationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
       */
    def updateReplicationJob(params: UpdateReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[UpdateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
       */
    def updateReplicationJob(
      params: UpdateReplicationJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateReplicationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateReplicationJobRequest extends js.Object {
    var description: js.UndefOr[Description] = js.undefined
    var frequency: js.UndefOr[Frequency] = js.undefined
    var licenseType: js.UndefOr[LicenseType] = js.undefined
    var nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined
    var replicationJobId: ReplicationJobId
    var roleName: js.UndefOr[RoleName] = js.undefined
  }
  
  
  trait UpdateReplicationJobResponse extends js.Object
  
  
  trait VmServer extends js.Object {
    var vmManagerName: js.UndefOr[VmManagerName] = js.undefined
    var vmManagerType: js.UndefOr[VmManagerType] = js.undefined
    var vmName: js.UndefOr[VmName] = js.undefined
    var vmPath: js.UndefOr[VmPath] = js.undefined
    var vmServerAddress: js.UndefOr[VmServerAddress] = js.undefined
  }
  
  
  trait VmServerAddress extends js.Object {
    var vmId: js.UndefOr[VmId] = js.undefined
    var vmManagerId: js.UndefOr[VmManagerId] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AmiId = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConnectorCapability = awsDashSdkLib.awsDashSdkLibStrings.VSPHERE | java.lang.String
  type ConnectorCapabilityList = js.Array[ConnectorCapability]
  type ConnectorId = java.lang.String
  type ConnectorList = js.Array[Connector]
  type ConnectorStatus = awsDashSdkLib.awsDashSdkLibStrings.HEALTHY | awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY | java.lang.String
  type ConnectorVersion = java.lang.String
  type Description = java.lang.String
  type Frequency = scala.Double
  type IpAddress = java.lang.String
  type LicenseType = awsDashSdkLib.awsDashSdkLibStrings.AWS | awsDashSdkLib.awsDashSdkLibStrings.BYOL | java.lang.String
  type MacAddress = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type ReplicationJobId = java.lang.String
  type ReplicationJobList = js.Array[ReplicationJob]
  type ReplicationJobState = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.DELETED | java.lang.String
  type ReplicationJobStatusMessage = java.lang.String
  type ReplicationJobTerminated = scala.Boolean
  type ReplicationRunId = java.lang.String
  type ReplicationRunList = js.Array[ReplicationRun]
  type ReplicationRunState = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.MISSED | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.DELETED | java.lang.String
  type ReplicationRunStatusMessage = java.lang.String
  type ReplicationRunType = awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND | awsDashSdkLib.awsDashSdkLibStrings.AUTOMATIC | java.lang.String
  type RoleName = java.lang.String
  type ServerCatalogStatus = awsDashSdkLib.awsDashSdkLibStrings.NOT_IMPORTED | awsDashSdkLib.awsDashSdkLibStrings.IMPORTING | awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.DELETED | awsDashSdkLib.awsDashSdkLibStrings.EXPIRED | java.lang.String
  type ServerId = java.lang.String
  type ServerList = js.Array[Server]
  type ServerType = awsDashSdkLib.awsDashSdkLibStrings.VIRTUAL_MACHINE | java.lang.String
  type Timestamp = stdLib.Date
  type VmId = java.lang.String
  type VmManagerId = java.lang.String
  type VmManagerName = java.lang.String
  type VmManagerType = awsDashSdkLib.awsDashSdkLibStrings.VSPHERE | java.lang.String
  type VmName = java.lang.String
  type VmPath = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-10-24` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

