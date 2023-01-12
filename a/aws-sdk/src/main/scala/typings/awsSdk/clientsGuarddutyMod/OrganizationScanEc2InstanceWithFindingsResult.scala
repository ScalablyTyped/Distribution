package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationScanEc2InstanceWithFindingsResult extends StObject {
  
  /**
    * Describes the configuration for scanning EBS volumes for an organization.
    */
  var EbsVolumes: js.UndefOr[OrganizationEbsVolumesResult] = js.undefined
}
object OrganizationScanEc2InstanceWithFindingsResult {
  
  inline def apply(): OrganizationScanEc2InstanceWithFindingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationScanEc2InstanceWithFindingsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationScanEc2InstanceWithFindingsResult] (val x: Self) extends AnyVal {
    
    inline def setEbsVolumes(value: OrganizationEbsVolumesResult): Self = StObject.set(x, "EbsVolumes", value.asInstanceOf[js.Any])
    
    inline def setEbsVolumesUndefined: Self = StObject.set(x, "EbsVolumes", js.undefined)
  }
}
