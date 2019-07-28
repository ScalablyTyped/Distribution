package typings.awsDashSdk.clientsIot1clickprojectsMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoT1ClickProjects extends Service {
  @JSName("config")
  var config_IoT1ClickProjects: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a physical device with a placement.
    */
  def associateDeviceWithPlacement(): Request[AssociateDeviceWithPlacementResponse, AWSError] = js.native
  def associateDeviceWithPlacement(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDeviceWithPlacementResponse, Unit]): Request[AssociateDeviceWithPlacementResponse, AWSError] = js.native
  /**
    * Associates a physical device with a placement.
    */
  def associateDeviceWithPlacement(params: AssociateDeviceWithPlacementRequest): Request[AssociateDeviceWithPlacementResponse, AWSError] = js.native
  def associateDeviceWithPlacement(
    params: AssociateDeviceWithPlacementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDeviceWithPlacementResponse, Unit]
  ): Request[AssociateDeviceWithPlacementResponse, AWSError] = js.native
  /**
    * Creates an empty placement.
    */
  def createPlacement(): Request[CreatePlacementResponse, AWSError] = js.native
  def createPlacement(callback: js.Function2[/* err */ AWSError, /* data */ CreatePlacementResponse, Unit]): Request[CreatePlacementResponse, AWSError] = js.native
  /**
    * Creates an empty placement.
    */
  def createPlacement(params: CreatePlacementRequest): Request[CreatePlacementResponse, AWSError] = js.native
  def createPlacement(
    params: CreatePlacementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePlacementResponse, Unit]
  ): Request[CreatePlacementResponse, AWSError] = js.native
  /**
    * Creates an empty project with a placement template. A project contains zero or more placements that adhere to the placement template defined in the project.
    */
  def createProject(): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]): Request[CreateProjectResponse, AWSError] = js.native
  /**
    * Creates an empty project with a placement template. A project contains zero or more placements that adhere to the placement template defined in the project.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]
  ): Request[CreateProjectResponse, AWSError] = js.native
  /**
    * Deletes a placement. To delete a placement, it must not have any devices associated with it.  When you delete a placement, all associated data becomes irretrievable. 
    */
  def deletePlacement(): Request[DeletePlacementResponse, AWSError] = js.native
  def deletePlacement(callback: js.Function2[/* err */ AWSError, /* data */ DeletePlacementResponse, Unit]): Request[DeletePlacementResponse, AWSError] = js.native
  /**
    * Deletes a placement. To delete a placement, it must not have any devices associated with it.  When you delete a placement, all associated data becomes irretrievable. 
    */
  def deletePlacement(params: DeletePlacementRequest): Request[DeletePlacementResponse, AWSError] = js.native
  def deletePlacement(
    params: DeletePlacementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePlacementResponse, Unit]
  ): Request[DeletePlacementResponse, AWSError] = js.native
  /**
    * Deletes a project. To delete a project, it must not have any placements associated with it.  When you delete a project, all associated data becomes irretrievable. 
    */
  def deleteProject(): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]): Request[DeleteProjectResponse, AWSError] = js.native
  /**
    * Deletes a project. To delete a project, it must not have any placements associated with it.  When you delete a project, all associated data becomes irretrievable. 
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]
  ): Request[DeleteProjectResponse, AWSError] = js.native
  /**
    * Describes a placement in a project.
    */
  def describePlacement(): Request[DescribePlacementResponse, AWSError] = js.native
  def describePlacement(callback: js.Function2[/* err */ AWSError, /* data */ DescribePlacementResponse, Unit]): Request[DescribePlacementResponse, AWSError] = js.native
  /**
    * Describes a placement in a project.
    */
  def describePlacement(params: DescribePlacementRequest): Request[DescribePlacementResponse, AWSError] = js.native
  def describePlacement(
    params: DescribePlacementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePlacementResponse, Unit]
  ): Request[DescribePlacementResponse, AWSError] = js.native
  /**
    * Returns an object describing a project.
    */
  def describeProject(): Request[DescribeProjectResponse, AWSError] = js.native
  def describeProject(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResponse, Unit]): Request[DescribeProjectResponse, AWSError] = js.native
  /**
    * Returns an object describing a project.
    */
  def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResponse, AWSError] = js.native
  def describeProject(
    params: DescribeProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResponse, Unit]
  ): Request[DescribeProjectResponse, AWSError] = js.native
  /**
    * Removes a physical device from a placement.
    */
  def disassociateDeviceFromPlacement(): Request[DisassociateDeviceFromPlacementResponse, AWSError] = js.native
  def disassociateDeviceFromPlacement(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDeviceFromPlacementResponse, Unit]
  ): Request[DisassociateDeviceFromPlacementResponse, AWSError] = js.native
  /**
    * Removes a physical device from a placement.
    */
  def disassociateDeviceFromPlacement(params: DisassociateDeviceFromPlacementRequest): Request[DisassociateDeviceFromPlacementResponse, AWSError] = js.native
  def disassociateDeviceFromPlacement(
    params: DisassociateDeviceFromPlacementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDeviceFromPlacementResponse, Unit]
  ): Request[DisassociateDeviceFromPlacementResponse, AWSError] = js.native
  /**
    * Returns an object enumerating the devices in a placement.
    */
  def getDevicesInPlacement(): Request[GetDevicesInPlacementResponse, AWSError] = js.native
  def getDevicesInPlacement(callback: js.Function2[/* err */ AWSError, /* data */ GetDevicesInPlacementResponse, Unit]): Request[GetDevicesInPlacementResponse, AWSError] = js.native
  /**
    * Returns an object enumerating the devices in a placement.
    */
  def getDevicesInPlacement(params: GetDevicesInPlacementRequest): Request[GetDevicesInPlacementResponse, AWSError] = js.native
  def getDevicesInPlacement(
    params: GetDevicesInPlacementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDevicesInPlacementResponse, Unit]
  ): Request[GetDevicesInPlacementResponse, AWSError] = js.native
  /**
    * Lists the placement(s) of a project.
    */
  def listPlacements(): Request[ListPlacementsResponse, AWSError] = js.native
  def listPlacements(callback: js.Function2[/* err */ AWSError, /* data */ ListPlacementsResponse, Unit]): Request[ListPlacementsResponse, AWSError] = js.native
  /**
    * Lists the placement(s) of a project.
    */
  def listPlacements(params: ListPlacementsRequest): Request[ListPlacementsResponse, AWSError] = js.native
  def listPlacements(
    params: ListPlacementsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPlacementsResponse, Unit]
  ): Request[ListPlacementsResponse, AWSError] = js.native
  /**
    * Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.
    */
  def listProjects(): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]): Request[ListProjectsResponse, AWSError] = js.native
  /**
    * Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.
    */
  def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]
  ): Request[ListProjectsResponse, AWSError] = js.native
  /**
    * Lists the tags (metadata key/value pairs) which you have assigned to the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags (metadata key/value pairs) which you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a resource. For more information, see AWS Tagging Strategies.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a resource. For more information, see AWS Tagging Strategies.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags (metadata key/value pairs) from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags (metadata key/value pairs) from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., "").
    */
  def updatePlacement(): Request[UpdatePlacementResponse, AWSError] = js.native
  def updatePlacement(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePlacementResponse, Unit]): Request[UpdatePlacementResponse, AWSError] = js.native
  /**
    * Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., "").
    */
  def updatePlacement(params: UpdatePlacementRequest): Request[UpdatePlacementResponse, AWSError] = js.native
  def updatePlacement(
    params: UpdatePlacementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePlacementResponse, Unit]
  ): Request[UpdatePlacementResponse, AWSError] = js.native
  /**
    * Updates a project associated with your AWS account and region. With the exception of device template names, you can pass just the values that need to be updated because the update request will change only the values that are provided. To clear a value, pass the empty string (i.e., "").
    */
  def updateProject(): Request[UpdateProjectResponse, AWSError] = js.native
  def updateProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResponse, Unit]): Request[UpdateProjectResponse, AWSError] = js.native
  /**
    * Updates a project associated with your AWS account and region. With the exception of device template names, you can pass just the values that need to be updated because the update request will change only the values that are provided. To clear a value, pass the empty string (i.e., "").
    */
  def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResponse, AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResponse, Unit]
  ): Request[UpdateProjectResponse, AWSError] = js.native
}

