package typings.awsSdk.autoscalingMod

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
  
  @scala.inline
  def apply(): SuspendedProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspendedProcess]
  }
  
  @scala.inline
  implicit class SuspendedProcessMutableBuilder[Self <: SuspendedProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessName(value: XmlStringMaxLen255): Self = StObject.set(x, "ProcessName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessNameUndefined: Self = StObject.set(x, "ProcessName", js.undefined)
    
    @scala.inline
    def setSuspensionReason(value: XmlStringMaxLen255): Self = StObject.set(x, "SuspensionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionReasonUndefined: Self = StObject.set(x, "SuspensionReason", js.undefined)
  }
}
