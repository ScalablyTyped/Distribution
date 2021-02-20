package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindObjectResponse[TObject] extends StObject {
  
  /**
    * The found object.
    */
  var `object`: TObject with ObjectWithObjectID = js.native
  
  /**
    * The page where the object was found.
    */
  var page: Double = js.native
  
  /**
    * The position where the object was found.
    */
  var position: Double = js.native
}
object FindObjectResponse {
  
  @scala.inline
  def apply[TObject](`object`: TObject with ObjectWithObjectID, page: Double, position: Double): FindObjectResponse[TObject] = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindObjectResponse[TObject]]
  }
  
  @scala.inline
  implicit class FindObjectResponseMutableBuilder[Self <: FindObjectResponse[_], TObject] (val x: Self with FindObjectResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def setObject(value: TObject with ObjectWithObjectID): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
