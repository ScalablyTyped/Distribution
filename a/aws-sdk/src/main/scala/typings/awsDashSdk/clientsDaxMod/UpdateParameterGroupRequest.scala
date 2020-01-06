package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateParameterGroupRequest extends js.Object {
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: String = js.native
  /**
    * An array of name-value pairs for the parameters in the group. Each element in the array represents a single parameter.
    */
  var ParameterNameValues: ParameterNameValueList = js.native
}

object UpdateParameterGroupRequest {
  @scala.inline
  def apply(ParameterGroupName: String, ParameterNameValues: ParameterNameValueList): UpdateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any], ParameterNameValues = ParameterNameValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateParameterGroupRequest]
  }
}

