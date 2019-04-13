package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeGenNodeArg extends js.Object {
  /**
    * The name of the argument or property.
    */
  var Name: CodeGenArgName
  /**
    * True if the value is used as a parameter.
    */
  var Param: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of the argument or property.
    */
  var Value: CodeGenArgValue
}

object CodeGenNodeArg {
  @scala.inline
  def apply(Name: CodeGenArgName, Value: CodeGenArgValue, Param: js.UndefOr[Boolean] = js.undefined): CodeGenNodeArg = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
    if (!js.isUndefined(Param)) __obj.updateDynamic("Param")(Param)
    __obj.asInstanceOf[CodeGenNodeArg]
  }
}

