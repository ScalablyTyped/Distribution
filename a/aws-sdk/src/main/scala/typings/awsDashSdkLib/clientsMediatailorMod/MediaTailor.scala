package typings
package awsDashSdkLib.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTailor
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaTailor: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Deletes the playback configuration for the specified name. 
    */
  def deletePlaybackConfiguration(): awsDashSdkLib.libRequestMod.Request[DeletePlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePlaybackConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the playback configuration for the specified name. 
    */
  def deletePlaybackConfiguration(params: DeletePlaybackConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeletePlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePlaybackConfiguration(
    params: DeletePlaybackConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the playback configuration for the specified name. 
    */
  def getPlaybackConfiguration(): awsDashSdkLib.libRequestMod.Request[GetPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPlaybackConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the playback configuration for the specified name. 
    */
  def getPlaybackConfiguration(params: GetPlaybackConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPlaybackConfiguration(
    params: GetPlaybackConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you can use to retrieve the next pageful. 
    */
  def listPlaybackConfigurations(): awsDashSdkLib.libRequestMod.Request[ListPlaybackConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPlaybackConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPlaybackConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPlaybackConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you can use to retrieve the next pageful. 
    */
  def listPlaybackConfigurations(params: ListPlaybackConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListPlaybackConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPlaybackConfigurations(
    params: ListPlaybackConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPlaybackConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPlaybackConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified playback configuration resource. 
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
    * Returns a list of the tags assigned to the specified playback configuration resource. 
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
    * Adds a new playback configuration to AWS Elemental MediaTailor. 
    */
  def putPlaybackConfiguration(): awsDashSdkLib.libRequestMod.Request[PutPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putPlaybackConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutPlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new playback configuration to AWS Elemental MediaTailor. 
    */
  def putPlaybackConfiguration(params: PutPlaybackConfigurationRequest): awsDashSdkLib.libRequestMod.Request[PutPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putPlaybackConfiguration(
    params: PutPlaybackConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutPlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds tags to the specified playback configuration resource. You can specify one or more tags to add. 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds tags to the specified playback configuration resource. You can specify one or more tags to add. 
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes tags from the specified playback configuration resource. You can specify one or more tags to remove. 
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes tags from the specified playback configuration resource. You can specify one or more tags to remove. 
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

