package typings.argparse.mod

import typings.argparse.anon.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("argparse", "ArgumentGroup")
@js.native
class ArgumentGroup () extends js.Object {
  
  def add_argument(arg1: String, arg2: String): Unit = js.native
  def add_argument(arg1: String, arg2: String, options: ArgumentOptions): Unit = js.native
  def add_argument(arg: String): Unit = js.native
  def add_argument(arg: String, options: ArgumentOptions): Unit = js.native
  
  def add_argument_group(): ArgumentGroup = js.native
  def add_argument_group(options: ArgumentGroupOptions): ArgumentGroup = js.native
  
  def add_mutually_exclusive_group(): ArgumentGroup = js.native
  def add_mutually_exclusive_group(options: Required): ArgumentGroup = js.native
  
  def get_default(dest: String): js.Any = js.native
  
  def set_defaults(): Unit = js.native
  def set_defaults(options: js.Object): Unit = js.native
}
