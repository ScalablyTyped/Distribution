package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanEc2InstanceWithFindings extends StObject {
  
  /**
    * Describes the configuration for scanning EBS volumes as data source.
    */
  var EbsVolumes: js.UndefOr[Boolean] = js.undefined
}
object ScanEc2InstanceWithFindings {
  
  inline def apply(): ScanEc2InstanceWithFindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanEc2InstanceWithFindings]
  }
  
  extension [Self <: ScanEc2InstanceWithFindings](x: Self) {
    
    inline def setEbsVolumes(value: Boolean): Self = StObject.set(x, "EbsVolumes", value.asInstanceOf[js.Any])
    
    inline def setEbsVolumesUndefined: Self = StObject.set(x, "EbsVolumes", js.undefined)
  }
}
