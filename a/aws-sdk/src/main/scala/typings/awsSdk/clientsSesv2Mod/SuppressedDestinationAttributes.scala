package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuppressedDestinationAttributes extends StObject {
  
  /**
    * A unique identifier that's generated when an email address is added to the suppression list for your account.
    */
  var FeedbackId: js.UndefOr[typings.awsSdk.clientsSesv2Mod.FeedbackId] = js.undefined
  
  /**
    * The unique identifier of the email message that caused the email address to be added to the suppression list for your account.
    */
  var MessageId: js.UndefOr[OutboundMessageId] = js.undefined
}
object SuppressedDestinationAttributes {
  
  inline def apply(): SuppressedDestinationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressedDestinationAttributes]
  }
  
  extension [Self <: SuppressedDestinationAttributes](x: Self) {
    
    inline def setFeedbackId(value: FeedbackId): Self = StObject.set(x, "FeedbackId", value.asInstanceOf[js.Any])
    
    inline def setFeedbackIdUndefined: Self = StObject.set(x, "FeedbackId", js.undefined)
    
    inline def setMessageId(value: OutboundMessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
