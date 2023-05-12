package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsvStoreOptions extends StObject {
  
  /**
    * The store's annotation type.
    */
  var annotationType: js.UndefOr[AnnotationType] = js.undefined
  
  /**
    * The store's header key to column name mapping.
    */
  var formatToHeader: js.UndefOr[FormatToHeader] = js.undefined
  
  /**
    * The store's schema.
    */
  var schema: js.UndefOr[TsvStoreOptionsSchemaList] = js.undefined
}
object TsvStoreOptions {
  
  inline def apply(): TsvStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TsvStoreOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsvStoreOptions] (val x: Self) extends AnyVal {
    
    inline def setAnnotationType(value: AnnotationType): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    inline def setFormatToHeader(value: FormatToHeader): Self = StObject.set(x, "formatToHeader", value.asInstanceOf[js.Any])
    
    inline def setFormatToHeaderUndefined: Self = StObject.set(x, "formatToHeader", js.undefined)
    
    inline def setSchema(value: TsvStoreOptionsSchemaList): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSchemaVarargs(value: SchemaItem*): Self = StObject.set(x, "schema", js.Array(value*))
  }
}
