package typings
package awsDashSdkLib.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTailor
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaTailor: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.ClientConfiguration = js.native
  /**
    * Deletes the configuration for the specified name. 
    */
  def deletePlaybackConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.DeletePlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePlaybackConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.DeletePlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.DeletePlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the configuration for the specified name. 
    */
  def deletePlaybackConfiguration(params: awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.DeletePlaybackConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.DeletePlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePlaybackConfiguration(
    params: awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.DeletePlaybackConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.DeletePlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.DeletePlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the configuration for the specified name. 
    */
  def getPlaybackConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.GetPlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPlaybackConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.GetPlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.GetPlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the configuration for the specified name. 
    */
  def getPlaybackConfiguration(params: awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.GetPlaybackConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.GetPlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPlaybackConfiguration(
    params: awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.GetPlaybackConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.GetPlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.GetPlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the configurations defined in AWS Elemental MediaTailor. You can specify a max number of configurations to return at a time. The default max is 50. Results are returned in pagefuls. If AWS Elemental MediaTailor has more configurations than the specified max, it provides parameters in the response that you can use to retrieve the next pageful. 
    */
  def listPlaybackConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.ListPlaybackConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPlaybackConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.ListPlaybackConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.ListPlaybackConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the configurations defined in AWS Elemental MediaTailor. You can specify a max number of configurations to return at a time. The default max is 50. Results are returned in pagefuls. If AWS Elemental MediaTailor has more configurations than the specified max, it provides parameters in the response that you can use to retrieve the next pageful. 
    */
  def listPlaybackConfigurations(params: awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.ListPlaybackConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.ListPlaybackConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPlaybackConfigurations(
    params: awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.ListPlaybackConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.ListPlaybackConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.ListPlaybackConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a new configuration to AWS Elemental MediaTailor.
    */
  def putPlaybackConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.PutPlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putPlaybackConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.PutPlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.PutPlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a new configuration to AWS Elemental MediaTailor.
    */
  def putPlaybackConfiguration(params: awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.PutPlaybackConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.PutPlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putPlaybackConfiguration(
    params: awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.PutPlaybackConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.PutPlaybackConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediatailorMod.MediaTailorNs.PutPlaybackConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

