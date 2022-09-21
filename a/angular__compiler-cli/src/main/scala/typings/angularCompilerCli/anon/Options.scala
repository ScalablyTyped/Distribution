package typings.angularCompilerCli.anon

import typings.angularCompilerCli.transformersApiMod.CompilerOptions
import typings.typescript.mod.CompilerHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: CompilerOptions
  
  var tsHost: js.UndefOr[CompilerHost] = js.undefined
}
object Options {
  
  inline def apply(options: CompilerOptions): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTsHost(value: CompilerHost): Self = StObject.set(x, "tsHost", value.asInstanceOf[js.Any])
    
    inline def setTsHostUndefined: Self = StObject.set(x, "tsHost", js.undefined)
  }
}
