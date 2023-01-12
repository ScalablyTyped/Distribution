package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelTargetInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact channel.
    */
  var ContactChannelId: SsmContactsArn
  
  /**
    * The number of minutes to wait to retry sending engagement in the case the engagement initially fails.
    */
  var RetryIntervalInMinutes: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.RetryIntervalInMinutes] = js.undefined
}
object ChannelTargetInfo {
  
  inline def apply(ContactChannelId: SsmContactsArn): ChannelTargetInfo = {
    val __obj = js.Dynamic.literal(ContactChannelId = ContactChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTargetInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelTargetInfo] (val x: Self) extends AnyVal {
    
    inline def setContactChannelId(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelId", value.asInstanceOf[js.Any])
    
    inline def setRetryIntervalInMinutes(value: RetryIntervalInMinutes): Self = StObject.set(x, "RetryIntervalInMinutes", value.asInstanceOf[js.Any])
    
    inline def setRetryIntervalInMinutesUndefined: Self = StObject.set(x, "RetryIntervalInMinutes", js.undefined)
  }
}
