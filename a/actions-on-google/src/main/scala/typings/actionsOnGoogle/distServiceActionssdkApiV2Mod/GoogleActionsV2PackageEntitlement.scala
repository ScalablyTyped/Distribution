package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2PackageEntitlement extends StObject {
  
  /**
    * List of entitlements for a given app
    */
  var entitlements: js.UndefOr[js.Array[GoogleActionsV2Entitlement]] = js.undefined
  
  /**
    * Should match the package name in action package
    */
  var packageName: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2PackageEntitlement {
  
  inline def apply(): GoogleActionsV2PackageEntitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PackageEntitlement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2PackageEntitlement] (val x: Self) extends AnyVal {
    
    inline def setEntitlements(value: js.Array[GoogleActionsV2Entitlement]): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
    
    inline def setEntitlementsVarargs(value: GoogleActionsV2Entitlement*): Self = StObject.set(x, "entitlements", js.Array(value*))
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
