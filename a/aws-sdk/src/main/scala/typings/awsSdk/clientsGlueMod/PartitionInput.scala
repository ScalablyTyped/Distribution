package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionInput extends StObject {
  
  /**
    * The last time at which the partition was accessed.
    */
  var LastAccessTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time at which column statistics were computed for this partition.
    */
  var LastAnalyzedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * These key-value pairs define partition parameters.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * Provides information about the physical location where the partition is stored.
    */
  var StorageDescriptor: js.UndefOr[typings.awsSdk.clientsGlueMod.StorageDescriptor] = js.undefined
  
  /**
    * The values of the partition. Although this parameter is not required by the SDK, you must specify this parameter for a valid input. The values for the keys for the new partition must be passed as an array of String objects that must be ordered in the same order as the partition keys appearing in the Amazon S3 prefix. Otherwise Glue will add the values to the wrong keys.
    */
  var Values: js.UndefOr[ValueStringList] = js.undefined
}
object PartitionInput {
  
  inline def apply(): PartitionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionInput]
  }
  
  extension [Self <: PartitionInput](x: Self) {
    
    inline def setLastAccessTime(value: js.Date): Self = StObject.set(x, "LastAccessTime", value.asInstanceOf[js.Any])
    
    inline def setLastAccessTimeUndefined: Self = StObject.set(x, "LastAccessTime", js.undefined)
    
    inline def setLastAnalyzedTime(value: js.Date): Self = StObject.set(x, "LastAnalyzedTime", value.asInstanceOf[js.Any])
    
    inline def setLastAnalyzedTimeUndefined: Self = StObject.set(x, "LastAnalyzedTime", js.undefined)
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setStorageDescriptor(value: StorageDescriptor): Self = StObject.set(x, "StorageDescriptor", value.asInstanceOf[js.Any])
    
    inline def setStorageDescriptorUndefined: Self = StObject.set(x, "StorageDescriptor", js.undefined)
    
    inline def setValues(value: ValueStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: ValueString*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
