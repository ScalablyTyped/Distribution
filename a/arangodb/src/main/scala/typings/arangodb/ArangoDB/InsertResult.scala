package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertResult[T /* <: js.Object */]
  extends StObject
     with DocumentMetadata {
  
  var `new`: js.UndefOr[Document[T]] = js.undefined
}
object InsertResult {
  
  inline def apply[T /* <: js.Object */](_id: String, _key: String, _rev: String): InsertResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertResult[T]]
  }
  
  extension [Self <: InsertResult[?], T /* <: js.Object */](x: Self & InsertResult[T]) {
    
    inline def setNew(value: Document[T]): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
  }
}
