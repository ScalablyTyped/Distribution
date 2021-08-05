package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResult[T /* <: js.Object */]
  extends StObject
     with UpdateMetadata {
  
  var `new`: js.UndefOr[Document[T]] = js.undefined
  
  var old: js.UndefOr[Document[T]] = js.undefined
}
object UpdateResult {
  
  inline def apply[T /* <: js.Object */](_id: String, _key: String, _oldRev: String, _rev: String): UpdateResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _oldRev = _oldRev.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult[T]]
  }
  
  extension [Self <: UpdateResult[?], T /* <: js.Object */](x: Self & UpdateResult[T]) {
    
    inline def setNew(value: Document[T]): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
    
    inline def setOld(value: Document[T]): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    inline def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
  }
}
