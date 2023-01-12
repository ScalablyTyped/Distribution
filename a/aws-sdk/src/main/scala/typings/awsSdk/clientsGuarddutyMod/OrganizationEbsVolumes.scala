package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationEbsVolumes extends StObject {
  
  /**
    * Whether scanning EBS volumes should be auto-enabled for new members joining the organization.
    */
  var AutoEnable: js.UndefOr[Boolean] = js.undefined
}
object OrganizationEbsVolumes {
  
  inline def apply(): OrganizationEbsVolumes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEbsVolumes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationEbsVolumes] (val x: Self) extends AnyVal {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "AutoEnable", js.undefined)
  }
}
