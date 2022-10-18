package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceShareRequest extends StObject {
  
  /**
    * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This lets you safely retry the request without accidentally performing the same operation a second time. Passing the same value to a later call to an operation requires that you also pass the same value for all other parameters. We recommend that you use a UUID type of value.. If you don't provide this value, then Amazon Web Services generates a random one for you.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, the new name that you want to attach to the resource share.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon Resoure Name (ARN) of the resource share that you want to modify.
    */
  var resourceShareArn: String
}
object UpdateResourceShareRequest {
  
  inline def apply(resourceShareArn: String): UpdateResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceShareRequest]
  }
  
  extension [Self <: UpdateResourceShareRequest](x: Self) {
    
    inline def setAllowExternalPrincipals(value: Boolean): Self = StObject.set(x, "allowExternalPrincipals", value.asInstanceOf[js.Any])
    
    inline def setAllowExternalPrincipalsUndefined: Self = StObject.set(x, "allowExternalPrincipals", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
  }
}
