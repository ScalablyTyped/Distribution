package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetId extends StObject {
  
  /**
    * Effective group id.
    */
  var group: String = js.native
  
  /**
    * Effective user id.
    */
  var user: String = js.native
}
object SetId {
  
  @scala.inline
  def apply(group: String, user: String): SetId = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetId]
  }
  
  @scala.inline
  implicit class SetIdMutableBuilder[Self <: SetId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
