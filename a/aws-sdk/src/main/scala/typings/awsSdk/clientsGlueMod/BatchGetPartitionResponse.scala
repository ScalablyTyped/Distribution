package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetPartitionResponse extends StObject {
  
  /**
    * A list of the requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.undefined
  
  /**
    * A list of the partition values in the request for which partitions were not returned.
    */
  var UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList] = js.undefined
}
object BatchGetPartitionResponse {
  
  inline def apply(): BatchGetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetPartitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetPartitionResponse] (val x: Self) extends AnyVal {
    
    inline def setPartitions(value: PartitionList): Self = StObject.set(x, "Partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "Partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: Partition*): Self = StObject.set(x, "Partitions", js.Array(value*))
    
    inline def setUnprocessedKeys(value: BatchGetPartitionValueList): Self = StObject.set(x, "UnprocessedKeys", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedKeysUndefined: Self = StObject.set(x, "UnprocessedKeys", js.undefined)
    
    inline def setUnprocessedKeysVarargs(value: PartitionValueList*): Self = StObject.set(x, "UnprocessedKeys", js.Array(value*))
  }
}
