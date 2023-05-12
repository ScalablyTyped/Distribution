package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollaborationsOutput extends StObject {
  
  /**
    * The list of collaborations.
    */
  var collaborationList: CollaborationSummaryList
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListCollaborationsOutput {
  
  inline def apply(collaborationList: CollaborationSummaryList): ListCollaborationsOutput = {
    val __obj = js.Dynamic.literal(collaborationList = collaborationList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCollaborationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCollaborationsOutput] (val x: Self) extends AnyVal {
    
    inline def setCollaborationList(value: CollaborationSummaryList): Self = StObject.set(x, "collaborationList", value.asInstanceOf[js.Any])
    
    inline def setCollaborationListVarargs(value: CollaborationSummary*): Self = StObject.set(x, "collaborationList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
