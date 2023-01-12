package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VdmOptions extends StObject {
  
  /**
    * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
    */
  var DashboardOptions: js.UndefOr[typings.awsSdk.clientsSesv2Mod.DashboardOptions] = js.undefined
  
  /**
    * Specifies additional settings for your VDM configuration as applicable to the Guardian.
    */
  var GuardianOptions: js.UndefOr[typings.awsSdk.clientsSesv2Mod.GuardianOptions] = js.undefined
}
object VdmOptions {
  
  inline def apply(): VdmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VdmOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VdmOptions] (val x: Self) extends AnyVal {
    
    inline def setDashboardOptions(value: DashboardOptions): Self = StObject.set(x, "DashboardOptions", value.asInstanceOf[js.Any])
    
    inline def setDashboardOptionsUndefined: Self = StObject.set(x, "DashboardOptions", js.undefined)
    
    inline def setGuardianOptions(value: GuardianOptions): Self = StObject.set(x, "GuardianOptions", value.asInstanceOf[js.Any])
    
    inline def setGuardianOptionsUndefined: Self = StObject.set(x, "GuardianOptions", js.undefined)
  }
}
