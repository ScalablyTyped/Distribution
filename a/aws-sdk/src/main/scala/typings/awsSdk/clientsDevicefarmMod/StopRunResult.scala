package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRunResult extends StObject {
  
  /**
    * The run that was stopped.
    */
  var run: js.UndefOr[Run] = js.undefined
}
object StopRunResult {
  
  inline def apply(): StopRunResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRunResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopRunResult] (val x: Self) extends AnyVal {
    
    inline def setRun(value: Run): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
