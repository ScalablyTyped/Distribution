package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendOTPMessageRequestParameters extends StObject {
  
  /**
    * The attempts allowed to validate an OTP.
    */
  var AllowedAttempts: js.UndefOr[integer] = js.undefined
  
  /**
    * The brand name that will be substituted into the OTP message body. Should be owned by calling AWS account.
    */
  var BrandName: string
  
  /**
    * Channel type for the OTP message. Supported values: [SMS].
    */
  var Channel: string
  
  /**
    * The number of characters in the generated OTP.
    */
  var CodeLength: js.UndefOr[integer] = js.undefined
  
  /**
    * The destination identity to send OTP to.
    */
  var DestinationIdentity: string
  
  /**
    * A unique Entity ID received from DLT after entity registration is approved.
    */
  var EntityId: js.UndefOr[string] = js.undefined
  
  /**
    * The language to be used for the outgoing message body containing the OTP.
    */
  var Language: js.UndefOr[string] = js.undefined
  
  /**
    * The origination identity used to send OTP from.
    */
  var OriginationIdentity: string
  
  /**
    * Developer-specified reference identifier. Required to match during OTP verification.
    */
  var ReferenceId: string
  
  /**
    * A unique Template ID received from DLT after entity registration is approved.
    */
  var TemplateId: js.UndefOr[string] = js.undefined
  
  /**
    * The time in minutes before the OTP is no longer valid.
    */
  var ValidityPeriod: js.UndefOr[integer] = js.undefined
}
object SendOTPMessageRequestParameters {
  
  inline def apply(
    BrandName: string,
    Channel: string,
    DestinationIdentity: string,
    OriginationIdentity: string,
    ReferenceId: string
  ): SendOTPMessageRequestParameters = {
    val __obj = js.Dynamic.literal(BrandName = BrandName.asInstanceOf[js.Any], Channel = Channel.asInstanceOf[js.Any], DestinationIdentity = DestinationIdentity.asInstanceOf[js.Any], OriginationIdentity = OriginationIdentity.asInstanceOf[js.Any], ReferenceId = ReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOTPMessageRequestParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendOTPMessageRequestParameters] (val x: Self) extends AnyVal {
    
    inline def setAllowedAttempts(value: integer): Self = StObject.set(x, "AllowedAttempts", value.asInstanceOf[js.Any])
    
    inline def setAllowedAttemptsUndefined: Self = StObject.set(x, "AllowedAttempts", js.undefined)
    
    inline def setBrandName(value: string): Self = StObject.set(x, "BrandName", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: string): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setCodeLength(value: integer): Self = StObject.set(x, "CodeLength", value.asInstanceOf[js.Any])
    
    inline def setCodeLengthUndefined: Self = StObject.set(x, "CodeLength", js.undefined)
    
    inline def setDestinationIdentity(value: string): Self = StObject.set(x, "DestinationIdentity", value.asInstanceOf[js.Any])
    
    inline def setEntityId(value: string): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "EntityId", js.undefined)
    
    inline def setLanguage(value: string): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    inline def setOriginationIdentity(value: string): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setReferenceId(value: string): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: string): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
    
    inline def setValidityPeriod(value: integer): Self = StObject.set(x, "ValidityPeriod", value.asInstanceOf[js.Any])
    
    inline def setValidityPeriodUndefined: Self = StObject.set(x, "ValidityPeriod", js.undefined)
  }
}
