package typings.angularCompiler.anon

import typings.angularCompiler.aotCompilerMod.AotCompiler
import typings.angularCompiler.staticReflectorMod.StaticReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compiler extends StObject {
  
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
  implicit class CompilerMutableBuilder[Self <: Compiler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompiler(value: AotCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflector(value: StaticReflector): Self = StObject.set(x, "reflector", value.asInstanceOf[js.Any])
  }
}
