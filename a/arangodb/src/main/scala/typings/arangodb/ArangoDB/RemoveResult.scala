package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveResult[T /* <: js.Object */] extends DocumentMetadata {
  
  var old: js.UndefOr[Document[T]] = js.native
}
object RemoveResult {
  
  @scala.inline
  def apply[T /* <: js.Object */](_id: String, _key: String, _rev: String): RemoveResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResult[T]]
  }
  
  @scala.inline
  implicit class RemoveResultMutableBuilder[Self <: RemoveResult[_], T /* <: js.Object */] (val x: Self with RemoveResult[T]) extends AnyVal {
    
    @scala.inline
    def setOld(value: Document[T]): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
  }
}
