package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Indexes
trait IndexLike
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var id: String
}
object IndexLike {
  
  inline def apply(id: String): IndexLike = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexLike]
  }
  
  extension [Self <: IndexLike](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
