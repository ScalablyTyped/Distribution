package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPackage
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaPackage: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new Channel.
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
    * Creates a new Channel.
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
    * Creates a new OriginEndpoint record.
    */
  def createOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[CreateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOriginEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new OriginEndpoint record.
    */
  def createOriginEndpoint(params: CreateOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[CreateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOriginEndpoint(
    params: CreateOriginEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing Channel.
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
    * Deletes an existing Channel.
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
    * Deletes an existing OriginEndpoint.
    */
  def deleteOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[DeleteOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteOriginEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing OriginEndpoint.
    */
  def deleteOriginEndpoint(params: DeleteOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[DeleteOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteOriginEndpoint(
    params: DeleteOriginEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets details about a Channel.
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
    * Gets details about a Channel.
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
    * Gets details about an existing OriginEndpoint.
    */
  def describeOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[DescribeOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOriginEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets details about an existing OriginEndpoint.
    */
  def describeOriginEndpoint(params: DescribeOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[DescribeOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOriginEndpoint(
    params: DescribeOriginEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a collection of Channels.
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
    * Returns a collection of Channels.
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
    * Returns a collection of OriginEndpoint records.
    */
  def listOriginEndpoints(): awsDashSdkLib.libRequestMod.Request[ListOriginEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOriginEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOriginEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOriginEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a collection of OriginEndpoint records.
    */
  def listOriginEndpoints(params: ListOriginEndpointsRequest): awsDashSdkLib.libRequestMod.Request[ListOriginEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOriginEndpoints(
    params: ListOriginEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOriginEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOriginEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
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
    * 
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
    * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use RotateIngestEndpointCredentials instead
    */
  def rotateChannelCredentials(): awsDashSdkLib.libRequestMod.Request[RotateChannelCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rotateChannelCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RotateChannelCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RotateChannelCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use RotateIngestEndpointCredentials instead
    */
  def rotateChannelCredentials(params: RotateChannelCredentialsRequest): awsDashSdkLib.libRequestMod.Request[RotateChannelCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rotateChannelCredentials(
    params: RotateChannelCredentialsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RotateChannelCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RotateChannelCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
    */
  def rotateIngestEndpointCredentials(): awsDashSdkLib.libRequestMod.Request[RotateIngestEndpointCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rotateIngestEndpointCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RotateIngestEndpointCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RotateIngestEndpointCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
    */
  def rotateIngestEndpointCredentials(params: RotateIngestEndpointCredentialsRequest): awsDashSdkLib.libRequestMod.Request[RotateIngestEndpointCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rotateIngestEndpointCredentials(
    params: RotateIngestEndpointCredentialsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RotateIngestEndpointCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RotateIngestEndpointCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing Channel.
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
    * Updates an existing Channel.
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
    * Updates an existing OriginEndpoint.
    */
  def updateOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[UpdateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateOriginEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing OriginEndpoint.
    */
  def updateOriginEndpoint(params: UpdateOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[UpdateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateOriginEndpoint(
    params: UpdateOriginEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

