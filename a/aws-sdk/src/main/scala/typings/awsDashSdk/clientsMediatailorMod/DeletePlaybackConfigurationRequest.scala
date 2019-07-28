package typings.awsDashSdk.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePlaybackConfigurationRequest extends js.Object {
  /**
    * The identifier for the playback configuration.
    */
  var Name: __string
}

object DeletePlaybackConfigurationRequest {
  @scala.inline
  def apply(Name: __string): DeletePlaybackConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeletePlaybackConfigurationRequest]
  }
}

