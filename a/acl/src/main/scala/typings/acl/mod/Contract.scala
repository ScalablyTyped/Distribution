package typings.acl.mod

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contract extends js.Object {
  
  def apply(args: IArguments): Contract | NoOp = js.native
  
  var args: js.Array[_] = js.native
  
  var checkedParams: js.Array[String] = js.native
  
  var debug: Boolean = js.native
  
  def end(): Unit = js.native
  
  var fulfilled: Boolean = js.native
  
  def params(types: String*): Contract | NoOp = js.native
}
