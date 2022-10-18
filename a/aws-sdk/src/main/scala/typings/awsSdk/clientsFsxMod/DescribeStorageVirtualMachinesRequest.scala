package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorageVirtualMachinesRequest extends StObject {
  
  /**
    * Enter a filter name:value pair to view a select set of SVMs.
    */
  var Filters: js.UndefOr[StorageVirtualMachineFilters] = js.undefined
  
  var MaxResults: js.UndefOr[typings.awsSdk.clientsFsxMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsFsxMod.NextToken] = js.undefined
  
  /**
    * Enter the ID of one or more SVMs that you want to view.
    */
  var StorageVirtualMachineIds: js.UndefOr[typings.awsSdk.clientsFsxMod.StorageVirtualMachineIds] = js.undefined
}
object DescribeStorageVirtualMachinesRequest {
  
  inline def apply(): DescribeStorageVirtualMachinesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStorageVirtualMachinesRequest]
  }
  
  extension [Self <: DescribeStorageVirtualMachinesRequest](x: Self) {
    
    inline def setFilters(value: StorageVirtualMachineFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: StorageVirtualMachineFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStorageVirtualMachineIds(value: StorageVirtualMachineIds): Self = StObject.set(x, "StorageVirtualMachineIds", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachineIdsUndefined: Self = StObject.set(x, "StorageVirtualMachineIds", js.undefined)
    
    inline def setStorageVirtualMachineIdsVarargs(value: StorageVirtualMachineId*): Self = StObject.set(x, "StorageVirtualMachineIds", js.Array(value*))
  }
}
