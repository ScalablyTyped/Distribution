package typings.actionsOnGoogle.v2Mod

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
  
  @scala.inline
  def apply(): GoogleActionsV2PackageEntitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PackageEntitlement]
  }
  
  @scala.inline
  implicit class GoogleActionsV2PackageEntitlementMutableBuilder[Self <: GoogleActionsV2PackageEntitlement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitlements(value: js.Array[GoogleActionsV2Entitlement]): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
    
    @scala.inline
    def setEntitlementsVarargs(value: GoogleActionsV2Entitlement*): Self = StObject.set(x, "entitlements", js.Array(value :_*))
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
