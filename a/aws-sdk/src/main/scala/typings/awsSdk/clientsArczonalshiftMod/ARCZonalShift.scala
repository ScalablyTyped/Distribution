package typings.awsSdk.clientsArczonalshiftMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARCZonalShift extends Service {
  
  /**
    * Cancel a zonal shift in Amazon Route 53 Application Recovery Controller that you've started for a resource in your AWS account in an AWS Region. 
    */
  def cancelZonalShift(): Request[ZonalShift, AWSError] = js.native
  def cancelZonalShift(callback: js.Function2[/* err */ AWSError, /* data */ ZonalShift, Unit]): Request[ZonalShift, AWSError] = js.native
  /**
    * Cancel a zonal shift in Amazon Route 53 Application Recovery Controller that you've started for a resource in your AWS account in an AWS Region. 
    */
  def cancelZonalShift(params: CancelZonalShiftRequest): Request[ZonalShift, AWSError] = js.native
  def cancelZonalShift(
    params: CancelZonalShiftRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ZonalShift, Unit]
  ): Request[ZonalShift, AWSError] = js.native
  
  @JSName("config")
  var config_ARCZonalShift: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Get information about a resource that's been registered for zonal shifts with Amazon Route 53 Application Recovery Controller in this AWS Region. Resources that are registered for zonal shifts are managed resources in Route 53 ARC. At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with cross-zone load balancing turned off.
    */
  def getManagedResource(): Request[GetManagedResourceResponse, AWSError] = js.native
  def getManagedResource(callback: js.Function2[/* err */ AWSError, /* data */ GetManagedResourceResponse, Unit]): Request[GetManagedResourceResponse, AWSError] = js.native
  /**
    * Get information about a resource that's been registered for zonal shifts with Amazon Route 53 Application Recovery Controller in this AWS Region. Resources that are registered for zonal shifts are managed resources in Route 53 ARC. At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with cross-zone load balancing turned off.
    */
  def getManagedResource(params: GetManagedResourceRequest): Request[GetManagedResourceResponse, AWSError] = js.native
  def getManagedResource(
    params: GetManagedResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetManagedResourceResponse, Unit]
  ): Request[GetManagedResourceResponse, AWSError] = js.native
  
  /**
    * Lists all the resources in your AWS account in this AWS Region that are managed for zonal shifts in Amazon Route 53 Application Recovery Controller, and information about them. The information includes their Amazon Resource Names (ARNs), the Availability Zones the resources are deployed in, and the resource name.
    */
  def listManagedResources(): Request[ListManagedResourcesResponse, AWSError] = js.native
  def listManagedResources(callback: js.Function2[/* err */ AWSError, /* data */ ListManagedResourcesResponse, Unit]): Request[ListManagedResourcesResponse, AWSError] = js.native
  /**
    * Lists all the resources in your AWS account in this AWS Region that are managed for zonal shifts in Amazon Route 53 Application Recovery Controller, and information about them. The information includes their Amazon Resource Names (ARNs), the Availability Zones the resources are deployed in, and the resource name.
    */
  def listManagedResources(params: ListManagedResourcesRequest): Request[ListManagedResourcesResponse, AWSError] = js.native
  def listManagedResources(
    params: ListManagedResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListManagedResourcesResponse, Unit]
  ): Request[ListManagedResourcesResponse, AWSError] = js.native
  
  /**
    * Lists all the active zonal shifts in Amazon Route 53 Application Recovery Controller in your AWS account in this AWS Region.
    */
  def listZonalShifts(): Request[ListZonalShiftsResponse, AWSError] = js.native
  def listZonalShifts(callback: js.Function2[/* err */ AWSError, /* data */ ListZonalShiftsResponse, Unit]): Request[ListZonalShiftsResponse, AWSError] = js.native
  /**
    * Lists all the active zonal shifts in Amazon Route 53 Application Recovery Controller in your AWS account in this AWS Region.
    */
  def listZonalShifts(params: ListZonalShiftsRequest): Request[ListZonalShiftsResponse, AWSError] = js.native
  def listZonalShifts(
    params: ListZonalShiftsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListZonalShiftsResponse, Unit]
  ): Request[ListZonalShiftsResponse, AWSError] = js.native
  
  /**
    * You start a zonal shift to temporarily move load balancer traffic away from an Availability Zone in a AWS Region, to help your application recover immediately, for example, from a developer's bad code deployment or from an AWS infrastructure failure in a single Availability Zone. You can start a zonal shift in Route 53 ARC only for managed resources in your account in an AWS Region. Resources are automatically registered with Route 53 ARC by AWS services. At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with cross-zone load balancing turned off. When you start a zonal shift, traffic for the resource is no longer routed to the Availability Zone. The zonal shift is created immediately in Route 53 ARC. However, it can take a short time, typically up to a few minutes, for existing, in-progress connections in the Availability Zone to complete. For more information, see Zonal shift in the Amazon Route 53 Application Recovery Controller Developer Guide.
    */
  def startZonalShift(): Request[ZonalShift, AWSError] = js.native
  def startZonalShift(callback: js.Function2[/* err */ AWSError, /* data */ ZonalShift, Unit]): Request[ZonalShift, AWSError] = js.native
  /**
    * You start a zonal shift to temporarily move load balancer traffic away from an Availability Zone in a AWS Region, to help your application recover immediately, for example, from a developer's bad code deployment or from an AWS infrastructure failure in a single Availability Zone. You can start a zonal shift in Route 53 ARC only for managed resources in your account in an AWS Region. Resources are automatically registered with Route 53 ARC by AWS services. At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with cross-zone load balancing turned off. When you start a zonal shift, traffic for the resource is no longer routed to the Availability Zone. The zonal shift is created immediately in Route 53 ARC. However, it can take a short time, typically up to a few minutes, for existing, in-progress connections in the Availability Zone to complete. For more information, see Zonal shift in the Amazon Route 53 Application Recovery Controller Developer Guide.
    */
  def startZonalShift(params: StartZonalShiftRequest): Request[ZonalShift, AWSError] = js.native
  def startZonalShift(
    params: StartZonalShiftRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ZonalShift, Unit]
  ): Request[ZonalShift, AWSError] = js.native
  
  /**
    * Update an active zonal shift in Amazon Route 53 Application Recovery Controller in your AWS account. You can update a zonal shift to set a new expiration, or edit or replace the comment for the zonal shift. 
    */
  def updateZonalShift(): Request[ZonalShift, AWSError] = js.native
  def updateZonalShift(callback: js.Function2[/* err */ AWSError, /* data */ ZonalShift, Unit]): Request[ZonalShift, AWSError] = js.native
  /**
    * Update an active zonal shift in Amazon Route 53 Application Recovery Controller in your AWS account. You can update a zonal shift to set a new expiration, or edit or replace the comment for the zonal shift. 
    */
  def updateZonalShift(params: UpdateZonalShiftRequest): Request[ZonalShift, AWSError] = js.native
  def updateZonalShift(
    params: UpdateZonalShiftRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ZonalShift, Unit]
  ): Request[ZonalShift, AWSError] = js.native
}
