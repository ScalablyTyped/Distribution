package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClusterSnapshotsInput extends StObject {
  
  /**
    * The arn of the Elastic DocumentDB cluster.
    */
  var clusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of entries to recieve in the response.
    */
  var maxResults: js.UndefOr[ListClusterSnapshotsInputMaxResultsInteger] = js.undefined
  
  /**
    * The nextToken which is used the get the next page of data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListClusterSnapshotsInput {
  
  inline def apply(): ListClusterSnapshotsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClusterSnapshotsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClusterSnapshotsInput] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "clusterArn", js.undefined)
    
    inline def setMaxResults(value: ListClusterSnapshotsInputMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
