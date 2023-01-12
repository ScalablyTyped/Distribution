package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typings.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host extends StObject {
  
  var host: CompilerHost
  
  var oldProgram: js.UndefOr[typings.angularCompilerCli.srcTransformersApiMod.Program] = js.undefined
  
  var options: CompilerOptions
  
  var rootNames: js.Array[String]
}
object Host {
  
  inline def apply(host: CompilerHost, options: CompilerOptions, rootNames: js.Array[String]): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
    
    inline def setHost(value: CompilerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setOldProgram(value: typings.angularCompilerCli.srcTransformersApiMod.Program): Self = StObject.set(x, "oldProgram", value.asInstanceOf[js.Any])
    
    inline def setOldProgramUndefined: Self = StObject.set(x, "oldProgram", js.undefined)
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRootNames(value: js.Array[String]): Self = StObject.set(x, "rootNames", value.asInstanceOf[js.Any])
    
    inline def setRootNamesVarargs(value: String*): Self = StObject.set(x, "rootNames", js.Array(value*))
  }
}
