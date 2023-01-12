package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanEc2InstanceWithFindingsResult extends StObject {
  
  /**
    * Describes the configuration of scanning EBS volumes as a data source.
    */
  var EbsVolumes: js.UndefOr[EbsVolumesResult] = js.undefined
}
object ScanEc2InstanceWithFindingsResult {
  
  inline def apply(): ScanEc2InstanceWithFindingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanEc2InstanceWithFindingsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanEc2InstanceWithFindingsResult] (val x: Self) extends AnyVal {
    
    inline def setEbsVolumes(value: EbsVolumesResult): Self = StObject.set(x, "EbsVolumes", value.asInstanceOf[js.Any])
    
    inline def setEbsVolumesUndefined: Self = StObject.set(x, "EbsVolumes", js.undefined)
  }
}
