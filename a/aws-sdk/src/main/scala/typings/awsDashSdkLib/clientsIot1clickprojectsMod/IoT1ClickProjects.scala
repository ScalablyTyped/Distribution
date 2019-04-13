package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoT1ClickProjects
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoT1ClickProjects: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a physical device with a placement.
    */
  def associateDeviceWithPlacement(): awsDashSdkLib.libRequestMod.Request[AssociateDeviceWithPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateDeviceWithPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateDeviceWithPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateDeviceWithPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a physical device with a placement.
    */
  def associateDeviceWithPlacement(params: AssociateDeviceWithPlacementRequest): awsDashSdkLib.libRequestMod.Request[AssociateDeviceWithPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateDeviceWithPlacement(
    params: AssociateDeviceWithPlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateDeviceWithPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateDeviceWithPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an empty placement.
    */
  def createPlacement(): awsDashSdkLib.libRequestMod.Request[CreatePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an empty placement.
    */
  def createPlacement(params: CreatePlacementRequest): awsDashSdkLib.libRequestMod.Request[CreatePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPlacement(
    params: CreatePlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an empty project with a placement template. A project contains zero or more placements that adhere to the placement template defined in the project.
    */
  def createProject(): awsDashSdkLib.libRequestMod.Request[CreateProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an empty project with a placement template. A project contains zero or more placements that adhere to the placement template defined in the project.
    */
  def createProject(params: CreateProjectRequest): awsDashSdkLib.libRequestMod.Request[CreateProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a placement. To delete a placement, it must not have any devices associated with it.  When you delete a placement, all associated data becomes irretrievable. 
    */
  def deletePlacement(): awsDashSdkLib.libRequestMod.Request[DeletePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a placement. To delete a placement, it must not have any devices associated with it.  When you delete a placement, all associated data becomes irretrievable. 
    */
  def deletePlacement(params: DeletePlacementRequest): awsDashSdkLib.libRequestMod.Request[DeletePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePlacement(
    params: DeletePlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a project. To delete a project, it must not have any placements associated with it.  When you delete a project, all associated data becomes irretrievable. 
    */
  def deleteProject(): awsDashSdkLib.libRequestMod.Request[DeleteProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a project. To delete a project, it must not have any placements associated with it.  When you delete a project, all associated data becomes irretrievable. 
    */
  def deleteProject(params: DeleteProjectRequest): awsDashSdkLib.libRequestMod.Request[DeleteProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a placement in a project.
    */
  def describePlacement(): awsDashSdkLib.libRequestMod.Request[DescribePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a placement in a project.
    */
  def describePlacement(params: DescribePlacementRequest): awsDashSdkLib.libRequestMod.Request[DescribePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePlacement(
    params: DescribePlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an object describing a project.
    */
  def describeProject(): awsDashSdkLib.libRequestMod.Request[DescribeProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an object describing a project.
    */
  def describeProject(params: DescribeProjectRequest): awsDashSdkLib.libRequestMod.Request[DescribeProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProject(
    params: DescribeProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a physical device from a placement.
    */
  def disassociateDeviceFromPlacement(): awsDashSdkLib.libRequestMod.Request[DisassociateDeviceFromPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateDeviceFromPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateDeviceFromPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateDeviceFromPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a physical device from a placement.
    */
  def disassociateDeviceFromPlacement(params: DisassociateDeviceFromPlacementRequest): awsDashSdkLib.libRequestMod.Request[DisassociateDeviceFromPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateDeviceFromPlacement(
    params: DisassociateDeviceFromPlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateDeviceFromPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateDeviceFromPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an object enumerating the devices in a placement.
    */
  def getDevicesInPlacement(): awsDashSdkLib.libRequestMod.Request[GetDevicesInPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevicesInPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDevicesInPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDevicesInPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an object enumerating the devices in a placement.
    */
  def getDevicesInPlacement(params: GetDevicesInPlacementRequest): awsDashSdkLib.libRequestMod.Request[GetDevicesInPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevicesInPlacement(
    params: GetDevicesInPlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDevicesInPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDevicesInPlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the placement(s) of a project.
    */
  def listPlacements(): awsDashSdkLib.libRequestMod.Request[ListPlacementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPlacements(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPlacementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPlacementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the placement(s) of a project.
    */
  def listPlacements(params: ListPlacementsRequest): awsDashSdkLib.libRequestMod.Request[ListPlacementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPlacements(
    params: ListPlacementsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPlacementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPlacementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.
    */
  def listProjects(): awsDashSdkLib.libRequestMod.Request[ListProjectsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProjectsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProjectsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.
    */
  def listProjects(params: ListProjectsRequest): awsDashSdkLib.libRequestMod.Request[ListProjectsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProjectsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProjectsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags (metadata key/value pairs) which you have assigned to the resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags (metadata key/value pairs) which you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a resource. For more information, see AWS Tagging Strategies.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a resource. For more information, see AWS Tagging Strategies.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags (metadata key/value pairs) from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags (metadata key/value pairs) from a resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., "").
    */
  def updatePlacement(): awsDashSdkLib.libRequestMod.Request[UpdatePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., "").
    */
  def updatePlacement(params: UpdatePlacementRequest): awsDashSdkLib.libRequestMod.Request[UpdatePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePlacement(
    params: UpdatePlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePlacementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a project associated with your AWS account and region. With the exception of device template names, you can pass just the values that need to be updated because the update request will change only the values that are provided. To clear a value, pass the empty string (i.e., "").
    */
  def updateProject(): awsDashSdkLib.libRequestMod.Request[UpdateProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a project associated with your AWS account and region. With the exception of device template names, you can pass just the values that need to be updated because the update request will change only the values that are provided. To clear a value, pass the empty string (i.e., "").
    */
  def updateProject(params: UpdateProjectRequest): awsDashSdkLib.libRequestMod.Request[UpdateProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

