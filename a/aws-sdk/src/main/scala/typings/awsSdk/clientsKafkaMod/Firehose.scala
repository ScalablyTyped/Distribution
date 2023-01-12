package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firehose extends StObject {
  
  var DeliveryStream: js.UndefOr[string] = js.undefined
  
  var Enabled: boolean
}
object Firehose {
  
  inline def apply(Enabled: boolean): Firehose = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firehose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Firehose] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStream(value: string): Self = StObject.set(x, "DeliveryStream", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamUndefined: Self = StObject.set(x, "DeliveryStream", js.undefined)
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
