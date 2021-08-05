package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileQueryMetadata extends StObject {
  
  var descendants: Boolean
  
  var first: Boolean
  
  var propertyName: String
  
  var read: CompileTokenMetadata
  
  var selectors: js.Array[CompileTokenMetadata]
  
  var static: js.UndefOr[Boolean] = js.undefined
}
object CompileQueryMetadata {
  
  inline def apply(
    descendants: Boolean,
    first: Boolean,
    propertyName: String,
    read: CompileTokenMetadata,
    selectors: js.Array[CompileTokenMetadata]
  ): CompileQueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileQueryMetadata]
  }
  
  extension [Self <: CompileQueryMetadata](x: Self) {
    
    inline def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setRead(value: CompileTokenMetadata): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setSelectors(value: js.Array[CompileTokenMetadata]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsVarargs(value: CompileTokenMetadata*): Self = StObject.set(x, "selectors", js.Array(value :_*))
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
