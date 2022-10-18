package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddRegionAction extends StObject {
  
  /**
    * The Amazon Web Services Region name to add to the replication set.
    */
  var regionName: RegionName
  
  /**
    * The KMS key ID to use to encrypt your replication set.
    */
  var sseKmsKeyId: js.UndefOr[SseKmsKey] = js.undefined
}
object AddRegionAction {
  
  inline def apply(regionName: RegionName): AddRegionAction = {
    val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRegionAction]
  }
  
  extension [Self <: AddRegionAction](x: Self) {
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
    
    inline def setSseKmsKeyId(value: SseKmsKey): Self = StObject.set(x, "sseKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setSseKmsKeyIdUndefined: Self = StObject.set(x, "sseKmsKeyId", js.undefined)
  }
}
