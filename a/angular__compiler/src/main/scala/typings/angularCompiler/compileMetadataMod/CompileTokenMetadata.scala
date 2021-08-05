package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileTokenMetadata extends StObject {
  
  var identifier: js.UndefOr[CompileIdentifierMetadata | CompileTypeMetadata] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object CompileTokenMetadata {
  
  inline def apply(): CompileTokenMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileTokenMetadata]
  }
  
  extension [Self <: CompileTokenMetadata](x: Self) {
    
    inline def setIdentifier(value: CompileIdentifierMetadata | CompileTypeMetadata): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
