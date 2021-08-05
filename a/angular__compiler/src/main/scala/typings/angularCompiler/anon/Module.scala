package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  var module: CompileIdentifierMetadata
  
  var provider: CompileProviderMetadata
}
object Module {
  
  inline def apply(module: CompileIdentifierMetadata, provider: CompileProviderMetadata): Module = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  extension [Self <: Module](x: Self) {
    
    inline def setModule(value: CompileIdentifierMetadata): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: CompileProviderMetadata): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
