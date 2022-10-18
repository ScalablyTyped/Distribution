package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscImportsSrcReexportMod {
  
  trait Reexport extends StObject {
    
    var asAlias: String
    
    var fromModule: String
    
    var symbolName: String
  }
  object Reexport {
    
    inline def apply(asAlias: String, fromModule: String, symbolName: String): Reexport = {
      val __obj = js.Dynamic.literal(asAlias = asAlias.asInstanceOf[js.Any], fromModule = fromModule.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reexport]
    }
    
    extension [Self <: Reexport](x: Self) {
      
      inline def setAsAlias(value: String): Self = StObject.set(x, "asAlias", value.asInstanceOf[js.Any])
      
      inline def setFromModule(value: String): Self = StObject.set(x, "fromModule", value.asInstanceOf[js.Any])
      
      inline def setSymbolName(value: String): Self = StObject.set(x, "symbolName", value.asInstanceOf[js.Any])
    }
  }
}
