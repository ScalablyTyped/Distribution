package typings.awsSdk.backupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectsInput extends StObject {
  
  /**
    * (Optional) Created after filter
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * (Optional) Created before filter
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Maximum objects count
    */
  var MaxResults: js.UndefOr[typings.awsSdk.backupstorageMod.MaxResults] = js.undefined
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Optional, specifies the starting Object name to list from. Ignored if NextToken is not NULL
    */
  var StartingObjectName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional, specifies the starting Object prefix to list from. Ignored if NextToken is not NULL
    */
  var StartingObjectPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Storage job id
    */
  var StorageJobId: String
}
object ListObjectsInput {
  
  inline def apply(StorageJobId: String): ListObjectsInput = {
    val __obj = js.Dynamic.literal(StorageJobId = StorageJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsInput]
  }
  
  extension [Self <: ListObjectsInput](x: Self) {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartingObjectName(value: String): Self = StObject.set(x, "StartingObjectName", value.asInstanceOf[js.Any])
    
    inline def setStartingObjectNameUndefined: Self = StObject.set(x, "StartingObjectName", js.undefined)
    
    inline def setStartingObjectPrefix(value: String): Self = StObject.set(x, "StartingObjectPrefix", value.asInstanceOf[js.Any])
    
    inline def setStartingObjectPrefixUndefined: Self = StObject.set(x, "StartingObjectPrefix", js.undefined)
    
    inline def setStorageJobId(value: String): Self = StObject.set(x, "StorageJobId", value.asInstanceOf[js.Any])
  }
}
