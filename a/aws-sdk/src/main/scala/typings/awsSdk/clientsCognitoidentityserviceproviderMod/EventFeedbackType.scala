package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFeedbackType extends StObject {
  
  /**
    * The event feedback date.
    */
  var FeedbackDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The event feedback value.
    */
  var FeedbackValue: FeedbackValueType
  
  /**
    * The provider.
    */
  var Provider: StringType
}
object EventFeedbackType {
  
  inline def apply(FeedbackValue: FeedbackValueType, Provider: StringType): EventFeedbackType = {
    val __obj = js.Dynamic.literal(FeedbackValue = FeedbackValue.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFeedbackType]
  }
  
  extension [Self <: EventFeedbackType](x: Self) {
    
    inline def setFeedbackDate(value: js.Date): Self = StObject.set(x, "FeedbackDate", value.asInstanceOf[js.Any])
    
    inline def setFeedbackDateUndefined: Self = StObject.set(x, "FeedbackDate", js.undefined)
    
    inline def setFeedbackValue(value: FeedbackValueType): Self = StObject.set(x, "FeedbackValue", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: StringType): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
  }
}
