package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSnapshotsRequest extends StObject {
  
  /**
    * The timestamp showing when the snapshot creation finished.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to display the next page of results.
    */
  var maxResults: js.UndefOr[ListSnapshotsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the namespace from which to list all snapshots.
    */
  var namespaceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace from which to list all snapshots.
    */
  var namespaceName: js.UndefOr[String] = js.undefined
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The owner Amazon Web Services account of the snapshot.
    */
  var ownerAccount: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the creation of the snapshot was initiated.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
}
object ListSnapshotsRequest {
  
  inline def apply(): ListSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSnapshotsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMaxResults(value: ListSnapshotsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNamespaceArn(value: String): Self = StObject.set(x, "namespaceArn", value.asInstanceOf[js.Any])
    
    inline def setNamespaceArnUndefined: Self = StObject.set(x, "namespaceArn", js.undefined)
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOwnerAccount(value: String): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
