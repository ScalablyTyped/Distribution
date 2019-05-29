package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundStation
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_GroundStation: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Cancels a contact with a specified contact ID.
    */
  def cancelContact(): awsDashSdkLib.libRequestMod.Request[ContactIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ContactIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ContactIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a contact with a specified contact ID.
    */
  def cancelContact(params: CancelContactRequest): awsDashSdkLib.libRequestMod.Request[ContactIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelContact(
    params: CancelContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ContactIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ContactIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Config with the specified configData parameters.
    Only one type of configData can be specified.
    */
  def createConfig(): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfigIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Config with the specified configData parameters.
    Only one type of configData can be specified.
    */
  def createConfig(params: CreateConfigRequest): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConfig(
    params: CreateConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfigIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a DataflowEndpoint group containing the specified list of DataflowEndpoint objects.
    The name field in each endpoint is used in your mission profile DataflowEndpointConfig 
    to specify which endpoints to use during a contact. 
    When a contact uses multiple DataflowEndpointConfig objects, each Config 
    must match a DataflowEndpoint in the same group.
    */
  def createDataflowEndpointGroup(): awsDashSdkLib.libRequestMod.Request[DataflowEndpointGroupIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDataflowEndpointGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DataflowEndpointGroupIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DataflowEndpointGroupIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a DataflowEndpoint group containing the specified list of DataflowEndpoint objects.
    The name field in each endpoint is used in your mission profile DataflowEndpointConfig 
    to specify which endpoints to use during a contact. 
    When a contact uses multiple DataflowEndpointConfig objects, each Config 
    must match a DataflowEndpoint in the same group.
    */
  def createDataflowEndpointGroup(params: CreateDataflowEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[DataflowEndpointGroupIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDataflowEndpointGroup(
    params: CreateDataflowEndpointGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DataflowEndpointGroupIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DataflowEndpointGroupIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a mission profile.
    
    dataflowEdges is a list of lists of strings. Each lower level list of strings
    has two elements: a from ARN and a to ARN.
    */
  def createMissionProfile(): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMissionProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ MissionProfileIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a mission profile.
    
    dataflowEdges is a list of lists of strings. Each lower level list of strings
    has two elements: a from ARN and a to ARN.
    */
  def createMissionProfile(params: CreateMissionProfileRequest): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMissionProfile(
    params: CreateMissionProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ MissionProfileIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Config.
    */
  def deleteConfig(): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfigIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Config.
    */
  def deleteConfig(params: DeleteConfigRequest): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConfig(
    params: DeleteConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfigIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a dataflow endpoint group.
    */
  def deleteDataflowEndpointGroup(): awsDashSdkLib.libRequestMod.Request[DataflowEndpointGroupIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataflowEndpointGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DataflowEndpointGroupIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DataflowEndpointGroupIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a dataflow endpoint group.
    */
  def deleteDataflowEndpointGroup(params: DeleteDataflowEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[DataflowEndpointGroupIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataflowEndpointGroup(
    params: DeleteDataflowEndpointGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DataflowEndpointGroupIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DataflowEndpointGroupIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a mission profile.
    */
  def deleteMissionProfile(): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMissionProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ MissionProfileIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a mission profile.
    */
  def deleteMissionProfile(params: DeleteMissionProfileRequest): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMissionProfile(
    params: DeleteMissionProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ MissionProfileIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an existing contact.
    */
  def describeContact(): awsDashSdkLib.libRequestMod.Request[DescribeContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an existing contact.
    */
  def describeContact(params: DescribeContactRequest): awsDashSdkLib.libRequestMod.Request[DescribeContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeContact(
    params: DescribeContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns Config information.
    Only one Config response can be returned.
    */
  def getConfig(): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns Config information.
    Only one Config response can be returned.
    */
  def getConfig(params: GetConfigRequest): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConfig(
    params: GetConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the dataflow endpoint group.
    */
  def getDataflowEndpointGroup(): awsDashSdkLib.libRequestMod.Request[GetDataflowEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDataflowEndpointGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDataflowEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDataflowEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the dataflow endpoint group.
    */
  def getDataflowEndpointGroup(params: GetDataflowEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[GetDataflowEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDataflowEndpointGroup(
    params: GetDataflowEndpointGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDataflowEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDataflowEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the number of minutes used by account.
    */
  def getMinuteUsage(): awsDashSdkLib.libRequestMod.Request[GetMinuteUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMinuteUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMinuteUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMinuteUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the number of minutes used by account.
    */
  def getMinuteUsage(params: GetMinuteUsageRequest): awsDashSdkLib.libRequestMod.Request[GetMinuteUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMinuteUsage(
    params: GetMinuteUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMinuteUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMinuteUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a mission profile.
    */
  def getMissionProfile(): awsDashSdkLib.libRequestMod.Request[GetMissionProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMissionProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMissionProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMissionProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a mission profile.
    */
  def getMissionProfile(params: GetMissionProfileRequest): awsDashSdkLib.libRequestMod.Request[GetMissionProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMissionProfile(
    params: GetMissionProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMissionProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMissionProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a satellite.
    */
  def getSatellite(): awsDashSdkLib.libRequestMod.Request[GetSatelliteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSatellite(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSatelliteResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSatelliteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a satellite.
    */
  def getSatellite(params: GetSatelliteRequest): awsDashSdkLib.libRequestMod.Request[GetSatelliteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSatellite(
    params: GetSatelliteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSatelliteResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSatelliteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of Config objects.
    */
  def listConfigs(): awsDashSdkLib.libRequestMod.Request[ListConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConfigsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of Config objects.
    */
  def listConfigs(params: ListConfigsRequest): awsDashSdkLib.libRequestMod.Request[ListConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConfigs(
    params: ListConfigsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConfigsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of contacts.
    If statusList contains AVAILABLE, the request must include
    groundstation, missionprofileArn, and satelliteArn.
    
    */
  def listContacts(): awsDashSdkLib.libRequestMod.Request[ListContactsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listContacts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListContactsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListContactsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of contacts.
    If statusList contains AVAILABLE, the request must include
    groundstation, missionprofileArn, and satelliteArn.
    
    */
  def listContacts(params: ListContactsRequest): awsDashSdkLib.libRequestMod.Request[ListContactsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listContacts(
    params: ListContactsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListContactsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListContactsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DataflowEndpoint groups.
    */
  def listDataflowEndpointGroups(): awsDashSdkLib.libRequestMod.Request[ListDataflowEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDataflowEndpointGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDataflowEndpointGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDataflowEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DataflowEndpoint groups.
    */
  def listDataflowEndpointGroups(params: ListDataflowEndpointGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListDataflowEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDataflowEndpointGroups(
    params: ListDataflowEndpointGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDataflowEndpointGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDataflowEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of ground stations. 
    */
  def listGroundStations(): awsDashSdkLib.libRequestMod.Request[ListGroundStationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroundStations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroundStationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroundStationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of ground stations. 
    */
  def listGroundStations(params: ListGroundStationsRequest): awsDashSdkLib.libRequestMod.Request[ListGroundStationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroundStations(
    params: ListGroundStationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroundStationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroundStationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of mission profiles.
    */
  def listMissionProfiles(): awsDashSdkLib.libRequestMod.Request[ListMissionProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMissionProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMissionProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMissionProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of mission profiles.
    */
  def listMissionProfiles(params: ListMissionProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListMissionProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMissionProfiles(
    params: ListMissionProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMissionProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMissionProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of satellites.
    */
  def listSatellites(): awsDashSdkLib.libRequestMod.Request[ListSatellitesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSatellites(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSatellitesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSatellitesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of satellites.
    */
  def listSatellites(params: ListSatellitesRequest): awsDashSdkLib.libRequestMod.Request[ListSatellitesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSatellites(
    params: ListSatellitesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSatellitesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSatellitesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of tags or a specified resource.
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
    * Returns a list of tags or a specified resource.
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
    * Reserves a contact using specified parameters.
    */
  def reserveContact(): awsDashSdkLib.libRequestMod.Request[ContactIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def reserveContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ContactIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ContactIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reserves a contact using specified parameters.
    */
  def reserveContact(params: ReserveContactRequest): awsDashSdkLib.libRequestMod.Request[ContactIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def reserveContact(
    params: ReserveContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ContactIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ContactIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns a tag to a resource.
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
    * Assigns a tag to a resource.
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
    * Deassigns a resource tag.
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
    * Deassigns a resource tag.
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
    * Updates the Config used when scheduling contacts.
    Updating a Config will not update the execution parameters
    for existing future contacts scheduled with this Config.
    */
  def updateConfig(): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfigIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Config used when scheduling contacts.
    Updating a Config will not update the execution parameters
    for existing future contacts scheduled with this Config.
    */
  def updateConfig(params: UpdateConfigRequest): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConfig(
    params: UpdateConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfigIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfigIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a mission profile.
    Updating a mission profile will not update the execution parameters
    for existing future contacts.
    */
  def updateMissionProfile(): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMissionProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ MissionProfileIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a mission profile.
    Updating a mission profile will not update the execution parameters
    for existing future contacts.
    */
  def updateMissionProfile(params: UpdateMissionProfileRequest): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMissionProfile(
    params: UpdateMissionProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ MissionProfileIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[MissionProfileIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

