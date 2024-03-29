package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleRunResult extends StObject {
  
  /**
    * Information about the scheduled run.
    */
  var run: js.UndefOr[Run] = js.undefined
}
object ScheduleRunResult {
  
  inline def apply(): ScheduleRunResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleRunResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleRunResult] (val x: Self) extends AnyVal {
    
    inline def setRun(value: Run): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
