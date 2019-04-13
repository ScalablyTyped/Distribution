package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteJobTemplateRequest extends js.Object {
  /**
    * The name of the job template to be deleted.
    */
  var Name: __string
}

object DeleteJobTemplateRequest {
  @scala.inline
  def apply(Name: __string): DeleteJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteJobTemplateRequest]
  }
}

