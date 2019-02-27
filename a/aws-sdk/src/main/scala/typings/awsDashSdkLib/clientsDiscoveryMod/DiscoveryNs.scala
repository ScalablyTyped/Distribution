package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/discovery", "Discovery")
@js.native
object DiscoveryNs extends js.Object {
  trait AgentConfigurationStatus extends js.Object {
    /**
      * The agent/connector ID.
      */
    var agentId: js.UndefOr[String] = js.undefined
    /**
      * A description of the operation performed.
      */
    var description: js.UndefOr[String] = js.undefined
    /**
      * Information about the status of the StartDataCollection and StopDataCollection operations. The system has recorded the data collection operation. The agent/connector receives this command the next time it polls for a new command. 
      */
    var operationSucceeded: js.UndefOr[Boolean] = js.undefined
  }
  
  trait AgentInfo extends js.Object {
    /**
      * The agent or connector ID.
      */
    var agentId: js.UndefOr[AgentId] = js.undefined
    /**
      * Network details about the host where the agent or connector resides.
      */
    var agentNetworkInfoList: js.UndefOr[AgentNetworkInfoList] = js.undefined
    /**
      * Type of agent.
      */
    var agentType: js.UndefOr[String] = js.undefined
    /**
      * Status of the collection process for an agent or connector.
      */
    var collectionStatus: js.UndefOr[String] = js.undefined
    /**
      * The ID of the connector.
      */
    var connectorId: js.UndefOr[String] = js.undefined
    /**
      * The health of the agent or connector.
      */
    var health: js.UndefOr[AgentStatus] = js.undefined
    /**
      * The name of the host where the agent or connector resides. The host can be a server or virtual machine.
      */
    var hostName: js.UndefOr[String] = js.undefined
    /**
      * Time since agent or connector health was reported.
      */
    var lastHealthPingTime: js.UndefOr[String] = js.undefined
    /**
      * Agent's first registration timestamp in UTC.
      */
    var registeredTime: js.UndefOr[String] = js.undefined
    /**
      * The agent or connector version.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  
  trait AgentNetworkInfo extends js.Object {
    /**
      * The IP address for the host where the agent/connector resides.
      */
    var ipAddress: js.UndefOr[String] = js.undefined
    /**
      * The MAC address for the host where the agent/connector resides.
      */
    var macAddress: js.UndefOr[String] = js.undefined
  }
  
  trait AssociateConfigurationItemsToApplicationRequest extends js.Object {
    /**
      * The configuration ID of an application with which items are to be associated.
      */
    var applicationConfigurationId: ApplicationId
    /**
      * The ID of each configuration item to be associated with an application.
      */
    var configurationIds: ConfigurationIdList
  }
  
  trait AssociateConfigurationItemsToApplicationResponse extends js.Object
  
  trait BatchDeleteImportDataError extends js.Object {
    /**
      * The type of error that occurred for a specific import task.
      */
    var errorCode: js.UndefOr[BatchDeleteImportDataErrorCode] = js.undefined
    /**
      * The description of the error that occurred for a specific import task.
      */
    var errorDescription: js.UndefOr[BatchDeleteImportDataErrorDescription] = js.undefined
    /**
      * The unique import ID associated with the error that occurred.
      */
    var importTaskId: js.UndefOr[ImportTaskIdentifier] = js.undefined
  }
  
  trait BatchDeleteImportDataRequest extends js.Object {
    /**
      * The IDs for the import tasks that you want to delete.
      */
    var importTaskIds: ToDeleteIdentifierList
  }
  
  trait BatchDeleteImportDataResponse extends js.Object {
    /**
      * Error messages returned for each import task that you deleted as a response for this command.
      */
    var errors: js.UndefOr[BatchDeleteImportDataErrorList] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Configuration
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait ConfigurationTag extends js.Object {
    /**
      * The configuration ID for the item to tag. You can specify a list of keys and values.
      */
    var configurationId: js.UndefOr[ConfigurationId] = js.undefined
    /**
      * A type of IT asset to tag.
      */
    var configurationType: js.UndefOr[ConfigurationItemType] = js.undefined
    /**
      * A type of tag on which to filter. For example, serverType.
      */
    var key: js.UndefOr[TagKey] = js.undefined
    /**
      * The time the configuration tag was created in Coordinated Universal Time (UTC).
      */
    var timeOfCreation: js.UndefOr[TimeStamp] = js.undefined
    /**
      * A value on which to filter. For example key = serverType and value = web server.
      */
    var value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait ContinuousExportDescription extends js.Object {
    /**
      * The type of data collector used to gather this data (currently only offered for AGENT).
      */
    var dataSource: js.UndefOr[DataSource] = js.undefined
    /**
      * The unique ID assigned to this export.
      */
    var exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
    /**
      * The name of the s3 bucket where the export data parquet files are stored.
      */
    var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * An object which describes how the data is stored.    databaseName - the name of the Glue database used to store the schema.  
      */
    var schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined
    /**
      * The timestamp representing when the continuous export was started.
      */
    var startTime: js.UndefOr[TimeStamp] = js.undefined
    /**
      * Describes the status of the export. Can be one of the following values:   START_IN_PROGRESS - setting up resources to start continuous export.   START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export again.   ACTIVE - data is being exported to the customer bucket.   ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and start-continuous-export.   STOP_IN_PROGRESS - stopping the export.   STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.   INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer bucket.  
      */
    var status: js.UndefOr[ContinuousExportStatus] = js.undefined
    /**
      * Contains information about any errors that have occurred. This data type can have the following values:   ACCESS_DENIED - You don’t have permission to start Data Exploration in Amazon Athena. Contact your AWS administrator for help. For more information, see Setting Up AWS Application Discovery Service in the Application Discovery Service User Guide.   DELIVERY_STREAM_LIMIT_FAILURE - You reached the limit for Amazon Kinesis Data Firehose delivery streams. Reduce the number of streams or request a limit increase and try again. For more information, see Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide.   FIREHOSE_ROLE_MISSING - The Data Exploration feature is in an error state because your IAM User is missing the AWSApplicationDiscoveryServiceFirehose role. Turn on Data Exploration in Amazon Athena and try again. For more information, see Step 3: Provide Application Discovery Service Access to Non-Administrator Users by Attaching Policies in the Application Discovery Service User Guide.   FIREHOSE_STREAM_DOES_NOT_EXIST - The Data Exploration feature is in an error state because your IAM User is missing one or more of the Kinesis data delivery streams.   INTERNAL_FAILURE - The Data Exploration feature is in an error state because of an internal failure. Try again later. If this problem persists, contact AWS Support.   S3_BUCKET_LIMIT_FAILURE - You reached the limit for Amazon S3 buckets. Reduce the number of Amazon S3 buckets or request a limit increase and try again. For more information, see Bucket Restrictions and Limitations in the Amazon Simple Storage Service Developer Guide.   S3_NOT_SIGNED_UP - Your account is not signed up for the Amazon S3 service. You must sign up before you can use Amazon S3. You can sign up at the following URL: https://aws.amazon.com/s3.  
      */
    var statusDetail: js.UndefOr[StringMax255] = js.undefined
    /**
      * The timestamp that represents when this continuous export was stopped.
      */
    var stopTime: js.UndefOr[TimeStamp] = js.undefined
  }
  
  trait CreateApplicationRequest extends js.Object {
    /**
      * Description of the application to be created.
      */
    var description: js.UndefOr[String] = js.undefined
    /**
      * Name of the application to be created.
      */
    var name: String
  }
  
  trait CreateApplicationResponse extends js.Object {
    /**
      * Configuration ID of an application to be created.
      */
    var configurationId: js.UndefOr[String] = js.undefined
  }
  
  trait CreateTagsRequest extends js.Object {
    /**
      * A list of configuration items that you want to tag.
      */
    var configurationIds: ConfigurationIdList
    /**
      * Tags that you want to associate with one or more configuration items. Specify the tags that you want to create in a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
      */
    var tags: TagSet
  }
  
  trait CreateTagsResponse extends js.Object
  
  trait CustomerAgentInfo extends js.Object {
    /**
      * Number of active discovery agents.
      */
    var activeAgents: Integer
    /**
      * Number of blacklisted discovery agents.
      */
    var blackListedAgents: Integer
    /**
      * Number of healthy discovery agents
      */
    var healthyAgents: Integer
    /**
      * Number of discovery agents with status SHUTDOWN.
      */
    var shutdownAgents: Integer
    /**
      * Total number of discovery agents.
      */
    var totalAgents: Integer
    /**
      * Number of unhealthy discovery agents.
      */
    var unhealthyAgents: Integer
    /**
      * Number of unknown discovery agents.
      */
    var unknownAgents: Integer
  }
  
  trait CustomerConnectorInfo extends js.Object {
    /**
      * Number of active discovery connectors.
      */
    var activeConnectors: Integer
    /**
      * Number of blacklisted discovery connectors.
      */
    var blackListedConnectors: Integer
    /**
      * Number of healthy discovery connectors.
      */
    var healthyConnectors: Integer
    /**
      * Number of discovery connectors with status SHUTDOWN,
      */
    var shutdownConnectors: Integer
    /**
      * Total number of discovery connectors.
      */
    var totalConnectors: Integer
    /**
      * Number of unhealthy discovery connectors.
      */
    var unhealthyConnectors: Integer
    /**
      * Number of unknown discovery connectors.
      */
    var unknownConnectors: Integer
  }
  
  trait DeleteApplicationsRequest extends js.Object {
    /**
      * Configuration ID of an application to be deleted.
      */
    var configurationIds: ApplicationIdsList
  }
  
  trait DeleteApplicationsResponse extends js.Object
  
  trait DeleteTagsRequest extends js.Object {
    /**
      * A list of configuration items with tags that you want to delete.
      */
    var configurationIds: ConfigurationIdList
    /**
      * Tags that you want to delete from one or more configuration items. Specify the tags that you want to delete in a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
      */
    var tags: js.UndefOr[TagSet] = js.undefined
  }
  
  trait DeleteTagsResponse extends js.Object
  
  trait DescribeAgentsRequest extends js.Object {
    /**
      * The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns information about all agents/Connectors associated with your AWS user account.
      */
    var agentIds: js.UndefOr[AgentIds] = js.undefined
    /**
      * You can filter the request using various logical operators and a key-value format. For example:   {"key": "collectionStatus", "value": "STARTED"} 
      */
    var filters: js.UndefOr[Filters] = js.undefined
    /**
      * The total number of agents/Connectors to return in a single page of output. The maximum value is 100.
      */
    var maxResults: js.UndefOr[Integer] = js.undefined
    /**
      * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for DescribeAgentsRequest$agentIds but set DescribeAgentsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAgentsResponse extends js.Object {
    /**
      * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media access control (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and the version number of each agent/Connector.
      */
    var agentsInfo: js.UndefOr[AgentsInfo] = js.undefined
    /**
      * Token to retrieve the next set of results. For example, if you specified 100 IDs for DescribeAgentsRequest$agentIds but set DescribeAgentsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeConfigurationsAttribute
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait DescribeConfigurationsRequest extends js.Object {
    /**
      * One or more configuration IDs.
      */
    var configurationIds: ConfigurationIdList
  }
  
  trait DescribeConfigurationsResponse extends js.Object {
    /**
      * A key in the response map. The value is an array of data.
      */
    var configurations: js.UndefOr[DescribeConfigurationsAttributes] = js.undefined
  }
  
  trait DescribeContinuousExportsRequest extends js.Object {
    /**
      * The unique IDs assigned to the exports.
      */
    var exportIds: js.UndefOr[ContinuousExportIds] = js.undefined
    /**
      * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
      */
    var maxResults: js.UndefOr[DescribeContinuousExportsMaxResults] = js.undefined
    /**
      * The token from the previous call to DescribeExportTasks.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeContinuousExportsResponse extends js.Object {
    /**
      * A list of continuous export descriptions.
      */
    var descriptions: js.UndefOr[ContinuousExportDescriptions] = js.undefined
    /**
      * The token from the previous call to DescribeExportTasks.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeExportConfigurationsRequest extends js.Object {
    /**
      * A list of continuous export ids to search for.
      */
    var exportIds: js.UndefOr[ExportIds] = js.undefined
    /**
      * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
      */
    var maxResults: js.UndefOr[Integer] = js.undefined
    /**
      * The token from the previous call to describe-export-tasks.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeExportConfigurationsResponse extends js.Object {
    /**
      * 
      */
    var exportsInfo: js.UndefOr[ExportsInfo] = js.undefined
    /**
      * The token from the previous call to describe-export-tasks.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeExportTasksRequest extends js.Object {
    /**
      * One or more unique identifiers used to query the status of an export request.
      */
    var exportIds: js.UndefOr[ExportIds] = js.undefined
    /**
      * One or more filters.    AgentId - ID of the agent whose collected data will be exported  
      */
    var filters: js.UndefOr[ExportFilters] = js.undefined
    /**
      * The maximum number of volume results returned by DescribeExportTasks in paginated output. When this parameter is used, DescribeExportTasks only returns maxResults results in a single page along with a nextToken response element.
      */
    var maxResults: js.UndefOr[Integer] = js.undefined
    /**
      * The nextToken value returned from a previous paginated DescribeExportTasks request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeExportTasksResponse extends js.Object {
    /**
      * Contains one or more sets of export request details. When the status of a request is SUCCEEDED, the response includes a URL for an Amazon S3 bucket where you can view the data in a CSV file.
      */
    var exportsInfo: js.UndefOr[ExportsInfo] = js.undefined
    /**
      * The nextToken value to include in a future DescribeExportTasks request. When the results of a DescribeExportTasks request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeImportTasksRequest extends js.Object {
    /**
      * An array of name-value pairs that you provide to filter the results for the DescribeImportTask request to a specific subset of results. Currently, wildcard values aren't supported for filters.
      */
    var filters: js.UndefOr[DescribeImportTasksFilterList] = js.undefined
    /**
      * The maximum number of results that you want this request to return, up to 100.
      */
    var maxResults: js.UndefOr[DescribeImportTasksMaxResults] = js.undefined
    /**
      * The token to request a specific page of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeImportTasksResponse extends js.Object {
    /**
      * The token to request the next page of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A returned array of import tasks that match any applied filters, up to the specified number of maximum results.
      */
    var tasks: js.UndefOr[ImportTaskList] = js.undefined
  }
  
  trait DescribeTagsRequest extends js.Object {
    /**
      * You can filter the list using a key-value format. You can separate these items by using logical operators. Allowed filters include tagKey, tagValue, and configurationId. 
      */
    var filters: js.UndefOr[TagFilters] = js.undefined
    /**
      * The total number of items to return in a single page of output. The maximum value is 100.
      */
    var maxResults: js.UndefOr[Integer] = js.undefined
    /**
      * A token to start the list. Use this token to get the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeTagsResponse extends js.Object {
    /**
      * The call returns a token. Use this token to get the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of tags for a specific configuration item.
      */
    var tags: js.UndefOr[ConfigurationTagSet] = js.undefined
  }
  
  trait DisassociateConfigurationItemsFromApplicationRequest extends js.Object {
    /**
      * Configuration ID of an application from which each item is disassociated.
      */
    var applicationConfigurationId: ApplicationId
    /**
      * Configuration ID of each item to be disassociated from an application.
      */
    var configurationIds: ConfigurationIdList
  }
  
  trait DisassociateConfigurationItemsFromApplicationResponse extends js.Object
  
  trait ExportConfigurationsResponse extends js.Object {
    /**
      * A unique identifier that you can use to query the export status.
      */
    var exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
  }
  
  trait ExportFilter extends js.Object {
    /**
      * Supported condition: EQUALS 
      */
    var condition: Condition
    /**
      * A single ExportFilter name. Supported filters: agentId.
      */
    var name: FilterName
    /**
      * A single agentId for a Discovery Agent. An agentId can be found using the DescribeAgents action. Typically an ADS agentId is in the form o-0123456789abcdef0.
      */
    var values: FilterValues
  }
  
  trait ExportInfo extends js.Object {
    /**
      * A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the export succeeded.
      */
    var configurationsDownloadUrl: js.UndefOr[ConfigurationsDownloadUrl] = js.undefined
    /**
      * A unique identifier used to query an export.
      */
    var exportId: ConfigurationsExportId
    /**
      * The time that the data export was initiated.
      */
    var exportRequestTime: ExportRequestTime
    /**
      * The status of the data export job.
      */
    var exportStatus: ExportStatus
    /**
      * If true, the export of agent information exceeded the size limit for a single export and the exported data is incomplete for the requested time range. To address this, select a smaller time range for the export by using startDate and endDate.
      */
    var isTruncated: js.UndefOr[Boolean] = js.undefined
    /**
      * The endTime used in the StartExportTask request. If no endTime was requested, this result does not appear in ExportInfo.
      */
    var requestedEndTime: js.UndefOr[TimeStamp] = js.undefined
    /**
      * The value of startTime parameter in the StartExportTask request. If no startTime was requested, this result does not appear in ExportInfo.
      */
    var requestedStartTime: js.UndefOr[TimeStamp] = js.undefined
    /**
      * A status message provided for API callers.
      */
    var statusMessage: ExportStatusMessage
  }
  
  trait Filter extends js.Object {
    /**
      * A conditional operator. The following operators are valid: EQUALS, NOT_EQUALS, CONTAINS, NOT_CONTAINS. If you specify multiple filters, the system utilizes all filters as though concatenated by AND. If you specify multiple values for a particular filter, the system differentiates the values using OR. Calling either DescribeConfigurations or ListConfigurations returns attributes of matching configuration items.
      */
    var condition: Condition
    /**
      * The name of the filter.
      */
    var name: String
    /**
      * A string value on which to filter. For example, if you choose the destinationServer.osVersion filter name, you could specify Ubuntu for the value.
      */
    var values: FilterValues
  }
  
  trait GetDiscoverySummaryRequest extends js.Object
  
  trait GetDiscoverySummaryResponse extends js.Object {
    /**
      * Details about discovered agents, including agent status and health.
      */
    var agentSummary: js.UndefOr[CustomerAgentInfo] = js.undefined
    /**
      * The number of applications discovered.
      */
    var applications: js.UndefOr[Long] = js.undefined
    /**
      * Details about discovered connectors, including connector status and health.
      */
    var connectorSummary: js.UndefOr[CustomerConnectorInfo] = js.undefined
    /**
      * The number of servers discovered.
      */
    var servers: js.UndefOr[Long] = js.undefined
    /**
      * The number of servers mapped to applications.
      */
    var serversMappedToApplications: js.UndefOr[Long] = js.undefined
    /**
      * The number of servers mapped to tags.
      */
    var serversMappedtoTags: js.UndefOr[Long] = js.undefined
  }
  
  trait ImportTask extends js.Object {
    /**
      * The total number of application records in the import file that failed to be imported.
      */
    var applicationImportFailure: js.UndefOr[Integer] = js.undefined
    /**
      * The total number of application records in the import file that were successfully imported.
      */
    var applicationImportSuccess: js.UndefOr[Integer] = js.undefined
    /**
      * A unique token used to prevent the same import request from occurring more than once. If you didn't provide a token, a token was automatically generated when the import task request was sent.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * A link to a compressed archive folder (in the ZIP format) that contains an error log and a file of failed records. You can use these two files to quickly identify records that failed, why they failed, and correct those records. Afterward, you can upload the corrected file to your Amazon S3 bucket and create another import task request. This field also includes authorization information so you can confirm the authenticity of the compressed archive before you download it. If some records failed to be imported we recommend that you correct the records in the failed entries file and then imports that failed entries file. This prevents you from having to correct and update the larger original file and attempt importing it again.
      */
    var errorsAndFailedEntriesZip: js.UndefOr[S3PresignedUrl] = js.undefined
    /**
      * The time that the import task request finished, presented in the Unix time stamp format.
      */
    var importCompletionTime: js.UndefOr[TimeStamp] = js.undefined
    /**
      * The time that the import task request was deleted, presented in the Unix time stamp format.
      */
    var importDeletedTime: js.UndefOr[TimeStamp] = js.undefined
    /**
      * The time that the import task request was made, presented in the Unix time stamp format.
      */
    var importRequestTime: js.UndefOr[TimeStamp] = js.undefined
    /**
      * The unique ID for a specific import task. These IDs aren't globally unique, but they are unique within an AWS account.
      */
    var importTaskId: js.UndefOr[ImportTaskIdentifier] = js.undefined
    /**
      * The URL for your import file that you've uploaded to Amazon S3.
      */
    var importUrl: js.UndefOr[ImportURL] = js.undefined
    /**
      * A descriptive name for an import task. You can use this name to filter future requests related to this import task, such as identifying applications and servers that were included in this import task. We recommend that you use a meaningful name for each import task.
      */
    var name: js.UndefOr[ImportTaskName] = js.undefined
    /**
      * The total number of server records in the import file that failed to be imported.
      */
    var serverImportFailure: js.UndefOr[Integer] = js.undefined
    /**
      * The total number of server records in the import file that were successfully imported.
      */
    var serverImportSuccess: js.UndefOr[Integer] = js.undefined
    /**
      * The status of the import task. An import can have the status of IMPORT_COMPLETE and still have some records fail to import from the overall request. More information can be found in the downloadable archive defined in the errorsAndFailedEntriesZip field, or in the Migration Hub management console.
      */
    var status: js.UndefOr[ImportStatus] = js.undefined
  }
  
  trait ImportTaskFilter extends js.Object {
    /**
      * The name, status, or import task ID for a specific import task.
      */
    var name: js.UndefOr[ImportTaskFilterName] = js.undefined
    /**
      * An array of strings that you can provide to match against a specific name, status, or import task ID to filter the results for your import task queries.
      */
    var values: js.UndefOr[ImportTaskFilterValueList] = js.undefined
  }
  
  trait ListConfigurationsRequest extends js.Object {
    /**
      * A valid configuration identified by Application Discovery Service. 
      */
    var configurationType: ConfigurationItemType
    /**
      * You can filter the request using various logical operators and a key-value format. For example:   {"key": "serverType", "value": "webServer"}  For a complete list of filter options and guidance about using them with this action, see Querying Discovered Configuration Items. 
      */
    var filters: js.UndefOr[Filters] = js.undefined
    /**
      * The total number of items to return. The maximum value is 100.
      */
    var maxResults: js.UndefOr[Integer] = js.undefined
    /**
      * Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned 100 items, but you set ListConfigurationsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Certain filter criteria return output that can be sorted in ascending or descending order. For a list of output characteristics for each filter, see Using the ListConfigurations Action.
      */
    var orderBy: js.UndefOr[OrderByList] = js.undefined
  }
  
  trait ListConfigurationsResponse extends js.Object {
    /**
      * Returns configuration details, including the configuration ID, attribute names, and attribute values.
      */
    var configurations: js.UndefOr[Configurations] = js.undefined
    /**
      * Token to retrieve the next set of results. For example, if your call to ListConfigurations returned 100 items, but you set ListConfigurationsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListServerNeighborsRequest extends js.Object {
    /**
      * Configuration ID of the server for which neighbors are being listed.
      */
    var configurationId: ConfigurationId
    /**
      * Maximum number of results to return in a single page of output.
      */
    var maxResults: js.UndefOr[Integer] = js.undefined
    /**
      * List of configuration IDs to test for one-hop-away.
      */
    var neighborConfigurationIds: js.UndefOr[ConfigurationIdList] = js.undefined
    /**
      * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * Flag to indicate if port and protocol information is needed as part of the response.
      */
    var portInformationNeeded: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ListServerNeighborsResponse extends js.Object {
    /**
      * Count of distinct servers that are one hop away from the given server.
      */
    var knownDependencyCount: js.UndefOr[Long] = js.undefined
    /**
      * List of distinct servers that are one hop away from the given server.
      */
    var neighbors: NeighborDetailsList
    /**
      * Token to retrieve the next set of results. For example, if you specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait NeighborConnectionDetail extends js.Object {
    /**
      * The number of open network connections with the neighboring server.
      */
    var connectionsCount: Long
    /**
      * The destination network port for the connection.
      */
    var destinationPort: js.UndefOr[BoxedInteger] = js.undefined
    /**
      * The ID of the server that accepted the network connection.
      */
    var destinationServerId: ConfigurationId
    /**
      * The ID of the server that opened the network connection.
      */
    var sourceServerId: ConfigurationId
    /**
      * The network protocol used for the connection.
      */
    var transportProtocol: js.UndefOr[String] = js.undefined
  }
  
  trait OrderByElement extends js.Object {
    /**
      * The field on which to order.
      */
    var fieldName: String
    /**
      * Ordering direction.
      */
    var sortOrder: js.UndefOr[orderString] = js.undefined
  }
  
  trait SchemaStorageConfig
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait StartContinuousExportRequest extends js.Object
  
  trait StartContinuousExportResponse extends js.Object {
    /**
      * The type of data collector used to gather this data (currently only offered for AGENT).
      */
    var dataSource: js.UndefOr[DataSource] = js.undefined
    /**
      * The unique ID assigned to this export.
      */
    var exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
    /**
      * The name of the s3 bucket where the export data parquet files are stored.
      */
    var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * A dictionary which describes how the data is stored.    databaseName - the name of the Glue database used to store the schema.  
      */
    var schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined
    /**
      * The timestamp representing when the continuous export was started.
      */
    var startTime: js.UndefOr[TimeStamp] = js.undefined
  }
  
  trait StartDataCollectionByAgentIdsRequest extends js.Object {
    /**
      * The IDs of the agents or connectors from which to start collecting data. If you send a request to an agent/connector ID that you do not have permission to contact, according to your AWS account, the service does not throw an exception. Instead, it returns the error in the Description field. If you send a request to multiple agents/connectors and you do not have permission to contact some of those agents/connectors, the system does not throw an exception. Instead, the system shows Failed in the Description field.
      */
    var agentIds: AgentIds
  }
  
  trait StartDataCollectionByAgentIdsResponse extends js.Object {
    /**
      * Information about agents or the connector that were instructed to start collecting data. Information includes the agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was updated.
      */
    var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined
  }
  
  trait StartExportTaskRequest extends js.Object {
    /**
      * The end timestamp for exported data from the single Application Discovery Agent selected in the filters. If no value is specified, exported data includes the most recent data collected by the agent.
      */
    var endTime: js.UndefOr[TimeStamp] = js.undefined
    /**
      * The file format for the returned export data. Default value is CSV. Note: The GRAPHML option has been deprecated. 
      */
    var exportDataFormat: js.UndefOr[ExportDataFormats] = js.undefined
    /**
      * If a filter is present, it selects the single agentId of the Application Discovery Agent for which data is exported. The agentId can be found in the results of the DescribeAgents API or CLI. If no filter is present, startTime and endTime are ignored and exported data includes both Agentless Discovery Connector data and summary data from Application Discovery agents. 
      */
    var filters: js.UndefOr[ExportFilters] = js.undefined
    /**
      * The start timestamp for exported data from the single Application Discovery Agent selected in the filters. If no value is specified, data is exported starting from the first data collected by the agent.
      */
    var startTime: js.UndefOr[TimeStamp] = js.undefined
  }
  
  trait StartExportTaskResponse extends js.Object {
    /**
      * A unique identifier used to query the status of an export request.
      */
    var exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
  }
  
  trait StartImportTaskRequest extends js.Object {
    /**
      * Optional. A unique token that you can provide to prevent the same import request from occurring more than once. If you don't provide a token, a token is automatically generated. Sending more than one StartImportTask request with the same client request token will return information about the original import task with that client request token.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The URL for your import file that you've uploaded to Amazon S3.  If you're using the AWS CLI, this URL is structured as follows: s3://BucketName/ImportFileName.CSV  
      */
    var importUrl: ImportURL
    /**
      * A descriptive name for this request. You can use this name to filter future requests related to this import task, such as identifying applications and servers that were included in this import task. We recommend that you use a meaningful name for each import task.
      */
    var name: ImportTaskName
  }
  
  trait StartImportTaskResponse extends js.Object {
    /**
      * An array of information related to the import task request including status information, times, IDs, the Amazon S3 Object URL for the import file, and more. 
      */
    var task: js.UndefOr[ImportTask] = js.undefined
  }
  
  trait StopContinuousExportRequest extends js.Object {
    /**
      * The unique ID assigned to this export.
      */
    var exportId: ConfigurationsExportId
  }
  
  trait StopContinuousExportResponse extends js.Object {
    /**
      * Timestamp that represents when this continuous export started collecting data.
      */
    var startTime: js.UndefOr[TimeStamp] = js.undefined
    /**
      * Timestamp that represents when this continuous export was stopped.
      */
    var stopTime: js.UndefOr[TimeStamp] = js.undefined
  }
  
  trait StopDataCollectionByAgentIdsRequest extends js.Object {
    /**
      * The IDs of the agents or connectors from which to stop collecting data.
      */
    var agentIds: AgentIds
  }
  
  trait StopDataCollectionByAgentIdsResponse extends js.Object {
    /**
      * Information about the agents or connector that were instructed to stop collecting data. Information includes the agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was updated.
      */
    var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The type of tag on which to filter.
      */
    var key: TagKey
    /**
      * A value for a tag key on which to filter.
      */
    var value: TagValue
  }
  
  trait TagFilter extends js.Object {
    /**
      * A name of the tag filter.
      */
    var name: FilterName
    /**
      * Values for the tag filter.
      */
    var values: FilterValues
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Associates one or more configuration items with an application.
      */
    def associateConfigurationItemsToApplication(): awsDashSdkLib.libRequestMod.Request[
        AssociateConfigurationItemsToApplicationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def associateConfigurationItemsToApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateConfigurationItemsToApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        AssociateConfigurationItemsToApplicationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Associates one or more configuration items with an application.
      */
    def associateConfigurationItemsToApplication(params: AssociateConfigurationItemsToApplicationRequest): awsDashSdkLib.libRequestMod.Request[
        AssociateConfigurationItemsToApplicationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def associateConfigurationItemsToApplication(
      params: AssociateConfigurationItemsToApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateConfigurationItemsToApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        AssociateConfigurationItemsToApplicationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Deletes one or more import tasks, each identified by their import ID. Each import task has a number of records that can identify servers or applications.  AWS Application Discovery Service has built-in matching logic that will identify when discovered servers match existing entries that you've previously discovered, the information for the already-existing discovered server is updated. When you delete an import task that contains records that were used to match, the information in those matched records that comes from the deleted records will also be deleted.
      */
    def batchDeleteImportData(): awsDashSdkLib.libRequestMod.Request[BatchDeleteImportDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDeleteImportData(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteImportDataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteImportDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes one or more import tasks, each identified by their import ID. Each import task has a number of records that can identify servers or applications.  AWS Application Discovery Service has built-in matching logic that will identify when discovered servers match existing entries that you've previously discovered, the information for the already-existing discovered server is updated. When you delete an import task that contains records that were used to match, the information in those matched records that comes from the deleted records will also be deleted.
      */
    def batchDeleteImportData(params: BatchDeleteImportDataRequest): awsDashSdkLib.libRequestMod.Request[BatchDeleteImportDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDeleteImportData(
      params: BatchDeleteImportDataRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteImportDataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteImportDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an application with the given name and description.
      */
    def createApplication(): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an application with the given name and description.
      */
    def createApplication(params: CreateApplicationRequest): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplication(
      params: CreateApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API accepts a list of multiple configuration items.
      */
    def createTags(): awsDashSdkLib.libRequestMod.Request[CreateTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API accepts a list of multiple configuration items.
      */
    def createTags(params: CreateTagsRequest): awsDashSdkLib.libRequestMod.Request[CreateTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTags(
      params: CreateTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a list of applications and their associations with configuration items.
      */
    def deleteApplications(): awsDashSdkLib.libRequestMod.Request[DeleteApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a list of applications and their associations with configuration items.
      */
    def deleteApplications(params: DeleteApplicationsRequest): awsDashSdkLib.libRequestMod.Request[DeleteApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplications(
      params: DeleteApplicationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple configuration items.
      */
    def deleteTags(): awsDashSdkLib.libRequestMod.Request[DeleteTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple configuration items.
      */
    def deleteTags(params: DeleteTagsRequest): awsDashSdkLib.libRequestMod.Request[DeleteTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTags(
      params: DeleteTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists agents or connectors as specified by ID or other filters. All agents/connectors associated with your user account can be listed if you call DescribeAgents as is without passing any parameters.
      */
    def describeAgents(): awsDashSdkLib.libRequestMod.Request[DescribeAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAgents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAgentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists agents or connectors as specified by ID or other filters. All agents/connectors associated with your user account can be listed if you call DescribeAgents as is without passing any parameters.
      */
    def describeAgents(params: DescribeAgentsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAgents(
      params: DescribeAgentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAgentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves attributes for a list of configuration item IDs.  All of the supplied IDs must be for the same asset type from one of the following:   server   application   process   connection   Output fields are specific to the asset type specified. For example, the output for a server configuration item includes a list of attributes about the server, such as host name, operating system, number of network cards, etc. For a complete list of outputs for each asset type, see Using the DescribeConfigurations Action. 
      */
    def describeConfigurations(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves attributes for a list of configuration item IDs.  All of the supplied IDs must be for the same asset type from one of the following:   server   application   process   connection   Output fields are specific to the asset type specified. For example, the output for a server configuration item includes a list of attributes about the server, such as host name, operating system, number of network cards, etc. For a complete list of outputs for each asset type, see Using the DescribeConfigurations Action. 
      */
    def describeConfigurations(params: DescribeConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConfigurations(
      params: DescribeConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists exports as specified by ID. All continuous exports associated with your user account can be listed if you call DescribeContinuousExports as is without passing any parameters.
      */
    def describeContinuousExports(): awsDashSdkLib.libRequestMod.Request[DescribeContinuousExportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeContinuousExports(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeContinuousExportsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeContinuousExportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists exports as specified by ID. All continuous exports associated with your user account can be listed if you call DescribeContinuousExports as is without passing any parameters.
      */
    def describeContinuousExports(params: DescribeContinuousExportsRequest): awsDashSdkLib.libRequestMod.Request[DescribeContinuousExportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeContinuousExports(
      params: DescribeContinuousExportsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeContinuousExportsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeContinuousExportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  DescribeExportConfigurations is deprecated. Use DescribeImportTasks, instead.
      */
    def describeExportConfigurations(): awsDashSdkLib.libRequestMod.Request[DescribeExportConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeExportConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExportConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExportConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  DescribeExportConfigurations is deprecated. Use DescribeImportTasks, instead.
      */
    def describeExportConfigurations(params: DescribeExportConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeExportConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeExportConfigurations(
      params: DescribeExportConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExportConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExportConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.
      */
    def describeExportTasks(): awsDashSdkLib.libRequestMod.Request[DescribeExportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeExportTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExportTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.
      */
    def describeExportTasks(params: DescribeExportTasksRequest): awsDashSdkLib.libRequestMod.Request[DescribeExportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeExportTasks(
      params: DescribeExportTasksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExportTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of import tasks for your account, including status information, times, IDs, the Amazon S3 Object URL for the import file, and more.
      */
    def describeImportTasks(): awsDashSdkLib.libRequestMod.Request[DescribeImportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeImportTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeImportTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeImportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of import tasks for your account, including status information, times, IDs, the Amazon S3 Object URL for the import file, and more.
      */
    def describeImportTasks(params: DescribeImportTasksRequest): awsDashSdkLib.libRequestMod.Request[DescribeImportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeImportTasks(
      params: DescribeImportTasksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeImportTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeImportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of configuration items that have tags as specified by the key-value pairs, name and value, passed to the optional parameter filters. There are three valid tag filter names:   tagKey   tagValue   configurationId   Also, all configuration items associated with your user account that have tags can be listed if you call DescribeTags as is without passing any parameters.
      */
    def describeTags(): awsDashSdkLib.libRequestMod.Request[DescribeTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of configuration items that have tags as specified by the key-value pairs, name and value, passed to the optional parameter filters. There are three valid tag filter names:   tagKey   tagValue   configurationId   Also, all configuration items associated with your user account that have tags can be listed if you call DescribeTags as is without passing any parameters.
      */
    def describeTags(params: DescribeTagsRequest): awsDashSdkLib.libRequestMod.Request[DescribeTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTags(
      params: DescribeTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates one or more configuration items from an application.
      */
    def disassociateConfigurationItemsFromApplication(): awsDashSdkLib.libRequestMod.Request[
        DisassociateConfigurationItemsFromApplicationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def disassociateConfigurationItemsFromApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateConfigurationItemsFromApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DisassociateConfigurationItemsFromApplicationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Disassociates one or more configuration items from an application.
      */
    def disassociateConfigurationItemsFromApplication(params: DisassociateConfigurationItemsFromApplicationRequest): awsDashSdkLib.libRequestMod.Request[
        DisassociateConfigurationItemsFromApplicationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def disassociateConfigurationItemsFromApplication(
      params: DisassociateConfigurationItemsFromApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateConfigurationItemsFromApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DisassociateConfigurationItemsFromApplicationResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Deprecated. Use StartExportTask instead. Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and evaluate the data. Data includes tags and tag associations, processes, connections, servers, and system performance. This API returns an export ID that you can query using the DescribeExportConfigurations API. The system imposes a limit of two configuration exports in six hours.
      */
    def exportConfigurations(): awsDashSdkLib.libRequestMod.Request[ExportConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def exportConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExportConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExportConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a short summary of discovered assets. This API operation takes no request parameters and is called as is at the command prompt as shown in the example.
      */
    def getDiscoverySummary(): awsDashSdkLib.libRequestMod.Request[GetDiscoverySummaryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDiscoverySummary(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDiscoverySummaryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDiscoverySummaryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a short summary of discovered assets. This API operation takes no request parameters and is called as is at the command prompt as shown in the example.
      */
    def getDiscoverySummary(params: GetDiscoverySummaryRequest): awsDashSdkLib.libRequestMod.Request[GetDiscoverySummaryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDiscoverySummary(
      params: GetDiscoverySummaryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDiscoverySummaryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDiscoverySummaryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of configuration items as specified by the value passed to the required paramater configurationType. Optional filtering may be applied to refine search results.
      */
    def listConfigurations(): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of configuration items as specified by the value passed to the required paramater configurationType. Optional filtering may be applied to refine search results.
      */
    def listConfigurations(params: ListConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listConfigurations(
      params: ListConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of servers that are one network hop away from a specified server.
      */
    def listServerNeighbors(): awsDashSdkLib.libRequestMod.Request[ListServerNeighborsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listServerNeighbors(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListServerNeighborsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListServerNeighborsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of servers that are one network hop away from a specified server.
      */
    def listServerNeighbors(params: ListServerNeighborsRequest): awsDashSdkLib.libRequestMod.Request[ListServerNeighborsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listServerNeighbors(
      params: ListServerNeighborsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListServerNeighborsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListServerNeighborsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Start the continuous flow of agent's discovered data into Amazon Athena.
      */
    def startContinuousExport(): awsDashSdkLib.libRequestMod.Request[StartContinuousExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startContinuousExport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartContinuousExportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartContinuousExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Start the continuous flow of agent's discovered data into Amazon Athena.
      */
    def startContinuousExport(params: StartContinuousExportRequest): awsDashSdkLib.libRequestMod.Request[StartContinuousExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startContinuousExport(
      params: StartContinuousExportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartContinuousExportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartContinuousExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Instructs the specified agents or connectors to start collecting data.
      */
    def startDataCollectionByAgentIds(): awsDashSdkLib.libRequestMod.Request[StartDataCollectionByAgentIdsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startDataCollectionByAgentIds(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDataCollectionByAgentIdsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDataCollectionByAgentIdsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Instructs the specified agents or connectors to start collecting data.
      */
    def startDataCollectionByAgentIds(params: StartDataCollectionByAgentIdsRequest): awsDashSdkLib.libRequestMod.Request[StartDataCollectionByAgentIdsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startDataCollectionByAgentIds(
      params: StartDataCollectionByAgentIdsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDataCollectionByAgentIdsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDataCollectionByAgentIdsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Begins the export of discovered data to an S3 bucket.  If you specify agentIds in a filter, the task exports up to 72 hours of detailed data collected by the identified Application Discovery Agent, including network, process, and performance details. A time range for exported agent data may be set by using startTime and endTime. Export of detailed agent data is limited to five concurrently running exports.   If you do not include an agentIds filter, summary data is exported that includes both AWS Agentless Discovery Connector data and summary data from AWS Discovery Agents. Export of summary data is limited to two exports per day. 
      */
    def startExportTask(): awsDashSdkLib.libRequestMod.Request[StartExportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startExportTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartExportTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartExportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Begins the export of discovered data to an S3 bucket.  If you specify agentIds in a filter, the task exports up to 72 hours of detailed data collected by the identified Application Discovery Agent, including network, process, and performance details. A time range for exported agent data may be set by using startTime and endTime. Export of detailed agent data is limited to five concurrently running exports.   If you do not include an agentIds filter, summary data is exported that includes both AWS Agentless Discovery Connector data and summary data from AWS Discovery Agents. Export of summary data is limited to two exports per day. 
      */
    def startExportTask(params: StartExportTaskRequest): awsDashSdkLib.libRequestMod.Request[StartExportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startExportTask(
      params: StartExportTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartExportTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartExportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts an import task, which allows you to import details of your on-premises environment directly into AWS without having to use the Application Discovery Service (ADS) tools such as the Discovery Connector or Discovery Agent. This gives you the option to perform migration assessment and planning directly from your imported data, including the ability to group your devices as applications and track their migration status. To start an import request, do this:   Download the specially formatted comma separated value (CSV) import template, which you can find here: https://s3-us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv.   Fill out the template with your server and application data.   Upload your import file to an Amazon S3 bucket, and make a note of it's Object URL. Your import file must be in the CSV format.   Use the console or the StartImportTask command with the AWS CLI or one of the AWS SDKs to import the records from your file.   For more information, including step-by-step procedures, see Migration Hub Import in the AWS Application Discovery Service User Guide.  There are limits to the number of import tasks you can create (and delete) in an AWS account. For more information, see AWS Application Discovery Service Limits in the AWS Application Discovery Service User Guide. 
      */
    def startImportTask(): awsDashSdkLib.libRequestMod.Request[StartImportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startImportTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartImportTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartImportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts an import task, which allows you to import details of your on-premises environment directly into AWS without having to use the Application Discovery Service (ADS) tools such as the Discovery Connector or Discovery Agent. This gives you the option to perform migration assessment and planning directly from your imported data, including the ability to group your devices as applications and track their migration status. To start an import request, do this:   Download the specially formatted comma separated value (CSV) import template, which you can find here: https://s3-us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv.   Fill out the template with your server and application data.   Upload your import file to an Amazon S3 bucket, and make a note of it's Object URL. Your import file must be in the CSV format.   Use the console or the StartImportTask command with the AWS CLI or one of the AWS SDKs to import the records from your file.   For more information, including step-by-step procedures, see Migration Hub Import in the AWS Application Discovery Service User Guide.  There are limits to the number of import tasks you can create (and delete) in an AWS account. For more information, see AWS Application Discovery Service Limits in the AWS Application Discovery Service User Guide. 
      */
    def startImportTask(params: StartImportTaskRequest): awsDashSdkLib.libRequestMod.Request[StartImportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startImportTask(
      params: StartImportTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartImportTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartImportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stop the continuous flow of agent's discovered data into Amazon Athena.
      */
    def stopContinuousExport(): awsDashSdkLib.libRequestMod.Request[StopContinuousExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopContinuousExport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopContinuousExportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopContinuousExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stop the continuous flow of agent's discovered data into Amazon Athena.
      */
    def stopContinuousExport(params: StopContinuousExportRequest): awsDashSdkLib.libRequestMod.Request[StopContinuousExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopContinuousExport(
      params: StopContinuousExportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopContinuousExportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopContinuousExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Instructs the specified agents or connectors to stop collecting data.
      */
    def stopDataCollectionByAgentIds(): awsDashSdkLib.libRequestMod.Request[StopDataCollectionByAgentIdsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopDataCollectionByAgentIds(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopDataCollectionByAgentIdsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopDataCollectionByAgentIdsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Instructs the specified agents or connectors to stop collecting data.
      */
    def stopDataCollectionByAgentIds(params: StopDataCollectionByAgentIdsRequest): awsDashSdkLib.libRequestMod.Request[StopDataCollectionByAgentIdsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopDataCollectionByAgentIds(
      params: StopDataCollectionByAgentIdsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopDataCollectionByAgentIdsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopDataCollectionByAgentIdsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates metadata about an application.
      */
    def updateApplication(): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates metadata about an application.
      */
    def updateApplication(params: UpdateApplicationRequest): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplication(
      params: UpdateApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateApplicationRequest extends js.Object {
    /**
      * Configuration ID of the application to be updated.
      */
    var configurationId: ApplicationId
    /**
      * New description of the application to be updated.
      */
    var description: js.UndefOr[String] = js.undefined
    /**
      * New name of the application to be updated.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  
  trait UpdateApplicationResponse extends js.Object
  
  val TypesNs: this.type = js.native
  type AgentConfigurationStatusList = js.Array[AgentConfigurationStatus]
  type AgentId = java.lang.String
  type AgentIds = js.Array[AgentId]
  type AgentNetworkInfoList = js.Array[AgentNetworkInfo]
  type AgentStatus = awsDashSdkLib.awsDashSdkLibStrings.HEALTHY | awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN | awsDashSdkLib.awsDashSdkLibStrings.BLACKLISTED | awsDashSdkLib.awsDashSdkLibStrings.SHUTDOWN | java.lang.String
  type AgentsInfo = js.Array[AgentInfo]
  type ApplicationId = java.lang.String
  type ApplicationIdsList = js.Array[ApplicationId]
  type BatchDeleteImportDataErrorCode = awsDashSdkLib.awsDashSdkLibStrings.NOT_FOUND | awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_SERVER_ERROR | java.lang.String
  type BatchDeleteImportDataErrorDescription = java.lang.String
  type BatchDeleteImportDataErrorList = js.Array[BatchDeleteImportDataError]
  type Boolean = scala.Boolean
  type BoxedInteger = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type Condition = java.lang.String
  type ConfigurationId = java.lang.String
  type ConfigurationIdList = js.Array[ConfigurationId]
  type ConfigurationItemType = awsDashSdkLib.awsDashSdkLibStrings.SERVER | awsDashSdkLib.awsDashSdkLibStrings.PROCESS | awsDashSdkLib.awsDashSdkLibStrings.CONNECTION | awsDashSdkLib.awsDashSdkLibStrings.APPLICATION | java.lang.String
  type ConfigurationTagSet = js.Array[ConfigurationTag]
  type Configurations = js.Array[Configuration]
  type ConfigurationsDownloadUrl = java.lang.String
  type ConfigurationsExportId = java.lang.String
  type ContinuousExportDescriptions = js.Array[ContinuousExportDescription]
  type ContinuousExportIds = js.Array[ConfigurationsExportId]
  type ContinuousExportStatus = awsDashSdkLib.awsDashSdkLibStrings.START_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.START_FAILED | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.ERROR | awsDashSdkLib.awsDashSdkLibStrings.STOP_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.STOP_FAILED | awsDashSdkLib.awsDashSdkLibStrings.INACTIVE | java.lang.String
  type DataSource = awsDashSdkLib.awsDashSdkLibStrings.AGENT | java.lang.String
  type DatabaseName = java.lang.String
  type DescribeConfigurationsAttributes = js.Array[DescribeConfigurationsAttribute]
  type DescribeContinuousExportsMaxResults = scala.Double
  type DescribeImportTasksFilterList = js.Array[ImportTaskFilter]
  type DescribeImportTasksMaxResults = scala.Double
  type ExportDataFormat = awsDashSdkLib.awsDashSdkLibStrings.CSV | awsDashSdkLib.awsDashSdkLibStrings.GRAPHML | java.lang.String
  type ExportDataFormats = js.Array[ExportDataFormat]
  type ExportFilters = js.Array[ExportFilter]
  type ExportIds = js.Array[ConfigurationsExportId]
  type ExportRequestTime = stdLib.Date
  type ExportStatus = awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | java.lang.String
  type ExportStatusMessage = java.lang.String
  type ExportsInfo = js.Array[ExportInfo]
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type ImportStatus = awsDashSdkLib.awsDashSdkLibStrings.IMPORT_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.IMPORT_COMPLETE | awsDashSdkLib.awsDashSdkLibStrings.IMPORT_FAILED | awsDashSdkLib.awsDashSdkLibStrings.IMPORT_FAILED_SERVER_LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.IMPORT_FAILED_RECORD_LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.DELETE_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.DELETE_COMPLETE | awsDashSdkLib.awsDashSdkLibStrings.DELETE_FAILED | awsDashSdkLib.awsDashSdkLibStrings.DELETE_FAILED_LIMIT_EXCEEDED | java.lang.String
  type ImportTaskFilterName = awsDashSdkLib.awsDashSdkLibStrings.IMPORT_TASK_ID | awsDashSdkLib.awsDashSdkLibStrings.STATUS | awsDashSdkLib.awsDashSdkLibStrings.NAME | java.lang.String
  type ImportTaskFilterValue = java.lang.String
  type ImportTaskFilterValueList = js.Array[ImportTaskFilterValue]
  type ImportTaskIdentifier = java.lang.String
  type ImportTaskList = js.Array[ImportTask]
  type ImportTaskName = java.lang.String
  type ImportURL = java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type NeighborDetailsList = js.Array[NeighborConnectionDetail]
  type NextToken = java.lang.String
  type OrderByList = js.Array[OrderByElement]
  type S3Bucket = java.lang.String
  type S3PresignedUrl = java.lang.String
  type String = java.lang.String
  type StringMax255 = java.lang.String
  type TagFilters = js.Array[TagFilter]
  type TagKey = java.lang.String
  type TagSet = js.Array[Tag]
  type TagValue = java.lang.String
  type TimeStamp = stdLib.Date
  type ToDeleteIdentifierList = js.Array[ImportTaskIdentifier]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2015-11-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type orderString = awsDashSdkLib.awsDashSdkLibStrings.ASC | awsDashSdkLib.awsDashSdkLibStrings.DESC | java.lang.String
}

