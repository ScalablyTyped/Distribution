package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteParameterGroupRequest extends js.Object {
  /**
    * The name of the parameter group to delete.
    */
  var ParameterGroupName: String
}

object DeleteParameterGroupRequest {
  @scala.inline
  def apply(ParameterGroupName: String): DeleteParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName)
  
    __obj.asInstanceOf[DeleteParameterGroupRequest]
  }
}

