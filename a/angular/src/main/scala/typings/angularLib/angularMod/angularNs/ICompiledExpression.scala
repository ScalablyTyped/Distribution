package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompiledExpression extends js.Object {
  var constant: scala.Boolean = js.native
  var literal: scala.Boolean = js.native
  def apply(context: js.Any): js.Any = js.native
  def apply(context: js.Any, locals: js.Any): js.Any = js.native
  // If value is not provided, undefined is gonna be used since the implementation
  // does not check the parameter. Let's force a value for consistency. If consumer
  // whants to undefine it, pass the undefined value explicitly.
  def assign(context: js.Any, value: js.Any): js.Any = js.native
}

