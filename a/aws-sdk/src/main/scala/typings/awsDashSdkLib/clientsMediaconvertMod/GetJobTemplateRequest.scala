package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobTemplateRequest extends js.Object {
  /**
    * The name of the job template.
    */
  var Name: __string
}

object GetJobTemplateRequest {
  @scala.inline
  def apply(Name: __string): GetJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[GetJobTemplateRequest]
  }
}

