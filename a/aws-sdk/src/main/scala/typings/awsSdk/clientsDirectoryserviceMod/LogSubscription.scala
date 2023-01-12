package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogSubscription extends StObject {
  
  /**
    * Identifier (ID) of the directory that you want to associate with the log subscription.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The name of the log group.
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.LogGroupName] = js.undefined
  
  /**
    * The date and time that the log subscription was created.
    */
  var SubscriptionCreatedDateTime: js.UndefOr[js.Date] = js.undefined
}
object LogSubscription {
  
  inline def apply(): LogSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSubscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogSubscription] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    inline def setSubscriptionCreatedDateTime(value: js.Date): Self = StObject.set(x, "SubscriptionCreatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionCreatedDateTimeUndefined: Self = StObject.set(x, "SubscriptionCreatedDateTime", js.undefined)
  }
}
