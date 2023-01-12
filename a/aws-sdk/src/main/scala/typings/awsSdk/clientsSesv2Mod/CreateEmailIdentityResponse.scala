package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEmailIdentityResponse extends StObject {
  
  /**
    * An object that contains information about the DKIM attributes for the identity.
    */
  var DkimAttributes: js.UndefOr[typings.awsSdk.clientsSesv2Mod.DkimAttributes] = js.undefined
  
  /**
    * The email identity type. Note: the MANAGED_DOMAIN identity type is not supported.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.clientsSesv2Mod.IdentityType] = js.undefined
  
  /**
    * Specifies whether or not the identity is verified. You can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
    */
  var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
}
object CreateEmailIdentityResponse {
  
  inline def apply(): CreateEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEmailIdentityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEmailIdentityResponse] (val x: Self) extends AnyVal {
    
    inline def setDkimAttributes(value: DkimAttributes): Self = StObject.set(x, "DkimAttributes", value.asInstanceOf[js.Any])
    
    inline def setDkimAttributesUndefined: Self = StObject.set(x, "DkimAttributes", js.undefined)
    
    inline def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    inline def setVerifiedForSendingStatus(value: Enabled): Self = StObject.set(x, "VerifiedForSendingStatus", value.asInstanceOf[js.Any])
    
    inline def setVerifiedForSendingStatusUndefined: Self = StObject.set(x, "VerifiedForSendingStatus", js.undefined)
  }
}
