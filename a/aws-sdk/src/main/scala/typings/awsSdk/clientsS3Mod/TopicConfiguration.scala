package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicConfiguration extends StObject {
  
  /**
    * The Amazon S3 bucket event about which to send notifications. For more information, see Supported Event Types in the Amazon S3 User Guide.
    */
  var Events: EventList
  
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
  
  var Id: js.UndefOr[NotificationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a message when it detects events of the specified type.
    */
  var TopicArn: typings.awsSdk.clientsS3Mod.TopicArn
}
object TopicConfiguration {
  
  inline def apply(Events: EventList, TopicArn: TopicArn): TopicConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setFilter(value: NotificationConfigurationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setId(value: NotificationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setTopicArn(value: TopicArn): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
