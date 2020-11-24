package typings.argparse.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("argparse", "ArgumentParser")
@js.native
class ArgumentParser () extends ArgumentGroup {
  def this(options: ArgumentParserOptions) = this()
  
  def add_subparsers(): SubParser = js.native
  def add_subparsers(options: SubparserOptions): SubParser = js.native
  
  def convert_arg_line_to_args(argLine: String): js.Array[String] = js.native
  
  def error(err: String): Unit = js.native
  def error(err: Error): Unit = js.native
  
  def exit(status: Double, message: String): Unit = js.native
  
  def format_help(): String = js.native
  
  def format_usage(): String = js.native
  
  def parse_args(): js.Any = js.native
  def parse_args(args: js.UndefOr[scala.Nothing], ns: js.Object): js.Any = js.native
  def parse_args(args: js.UndefOr[scala.Nothing], ns: Namespace): js.Any = js.native
  def parse_args(args: js.Array[String]): js.Any = js.native
  def parse_args(args: js.Array[String], ns: js.Object): js.Any = js.native
  def parse_args(args: js.Array[String], ns: Namespace): js.Any = js.native
  
  def parse_known_args(): js.Array[_] = js.native
  def parse_known_args(args: js.UndefOr[scala.Nothing], ns: js.Object): js.Array[_] = js.native
  def parse_known_args(args: js.UndefOr[scala.Nothing], ns: Namespace): js.Array[_] = js.native
  def parse_known_args(args: js.Array[String]): js.Array[_] = js.native
  def parse_known_args(args: js.Array[String], ns: js.Object): js.Array[_] = js.native
  def parse_known_args(args: js.Array[String], ns: Namespace): js.Array[_] = js.native
  
  def print_help(): Unit = js.native
  
  def print_usage(): Unit = js.native
}
