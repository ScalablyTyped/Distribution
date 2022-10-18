package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageTypeLimit extends StObject {
  
  /**
    *  Name of storage limits that are applicable for given storage type. If  StorageType  is ebs, following storage options are applicable  MinimumVolumeSize Minimum amount of volume size that is applicable for given storage type.It can be empty if it is not applicable. MaximumVolumeSize Maximum amount of volume size that is applicable for given storage type.It can be empty if it is not applicable. MaximumIops Maximum amount of Iops that is applicable for given storage type.It can be empty if it is not applicable. MinimumIops Minimum amount of Iops that is applicable for given storage type.It can be empty if it is not applicable. MaximumThroughput Maximum amount of Throughput that is applicable for given storage type.It can be empty if it is not applicable. MinimumThroughput Minimum amount of Throughput that is applicable for given storage type.It can be empty if it is not applicable.  
    */
  var LimitName: js.UndefOr[typings.awsSdk.clientsEsMod.LimitName] = js.undefined
  
  /**
    *  Values for the  StorageTypeLimit$LimitName  . 
    */
  var LimitValues: js.UndefOr[LimitValueList] = js.undefined
}
object StorageTypeLimit {
  
  inline def apply(): StorageTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageTypeLimit]
  }
  
  extension [Self <: StorageTypeLimit](x: Self) {
    
    inline def setLimitName(value: LimitName): Self = StObject.set(x, "LimitName", value.asInstanceOf[js.Any])
    
    inline def setLimitNameUndefined: Self = StObject.set(x, "LimitName", js.undefined)
    
    inline def setLimitValues(value: LimitValueList): Self = StObject.set(x, "LimitValues", value.asInstanceOf[js.Any])
    
    inline def setLimitValuesUndefined: Self = StObject.set(x, "LimitValues", js.undefined)
    
    inline def setLimitValuesVarargs(value: LimitValue*): Self = StObject.set(x, "LimitValues", js.Array(value*))
  }
}
