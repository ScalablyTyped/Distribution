package typings.angularCompiler.anon

import typings.angularCompiler.aotCompilerMod.AotCompiler
import typings.angularCompiler.staticReflectorMod.StaticReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compiler extends StObject {
  
  var compiler: AotCompiler
  
  var reflector: StaticReflector
}
object Compiler {
  
  inline def apply(compiler: AotCompiler, reflector: StaticReflector): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], reflector = reflector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
  
  extension [Self <: Compiler](x: Self) {
    
    inline def setCompiler(value: AotCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setReflector(value: StaticReflector): Self = StObject.set(x, "reflector", value.asInstanceOf[js.Any])
  }
}
