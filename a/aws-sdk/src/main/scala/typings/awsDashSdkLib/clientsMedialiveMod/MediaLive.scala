package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaLive
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaLive: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Update a channel schedule
    */
  def batchUpdateSchedule(): awsDashSdkLib.libRequestMod.Request[BatchUpdateScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchUpdateSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchUpdateScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchUpdateScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a channel schedule
    */
  def batchUpdateSchedule(params: BatchUpdateScheduleRequest): awsDashSdkLib.libRequestMod.Request[BatchUpdateScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchUpdateSchedule(
    params: BatchUpdateScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchUpdateScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchUpdateScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new channel
    */
  def createChannel(): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new channel
    */
  def createChannel(params: CreateChannelRequest): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createChannel(
    params: CreateChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create an input
    */
  def createInput(): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create an input
    */
  def createInput(params: CreateInputRequest): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInput(
    params: CreateInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Input Security Group
    */
  def createInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[CreateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInputSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Input Security Group
    */
  def createInputSecurityGroup(params: CreateInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInputSecurityGroup(
    params: CreateInputSecurityGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create tags for a resource
    */
  def createTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create tags for a resource
    */
  def createTags(params: CreateTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTags(
    params: CreateTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts deletion of channel. The associated outputs are also deleted.
    */
  def deleteChannel(): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts deletion of channel. The associated outputs are also deleted.
    */
  def deleteChannel(params: DeleteChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteChannel(
    params: DeleteChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the input end point
    */
  def deleteInput(): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the input end point
    */
  def deleteInput(params: DeleteInputRequest): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInput(
    params: DeleteInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an Input Security Group
    */
  def deleteInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[DeleteInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInputSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an Input Security Group
    */
  def deleteInputSecurityGroup(params: DeleteInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInputSecurityGroup(
    params: DeleteInputSecurityGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete an expired reservation.
    */
  def deleteReservation(): awsDashSdkLib.libRequestMod.Request[DeleteReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete an expired reservation.
    */
  def deleteReservation(params: DeleteReservationRequest): awsDashSdkLib.libRequestMod.Request[DeleteReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReservation(
    params: DeleteReservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete all schedule actions on a channel.
    */
  def deleteSchedule(): awsDashSdkLib.libRequestMod.Request[DeleteScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete all schedule actions on a channel.
    */
  def deleteSchedule(params: DeleteScheduleRequest): awsDashSdkLib.libRequestMod.Request[DeleteScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSchedule(
    params: DeleteScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes tags for a resource
    */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes tags for a resource
    */
  def deleteTags(params: DeleteTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    params: DeleteTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets details about a channel
    */
  def describeChannel(): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets details about a channel
    */
  def describeChannel(params: DescribeChannelRequest): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeChannel(
    params: DescribeChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces details about an input
    */
  def describeInput(): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces details about an input
    */
  def describeInput(params: DescribeInputRequest): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInput(
    params: DescribeInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces a summary of an Input Security Group
    */
  def describeInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[DescribeInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInputSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces a summary of an Input Security Group
    */
  def describeInputSecurityGroup(params: DescribeInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInputSecurityGroup(
    params: DescribeInputSecurityGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get details for an offering.
    */
  def describeOffering(): awsDashSdkLib.libRequestMod.Request[DescribeOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get details for an offering.
    */
  def describeOffering(params: DescribeOfferingRequest): awsDashSdkLib.libRequestMod.Request[DescribeOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOffering(
    params: DescribeOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get details for a reservation.
    */
  def describeReservation(): awsDashSdkLib.libRequestMod.Request[DescribeReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get details for a reservation.
    */
  def describeReservation(params: DescribeReservationRequest): awsDashSdkLib.libRequestMod.Request[DescribeReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReservation(
    params: DescribeReservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get a channel schedule
    */
  def describeSchedule(): awsDashSdkLib.libRequestMod.Request[DescribeScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get a channel schedule
    */
  def describeSchedule(params: DescribeScheduleRequest): awsDashSdkLib.libRequestMod.Request[DescribeScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSchedule(
    params: DescribeScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces list of channels that have been created
    */
  def listChannels(): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listChannels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces list of channels that have been created
    */
  def listChannels(params: ListChannelsRequest): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listChannels(
    params: ListChannelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces a list of Input Security Groups for an account
    */
  def listInputSecurityGroups(): awsDashSdkLib.libRequestMod.Request[ListInputSecurityGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInputSecurityGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInputSecurityGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInputSecurityGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces a list of Input Security Groups for an account
    */
  def listInputSecurityGroups(params: ListInputSecurityGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListInputSecurityGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInputSecurityGroups(
    params: ListInputSecurityGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInputSecurityGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInputSecurityGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces list of inputs that have been created
    */
  def listInputs(): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInputs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInputsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces list of inputs that have been created
    */
  def listInputs(params: ListInputsRequest): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInputs(
    params: ListInputsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInputsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List offerings available for purchase.
    */
  def listOfferings(): awsDashSdkLib.libRequestMod.Request[ListOfferingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOfferingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOfferingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List offerings available for purchase.
    */
  def listOfferings(params: ListOfferingsRequest): awsDashSdkLib.libRequestMod.Request[ListOfferingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOfferings(
    params: ListOfferingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOfferingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOfferingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List purchased reservations.
    */
  def listReservations(): awsDashSdkLib.libRequestMod.Request[ListReservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listReservations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListReservationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListReservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List purchased reservations.
    */
  def listReservations(params: ListReservationsRequest): awsDashSdkLib.libRequestMod.Request[ListReservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listReservations(
    params: ListReservationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListReservationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListReservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Produces list of tags that have been created for a resource
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
    * Produces list of tags that have been created for a resource
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
    * Purchase an offering and create a reservation.
    */
  def purchaseOffering(): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def purchaseOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PurchaseOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Purchase an offering and create a reservation.
    */
  def purchaseOffering(params: PurchaseOfferingRequest): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def purchaseOffering(
    params: PurchaseOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PurchaseOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an existing channel
    */
  def startChannel(): awsDashSdkLib.libRequestMod.Request[StartChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an existing channel
    */
  def startChannel(params: StartChannelRequest): awsDashSdkLib.libRequestMod.Request[StartChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startChannel(
    params: StartChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a running channel
    */
  def stopChannel(): awsDashSdkLib.libRequestMod.Request[StopChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a running channel
    */
  def stopChannel(params: StopChannelRequest): awsDashSdkLib.libRequestMod.Request[StopChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopChannel(
    params: StopChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a channel.
    */
  def updateChannel(): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a channel.
    */
  def updateChannel(params: UpdateChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateChannel(
    params: UpdateChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the class of the channel.
    */
  def updateChannelClass(): awsDashSdkLib.libRequestMod.Request[UpdateChannelClassResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateChannelClass(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateChannelClassResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateChannelClassResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the class of the channel.
    */
  def updateChannelClass(params: UpdateChannelClassRequest): awsDashSdkLib.libRequestMod.Request[UpdateChannelClassResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateChannelClass(
    params: UpdateChannelClassRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateChannelClassResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateChannelClassResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an input.
    */
  def updateInput(): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an input.
    */
  def updateInput(params: UpdateInputRequest): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInput(
    params: UpdateInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an Input Security Group's Whilelists.
    */
  def updateInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[UpdateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInputSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an Input Security Group's Whilelists.
    */
  def updateInputSecurityGroup(params: UpdateInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInputSecurityGroup(
    params: UpdateInputSecurityGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update reservation.
    */
  def updateReservation(): awsDashSdkLib.libRequestMod.Request[UpdateReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateReservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update reservation.
    */
  def updateReservation(params: UpdateReservationRequest): awsDashSdkLib.libRequestMod.Request[UpdateReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateReservation(
    params: UpdateReservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

