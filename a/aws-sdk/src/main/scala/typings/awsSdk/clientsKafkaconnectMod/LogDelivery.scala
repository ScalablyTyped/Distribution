package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogDelivery extends StObject {
  
  /**
    * The workers can send worker logs to different destination types. This configuration specifies the details of these destinations.
    */
  var workerLogDelivery: WorkerLogDelivery
}
object LogDelivery {
  
  inline def apply(workerLogDelivery: WorkerLogDelivery): LogDelivery = {
    val __obj = js.Dynamic.literal(workerLogDelivery = workerLogDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogDelivery] (val x: Self) extends AnyVal {
    
    inline def setWorkerLogDelivery(value: WorkerLogDelivery): Self = StObject.set(x, "workerLogDelivery", value.asInstanceOf[js.Any])
  }
}
