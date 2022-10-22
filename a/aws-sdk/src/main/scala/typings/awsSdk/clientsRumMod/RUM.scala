package typings.awsSdk.clientsRumMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RUM extends Service {
  
  /**
    * Specifies the extended metrics that you want a CloudWatch RUM app monitor to send to a destination. Valid destinations include CloudWatch and Evidently. By default, RUM app monitors send some metrics to CloudWatch. These default metrics are listed in CloudWatch metrics that you can collect with CloudWatch RUM. If you also send extended metrics, you can send metrics to Evidently as well as CloudWatch, and you can also optionally send the metrics with additional dimensions. The valid dimension names for the additional dimensions are BrowserName, CountryCode, DeviceType, FileType, OSName, and PageId. For more information, see  Extended metrics that you can send to CloudWatch and CloudWatch Evidently. The maximum number of metric definitions that you can specify in one BatchCreateRumMetricDefinitions operation is 200.  &lt;p&gt;The maximum number of metric definitions that one destination can contain is 2000.&lt;/p&gt; &lt;p&gt;Extended metrics sent are charged as CloudWatch custom metrics. Each combination of additional dimension name and dimension value counts as a custom metric. For more information, see &lt;a href=&quot;https://aws.amazon.com/cloudwatch/pricing/&quot;&gt;Amazon CloudWatch Pricing&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;You must have already created a destination for the metrics before you send them. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html&quot;&gt;PutRumMetricsDestination&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;If some metric definitions specified in a &lt;code&gt;BatchCreateRumMetricDefinitions&lt;/code&gt; operations are not valid, those metric definitions fail and return errors, but all valid metric definitions in the same operation still succeed.&lt;/p&gt; 
    */
  def batchCreateRumMetricDefinitions(): Request[BatchCreateRumMetricDefinitionsResponse, AWSError] = js.native
  def batchCreateRumMetricDefinitions(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateRumMetricDefinitionsResponse, Unit]
  ): Request[BatchCreateRumMetricDefinitionsResponse, AWSError] = js.native
  /**
    * Specifies the extended metrics that you want a CloudWatch RUM app monitor to send to a destination. Valid destinations include CloudWatch and Evidently. By default, RUM app monitors send some metrics to CloudWatch. These default metrics are listed in CloudWatch metrics that you can collect with CloudWatch RUM. If you also send extended metrics, you can send metrics to Evidently as well as CloudWatch, and you can also optionally send the metrics with additional dimensions. The valid dimension names for the additional dimensions are BrowserName, CountryCode, DeviceType, FileType, OSName, and PageId. For more information, see  Extended metrics that you can send to CloudWatch and CloudWatch Evidently. The maximum number of metric definitions that you can specify in one BatchCreateRumMetricDefinitions operation is 200.  &lt;p&gt;The maximum number of metric definitions that one destination can contain is 2000.&lt;/p&gt; &lt;p&gt;Extended metrics sent are charged as CloudWatch custom metrics. Each combination of additional dimension name and dimension value counts as a custom metric. For more information, see &lt;a href=&quot;https://aws.amazon.com/cloudwatch/pricing/&quot;&gt;Amazon CloudWatch Pricing&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;You must have already created a destination for the metrics before you send them. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html&quot;&gt;PutRumMetricsDestination&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;If some metric definitions specified in a &lt;code&gt;BatchCreateRumMetricDefinitions&lt;/code&gt; operations are not valid, those metric definitions fail and return errors, but all valid metric definitions in the same operation still succeed.&lt;/p&gt; 
    */
  def batchCreateRumMetricDefinitions(params: BatchCreateRumMetricDefinitionsRequest): Request[BatchCreateRumMetricDefinitionsResponse, AWSError] = js.native
  def batchCreateRumMetricDefinitions(
    params: BatchCreateRumMetricDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateRumMetricDefinitionsResponse, Unit]
  ): Request[BatchCreateRumMetricDefinitionsResponse, AWSError] = js.native
  
  /**
    * Removes the specified metrics from being sent to an extended metrics destination. If some metric definition IDs specified in a BatchDeleteRumMetricDefinitions operations are not valid, those metric definitions fail and return errors, but all valid metric definition IDs in the same operation are still deleted. The maximum number of metric definitions that you can specify in one BatchDeleteRumMetricDefinitions operation is 200.
    */
  def batchDeleteRumMetricDefinitions(): Request[BatchDeleteRumMetricDefinitionsResponse, AWSError] = js.native
  def batchDeleteRumMetricDefinitions(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteRumMetricDefinitionsResponse, Unit]
  ): Request[BatchDeleteRumMetricDefinitionsResponse, AWSError] = js.native
  /**
    * Removes the specified metrics from being sent to an extended metrics destination. If some metric definition IDs specified in a BatchDeleteRumMetricDefinitions operations are not valid, those metric definitions fail and return errors, but all valid metric definition IDs in the same operation are still deleted. The maximum number of metric definitions that you can specify in one BatchDeleteRumMetricDefinitions operation is 200.
    */
  def batchDeleteRumMetricDefinitions(params: BatchDeleteRumMetricDefinitionsRequest): Request[BatchDeleteRumMetricDefinitionsResponse, AWSError] = js.native
  def batchDeleteRumMetricDefinitions(
    params: BatchDeleteRumMetricDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteRumMetricDefinitionsResponse, Unit]
  ): Request[BatchDeleteRumMetricDefinitionsResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of metrics and dimensions that a RUM app monitor is sending to a single destination.
    */
  def batchGetRumMetricDefinitions(): Request[BatchGetRumMetricDefinitionsResponse, AWSError] = js.native
  def batchGetRumMetricDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetRumMetricDefinitionsResponse, Unit]): Request[BatchGetRumMetricDefinitionsResponse, AWSError] = js.native
  /**
    * Retrieves the list of metrics and dimensions that a RUM app monitor is sending to a single destination.
    */
  def batchGetRumMetricDefinitions(params: BatchGetRumMetricDefinitionsRequest): Request[BatchGetRumMetricDefinitionsResponse, AWSError] = js.native
  def batchGetRumMetricDefinitions(
    params: BatchGetRumMetricDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetRumMetricDefinitionsResponse, Unit]
  ): Request[BatchGetRumMetricDefinitionsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_RUM: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a Amazon CloudWatch RUM app monitor, which collects telemetry data from your application and sends that data to RUM. The data includes performance and reliability information such as page load time, client-side errors, and user behavior. You use this operation only to create a new app monitor. To update an existing app monitor, use UpdateAppMonitor instead. After you create an app monitor, sign in to the CloudWatch RUM console to get the JavaScript code snippet to add to your web application. For more information, see How do I find a code snippet that I've already generated? 
    */
  def createAppMonitor(): Request[CreateAppMonitorResponse, AWSError] = js.native
  def createAppMonitor(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppMonitorResponse, Unit]): Request[CreateAppMonitorResponse, AWSError] = js.native
  /**
    * Creates a Amazon CloudWatch RUM app monitor, which collects telemetry data from your application and sends that data to RUM. The data includes performance and reliability information such as page load time, client-side errors, and user behavior. You use this operation only to create a new app monitor. To update an existing app monitor, use UpdateAppMonitor instead. After you create an app monitor, sign in to the CloudWatch RUM console to get the JavaScript code snippet to add to your web application. For more information, see How do I find a code snippet that I've already generated? 
    */
  def createAppMonitor(params: CreateAppMonitorRequest): Request[CreateAppMonitorResponse, AWSError] = js.native
  def createAppMonitor(
    params: CreateAppMonitorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppMonitorResponse, Unit]
  ): Request[CreateAppMonitorResponse, AWSError] = js.native
  
  /**
    * Deletes an existing app monitor. This immediately stops the collection of data.
    */
  def deleteAppMonitor(): Request[DeleteAppMonitorResponse, AWSError] = js.native
  def deleteAppMonitor(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppMonitorResponse, Unit]): Request[DeleteAppMonitorResponse, AWSError] = js.native
  /**
    * Deletes an existing app monitor. This immediately stops the collection of data.
    */
  def deleteAppMonitor(params: DeleteAppMonitorRequest): Request[DeleteAppMonitorResponse, AWSError] = js.native
  def deleteAppMonitor(
    params: DeleteAppMonitorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppMonitorResponse, Unit]
  ): Request[DeleteAppMonitorResponse, AWSError] = js.native
  
  /**
    * Deletes a destination for CloudWatch RUM extended metrics, so that the specified app monitor stops sending extended metrics to that destination.
    */
  def deleteRumMetricsDestination(): Request[DeleteRumMetricsDestinationResponse, AWSError] = js.native
  def deleteRumMetricsDestination(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRumMetricsDestinationResponse, Unit]): Request[DeleteRumMetricsDestinationResponse, AWSError] = js.native
  /**
    * Deletes a destination for CloudWatch RUM extended metrics, so that the specified app monitor stops sending extended metrics to that destination.
    */
  def deleteRumMetricsDestination(params: DeleteRumMetricsDestinationRequest): Request[DeleteRumMetricsDestinationResponse, AWSError] = js.native
  def deleteRumMetricsDestination(
    params: DeleteRumMetricsDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRumMetricsDestinationResponse, Unit]
  ): Request[DeleteRumMetricsDestinationResponse, AWSError] = js.native
  
  /**
    * Retrieves the complete configuration information for one app monitor.
    */
  def getAppMonitor(): Request[GetAppMonitorResponse, AWSError] = js.native
  def getAppMonitor(callback: js.Function2[/* err */ AWSError, /* data */ GetAppMonitorResponse, Unit]): Request[GetAppMonitorResponse, AWSError] = js.native
  /**
    * Retrieves the complete configuration information for one app monitor.
    */
  def getAppMonitor(params: GetAppMonitorRequest): Request[GetAppMonitorResponse, AWSError] = js.native
  def getAppMonitor(
    params: GetAppMonitorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppMonitorResponse, Unit]
  ): Request[GetAppMonitorResponse, AWSError] = js.native
  
  /**
    * Retrieves the raw performance events that RUM has collected from your web application, so that you can do your own processing or analysis of this data.
    */
  def getAppMonitorData(): Request[GetAppMonitorDataResponse, AWSError] = js.native
  def getAppMonitorData(callback: js.Function2[/* err */ AWSError, /* data */ GetAppMonitorDataResponse, Unit]): Request[GetAppMonitorDataResponse, AWSError] = js.native
  /**
    * Retrieves the raw performance events that RUM has collected from your web application, so that you can do your own processing or analysis of this data.
    */
  def getAppMonitorData(params: GetAppMonitorDataRequest): Request[GetAppMonitorDataResponse, AWSError] = js.native
  def getAppMonitorData(
    params: GetAppMonitorDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppMonitorDataResponse, Unit]
  ): Request[GetAppMonitorDataResponse, AWSError] = js.native
  
  /**
    * Returns a list of the Amazon CloudWatch RUM app monitors in the account.
    */
  def listAppMonitors(): Request[ListAppMonitorsResponse, AWSError] = js.native
  def listAppMonitors(callback: js.Function2[/* err */ AWSError, /* data */ ListAppMonitorsResponse, Unit]): Request[ListAppMonitorsResponse, AWSError] = js.native
  /**
    * Returns a list of the Amazon CloudWatch RUM app monitors in the account.
    */
  def listAppMonitors(params: ListAppMonitorsRequest): Request[ListAppMonitorsResponse, AWSError] = js.native
  def listAppMonitors(
    params: ListAppMonitorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppMonitorsResponse, Unit]
  ): Request[ListAppMonitorsResponse, AWSError] = js.native
  
  /**
    * Returns a list of destinations that you have created to receive RUM extended metrics, for the specified app monitor. For more information about extended metrics, see AddRumMetrics.
    */
  def listRumMetricsDestinations(): Request[ListRumMetricsDestinationsResponse, AWSError] = js.native
  def listRumMetricsDestinations(callback: js.Function2[/* err */ AWSError, /* data */ ListRumMetricsDestinationsResponse, Unit]): Request[ListRumMetricsDestinationsResponse, AWSError] = js.native
  /**
    * Returns a list of destinations that you have created to receive RUM extended metrics, for the specified app monitor. For more information about extended metrics, see AddRumMetrics.
    */
  def listRumMetricsDestinations(params: ListRumMetricsDestinationsRequest): Request[ListRumMetricsDestinationsResponse, AWSError] = js.native
  def listRumMetricsDestinations(
    params: ListRumMetricsDestinationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRumMetricsDestinationsResponse, Unit]
  ): Request[ListRumMetricsDestinationsResponse, AWSError] = js.native
  
  /**
    * Displays the tags associated with a CloudWatch RUM resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Displays the tags associated with a CloudWatch RUM resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Sends telemetry events about your application performance and user behavior to CloudWatch RUM. The code snippet that RUM generates for you to add to your application includes PutRumEvents operations to send this data to RUM. Each PutRumEvents operation can send a batch of events from one user session.
    */
  def putRumEvents(): Request[PutRumEventsResponse, AWSError] = js.native
  def putRumEvents(callback: js.Function2[/* err */ AWSError, /* data */ PutRumEventsResponse, Unit]): Request[PutRumEventsResponse, AWSError] = js.native
  /**
    * Sends telemetry events about your application performance and user behavior to CloudWatch RUM. The code snippet that RUM generates for you to add to your application includes PutRumEvents operations to send this data to RUM. Each PutRumEvents operation can send a batch of events from one user session.
    */
  def putRumEvents(params: PutRumEventsRequest): Request[PutRumEventsResponse, AWSError] = js.native
  def putRumEvents(
    params: PutRumEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRumEventsResponse, Unit]
  ): Request[PutRumEventsResponse, AWSError] = js.native
  
  /**
    * Creates or updates a destination to receive extended metrics from CloudWatch RUM. You can send extended metrics to CloudWatch or to a CloudWatch Evidently experiment. For more information about extended metrics, see AddRumMetrics.
    */
  def putRumMetricsDestination(): Request[PutRumMetricsDestinationResponse, AWSError] = js.native
  def putRumMetricsDestination(callback: js.Function2[/* err */ AWSError, /* data */ PutRumMetricsDestinationResponse, Unit]): Request[PutRumMetricsDestinationResponse, AWSError] = js.native
  /**
    * Creates or updates a destination to receive extended metrics from CloudWatch RUM. You can send extended metrics to CloudWatch or to a CloudWatch Evidently experiment. For more information about extended metrics, see AddRumMetrics.
    */
  def putRumMetricsDestination(params: PutRumMetricsDestinationRequest): Request[PutRumMetricsDestinationResponse, AWSError] = js.native
  def putRumMetricsDestination(
    params: PutRumMetricsDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRumMetricsDestinationResponse, Unit]
  ): Request[PutRumMetricsDestinationResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified CloudWatch RUM resource. Currently, the only resources that can be tagged app monitors. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource. For more information, see Tagging Amazon Web Services resources.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified CloudWatch RUM resource. Currently, the only resources that can be tagged app monitors. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource. For more information, see Tagging Amazon Web Services resources.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of an existing app monitor. When you use this operation, only the parts of the app monitor configuration that you specify in this operation are changed. For any parameters that you omit, the existing values are kept. You can't use this operation to change the tags of an existing app monitor. To change the tags of an existing app monitor, use TagResource. To create a new app monitor, use CreateAppMonitor. After you update an app monitor, sign in to the CloudWatch RUM console to get the updated JavaScript code snippet to add to your web application. For more information, see How do I find a code snippet that I've already generated? 
    */
  def updateAppMonitor(): Request[UpdateAppMonitorResponse, AWSError] = js.native
  def updateAppMonitor(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppMonitorResponse, Unit]): Request[UpdateAppMonitorResponse, AWSError] = js.native
  /**
    * Updates the configuration of an existing app monitor. When you use this operation, only the parts of the app monitor configuration that you specify in this operation are changed. For any parameters that you omit, the existing values are kept. You can't use this operation to change the tags of an existing app monitor. To change the tags of an existing app monitor, use TagResource. To create a new app monitor, use CreateAppMonitor. After you update an app monitor, sign in to the CloudWatch RUM console to get the updated JavaScript code snippet to add to your web application. For more information, see How do I find a code snippet that I've already generated? 
    */
  def updateAppMonitor(params: UpdateAppMonitorRequest): Request[UpdateAppMonitorResponse, AWSError] = js.native
  def updateAppMonitor(
    params: UpdateAppMonitorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppMonitorResponse, Unit]
  ): Request[UpdateAppMonitorResponse, AWSError] = js.native
  
  /**
    * Modifies one existing metric definition for CloudWatch RUM extended metrics. For more information about extended metrics, see BatchCreateRumMetricsDefinitions.
    */
  def updateRumMetricDefinition(): Request[UpdateRumMetricDefinitionResponse, AWSError] = js.native
  def updateRumMetricDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRumMetricDefinitionResponse, Unit]): Request[UpdateRumMetricDefinitionResponse, AWSError] = js.native
  /**
    * Modifies one existing metric definition for CloudWatch RUM extended metrics. For more information about extended metrics, see BatchCreateRumMetricsDefinitions.
    */
  def updateRumMetricDefinition(params: UpdateRumMetricDefinitionRequest): Request[UpdateRumMetricDefinitionResponse, AWSError] = js.native
  def updateRumMetricDefinition(
    params: UpdateRumMetricDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRumMetricDefinitionResponse, Unit]
  ): Request[UpdateRumMetricDefinitionResponse, AWSError] = js.native
}
