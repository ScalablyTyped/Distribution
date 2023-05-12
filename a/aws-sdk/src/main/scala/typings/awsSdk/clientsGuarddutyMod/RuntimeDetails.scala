package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeDetails extends StObject {
  
  /**
    * Additional information about the suspicious activity.
    */
  var Context: js.UndefOr[RuntimeContext] = js.undefined
  
  /**
    * Information about the observed process.
    */
  var Process: js.UndefOr[ProcessDetails] = js.undefined
}
object RuntimeDetails {
  
  inline def apply(): RuntimeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeDetails] (val x: Self) extends AnyVal {
    
    inline def setContext(value: RuntimeContext): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    inline def setProcess(value: ProcessDetails): Self = StObject.set(x, "Process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "Process", js.undefined)
  }
}
