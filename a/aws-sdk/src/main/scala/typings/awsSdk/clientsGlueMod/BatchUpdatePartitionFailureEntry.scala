package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdatePartitionFailureEntry extends StObject {
  
  /**
    * The details about the batch update partition error.
    */
  var ErrorDetail: js.UndefOr[typings.awsSdk.clientsGlueMod.ErrorDetail] = js.undefined
  
  /**
    * A list of values defining the partitions.
    */
  var PartitionValueList: js.UndefOr[BoundedPartitionValueList] = js.undefined
}
object BatchUpdatePartitionFailureEntry {
  
  inline def apply(): BatchUpdatePartitionFailureEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePartitionFailureEntry]
  }
  
  extension [Self <: BatchUpdatePartitionFailureEntry](x: Self) {
    
    inline def setErrorDetail(value: ErrorDetail): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    inline def setPartitionValueList(value: BoundedPartitionValueList): Self = StObject.set(x, "PartitionValueList", value.asInstanceOf[js.Any])
    
    inline def setPartitionValueListUndefined: Self = StObject.set(x, "PartitionValueList", js.undefined)
    
    inline def setPartitionValueListVarargs(value: ValueString*): Self = StObject.set(x, "PartitionValueList", js.Array(value*))
  }
}
