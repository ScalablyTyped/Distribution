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
}
