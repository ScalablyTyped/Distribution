package typings.ajv.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SchemaObject
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  @JSName("$id")
  var $id: js.UndefOr[String] = js.undefined
  
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object _SchemaObject {
  
  inline def apply(): _SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_SchemaObject]
  }
  
  extension [Self <: _SchemaObject](x: Self) {
    
    inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
    
    inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
    
    inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
