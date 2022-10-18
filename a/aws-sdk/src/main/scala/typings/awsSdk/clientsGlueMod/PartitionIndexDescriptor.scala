package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionIndexDescriptor extends StObject {
  
  /**
    * A list of errors that can occur when registering partition indexes for an existing table.
    */
  var BackfillErrors: js.UndefOr[typings.awsSdk.clientsGlueMod.BackfillErrors] = js.undefined
  
  /**
    * The name of the partition index.
    */
  var IndexName: NameString
  
  /**
    * The status of the partition index.  The possible statuses are:   CREATING: The index is being created. When an index is in a CREATING state, the index or its table cannot be deleted.   ACTIVE: The index creation succeeds.   FAILED: The index creation fails.    DELETING: The index is deleted from the list of indexes.  
    */
  var IndexStatus: PartitionIndexStatus
  
  /**
    * A list of one or more keys, as KeySchemaElement structures, for the partition index.
    */
  var Keys: KeySchemaElementList
}
object PartitionIndexDescriptor {
  
  inline def apply(IndexName: NameString, IndexStatus: PartitionIndexStatus, Keys: KeySchemaElementList): PartitionIndexDescriptor = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], IndexStatus = IndexStatus.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionIndexDescriptor]
  }
  
  extension [Self <: PartitionIndexDescriptor](x: Self) {
    
    inline def setBackfillErrors(value: BackfillErrors): Self = StObject.set(x, "BackfillErrors", value.asInstanceOf[js.Any])
    
    inline def setBackfillErrorsUndefined: Self = StObject.set(x, "BackfillErrors", js.undefined)
    
    inline def setBackfillErrorsVarargs(value: BackfillError*): Self = StObject.set(x, "BackfillErrors", js.Array(value*))
    
    inline def setIndexName(value: NameString): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexStatus(value: PartitionIndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: KeySchemaElementList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: KeySchemaElement*): Self = StObject.set(x, "Keys", js.Array(value*))
  }
}
