package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined auth0.auth0.ObjectWithId & {  user_id :string} */
trait ObjectWithIduseridstring extends StObject {
  
  var id: String
  
  var user_id: String
}
object ObjectWithIduseridstring {
  
  inline def apply(id: String, user_id: String): ObjectWithIduseridstring = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithIduseridstring]
  }
  
  extension [Self <: ObjectWithIduseridstring](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
