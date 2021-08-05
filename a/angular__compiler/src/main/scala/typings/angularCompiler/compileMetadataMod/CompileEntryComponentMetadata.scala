package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileEntryComponentMetadata extends StObject {
  
  var componentFactory: StaticSymbol | js.Object
  
  var componentType: js.Any
}
object CompileEntryComponentMetadata {
  
  inline def apply(componentFactory: StaticSymbol | js.Object, componentType: js.Any): CompileEntryComponentMetadata = {
    val __obj = js.Dynamic.literal(componentFactory = componentFactory.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileEntryComponentMetadata]
  }
  
  extension [Self <: CompileEntryComponentMetadata](x: Self) {
    
    inline def setComponentFactory(value: StaticSymbol | js.Object): Self = StObject.set(x, "componentFactory", value.asInstanceOf[js.Any])
    
    inline def setComponentType(value: js.Any): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
  }
}
