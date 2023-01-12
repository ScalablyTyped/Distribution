package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseUsage extends StObject {
  
  /**
    * License entitlement usages.
    */
  var EntitlementUsages: js.UndefOr[EntitlementUsageList] = js.undefined
}
object LicenseUsage {
  
  inline def apply(): LicenseUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseUsage] (val x: Self) extends AnyVal {
    
    inline def setEntitlementUsages(value: EntitlementUsageList): Self = StObject.set(x, "EntitlementUsages", value.asInstanceOf[js.Any])
    
    inline def setEntitlementUsagesUndefined: Self = StObject.set(x, "EntitlementUsages", js.undefined)
    
    inline def setEntitlementUsagesVarargs(value: EntitlementUsage*): Self = StObject.set(x, "EntitlementUsages", js.Array(value*))
  }
}
