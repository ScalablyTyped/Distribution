package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartingEventBatchCondition extends StObject {
  
  /**
    * Number of events in the batch.
    */
  var BatchSize: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * Duration of the batch window in seconds.
    */
  var BatchWindow: js.UndefOr[NullableInteger] = js.undefined
}
object StartingEventBatchCondition {
  
  inline def apply(): StartingEventBatchCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartingEventBatchCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartingEventBatchCondition] (val x: Self) extends AnyVal {
    
    inline def setBatchSize(value: NullableInteger): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setBatchWindow(value: NullableInteger): Self = StObject.set(x, "BatchWindow", value.asInstanceOf[js.Any])
    
    inline def setBatchWindowUndefined: Self = StObject.set(x, "BatchWindow", js.undefined)
  }
}
