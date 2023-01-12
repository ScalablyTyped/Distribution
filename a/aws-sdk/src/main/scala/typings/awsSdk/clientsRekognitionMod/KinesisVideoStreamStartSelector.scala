package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisVideoStreamStartSelector extends StObject {
  
  /**
    *  The unique identifier of the fragment. This value monotonically increases based on the ingestion order. 
    */
  var FragmentNumber: js.UndefOr[KinesisVideoStreamFragmentNumber] = js.undefined
  
  /**
    *  The timestamp from the producer corresponding to the fragment, in milliseconds, expressed in unix time format. 
    */
  var ProducerTimestamp: js.UndefOr[ULong] = js.undefined
}
object KinesisVideoStreamStartSelector {
  
  inline def apply(): KinesisVideoStreamStartSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisVideoStreamStartSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisVideoStreamStartSelector] (val x: Self) extends AnyVal {
    
    inline def setFragmentNumber(value: KinesisVideoStreamFragmentNumber): Self = StObject.set(x, "FragmentNumber", value.asInstanceOf[js.Any])
    
    inline def setFragmentNumberUndefined: Self = StObject.set(x, "FragmentNumber", js.undefined)
    
    inline def setProducerTimestamp(value: ULong): Self = StObject.set(x, "ProducerTimestamp", value.asInstanceOf[js.Any])
    
    inline def setProducerTimestampUndefined: Self = StObject.set(x, "ProducerTimestamp", js.undefined)
  }
}
