package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeliveryStreamOutput extends StObject {
  
  /**
    * The ARN of the delivery stream.
    */
  var DeliveryStreamARN: js.UndefOr[typings.awsSdk.clientsFirehoseMod.DeliveryStreamARN] = js.undefined
}
object CreateDeliveryStreamOutput {
  
  inline def apply(): CreateDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeliveryStreamOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeliveryStreamOutput] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStreamARN(value: DeliveryStreamARN): Self = StObject.set(x, "DeliveryStreamARN", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamARNUndefined: Self = StObject.set(x, "DeliveryStreamARN", js.undefined)
  }
}
