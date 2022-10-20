package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsRequest extends StObject {
  
  /**
    *  The ARN of the destination event data store. 
    */
  var Destination: js.UndefOr[EventDataStoreArn] = js.undefined
  
  /**
    *  The status of the import. 
    */
  var ImportStatus: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ImportStatus] = js.undefined
  
  /**
    *  The maximum number of imports to display on a single page. 
    */
  var MaxResults: js.UndefOr[ListImportsMaxResultsCount] = js.undefined
  
  /**
    *  A token you can use to get the next page of import results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImportsRequest {
  
  inline def apply(): ListImportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsRequest]
  }
  
  extension [Self <: ListImportsRequest](x: Self) {
    
    inline def setDestination(value: EventDataStoreArn): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
    
    inline def setMaxResults(value: ListImportsMaxResultsCount): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
