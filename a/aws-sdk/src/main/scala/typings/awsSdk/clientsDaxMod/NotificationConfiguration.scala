package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the topic. 
    */
  var TopicArn: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the topic. A value of “active” means that notifications will be sent to the topic. A value of “inactive” means that notifications will not be sent to the topic.
    */
  var TopicStatus: js.UndefOr[String] = js.undefined
}
object NotificationConfiguration {
  
  inline def apply(): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTopicArn(value: String): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
    
    inline def setTopicStatus(value: String): Self = StObject.set(x, "TopicStatus", value.asInstanceOf[js.Any])
    
    inline def setTopicStatusUndefined: Self = StObject.set(x, "TopicStatus", js.undefined)
  }
}
