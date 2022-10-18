package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBus extends StObject {
  
  /**
    * The ARN of the event bus.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the event bus.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The permissions policy of the event bus, describing which other Amazon Web Services accounts can write events to this event bus.
    */
  var Policy: js.UndefOr[String] = js.undefined
}
object EventBus {
  
  inline def apply(): EventBus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventBus]
  }
  
  extension [Self <: EventBus](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
