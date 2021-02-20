package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Indexes
@js.native
trait IndexLike
  extends /* key */ StringDictionary[js.Any] {
  
  var id: String = js.native
}
object IndexLike {
  
  @scala.inline
  def apply(id: String): IndexLike = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexLike]
  }
  
  @scala.inline
  implicit class IndexLikeMutableBuilder[Self <: IndexLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
