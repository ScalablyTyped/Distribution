package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeliveryStreamsOutput extends StObject {
  
  /**
    * The names of the delivery streams.
    */
  var DeliveryStreamNames: DeliveryStreamNameList
  
  /**
    * Indicates whether there are more delivery streams available to list.
    */
  var HasMoreDeliveryStreams: BooleanObject
}
object ListDeliveryStreamsOutput {
  
  inline def apply(DeliveryStreamNames: DeliveryStreamNameList, HasMoreDeliveryStreams: BooleanObject): ListDeliveryStreamsOutput = {
    val __obj = js.Dynamic.literal(DeliveryStreamNames = DeliveryStreamNames.asInstanceOf[js.Any], HasMoreDeliveryStreams = HasMoreDeliveryStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeliveryStreamsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeliveryStreamsOutput] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStreamNames(value: DeliveryStreamNameList): Self = StObject.set(x, "DeliveryStreamNames", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamNamesVarargs(value: DeliveryStreamName*): Self = StObject.set(x, "DeliveryStreamNames", js.Array(value*))
    
    inline def setHasMoreDeliveryStreams(value: BooleanObject): Self = StObject.set(x, "HasMoreDeliveryStreams", value.asInstanceOf[js.Any])
  }
}
