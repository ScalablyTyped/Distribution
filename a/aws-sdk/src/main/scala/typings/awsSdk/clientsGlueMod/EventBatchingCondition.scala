package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBatchingCondition extends StObject {
  
  /**
    * Number of events that must be received from Amazon EventBridge before EventBridge event trigger fires.
    */
  var BatchSize: typings.awsSdk.clientsGlueMod.BatchSize
  
  /**
    * Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is received.
    */
  var BatchWindow: js.UndefOr[typings.awsSdk.clientsGlueMod.BatchWindow] = js.undefined
}
object EventBatchingCondition {
  
  inline def apply(BatchSize: BatchSize): EventBatchingCondition = {
    val __obj = js.Dynamic.literal(BatchSize = BatchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBatchingCondition]
  }
  
  extension [Self <: EventBatchingCondition](x: Self) {
    
    inline def setBatchSize(value: BatchSize): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchWindow(value: BatchWindow): Self = StObject.set(x, "BatchWindow", value.asInstanceOf[js.Any])
    
    inline def setBatchWindowUndefined: Self = StObject.set(x, "BatchWindow", js.undefined)
  }
}
