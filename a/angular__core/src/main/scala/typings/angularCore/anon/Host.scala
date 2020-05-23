package typings.angularCore.anon

import typings.typescript.mod.CompilerHost
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: CompilerHost
  var parsed: ParsedCommandLine
  var program: Program
}

object Host {
  @scala.inline
  def apply(host: CompilerHost, parsed: ParsedCommandLine, program: Program): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

