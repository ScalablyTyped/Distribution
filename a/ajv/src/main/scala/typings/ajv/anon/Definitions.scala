package typings.ajv.anon

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definitions[D /* <: Record[String, Any] */] extends StObject {
  
  var definitions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof D ]: ajv.ajv/dist/types/jtd-schema.JTDSchemaType<D[K], D>}
    */ typings.ajv.ajvStrings.Definitions & TopLevel[D]
  ] = js.undefined
  
  var metadata: js.UndefOr[Record[String, Any]] = js.undefined
}
object Definitions {
  
  inline def apply[D /* <: Record[String, Any] */](): Definitions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definitions[D]]
  }
  
  extension [Self <: Definitions[?], D /* <: Record[String, Any] */](x: Self & Definitions[D]) {
    
    inline def setDefinitions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof D ]: ajv.ajv/dist/types/jtd-schema.JTDSchemaType<D[K], D>}
      */ typings.ajv.ajvStrings.Definitions & TopLevel[D]
    ): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
