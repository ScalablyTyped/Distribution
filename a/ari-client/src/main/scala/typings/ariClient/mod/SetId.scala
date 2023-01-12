package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetId extends StObject {
  
  /**
    * Effective group id.
    */
  var group: String
  
  /**
    * Effective user id.
    */
  var user: String
}
object SetId {
  
  inline def apply(group: String, user: String): SetId = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetId] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
