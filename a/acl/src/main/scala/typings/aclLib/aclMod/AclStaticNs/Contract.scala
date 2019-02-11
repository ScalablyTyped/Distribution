package typings
package aclLib.aclMod.AclStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contract extends js.Object {
  var args: js.Array[_] = js.native
  var checkedParams: js.Array[java.lang.String] = js.native
  var debug: scala.Boolean = js.native
  var fulfilled: scala.Boolean = js.native
  def apply(args: stdLib.IArguments): Contract | NoOp = js.native
  def end(): scala.Unit = js.native
  def params(types: java.lang.String*): Contract | NoOp = js.native
}

