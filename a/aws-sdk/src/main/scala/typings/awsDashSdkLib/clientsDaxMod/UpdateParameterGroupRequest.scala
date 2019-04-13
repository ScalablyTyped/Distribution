package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateParameterGroupRequest extends js.Object {
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: String
  /**
    * An array of name-value pairs for the parameters in the group. Each element in the array represents a single parameter.
    */
  var ParameterNameValues: ParameterNameValueList
}

object UpdateParameterGroupRequest {
  @scala.inline
  def apply(ParameterGroupName: String, ParameterNameValues: ParameterNameValueList): UpdateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName, ParameterNameValues = ParameterNameValues)
  
    __obj.asInstanceOf[UpdateParameterGroupRequest]
  }
}

