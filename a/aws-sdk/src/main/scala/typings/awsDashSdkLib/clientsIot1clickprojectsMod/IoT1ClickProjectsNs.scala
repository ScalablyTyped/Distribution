package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/iot1clickprojects", "IoT1ClickProjects")
@js.native
object IoT1ClickProjectsNs extends js.Object {
  trait AssociateDeviceWithPlacementRequest extends js.Object {
    /**
      * The ID of the physical device to be associated with the given placement in the project. Note that a mandatory 4 character prefix is required for all deviceId values.
      */
    var deviceId: DeviceId
    /**
      * The device template name to associate with the device ID.
      */
    var deviceTemplateName: DeviceTemplateName
    /**
      * The name of the placement in which to associate the device.
      */
    var placementName: PlacementName
    /**
      * The name of the project containing the placement in which to associate the device.
      */
    var projectName: ProjectName
  }
  
  trait AssociateDeviceWithPlacementResponse extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreatePlacementRequest extends js.Object {
    /**
      * Optional user-defined key/value pairs providing contextual data (such as location or function) for the placement.
      */
    var attributes: js.UndefOr[PlacementAttributeMap] = js.undefined
    /**
      * The name of the placement to be created.
      */
    var placementName: PlacementName
    /**
      * The name of the project in which to create the placement.
      */
    var projectName: ProjectName
  }
  
  trait CreatePlacementResponse extends js.Object
  
  trait CreateProjectRequest extends js.Object {
    /**
      * An optional description for the project.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The schema defining the placement to be created. A placement template defines placement default attributes and device templates. You cannot add or remove device templates after the project has been created. However, you can update callbackOverrides for the device templates using the UpdateProject API.
      */
    var placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined
    /**
      * The name of the project to create.
      */
    var projectName: ProjectName
  }
  
  trait CreateProjectResponse extends js.Object
  
  trait DefaultPlacementAttributeMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeDefaultValue]
  
  trait DeletePlacementRequest extends js.Object {
    /**
      * The name of the empty placement to delete.
      */
    var placementName: PlacementName
    /**
      * The project containing the empty placement to delete.
      */
    var projectName: ProjectName
  }
  
  trait DeletePlacementResponse extends js.Object
  
  trait DeleteProjectRequest extends js.Object {
    /**
      * The name of the empty project to delete.
      */
    var projectName: ProjectName
  }
  
  trait DeleteProjectResponse extends js.Object
  
  trait DescribePlacementRequest extends js.Object {
    /**
      * The name of the placement within a project.
      */
    var placementName: PlacementName
    /**
      * The project containing the placement to be described.
      */
    var projectName: ProjectName
  }
  
  trait DescribePlacementResponse extends js.Object {
    /**
      * An object describing the placement.
      */
    var placement: PlacementDescription
  }
  
  trait DescribeProjectRequest extends js.Object {
    /**
      * The name of the project to be described.
      */
    var projectName: ProjectName
  }
  
  trait DescribeProjectResponse extends js.Object {
    /**
      * An object describing the project.
      */
    var project: ProjectDescription
  }
  
  trait DeviceCallbackOverrideMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[DeviceCallbackValue]
  
  trait DeviceMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[DeviceId]
  
  trait DeviceTemplate extends js.Object {
    /**
      * An optional Lambda function to invoke instead of the default Lambda function provided by the placement template.
      */
    var callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap] = js.undefined
    /**
      * The device type, which currently must be "button".
      */
    var deviceType: js.UndefOr[DeviceType] = js.undefined
  }
  
  trait DeviceTemplateMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[DeviceTemplate]
  
  trait DisassociateDeviceFromPlacementRequest extends js.Object {
    /**
      * The device ID that should be removed from the placement.
      */
    var deviceTemplateName: DeviceTemplateName
    /**
      * The name of the placement that the device should be removed from.
      */
    var placementName: PlacementName
    /**
      * The name of the project that contains the placement.
      */
    var projectName: ProjectName
  }
  
  trait DisassociateDeviceFromPlacementResponse extends js.Object
  
  trait GetDevicesInPlacementRequest extends js.Object {
    /**
      * The name of the placement to get the devices from.
      */
    var placementName: PlacementName
    /**
      * The name of the project containing the placement.
      */
    var projectName: ProjectName
  }
  
  trait GetDevicesInPlacementResponse extends js.Object {
    /**
      * An object containing the devices (zero or more) within the placement.
      */
    var devices: DeviceMap
  }
  
  trait ListPlacementsRequest extends js.Object {
    /**
      * The maximum number of results to return per request. If not set, a default value of 100 is used.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The project containing the placements to be listed.
      */
    var projectName: ProjectName
  }
  
  trait ListPlacementsResponse extends js.Object {
    /**
      * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An object listing the requested placements.
      */
    var placements: PlacementSummaryList
  }
  
  trait ListProjectsRequest extends js.Object {
    /**
      * The maximum number of results to return per request. If not set, a default value of 100 is used.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListProjectsResponse extends js.Object {
    /**
      * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An object containing the list of projects.
      */
    var projects: ProjectSummaryList
  }
  
  trait PlacementAttributeMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait PlacementDescription extends js.Object {
    /**
      * The user-defined attributes associated with the placement.
      */
    var attributes: PlacementAttributeMap
    /**
      * The date when the placement was initially created, in UNIX epoch time format.
      */
    var createdDate: Time
    /**
      * The name of the placement.
      */
    var placementName: PlacementName
    /**
      * The name of the project containing the placement.
      */
    var projectName: ProjectName
    /**
      * The date when the placement was last updated, in UNIX epoch time format. If the placement was not updated, then createdDate and updatedDate are the same.
      */
    var updatedDate: Time
  }
  
  trait PlacementSummary extends js.Object {
    /**
      * The date when the placement was originally created, in UNIX epoch time format.
      */
    var createdDate: Time
    /**
      * The name of the placement being summarized.
      */
    var placementName: PlacementName
    /**
      * The name of the project containing the placement.
      */
    var projectName: ProjectName
    /**
      * The date when the placement was last updated, in UNIX epoch time format. If the placement was not updated, then createdDate and updatedDate are the same.
      */
    var updatedDate: Time
  }
  
  trait PlacementTemplate extends js.Object {
    /**
      * The default attributes (key/value pairs) to be applied to all placements using this template.
      */
    var defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap] = js.undefined
    /**
      * An object specifying the DeviceTemplate for all placements using this (PlacementTemplate) template.
      */
    var deviceTemplates: js.UndefOr[DeviceTemplateMap] = js.undefined
  }
  
  trait ProjectDescription extends js.Object {
    /**
      * The date when the project was originally created, in UNIX epoch time format.
      */
    var createdDate: Time
    /**
      * The description of the project.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * An object describing the project's placement specifications.
      */
    var placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined
    /**
      * The name of the project for which to obtain information from.
      */
    var projectName: ProjectName
    /**
      * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then createdDate and updatedDate are the same.
      */
    var updatedDate: Time
  }
  
  trait ProjectSummary extends js.Object {
    /**
      * The date when the project was originally created, in UNIX epoch time format.
      */
    var createdDate: Time
    /**
      * The name of the project being summarized.
      */
    var projectName: ProjectName
    /**
      * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then createdDate and updatedDate are the same.
      */
    var updatedDate: Time
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UpdatePlacementRequest extends js.Object {
    /**
      * The user-defined object of attributes used to update the placement. The maximum number of key/value pairs is 50.
      */
    var attributes: js.UndefOr[PlacementAttributeMap] = js.undefined
    /**
      * The name of the placement to update.
      */
    var placementName: PlacementName
    /**
      * The name of the project containing the placement to be updated.
      */
    var projectName: ProjectName
  }
  
  trait UpdatePlacementResponse extends js.Object
  
  trait UpdateProjectRequest extends js.Object {
    /**
      * An optional user-defined description for the project.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * An object defining the project update. Once a project has been created, you cannot add device template names to the project. However, for a given placementTemplate, you can update the associated callbackOverrides for the device definition using this API.
      */
    var placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined
    /**
      * The name of the project to be updated.
      */
    var projectName: ProjectName
  }
  
  trait UpdateProjectResponse extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AttributeDefaultValue = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Description = java.lang.String
  type DeviceCallbackKey = java.lang.String
  type DeviceCallbackValue = java.lang.String
  type DeviceId = java.lang.String
  type DeviceTemplateName = java.lang.String
  type DeviceType = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PlacementName = java.lang.String
  type PlacementSummaryList = js.Array[PlacementSummary]
  type ProjectName = java.lang.String
  type ProjectSummaryList = js.Array[ProjectSummary]
  type Time = stdLib.Date
  type apiVersion = _apiVersion | java.lang.String
}

