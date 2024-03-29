package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkEventNotificationConfigurations extends StObject {
  
  /**
    * Denotes whether the Amazon ID event topic is enabled or disabled.
    */
  var AmazonIdEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
}
object SidewalkEventNotificationConfigurations {
  
  inline def apply(): SidewalkEventNotificationConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkEventNotificationConfigurations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidewalkEventNotificationConfigurations] (val x: Self) extends AnyVal {
    
    inline def setAmazonIdEventTopic(value: EventNotificationTopicStatus): Self = StObject.set(x, "AmazonIdEventTopic", value.asInstanceOf[js.Any])
    
    inline def setAmazonIdEventTopicUndefined: Self = StObject.set(x, "AmazonIdEventTopic", js.undefined)
  }
}
