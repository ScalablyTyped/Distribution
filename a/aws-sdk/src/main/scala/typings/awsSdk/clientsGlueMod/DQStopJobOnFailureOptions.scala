package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DQStopJobOnFailureOptions extends StObject {
  
  /**
    * When to stop job if your data quality evaluation fails. Options are Immediate or AfterDataLoad.
    */
  var StopJobOnFailureTiming: js.UndefOr[DQStopJobOnFailureTiming] = js.undefined
}
object DQStopJobOnFailureOptions {
  
  inline def apply(): DQStopJobOnFailureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DQStopJobOnFailureOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DQStopJobOnFailureOptions] (val x: Self) extends AnyVal {
    
    inline def setStopJobOnFailureTiming(value: DQStopJobOnFailureTiming): Self = StObject.set(x, "StopJobOnFailureTiming", value.asInstanceOf[js.Any])
    
    inline def setStopJobOnFailureTimingUndefined: Self = StObject.set(x, "StopJobOnFailureTiming", js.undefined)
  }
}
