package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeliveryStreamOutput extends StObject {
  
  /**
    * Information about the delivery stream.
    */
  var DeliveryStreamDescription: typings.awsSdk.clientsFirehoseMod.DeliveryStreamDescription
}
object DescribeDeliveryStreamOutput {
  
  inline def apply(DeliveryStreamDescription: DeliveryStreamDescription): DescribeDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal(DeliveryStreamDescription = DeliveryStreamDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeliveryStreamOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDeliveryStreamOutput] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStreamDescription(value: DeliveryStreamDescription): Self = StObject.set(x, "DeliveryStreamDescription", value.asInstanceOf[js.Any])
  }
}
