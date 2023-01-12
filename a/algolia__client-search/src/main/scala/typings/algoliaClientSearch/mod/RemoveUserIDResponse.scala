package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveUserIDResponse extends StObject {
  
  /**
    * When the given `userID` got removed.
    */
  var deletedAt: String
}
object RemoveUserIDResponse {
  
  inline def apply(deletedAt: String): RemoveUserIDResponse = {
    val __obj = js.Dynamic.literal(deletedAt = deletedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveUserIDResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveUserIDResponse] (val x: Self) extends AnyVal {
    
    inline def setDeletedAt(value: String): Self = StObject.set(x, "deletedAt", value.asInstanceOf[js.Any])
  }
}
