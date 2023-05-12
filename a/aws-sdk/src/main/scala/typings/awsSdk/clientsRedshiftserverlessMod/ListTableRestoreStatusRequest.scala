package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTableRestoreStatusRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to display the next page of results.
    */
  var maxResults: js.UndefOr[ListTableRestoreStatusRequestMaxResultsInteger] = js.undefined
  
  /**
    * The namespace from which to list all of the statuses of RestoreTableFromSnapshot operations .
    */
  var namespaceName: js.UndefOr[String] = js.undefined
  
  /**
    * If your initial ListTableRestoreStatus operation returns a nextToken, you can include the returned nextToken in following ListTableRestoreStatus operations. This will return results on the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The workgroup from which to list all of the statuses of RestoreTableFromSnapshot operations.
    */
  var workgroupName: js.UndefOr[String] = js.undefined
}
object ListTableRestoreStatusRequest {
  
  inline def apply(): ListTableRestoreStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTableRestoreStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTableRestoreStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListTableRestoreStatusRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkgroupName(value: String): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupNameUndefined: Self = StObject.set(x, "workgroupName", js.undefined)
  }
}
