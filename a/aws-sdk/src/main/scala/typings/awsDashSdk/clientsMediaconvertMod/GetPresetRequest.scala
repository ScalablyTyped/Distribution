package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPresetRequest extends js.Object {
  /**
    * The name of the preset.
    */
  var Name: __string
}

object GetPresetRequest {
  @scala.inline
  def apply(Name: __string): GetPresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[GetPresetRequest]
  }
}

