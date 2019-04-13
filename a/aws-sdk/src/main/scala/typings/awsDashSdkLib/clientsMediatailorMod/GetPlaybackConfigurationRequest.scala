package typings
package awsDashSdkLib.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPlaybackConfigurationRequest extends js.Object {
  /**
    * The identifier for the playback configuration.
    */
  var Name: __string
}

object GetPlaybackConfigurationRequest {
  @scala.inline
  def apply(Name: __string): GetPlaybackConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[GetPlaybackConfigurationRequest]
  }
}

