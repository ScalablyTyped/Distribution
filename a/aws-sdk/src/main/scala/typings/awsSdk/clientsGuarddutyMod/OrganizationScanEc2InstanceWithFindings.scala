package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationScanEc2InstanceWithFindings extends StObject {
  
  /**
    * Whether scanning EBS volumes should be auto-enabled for new members joining the organization.
    */
  var EbsVolumes: js.UndefOr[OrganizationEbsVolumes] = js.undefined
}
object OrganizationScanEc2InstanceWithFindings {
  
  inline def apply(): OrganizationScanEc2InstanceWithFindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationScanEc2InstanceWithFindings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationScanEc2InstanceWithFindings] (val x: Self) extends AnyVal {
    
    inline def setEbsVolumes(value: OrganizationEbsVolumes): Self = StObject.set(x, "EbsVolumes", value.asInstanceOf[js.Any])
    
    inline def setEbsVolumesUndefined: Self = StObject.set(x, "EbsVolumes", js.undefined)
  }
}
