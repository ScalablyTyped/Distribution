package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsVolumesResult extends StObject {
  
  /**
    * Specifies the reason why scanning EBS volumes (Malware Protection) was not enabled as a data source.
    */
  var Reason: js.UndefOr[String] = js.undefined
  
  /**
    * Describes whether scanning EBS volumes is enabled as a data source.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.undefined
}
object EbsVolumesResult {
  
  inline def apply(): EbsVolumesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsVolumesResult]
  }
  
  extension [Self <: EbsVolumesResult](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
