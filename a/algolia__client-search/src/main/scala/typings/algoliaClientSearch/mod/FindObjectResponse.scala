package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindObjectResponse[TObject] extends StObject {
  
  /**
    * The found object.
    */
  var `object`: TObject & ObjectWithObjectID
  
  /**
    * The page where the object was found.
    */
  var page: Double
  
  /**
    * The position where the object was found.
    */
  var position: Double
}
object FindObjectResponse {
  
  inline def apply[TObject](`object`: TObject & ObjectWithObjectID, page: Double, position: Double): FindObjectResponse[TObject] = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindObjectResponse[TObject]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindObjectResponse[?], TObject] (val x: Self & FindObjectResponse[TObject]) extends AnyVal {
    
    inline def setObject(value: TObject & ObjectWithObjectID): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
