package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index[T /* <: js.Object */] extends StObject {
  
  var code: Double
  
  var deduplicate: Boolean
  
  var expireAfter: js.UndefOr[Double] = js.undefined
  
  var fields: js.Array[/* keyof T */ String]
  
  var id: String
  
  var isNewlyCreated: Boolean
  
  var name: String
  
  var selectivityEstimate: Double
  
  var sparse: Boolean
  
  var `type`: IndexType
  
  var unique: Boolean
}
object Index {
  
  inline def apply[T /* <: js.Object */](
    code: Double,
    deduplicate: Boolean,
    fields: js.Array[/* keyof T */ String],
    id: String,
    isNewlyCreated: Boolean,
    name: String,
    selectivityEstimate: Double,
    sparse: Boolean,
    `type`: IndexType,
    unique: Boolean
  ): Index[T] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], deduplicate = deduplicate.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isNewlyCreated = isNewlyCreated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectivityEstimate = selectivityEstimate.asInstanceOf[js.Any], sparse = sparse.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index[?], T /* <: js.Object */] (val x: Self & Index[T]) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDeduplicate(value: Boolean): Self = StObject.set(x, "deduplicate", value.asInstanceOf[js.Any])
    
    inline def setExpireAfter(value: Double): Self = StObject.set(x, "expireAfter", value.asInstanceOf[js.Any])
    
    inline def setExpireAfterUndefined: Self = StObject.set(x, "expireAfter", js.undefined)
    
    inline def setFields(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsNewlyCreated(value: Boolean): Self = StObject.set(x, "isNewlyCreated", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelectivityEstimate(value: Double): Self = StObject.set(x, "selectivityEstimate", value.asInstanceOf[js.Any])
    
    inline def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
    
    inline def setType(value: IndexType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
