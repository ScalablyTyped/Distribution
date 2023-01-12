package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageTypeLimit extends StObject {
  
  /**
    *  Name of storage limits that are applicable for the given storage type. If StorageType is ebs, the following options are available:    MinimumVolumeSize - Minimum volume size that is available for the given storage type. Can be empty if not applicable.    MaximumVolumeSize - Maximum volume size that is available for the given storage type. Can be empty if not applicable.    MaximumIops - Maximum amount of IOPS that is available for the given the storage type. Can be empty if not applicable.    MinimumIops - Minimum amount of IOPS that is available for the given the storage type. Can be empty if not applicable.    MaximumThroughput - Maximum amount of throughput that is available for the given the storage type. Can be empty if not applicable.    MinimumThroughput - Minimum amount of throughput that is available for the given the storage type. Can be empty if not applicable.  
    */
  var LimitName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.LimitName] = js.undefined
  
  /**
    * The limit values.
    */
  var LimitValues: js.UndefOr[LimitValueList] = js.undefined
}
object StorageTypeLimit {
  
  inline def apply(): StorageTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageTypeLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageTypeLimit] (val x: Self) extends AnyVal {
    
    inline def setLimitName(value: LimitName): Self = StObject.set(x, "LimitName", value.asInstanceOf[js.Any])
    
    inline def setLimitNameUndefined: Self = StObject.set(x, "LimitName", js.undefined)
    
    inline def setLimitValues(value: LimitValueList): Self = StObject.set(x, "LimitValues", value.asInstanceOf[js.Any])
    
    inline def setLimitValuesUndefined: Self = StObject.set(x, "LimitValues", js.undefined)
    
    inline def setLimitValuesVarargs(value: LimitValue*): Self = StObject.set(x, "LimitValues", js.Array(value*))
  }
}
