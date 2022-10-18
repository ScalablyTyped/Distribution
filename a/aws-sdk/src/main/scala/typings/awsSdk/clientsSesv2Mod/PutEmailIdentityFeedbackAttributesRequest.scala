package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEmailIdentityFeedbackAttributesRequest extends StObject {
  
  /**
    * Sets the feedback forwarding configuration for the identity. If the value is true, you receive email notifications when bounce or complaint events occur. These notifications are sent to the address that you specified in the Return-Path header of the original email. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an email notification when these events occur (even if this setting is disabled).
    */
  var EmailForwardingEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * The email identity.
    */
  var EmailIdentity: Identity
}
object PutEmailIdentityFeedbackAttributesRequest {
  
  inline def apply(EmailIdentity: Identity): PutEmailIdentityFeedbackAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityFeedbackAttributesRequest]
  }
  
  extension [Self <: PutEmailIdentityFeedbackAttributesRequest](x: Self) {
    
    inline def setEmailForwardingEnabled(value: Enabled): Self = StObject.set(x, "EmailForwardingEnabled", value.asInstanceOf[js.Any])
    
    inline def setEmailForwardingEnabledUndefined: Self = StObject.set(x, "EmailForwardingEnabled", js.undefined)
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
  }
}
