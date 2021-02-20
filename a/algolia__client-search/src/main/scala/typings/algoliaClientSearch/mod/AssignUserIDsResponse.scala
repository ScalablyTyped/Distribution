package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignUserIDsResponse extends StObject {
  
  /**
    * Date of creation of the userId
    */
  var createdAt: String = js.native
}
object AssignUserIDsResponse {
  
  @scala.inline
  def apply(createdAt: String): AssignUserIDsResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignUserIDsResponse]
  }
  
  @scala.inline
  implicit class AssignUserIDsResponseMutableBuilder[Self <: AssignUserIDsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
  }
}
