package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddonDetails extends StObject {
  
  /**
    * Status of the installed EKS add-on.
    */
  var AddonStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Version of the installed EKS add-on.
    */
  var AddonVersion: js.UndefOr[String] = js.undefined
}
object AddonDetails {
  
  inline def apply(): AddonDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddonDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddonDetails] (val x: Self) extends AnyVal {
    
    inline def setAddonStatus(value: String): Self = StObject.set(x, "AddonStatus", value.asInstanceOf[js.Any])
    
    inline def setAddonStatusUndefined: Self = StObject.set(x, "AddonStatus", js.undefined)
    
    inline def setAddonVersion(value: String): Self = StObject.set(x, "AddonVersion", value.asInstanceOf[js.Any])
    
    inline def setAddonVersionUndefined: Self = StObject.set(x, "AddonVersion", js.undefined)
  }
}
