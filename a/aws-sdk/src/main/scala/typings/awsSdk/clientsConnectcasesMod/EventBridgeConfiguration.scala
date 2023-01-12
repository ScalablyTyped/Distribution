package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBridgeConfiguration extends StObject {
  
  /**
    * Indicates whether the to broadcast case event data to the customer.
    */
  var enabled: Boolean
  
  /**
    * Details of what case and related item data is published through the case event stream.
    */
  var includedData: js.UndefOr[EventIncludedData] = js.undefined
}
object EventBridgeConfiguration {
  
  inline def apply(enabled: Boolean): EventBridgeConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBridgeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventBridgeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setIncludedData(value: EventIncludedData): Self = StObject.set(x, "includedData", value.asInstanceOf[js.Any])
    
    inline def setIncludedDataUndefined: Self = StObject.set(x, "includedData", js.undefined)
  }
}
