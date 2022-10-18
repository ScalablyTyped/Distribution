package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogDeliveryDescription extends StObject {
  
  /**
    * The workers can send worker logs to different destination types. This configuration specifies the details of these destinations.
    */
  var workerLogDelivery: js.UndefOr[WorkerLogDeliveryDescription] = js.undefined
}
object LogDeliveryDescription {
  
  inline def apply(): LogDeliveryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDeliveryDescription]
  }
  
  extension [Self <: LogDeliveryDescription](x: Self) {
    
    inline def setWorkerLogDelivery(value: WorkerLogDeliveryDescription): Self = StObject.set(x, "workerLogDelivery", value.asInstanceOf[js.Any])
    
    inline def setWorkerLogDeliveryUndefined: Self = StObject.set(x, "workerLogDelivery", js.undefined)
  }
}
