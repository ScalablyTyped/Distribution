package typings.argparse.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("argparse", "ArgumentError")
@js.native
class ArgumentError protected () extends Error {
  def this(argument: Action, message: String) = this()
  
  def str(): String = js.native
}
