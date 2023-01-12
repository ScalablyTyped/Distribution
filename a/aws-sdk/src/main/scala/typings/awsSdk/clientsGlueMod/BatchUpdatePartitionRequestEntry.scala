package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdatePartitionRequestEntry extends StObject {
  
  /**
    * The structure used to update a partition.
    */
  var PartitionInput: typings.awsSdk.clientsGlueMod.PartitionInput
  
  /**
    * A list of values defining the partitions.
    */
  var PartitionValueList: BoundedPartitionValueList
}
object BatchUpdatePartitionRequestEntry {
  
  inline def apply(PartitionInput: PartitionInput, PartitionValueList: BoundedPartitionValueList): BatchUpdatePartitionRequestEntry = {
    val __obj = js.Dynamic.literal(PartitionInput = PartitionInput.asInstanceOf[js.Any], PartitionValueList = PartitionValueList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePartitionRequestEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdatePartitionRequestEntry] (val x: Self) extends AnyVal {
    
    inline def setPartitionInput(value: PartitionInput): Self = StObject.set(x, "PartitionInput", value.asInstanceOf[js.Any])
    
    inline def setPartitionValueList(value: BoundedPartitionValueList): Self = StObject.set(x, "PartitionValueList", value.asInstanceOf[js.Any])
    
    inline def setPartitionValueListVarargs(value: ValueString*): Self = StObject.set(x, "PartitionValueList", js.Array(value*))
  }
}
