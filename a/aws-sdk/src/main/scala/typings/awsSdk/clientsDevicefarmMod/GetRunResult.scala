package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRunResult extends StObject {
  
  /**
    * The run to get results from.
    */
  var run: js.UndefOr[Run] = js.undefined
}
object GetRunResult {
  
  inline def apply(): GetRunResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRunResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRunResult] (val x: Self) extends AnyVal {
    
    inline def setRun(value: Run): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
