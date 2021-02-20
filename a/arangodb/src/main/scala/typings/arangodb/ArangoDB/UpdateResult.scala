package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResult[T /* <: js.Object */] extends UpdateMetadata {
  
  var `new`: js.UndefOr[Document[T]] = js.native
  
  var old: js.UndefOr[Document[T]] = js.native
}
object UpdateResult {
  
  @scala.inline
  def apply[T /* <: js.Object */](_id: String, _key: String, _oldRev: String, _rev: String): UpdateResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _oldRev = _oldRev.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult[T]]
  }
  
  @scala.inline
  implicit class UpdateResultMutableBuilder[Self <: UpdateResult[_], T /* <: js.Object */] (val x: Self with UpdateResult[T]) extends AnyVal {
    
    @scala.inline
    def setNew(value: Document[T]): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
    
    @scala.inline
    def setOld(value: Document[T]): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
  }
}
