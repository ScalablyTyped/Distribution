package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenZFSUserOrGroupQuota extends StObject {
  
  /**
    * The ID of the user or group.
    */
  var Id: IntegerNoMax
  
  /**
    * The amount of storage that the user or group can use in gibibytes (GiB).
    */
  var StorageCapacityQuotaGiB: IntegerNoMax
  
  /**
    * A value that specifies whether the quota applies to a user or group.
    */
  var Type: OpenZFSQuotaType
}
object OpenZFSUserOrGroupQuota {
  
  inline def apply(Id: IntegerNoMax, StorageCapacityQuotaGiB: IntegerNoMax, Type: OpenZFSQuotaType): OpenZFSUserOrGroupQuota = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageCapacityQuotaGiB = StorageCapacityQuotaGiB.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenZFSUserOrGroupQuota]
  }
  
  extension [Self <: OpenZFSUserOrGroupQuota](x: Self) {
    
    inline def setId(value: IntegerNoMax): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityQuotaGiB(value: IntegerNoMax): Self = StObject.set(x, "StorageCapacityQuotaGiB", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpenZFSQuotaType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
