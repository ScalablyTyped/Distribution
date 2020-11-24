package typings.angularCore.anon

import typings.typescript.mod.CompilerHost
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Host extends js.Object {
  
  var host: CompilerHost = js.native
  
  var parsed: ParsedCommandLine = js.native
  
  var program: Program = js.native
}
object Host {
  
  @scala.inline
  def apply(host: CompilerHost, parsed: ParsedCommandLine, program: Program): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit class HostOps[Self <: Host] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHost(value: CompilerHost): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsed(value: ParsedCommandLine): Self = this.set("parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: Program): Self = this.set("program", value.asInstanceOf[js.Any])
  }
}
