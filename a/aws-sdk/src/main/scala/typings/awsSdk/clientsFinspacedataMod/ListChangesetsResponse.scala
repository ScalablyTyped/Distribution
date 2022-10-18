package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChangesetsResponse extends StObject {
  
  /**
    * List of Changesets found.
    */
  var changesets: js.UndefOr[ChangesetList] = js.undefined
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListChangesetsResponse {
  
  inline def apply(): ListChangesetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChangesetsResponse]
  }
  
  extension [Self <: ListChangesetsResponse](x: Self) {
    
    inline def setChangesets(value: ChangesetList): Self = StObject.set(x, "changesets", value.asInstanceOf[js.Any])
    
    inline def setChangesetsUndefined: Self = StObject.set(x, "changesets", js.undefined)
    
    inline def setChangesetsVarargs(value: ChangesetSummary*): Self = StObject.set(x, "changesets", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
