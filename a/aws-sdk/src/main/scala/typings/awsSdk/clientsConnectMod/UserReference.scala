package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the user.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The unique identifier for the user.
    */
  var Id: js.UndefOr[UserId] = js.undefined
}
object UserReference {
  
  inline def apply(): UserReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserReference] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: UserId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
