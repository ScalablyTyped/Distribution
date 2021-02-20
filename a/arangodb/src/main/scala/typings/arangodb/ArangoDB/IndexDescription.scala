package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexDescription[T] extends StObject {
  
  var deduplicate: js.UndefOr[Boolean] = js.native
  
  var expireAfter: js.UndefOr[Double] = js.native
  
  var fields: js.Array[/* keyof T */ String] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var sparse: js.UndefOr[Boolean] = js.native
  
  var `type`: IndexType = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
}
object IndexDescription {
  
  @scala.inline
  def apply[T](fields: js.Array[/* keyof T */ String], `type`: IndexType): IndexDescription[T] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDescription[T]]
  }
  
  @scala.inline
  implicit class IndexDescriptionMutableBuilder[Self <: IndexDescription[_], T] (val x: Self with IndexDescription[T]) extends AnyVal {
    
    @scala.inline
    def setDeduplicate(value: Boolean): Self = StObject.set(x, "deduplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeduplicateUndefined: Self = StObject.set(x, "deduplicate", js.undefined)
    
    @scala.inline
    def setExpireAfter(value: Double): Self = StObject.set(x, "expireAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireAfterUndefined: Self = StObject.set(x, "expireAfter", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
    
    @scala.inline
    def setType(value: IndexType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
