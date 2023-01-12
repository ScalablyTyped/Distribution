package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserMessage extends StObject {
  
  /**
    * The ID of the user.
    */
  var UserId: typings.awsSdk.clientsElasticacheMod.UserId
}
object DeleteUserMessage {
  
  inline def apply(UserId: UserId): DeleteUserMessage = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteUserMessage] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
