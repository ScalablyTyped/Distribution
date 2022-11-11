package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBridgeParameters extends StObject {
  
  /**
    * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event detail.
    */
  var DetailType: typings.awsSdk.clientsSchedulerMod.DetailType
  
  /**
    * The source of the event.
    */
  var Source: typings.awsSdk.clientsSchedulerMod.Source
}
object EventBridgeParameters {
  
  inline def apply(DetailType: DetailType, Source: Source): EventBridgeParameters = {
    val __obj = js.Dynamic.literal(DetailType = DetailType.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBridgeParameters]
  }
  
  extension [Self <: EventBridgeParameters](x: Self) {
    
    inline def setDetailType(value: DetailType): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
