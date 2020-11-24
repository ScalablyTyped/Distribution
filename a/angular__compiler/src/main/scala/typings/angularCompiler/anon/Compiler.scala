package typings.angularCompiler.anon

import typings.angularCompiler.aotCompilerMod.AotCompiler
import typings.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compiler extends js.Object {
  
  var compiler: AotCompiler = js.native
  
  var reflector: StaticReflector = js.native
}
object Compiler {
  
  @scala.inline
  def apply(compiler: AotCompiler, reflector: StaticReflector): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], reflector = reflector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
  
  @scala.inline
  implicit class CompilerOps[Self <: Compiler] (val x: Self) extends AnyVal {
    
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
    def setCompiler(value: AotCompiler): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflector(value: StaticReflector): Self = this.set("reflector", value.asInstanceOf[js.Any])
  }
}
