package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamConsumerOutput extends StObject {
  
  /**
    * An object that represents the details of the consumer.
    */
  var ConsumerDescription: typings.awsSdk.clientsKinesisMod.ConsumerDescription
}
object DescribeStreamConsumerOutput {
  
  inline def apply(ConsumerDescription: ConsumerDescription): DescribeStreamConsumerOutput = {
    val __obj = js.Dynamic.literal(ConsumerDescription = ConsumerDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamConsumerOutput]
  }
  
  extension [Self <: DescribeStreamConsumerOutput](x: Self) {
    
    inline def setConsumerDescription(value: ConsumerDescription): Self = StObject.set(x, "ConsumerDescription", value.asInstanceOf[js.Any])
  }
}
