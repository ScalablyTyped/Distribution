package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaLive
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaLive: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ClientConfiguration = js.native
  /**
    * Update a channel schedule
    */
  def batchUpdateSchedule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.BatchUpdateScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchUpdateSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.BatchUpdateScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.BatchUpdateScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update a channel schedule
    */
  def batchUpdateSchedule(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.BatchUpdateScheduleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.BatchUpdateScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchUpdateSchedule(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.BatchUpdateScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.BatchUpdateScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.BatchUpdateScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new channel
    */
  def createChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new channel
    */
  def createChannel(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createChannel(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create an input
    */
  def createInput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create an input
    */
  def createInput(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInput(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Input Security Group
    */
  def createInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInputSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Input Security Group
    */
  def createInputSecurityGroup(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInputSecurityGroup(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputSecurityGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def createTags(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTags(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.CreateTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts deletion of channel. The associated outputs are also deleted.
    */
  def deleteChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts deletion of channel. The associated outputs are also deleted.
    */
  def deleteChannel(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteChannel(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the input end point
    */
  def deleteInput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the input end point
    */
  def deleteInput(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInput(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an Input Security Group
    */
  def deleteInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInputSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an Input Security Group
    */
  def deleteInputSecurityGroup(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInputSecurityGroup(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputSecurityGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Delete an expired reservation.
    */
  def deleteReservation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Delete an expired reservation.
    */
  def deleteReservation(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteReservationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReservation(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteReservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteTags(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DeleteTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets details about a channel
    */
  def describeChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets details about a channel
    */
  def describeChannel(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeChannel(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces details about an input
    */
  def describeInput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces details about an input
    */
  def describeInput(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInput(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces a summary of an Input Security Group
    */
  def describeInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInputSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces a summary of an Input Security Group
    */
  def describeInputSecurityGroup(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInputSecurityGroup(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputSecurityGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Get details for an offering.
    */
  def describeOffering(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Get details for an offering.
    */
  def describeOffering(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeOfferingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOffering(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Get details for a reservation.
    */
  def describeReservation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Get details for a reservation.
    */
  def describeReservation(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeReservationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservation(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeReservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Get a channel schedule
    */
  def describeSchedule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Get a channel schedule
    */
  def describeSchedule(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeScheduleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSchedule(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.DescribeScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces list of channels that have been created
    */
  def listChannels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listChannels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces list of channels that have been created
    */
  def listChannels(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListChannelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listChannels(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListChannelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces a list of Input Security Groups for an account
    */
  def listInputSecurityGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputSecurityGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInputSecurityGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputSecurityGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputSecurityGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces a list of Input Security Groups for an account
    */
  def listInputSecurityGroups(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputSecurityGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputSecurityGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInputSecurityGroups(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputSecurityGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputSecurityGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputSecurityGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces list of inputs that have been created
    */
  def listInputs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInputs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces list of inputs that have been created
    */
  def listInputs(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInputs(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListInputsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List offerings available for purchase.
    */
  def listOfferings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListOfferingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List offerings available for purchase.
    */
  def listOfferings(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListOfferingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listOfferings(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListOfferingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListOfferingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List purchased reservations.
    */
  def listReservations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListReservationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listReservations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListReservationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListReservationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List purchased reservations.
    */
  def listReservations(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListReservationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListReservationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listReservations(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListReservationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListReservationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListReservationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces list of tags that have been created for a resource
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Produces list of tags that have been created for a resource
    */
  def listTagsForResource(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Purchase an offering and create a reservation.
    */
  def purchaseOffering(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.PurchaseOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.PurchaseOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.PurchaseOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Purchase an offering and create a reservation.
    */
  def purchaseOffering(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.PurchaseOfferingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.PurchaseOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseOffering(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.PurchaseOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.PurchaseOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.PurchaseOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an existing channel
    */
  def startChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StartChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StartChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StartChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an existing channel
    */
  def startChannel(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StartChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StartChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startChannel(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StartChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StartChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StartChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a running channel
    */
  def stopChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StopChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StopChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StopChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a running channel
    */
  def stopChannel(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StopChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StopChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopChannel(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StopChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StopChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.StopChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a channel.
    */
  def updateChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a channel.
    */
  def updateChannel(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateChannel(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an input.
    */
  def updateInput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an input.
    */
  def updateInput(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateInput(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update an Input Security Group's Whilelists.
    */
  def updateInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateInputSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update an Input Security Group's Whilelists.
    */
  def updateInputSecurityGroup(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateInputSecurityGroup(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputSecurityGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputSecurityGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateInputSecurityGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update reservation.
    */
  def updateReservation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateReservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update reservation.
    */
  def updateReservation(params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateReservationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateReservation(
    params: awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateReservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateReservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMedialiveMod.MediaLiveNs.UpdateReservationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

