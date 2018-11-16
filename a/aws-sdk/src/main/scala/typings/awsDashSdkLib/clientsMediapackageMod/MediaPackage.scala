package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPackage
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaPackage: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ClientConfiguration = js.native
  /**
     * Creates a new Channel.
     */
  def createChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Channel.
     */
  def createChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Channel.
     */
  def createChannel(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Channel.
     */
  def createChannel(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new OriginEndpoint record.
     */
  def createOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new OriginEndpoint record.
     */
  def createOriginEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new OriginEndpoint record.
     */
  def createOriginEndpoint(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new OriginEndpoint record.
     */
  def createOriginEndpoint(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateOriginEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.CreateOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing Channel.
     */
  def deleteChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing Channel.
     */
  def deleteChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing Channel.
     */
  def deleteChannel(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing Channel.
     */
  def deleteChannel(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing OriginEndpoint.
     */
  def deleteOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing OriginEndpoint.
     */
  def deleteOriginEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing OriginEndpoint.
     */
  def deleteOriginEndpoint(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing OriginEndpoint.
     */
  def deleteOriginEndpoint(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteOriginEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DeleteOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a Channel.
     */
  def describeChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a Channel.
     */
  def describeChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a Channel.
     */
  def describeChannel(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a Channel.
     */
  def describeChannel(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about an existing OriginEndpoint.
     */
  def describeOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about an existing OriginEndpoint.
     */
  def describeOriginEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about an existing OriginEndpoint.
     */
  def describeOriginEndpoint(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about an existing OriginEndpoint.
     */
  def describeOriginEndpoint(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeOriginEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.DescribeOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a collection of Channels.
     */
  def listChannels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a collection of Channels.
     */
  def listChannels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a collection of Channels.
     */
  def listChannels(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListChannelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a collection of Channels.
     */
  def listChannels(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListChannelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a collection of OriginEndpoint records.
     */
  def listOriginEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListOriginEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a collection of OriginEndpoint records.
     */
  def listOriginEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListOriginEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListOriginEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a collection of OriginEndpoint records.
     */
  def listOriginEndpoints(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListOriginEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListOriginEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a collection of OriginEndpoint records.
     */
  def listOriginEndpoints(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListOriginEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListOriginEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.ListOriginEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use RotateIngestEndpointCredentials instead
     */
  def rotateChannelCredentials(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateChannelCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use RotateIngestEndpointCredentials instead
     */
  def rotateChannelCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateChannelCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateChannelCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use RotateIngestEndpointCredentials instead
     */
  def rotateChannelCredentials(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateChannelCredentialsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateChannelCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use RotateIngestEndpointCredentials instead
     */
  def rotateChannelCredentials(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateChannelCredentialsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateChannelCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateChannelCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
     */
  def rotateIngestEndpointCredentials(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateIngestEndpointCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
     */
  def rotateIngestEndpointCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateIngestEndpointCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateIngestEndpointCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
     */
  def rotateIngestEndpointCredentials(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateIngestEndpointCredentialsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateIngestEndpointCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
     */
  def rotateIngestEndpointCredentials(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateIngestEndpointCredentialsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateIngestEndpointCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.RotateIngestEndpointCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing Channel.
     */
  def updateChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing Channel.
     */
  def updateChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing Channel.
     */
  def updateChannel(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing Channel.
     */
  def updateChannel(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing OriginEndpoint.
     */
  def updateOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing OriginEndpoint.
     */
  def updateOriginEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing OriginEndpoint.
     */
  def updateOriginEndpoint(params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing OriginEndpoint.
     */
  def updateOriginEndpoint(
    params: awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateOriginEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateOriginEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediapackageMod.MediaPackageNs.UpdateOriginEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

