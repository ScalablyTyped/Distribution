package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendedProcess extends StObject {
  
  /**
    * The name of the suspended process.
    */
  var ProcessName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The reason that the process was suspended.
    */
  var SuspensionReason: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object SuspendedProcess {
  
  inline def apply(): SuspendedProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspendedProcess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuspendedProcess] (val x: Self) extends AnyVal {
    
    inline def setProcessName(value: XmlStringMaxLen255): Self = StObject.set(x, "ProcessName", value.asInstanceOf[js.Any])
    
    inline def setProcessNameUndefined: Self = StObject.set(x, "ProcessName", js.undefined)
    
    inline def setSuspensionReason(value: XmlStringMaxLen255): Self = StObject.set(x, "SuspensionReason", value.asInstanceOf[js.Any])
    
    inline def setSuspensionReasonUndefined: Self = StObject.set(x, "SuspensionReason", js.undefined)
  }
}
