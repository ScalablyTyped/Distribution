package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VdmAttributes extends StObject {
  
  /**
    * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
    */
  var DashboardAttributes: js.UndefOr[typings.awsSdk.clientsSesv2Mod.DashboardAttributes] = js.undefined
  
  /**
    * Specifies additional settings for your VDM configuration as applicable to the Guardian.
    */
  var GuardianAttributes: js.UndefOr[typings.awsSdk.clientsSesv2Mod.GuardianAttributes] = js.undefined
  
  /**
    * Specifies the status of your VDM configuration. Can be one of the following:    ENABLED – Amazon SES enables VDM for your account.    DISABLED – Amazon SES disables VDM for your account.  
    */
  var VdmEnabled: FeatureStatus
}
object VdmAttributes {
  
  inline def apply(VdmEnabled: FeatureStatus): VdmAttributes = {
    val __obj = js.Dynamic.literal(VdmEnabled = VdmEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[VdmAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VdmAttributes] (val x: Self) extends AnyVal {
    
    inline def setDashboardAttributes(value: DashboardAttributes): Self = StObject.set(x, "DashboardAttributes", value.asInstanceOf[js.Any])
    
    inline def setDashboardAttributesUndefined: Self = StObject.set(x, "DashboardAttributes", js.undefined)
    
    inline def setGuardianAttributes(value: GuardianAttributes): Self = StObject.set(x, "GuardianAttributes", value.asInstanceOf[js.Any])
    
    inline def setGuardianAttributesUndefined: Self = StObject.set(x, "GuardianAttributes", js.undefined)
    
    inline def setVdmEnabled(value: FeatureStatus): Self = StObject.set(x, "VdmEnabled", value.asInstanceOf[js.Any])
  }
}
