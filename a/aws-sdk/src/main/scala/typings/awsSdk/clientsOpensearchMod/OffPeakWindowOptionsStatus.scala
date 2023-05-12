package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffPeakWindowOptionsStatus extends StObject {
  
  /**
    * The domain's off-peak window configuration.
    */
  var Options: js.UndefOr[OffPeakWindowOptions] = js.undefined
  
  /**
    * The current status of off-peak window options.
    */
  var Status: js.UndefOr[OptionStatus] = js.undefined
}
object OffPeakWindowOptionsStatus {
  
  inline def apply(): OffPeakWindowOptionsStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffPeakWindowOptionsStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffPeakWindowOptionsStatus] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: OffPeakWindowOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
