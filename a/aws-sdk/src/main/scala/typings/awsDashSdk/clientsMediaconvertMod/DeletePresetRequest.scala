package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePresetRequest extends js.Object {
  /**
    * The name of the preset to be deleted.
    */
  var Name: __string
}

object DeletePresetRequest {
  @scala.inline
  def apply(Name: __string): DeletePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeletePresetRequest]
  }
}

