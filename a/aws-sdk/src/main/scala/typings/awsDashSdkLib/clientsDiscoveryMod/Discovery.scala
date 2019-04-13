package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discovery
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Discovery: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

