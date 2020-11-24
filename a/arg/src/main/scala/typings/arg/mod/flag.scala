package typings.arg.mod

import typings.arg.anon.FlagSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("arg", "flag")
@js.native
object flag extends js.Object {
  
  def apply[T](fn: T): T with FlagSymbol = js.native
}
