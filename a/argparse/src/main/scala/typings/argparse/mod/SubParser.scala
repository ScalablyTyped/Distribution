package typings.argparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("argparse", "SubParser")
@js.native
class SubParser () extends js.Object {
  
  def add_parser(name: String): ArgumentParser = js.native
  def add_parser(name: String, options: SubArgumentParserOptions): ArgumentParser = js.native
}
