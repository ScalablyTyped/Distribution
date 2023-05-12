package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffPeakWindowOptions extends StObject {
  
  /**
    * Whether to enable an off-peak window. This option is only available when modifying a domain created prior to February 16, 2023, not when creating a new domain. All domains created after this date have the off-peak window enabled by default. You can't disable the off-peak window after it's enabled for a domain.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Off-peak window settings for the domain.
    */
  var OffPeakWindow: js.UndefOr[typings.awsSdk.clientsOpensearchMod.OffPeakWindow] = js.undefined
}
object OffPeakWindowOptions {
  
  inline def apply(): OffPeakWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffPeakWindowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffPeakWindowOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setOffPeakWindow(value: OffPeakWindow): Self = StObject.set(x, "OffPeakWindow", value.asInstanceOf[js.Any])
    
    inline def setOffPeakWindowUndefined: Self = StObject.set(x, "OffPeakWindow", js.undefined)
  }
}
