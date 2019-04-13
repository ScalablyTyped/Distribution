package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteParameterRequest extends js.Object {
  /**
    * The name of the parameter to delete.
    */
  var Name: PSParameterName
}

object DeleteParameterRequest {
  @scala.inline
  def apply(Name: PSParameterName): DeleteParameterRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteParameterRequest]
  }
}

