package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discovery
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Discovery: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ClientConfiguration = js.native
  /**
    * Associates one or more configuration items with an application.
    */
  def associateConfigurationItemsToApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.AssociateConfigurationItemsToApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateConfigurationItemsToApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.AssociateConfigurationItemsToApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.AssociateConfigurationItemsToApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates one or more configuration items with an application.
    */
  def associateConfigurationItemsToApplication(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.AssociateConfigurationItemsToApplicationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.AssociateConfigurationItemsToApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateConfigurationItemsToApplication(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.AssociateConfigurationItemsToApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.AssociateConfigurationItemsToApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.AssociateConfigurationItemsToApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more import tasks, each identified by their import ID. Each import task has a number of records that can identify servers or applications.  AWS Application Discovery Service has built-in matching logic that will identify when discovered servers match existing entries that you've previously discovered, the information for the already-existing discovered server is updated. When you delete an import task that contains records that were used to match, the information in those matched records that comes from the deleted records will also be deleted.
    */
  def batchDeleteImportData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.BatchDeleteImportDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeleteImportData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.BatchDeleteImportDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.BatchDeleteImportDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more import tasks, each identified by their import ID. Each import task has a number of records that can identify servers or applications.  AWS Application Discovery Service has built-in matching logic that will identify when discovered servers match existing entries that you've previously discovered, the information for the already-existing discovered server is updated. When you delete an import task that contains records that were used to match, the information in those matched records that comes from the deleted records will also be deleted.
    */
  def batchDeleteImportData(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.BatchDeleteImportDataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.BatchDeleteImportDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeleteImportData(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.BatchDeleteImportDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.BatchDeleteImportDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.BatchDeleteImportDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an application with the given name and description.
    */
  def createApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an application with the given name and description.
    */
  def createApplication(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplication(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API accepts a list of multiple configuration items.
    */
  def createTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API accepts a list of multiple configuration items.
    */
  def createTags(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTags(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.CreateTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a list of applications and their associations with configuration items.
    */
  def deleteApplications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a list of applications and their associations with configuration items.
    */
  def deleteApplications(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteApplicationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplications(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteApplicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple configuration items.
    */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple configuration items.
    */
  def deleteTags(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTags(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DeleteTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists agents or connectors as specified by ID or other filters. All agents/connectors associated with your user account can be listed if you call DescribeAgents as is without passing any parameters.
    */
  def describeAgents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeAgentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAgents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeAgentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeAgentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists agents or connectors as specified by ID or other filters. All agents/connectors associated with your user account can be listed if you call DescribeAgents as is without passing any parameters.
    */
  def describeAgents(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeAgentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeAgentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAgents(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeAgentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeAgentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeAgentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves attributes for a list of configuration item IDs.  All of the supplied IDs must be for the same asset type from one of the following:   server   application   process   connection   Output fields are specific to the asset type specified. For example, the output for a server configuration item includes a list of attributes about the server, such as host name, operating system, number of network cards, etc. For a complete list of outputs for each asset type, see Using the DescribeConfigurations Action. 
    */
  def describeConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves attributes for a list of configuration item IDs.  All of the supplied IDs must be for the same asset type from one of the following:   server   application   process   connection   Output fields are specific to the asset type specified. For example, the output for a server configuration item includes a list of attributes about the server, such as host name, operating system, number of network cards, etc. For a complete list of outputs for each asset type, see Using the DescribeConfigurations Action. 
    */
  def describeConfigurations(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurations(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists exports as specified by ID. All continuous exports associated with your user account can be listed if you call DescribeContinuousExports as is without passing any parameters.
    */
  def describeContinuousExports(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeContinuousExportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeContinuousExports(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeContinuousExportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeContinuousExportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists exports as specified by ID. All continuous exports associated with your user account can be listed if you call DescribeContinuousExports as is without passing any parameters.
    */
  def describeContinuousExports(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeContinuousExportsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeContinuousExportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeContinuousExports(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeContinuousExportsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeContinuousExportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeContinuousExportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  DescribeExportConfigurations is deprecated. Use DescribeImportTasks, instead.
    */
  def describeExportConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeExportConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  DescribeExportConfigurations is deprecated. Use DescribeImportTasks, instead.
    */
  def describeExportConfigurations(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeExportConfigurations(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.
    */
  def describeExportTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeExportTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.
    */
  def describeExportTasks(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeExportTasks(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeExportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of import tasks for your account, including status information, times, IDs, the Amazon S3 Object URL for the import file, and more.
    */
  def describeImportTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeImportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImportTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeImportTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeImportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of import tasks for your account, including status information, times, IDs, the Amazon S3 Object URL for the import file, and more.
    */
  def describeImportTasks(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeImportTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeImportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeImportTasks(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeImportTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeImportTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeImportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of configuration items that have tags as specified by the key-value pairs, name and value, passed to the optional parameter filters. There are three valid tag filter names:   tagKey   tagValue   configurationId   Also, all configuration items associated with your user account that have tags can be listed if you call DescribeTags as is without passing any parameters.
    */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of configuration items that have tags as specified by the key-value pairs, name and value, passed to the optional parameter filters. There are three valid tag filter names:   tagKey   tagValue   configurationId   Also, all configuration items associated with your user account that have tags can be listed if you call DescribeTags as is without passing any parameters.
    */
  def describeTags(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTags(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DescribeTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates one or more configuration items from an application.
    */
  def disassociateConfigurationItemsFromApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DisassociateConfigurationItemsFromApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateConfigurationItemsFromApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DisassociateConfigurationItemsFromApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DisassociateConfigurationItemsFromApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates one or more configuration items from an application.
    */
  def disassociateConfigurationItemsFromApplication(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DisassociateConfigurationItemsFromApplicationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DisassociateConfigurationItemsFromApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateConfigurationItemsFromApplication(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DisassociateConfigurationItemsFromApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DisassociateConfigurationItemsFromApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.DisassociateConfigurationItemsFromApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deprecated. Use StartExportTask instead. Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and evaluate the data. Data includes tags and tag associations, processes, connections, servers, and system performance. This API returns an export ID that you can query using the DescribeExportConfigurations API. The system imposes a limit of two configuration exports in six hours.
    */
  def exportConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ExportConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ExportConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ExportConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a short summary of discovered assets. This API operation takes no request parameters and is called as is at the command prompt as shown in the example.
    */
  def getDiscoverySummary(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.GetDiscoverySummaryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDiscoverySummary(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.GetDiscoverySummaryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.GetDiscoverySummaryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a short summary of discovered assets. This API operation takes no request parameters and is called as is at the command prompt as shown in the example.
    */
  def getDiscoverySummary(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.GetDiscoverySummaryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.GetDiscoverySummaryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDiscoverySummary(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.GetDiscoverySummaryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.GetDiscoverySummaryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.GetDiscoverySummaryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of configuration items as specified by the value passed to the required paramater configurationType. Optional filtering may be applied to refine search results.
    */
  def listConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of configuration items as specified by the value passed to the required paramater configurationType. Optional filtering may be applied to refine search results.
    */
  def listConfigurations(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listConfigurations(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of servers that are one network hop away from a specified server.
    */
  def listServerNeighbors(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListServerNeighborsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listServerNeighbors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListServerNeighborsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListServerNeighborsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of servers that are one network hop away from a specified server.
    */
  def listServerNeighbors(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListServerNeighborsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListServerNeighborsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listServerNeighbors(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListServerNeighborsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListServerNeighborsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.ListServerNeighborsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Start the continuous flow of agent's discovered data into Amazon Athena.
    */
  def startContinuousExport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartContinuousExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startContinuousExport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartContinuousExportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartContinuousExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Start the continuous flow of agent's discovered data into Amazon Athena.
    */
  def startContinuousExport(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartContinuousExportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartContinuousExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startContinuousExport(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartContinuousExportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartContinuousExportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartContinuousExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Instructs the specified agents or connectors to start collecting data.
    */
  def startDataCollectionByAgentIds(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartDataCollectionByAgentIdsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startDataCollectionByAgentIds(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartDataCollectionByAgentIdsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartDataCollectionByAgentIdsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Instructs the specified agents or connectors to start collecting data.
    */
  def startDataCollectionByAgentIds(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartDataCollectionByAgentIdsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartDataCollectionByAgentIdsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startDataCollectionByAgentIds(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartDataCollectionByAgentIdsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartDataCollectionByAgentIdsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartDataCollectionByAgentIdsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Begins the export of discovered data to an S3 bucket.  If you specify agentIds in a filter, the task exports up to 72 hours of detailed data collected by the identified Application Discovery Agent, including network, process, and performance details. A time range for exported agent data may be set by using startTime and endTime. Export of detailed agent data is limited to five concurrently running exports.   If you do not include an agentIds filter, summary data is exported that includes both AWS Agentless Discovery Connector data and summary data from AWS Discovery Agents. Export of summary data is limited to two exports per day. 
    */
  def startExportTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartExportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startExportTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartExportTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartExportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Begins the export of discovered data to an S3 bucket.  If you specify agentIds in a filter, the task exports up to 72 hours of detailed data collected by the identified Application Discovery Agent, including network, process, and performance details. A time range for exported agent data may be set by using startTime and endTime. Export of detailed agent data is limited to five concurrently running exports.   If you do not include an agentIds filter, summary data is exported that includes both AWS Agentless Discovery Connector data and summary data from AWS Discovery Agents. Export of summary data is limited to two exports per day. 
    */
  def startExportTask(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartExportTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartExportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startExportTask(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartExportTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartExportTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartExportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an import task, which allows you to import details of your on-premises environment directly into AWS without having to use the Application Discovery Service (ADS) tools such as the Discovery Connector or Discovery Agent. This gives you the option to perform migration assessment and planning directly from your imported data, including the ability to group your devices as applications and track their migration status. To start an import request, do this:   Download the specially formatted comma separated value (CSV) import template, which you can find here: https://s3-us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv.   Fill out the template with your server and application data.   Upload your import file to an Amazon S3 bucket, and make a note of it's Object URL. Your import file must be in the CSV format.   Use the console or the StartImportTask command with the AWS CLI or one of the AWS SDKs to import the records from your file.   For more information, including step-by-step procedures, see Migration Hub Import in the AWS Application Discovery Service User Guide.  There are limits to the number of import tasks you can create (and delete) in an AWS account. For more information, see AWS Application Discovery Service Limits in the AWS Application Discovery Service User Guide. 
    */
  def startImportTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartImportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startImportTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartImportTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartImportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an import task, which allows you to import details of your on-premises environment directly into AWS without having to use the Application Discovery Service (ADS) tools such as the Discovery Connector or Discovery Agent. This gives you the option to perform migration assessment and planning directly from your imported data, including the ability to group your devices as applications and track their migration status. To start an import request, do this:   Download the specially formatted comma separated value (CSV) import template, which you can find here: https://s3-us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv.   Fill out the template with your server and application data.   Upload your import file to an Amazon S3 bucket, and make a note of it's Object URL. Your import file must be in the CSV format.   Use the console or the StartImportTask command with the AWS CLI or one of the AWS SDKs to import the records from your file.   For more information, including step-by-step procedures, see Migration Hub Import in the AWS Application Discovery Service User Guide.  There are limits to the number of import tasks you can create (and delete) in an AWS account. For more information, see AWS Application Discovery Service Limits in the AWS Application Discovery Service User Guide. 
    */
  def startImportTask(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartImportTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartImportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startImportTask(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartImportTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartImportTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StartImportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stop the continuous flow of agent's discovered data into Amazon Athena.
    */
  def stopContinuousExport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopContinuousExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopContinuousExport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopContinuousExportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopContinuousExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stop the continuous flow of agent's discovered data into Amazon Athena.
    */
  def stopContinuousExport(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopContinuousExportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopContinuousExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopContinuousExport(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopContinuousExportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopContinuousExportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopContinuousExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Instructs the specified agents or connectors to stop collecting data.
    */
  def stopDataCollectionByAgentIds(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopDataCollectionByAgentIdsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopDataCollectionByAgentIds(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopDataCollectionByAgentIdsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopDataCollectionByAgentIdsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Instructs the specified agents or connectors to stop collecting data.
    */
  def stopDataCollectionByAgentIds(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopDataCollectionByAgentIdsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopDataCollectionByAgentIdsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopDataCollectionByAgentIds(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopDataCollectionByAgentIdsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopDataCollectionByAgentIdsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.StopDataCollectionByAgentIdsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates metadata about an application.
    */
  def updateApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.UpdateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates metadata about an application.
    */
  def updateApplication(params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.UpdateApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplication(
    params: awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.UpdateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.UpdateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDiscoveryMod.DiscoveryNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

