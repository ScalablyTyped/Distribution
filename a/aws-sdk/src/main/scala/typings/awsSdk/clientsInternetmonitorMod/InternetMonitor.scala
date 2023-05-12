package typings.awsSdk.clientsInternetmonitorMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternetMonitor extends Service {
  
  @JSName("config")
  var config_InternetMonitor: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a monitor in Amazon CloudWatch Internet Monitor. A monitor is built based on information from the application resources that you add: Amazon Virtual Private Clouds (VPCs), Amazon CloudFront distributions, and WorkSpaces directories. Internet Monitor then publishes internet measurements from Amazon Web Services that are specific to the city-networks, that is, the locations and ASNs (typically internet service providers or ISPs), where clients access your application. For more information, see Using Amazon CloudWatch Internet Monitor in the Amazon CloudWatch User Guide. When you create a monitor, you set a maximum limit for the number of city-networks where client traffic is monitored. The city-network maximum that you choose is the limit, but you only pay for the number of city-networks that are actually monitored. You can change the maximum at any time by updating your monitor. For more information, see Choosing a city-network maximum value in the Amazon CloudWatch User Guide.
    */
  def createMonitor(): Request[CreateMonitorOutput, AWSError] = js.native
  def createMonitor(callback: js.Function2[/* err */ AWSError, /* data */ CreateMonitorOutput, Unit]): Request[CreateMonitorOutput, AWSError] = js.native
  /**
    * Creates a monitor in Amazon CloudWatch Internet Monitor. A monitor is built based on information from the application resources that you add: Amazon Virtual Private Clouds (VPCs), Amazon CloudFront distributions, and WorkSpaces directories. Internet Monitor then publishes internet measurements from Amazon Web Services that are specific to the city-networks, that is, the locations and ASNs (typically internet service providers or ISPs), where clients access your application. For more information, see Using Amazon CloudWatch Internet Monitor in the Amazon CloudWatch User Guide. When you create a monitor, you set a maximum limit for the number of city-networks where client traffic is monitored. The city-network maximum that you choose is the limit, but you only pay for the number of city-networks that are actually monitored. You can change the maximum at any time by updating your monitor. For more information, see Choosing a city-network maximum value in the Amazon CloudWatch User Guide.
    */
  def createMonitor(params: CreateMonitorInput): Request[CreateMonitorOutput, AWSError] = js.native
  def createMonitor(
    params: CreateMonitorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMonitorOutput, Unit]
  ): Request[CreateMonitorOutput, AWSError] = js.native
  
  /**
    * Deletes a monitor in Amazon CloudWatch Internet Monitor. 
    */
  def deleteMonitor(): Request[DeleteMonitorOutput, AWSError] = js.native
  def deleteMonitor(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMonitorOutput, Unit]): Request[DeleteMonitorOutput, AWSError] = js.native
  /**
    * Deletes a monitor in Amazon CloudWatch Internet Monitor. 
    */
  def deleteMonitor(params: DeleteMonitorInput): Request[DeleteMonitorOutput, AWSError] = js.native
  def deleteMonitor(
    params: DeleteMonitorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMonitorOutput, Unit]
  ): Request[DeleteMonitorOutput, AWSError] = js.native
  
  /**
    * Gets information the Amazon CloudWatch Internet Monitor has created and stored about a health event for a specified monitor. This information includes the impacted locations, and all of the information related to the event by location. The information returned includes the performance, availability, and round-trip time impact, information about the network providers, the event type, and so on. Information rolled up at the global traffic level is also returned, including the impact type and total traffic impact.
    */
  def getHealthEvent(): Request[GetHealthEventOutput, AWSError] = js.native
  def getHealthEvent(callback: js.Function2[/* err */ AWSError, /* data */ GetHealthEventOutput, Unit]): Request[GetHealthEventOutput, AWSError] = js.native
  /**
    * Gets information the Amazon CloudWatch Internet Monitor has created and stored about a health event for a specified monitor. This information includes the impacted locations, and all of the information related to the event by location. The information returned includes the performance, availability, and round-trip time impact, information about the network providers, the event type, and so on. Information rolled up at the global traffic level is also returned, including the impact type and total traffic impact.
    */
  def getHealthEvent(params: GetHealthEventInput): Request[GetHealthEventOutput, AWSError] = js.native
  def getHealthEvent(
    params: GetHealthEventInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHealthEventOutput, Unit]
  ): Request[GetHealthEventOutput, AWSError] = js.native
  
  /**
    * Gets information about a monitor in Amazon CloudWatch Internet Monitor based on a monitor name. The information returned includes the Amazon Resource Name (ARN), create time, modified time, resources included in the monitor, and status information.
    */
  def getMonitor(): Request[GetMonitorOutput, AWSError] = js.native
  def getMonitor(callback: js.Function2[/* err */ AWSError, /* data */ GetMonitorOutput, Unit]): Request[GetMonitorOutput, AWSError] = js.native
  /**
    * Gets information about a monitor in Amazon CloudWatch Internet Monitor based on a monitor name. The information returned includes the Amazon Resource Name (ARN), create time, modified time, resources included in the monitor, and status information.
    */
  def getMonitor(params: GetMonitorInput): Request[GetMonitorOutput, AWSError] = js.native
  def getMonitor(
    params: GetMonitorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMonitorOutput, Unit]
  ): Request[GetMonitorOutput, AWSError] = js.native
  
  /**
    * Lists all health events for a monitor in Amazon CloudWatch Internet Monitor. Returns all information for health events including the client location information the network cause and status, event start and end time, percentage of total traffic impacted, and status.  Health events that have start times during the time frame that is requested are not included in the list of health events. 
    */
  def listHealthEvents(): Request[ListHealthEventsOutput, AWSError] = js.native
  def listHealthEvents(callback: js.Function2[/* err */ AWSError, /* data */ ListHealthEventsOutput, Unit]): Request[ListHealthEventsOutput, AWSError] = js.native
  /**
    * Lists all health events for a monitor in Amazon CloudWatch Internet Monitor. Returns all information for health events including the client location information the network cause and status, event start and end time, percentage of total traffic impacted, and status.  Health events that have start times during the time frame that is requested are not included in the list of health events. 
    */
  def listHealthEvents(params: ListHealthEventsInput): Request[ListHealthEventsOutput, AWSError] = js.native
  def listHealthEvents(
    params: ListHealthEventsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHealthEventsOutput, Unit]
  ): Request[ListHealthEventsOutput, AWSError] = js.native
  
  /**
    * Lists all of your monitors for Amazon CloudWatch Internet Monitor and their statuses, along with the Amazon Resource Name (ARN) and name of each monitor.
    */
  def listMonitors(): Request[ListMonitorsOutput, AWSError] = js.native
  def listMonitors(callback: js.Function2[/* err */ AWSError, /* data */ ListMonitorsOutput, Unit]): Request[ListMonitorsOutput, AWSError] = js.native
  /**
    * Lists all of your monitors for Amazon CloudWatch Internet Monitor and their statuses, along with the Amazon Resource Name (ARN) and name of each monitor.
    */
  def listMonitors(params: ListMonitorsInput): Request[ListMonitorsOutput, AWSError] = js.native
  def listMonitors(
    params: ListMonitorsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMonitorsOutput, Unit]
  ): Request[ListMonitorsOutput, AWSError] = js.native
  
  /**
    * Lists the tags for a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists the tags for a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Adds a tag to a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor. You can add a maximum of 50 tags in Internet Monitor. A minimum of one tag is required for this call. It returns an error if you use the TagResource request with 0 tags.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds a tag to a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor. You can add a maximum of 50 tags in Internet Monitor. A minimum of one tag is required for this call. It returns an error if you use the TagResource request with 0 tags.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Removes a tag from a resource.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes a tag from a resource.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Updates a monitor. You can update a monitor to change the maximum number of city-networks (locations and ASNs or internet service providers), to add or remove resources, or to change the status of the monitor. Note that you can't change the name of a monitor. The city-network maximum that you choose is the limit, but you only pay for the number of city-networks that are actually monitored. For more information, see Choosing a city-network maximum value in the Amazon CloudWatch User Guide.
    */
  def updateMonitor(): Request[UpdateMonitorOutput, AWSError] = js.native
  def updateMonitor(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMonitorOutput, Unit]): Request[UpdateMonitorOutput, AWSError] = js.native
  /**
    * Updates a monitor. You can update a monitor to change the maximum number of city-networks (locations and ASNs or internet service providers), to add or remove resources, or to change the status of the monitor. Note that you can't change the name of a monitor. The city-network maximum that you choose is the limit, but you only pay for the number of city-networks that are actually monitored. For more information, see Choosing a city-network maximum value in the Amazon CloudWatch User Guide.
    */
  def updateMonitor(params: UpdateMonitorInput): Request[UpdateMonitorOutput, AWSError] = js.native
  def updateMonitor(
    params: UpdateMonitorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMonitorOutput, Unit]
  ): Request[UpdateMonitorOutput, AWSError] = js.native
}
