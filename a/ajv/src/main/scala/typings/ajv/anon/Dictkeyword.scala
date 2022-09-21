package typings.ajv.anon

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.ajvBooleans.`true`
import typings.ajv.jsonSchemaMod.Known
import typings.ajv.jsonSchemaMod.UncheckedJSONSchemaType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkeyword
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  @JSName("$defs")
  var $defs: js.UndefOr[Record[String, UncheckedJSONSchemaType[Known, `true`]]] = js.undefined
  
  @JSName("$id")
  var $id: js.UndefOr[String] = js.undefined
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  
  var definitions: js.UndefOr[Record[String, UncheckedJSONSchemaType[Known, `true`]]] = js.undefined
}
object Dictkeyword {
  
  inline def apply(): Dictkeyword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkeyword]
  }
  
  extension [Self <: Dictkeyword](x: Self) {
    
    inline def set$defs(value: Record[String, UncheckedJSONSchemaType[Known, `true`]]): Self = StObject.set(x, "$defs", value.asInstanceOf[js.Any])
    
    inline def set$defsUndefined: Self = StObject.set(x, "$defs", js.undefined)
    
    inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
    
    inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    inline def setDefinitions(value: Record[String, UncheckedJSONSchemaType[Known, `true`]]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
  }
}
