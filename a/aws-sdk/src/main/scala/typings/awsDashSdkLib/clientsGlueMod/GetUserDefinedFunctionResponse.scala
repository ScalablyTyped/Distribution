package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserDefinedFunctionResponse extends js.Object {
  /**
    * The requested function definition.
    */
  var UserDefinedFunction: js.UndefOr[UserDefinedFunction] = js.undefined
}

object GetUserDefinedFunctionResponse {
  @scala.inline
  def apply(UserDefinedFunction: UserDefinedFunction = null): GetUserDefinedFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (UserDefinedFunction != null) __obj.updateDynamic("UserDefinedFunction")(UserDefinedFunction)
    __obj.asInstanceOf[GetUserDefinedFunctionResponse]
  }
}

