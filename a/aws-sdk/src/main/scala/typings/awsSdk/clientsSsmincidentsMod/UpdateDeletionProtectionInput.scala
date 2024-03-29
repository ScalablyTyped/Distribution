package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeletionProtectionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replication set to update.
    */
  var arn: Arn
  
  /**
    * A token that ensures that the operation is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * Specifies if deletion protection is turned on or off in your account. 
    */
  var deletionProtected: Boolean
}
object UpdateDeletionProtectionInput {
  
  inline def apply(arn: Arn, deletionProtected: Boolean): UpdateDeletionProtectionInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], deletionProtected = deletionProtected.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeletionProtectionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDeletionProtectionInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDeletionProtected(value: Boolean): Self = StObject.set(x, "deletionProtected", value.asInstanceOf[js.Any])
  }
}
