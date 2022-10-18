package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityNotificationAttributesRequest extends StObject {
  
  /**
    * A list of one or more identities. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com.
    */
  var Identities: IdentityList
}
object GetIdentityNotificationAttributesRequest {
  
  inline def apply(Identities: IdentityList): GetIdentityNotificationAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityNotificationAttributesRequest]
  }
  
  extension [Self <: GetIdentityNotificationAttributesRequest](x: Self) {
    
    inline def setIdentities(value: IdentityList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "Identities", js.Array(value*))
  }
}
