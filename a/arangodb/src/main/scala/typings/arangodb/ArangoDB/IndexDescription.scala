package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexDescription[T] extends StObject {
  
  var deduplicate: js.UndefOr[Boolean] = js.undefined
  
  var expireAfter: js.UndefOr[Double] = js.undefined
  
  var fields: js.Array[/* keyof T */ String]
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var sparse: js.UndefOr[Boolean] = js.undefined
  
  var `type`: IndexType
  
  var unique: js.UndefOr[Boolean] = js.undefined
}
object IndexDescription {
  
  inline def apply[T](fields: js.Array[/* keyof T */ String], `type`: IndexType): IndexDescription[T] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDescription[T]]
  }
  
  extension [Self <: IndexDescription[?], T](x: Self & IndexDescription[T]) {
    
    inline def setDeduplicate(value: Boolean): Self = StObject.set(x, "deduplicate", value.asInstanceOf[js.Any])
    
    inline def setDeduplicateUndefined: Self = StObject.set(x, "deduplicate", js.undefined)
    
    inline def setExpireAfter(value: Double): Self = StObject.set(x, "expireAfter", value.asInstanceOf[js.Any])
    
    inline def setExpireAfterUndefined: Self = StObject.set(x, "expireAfter", js.undefined)
    
    inline def setFields(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
    
    inline def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
    
    inline def setType(value: IndexType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
