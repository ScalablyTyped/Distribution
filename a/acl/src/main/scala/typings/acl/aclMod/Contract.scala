package typings.acl.aclMod

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contract extends js.Object {
  var args: js.Array[_] = js.native
  var checkedParams: js.Array[String] = js.native
  var debug: Boolean = js.native
  var fulfilled: Boolean = js.native
  def apply(args: IArguments): Contract | NoOp = js.native
  def end(): Unit = js.native
  def params(types: String*): Contract | NoOp = js.native
}

