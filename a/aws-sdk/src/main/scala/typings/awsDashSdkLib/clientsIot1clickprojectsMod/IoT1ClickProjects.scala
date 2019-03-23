package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoT1ClickProjects
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoT1ClickProjects: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ClientConfiguration = js.native
  /**
    * Associates a physical device with a placement.
    */
  def associateDeviceWithPlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.AssociateDeviceWithPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateDeviceWithPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.AssociateDeviceWithPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.AssociateDeviceWithPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a physical device with a placement.
    */
  def associateDeviceWithPlacement(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.AssociateDeviceWithPlacementRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.AssociateDeviceWithPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateDeviceWithPlacement(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.AssociateDeviceWithPlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.AssociateDeviceWithPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.AssociateDeviceWithPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an empty placement.
    */
  def createPlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreatePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreatePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreatePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an empty placement.
    */
  def createPlacement(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreatePlacementRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreatePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPlacement(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreatePlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreatePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreatePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an empty project with a placement template. A project contains zero or more placements that adhere to the placement template defined in the project.
    */
  def createProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreateProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreateProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreateProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an empty project with a placement template. A project contains zero or more placements that adhere to the placement template defined in the project.
    */
  def createProject(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreateProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreateProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createProject(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreateProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.CreateProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a placement. To delete a placement, it must not have any devices associated with it.  When you delete a placement, all associated data becomes irretrievable. 
    */
  def deletePlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeletePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeletePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeletePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a placement. To delete a placement, it must not have any devices associated with it.  When you delete a placement, all associated data becomes irretrievable. 
    */
  def deletePlacement(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeletePlacementRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeletePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePlacement(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeletePlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeletePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeletePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a project. To delete a project, it must not have any placements associated with it.  When you delete a project, all associated data becomes irretrievable. 
    */
  def deleteProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeleteProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeleteProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeleteProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a project. To delete a project, it must not have any placements associated with it.  When you delete a project, all associated data becomes irretrievable. 
    */
  def deleteProject(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeleteProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeleteProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteProject(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeleteProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeleteProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DeleteProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a placement in a project.
    */
  def describePlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a placement in a project.
    */
  def describePlacement(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribePlacementRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePlacement(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribePlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an object describing a project.
    */
  def describeProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribeProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribeProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribeProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an object describing a project.
    */
  def describeProject(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribeProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribeProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeProject(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribeProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribeProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DescribeProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a physical device from a placement.
    */
  def disassociateDeviceFromPlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DisassociateDeviceFromPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateDeviceFromPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DisassociateDeviceFromPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DisassociateDeviceFromPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a physical device from a placement.
    */
  def disassociateDeviceFromPlacement(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DisassociateDeviceFromPlacementRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DisassociateDeviceFromPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateDeviceFromPlacement(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DisassociateDeviceFromPlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DisassociateDeviceFromPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.DisassociateDeviceFromPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an object enumerating the devices in a placement.
    */
  def getDevicesInPlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.GetDevicesInPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDevicesInPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.GetDevicesInPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.GetDevicesInPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an object enumerating the devices in a placement.
    */
  def getDevicesInPlacement(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.GetDevicesInPlacementRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.GetDevicesInPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDevicesInPlacement(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.GetDevicesInPlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.GetDevicesInPlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.GetDevicesInPlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the placement(s) of a project.
    */
  def listPlacements(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListPlacementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPlacements(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListPlacementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListPlacementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the placement(s) of a project.
    */
  def listPlacements(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListPlacementsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListPlacementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPlacements(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListPlacementsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListPlacementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListPlacementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.
    */
  def listProjects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListProjectsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListProjectsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListProjectsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.
    */
  def listProjects(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListProjectsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListProjectsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProjects(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListProjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListProjectsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListProjectsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the tags (metadata key/value pairs) which you have assigned to the resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the tags (metadata key/value pairs) which you have assigned to the resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a resource. For more information, see AWS Tagging Strategies.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a resource. For more information, see AWS Tagging Strategies.
    */
  def tagResource(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes one or more tags (metadata key/value pairs) from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes one or more tags (metadata key/value pairs) from a resource.
    */
  def untagResource(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., "").
    */
  def updatePlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdatePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdatePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdatePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., "").
    */
  def updatePlacement(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdatePlacementRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdatePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePlacement(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdatePlacementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdatePlacementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdatePlacementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a project associated with your AWS account and region. With the exception of device template names, you can pass just the values that need to be updated because the update request will change only the values that are provided. To clear a value, pass the empty string (i.e., "").
    */
  def updateProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdateProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdateProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdateProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a project associated with your AWS account and region. With the exception of device template names, you can pass just the values that need to be updated because the update request will change only the values that are provided. To clear a value, pass the empty string (i.e., "").
    */
  def updateProject(params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdateProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdateProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateProject(
    params: awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdateProjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickprojectsMod.IoT1ClickProjectsNs.UpdateProjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

