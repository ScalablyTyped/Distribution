package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index[T /* <: js.Object */] extends StObject {
  
  var code: Double = js.native
  
  var deduplicate: Boolean = js.native
  
  var expireAfter: js.UndefOr[Double] = js.native
  
  var fields: js.Array[/* keyof T */ String] = js.native
  
  var id: String = js.native
  
  var isNewlyCreated: Boolean = js.native
  
  var name: String = js.native
  
  var selectivityEstimate: Double = js.native
  
  var sparse: Boolean = js.native
  
  var `type`: IndexType = js.native
  
  var unique: Boolean = js.native
}
object Index {
  
  @scala.inline
  def apply[T /* <: js.Object */](
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
  implicit class IndexMutableBuilder[Self <: Index[_], T /* <: js.Object */] (val x: Self with Index[T]) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeduplicate(value: Boolean): Self = StObject.set(x, "deduplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireAfter(value: Double): Self = StObject.set(x, "expireAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireAfterUndefined: Self = StObject.set(x, "expireAfter", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewlyCreated(value: Boolean): Self = StObject.set(x, "isNewlyCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectivityEstimate(value: Double): Self = StObject.set(x, "selectivityEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IndexType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
