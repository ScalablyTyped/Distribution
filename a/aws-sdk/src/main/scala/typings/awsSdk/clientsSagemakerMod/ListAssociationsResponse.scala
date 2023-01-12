package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociationsResponse extends StObject {
  
  /**
    * A list of associations and their properties.
    */
  var AssociationSummaries: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AssociationSummaries] = js.undefined
  
  /**
    * A token for getting the next set of associations, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListAssociationsResponse {
  
  inline def apply(): ListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setAssociationSummaries(value: AssociationSummaries): Self = StObject.set(x, "AssociationSummaries", value.asInstanceOf[js.Any])
    
    inline def setAssociationSummariesUndefined: Self = StObject.set(x, "AssociationSummaries", js.undefined)
    
    inline def setAssociationSummariesVarargs(value: AssociationSummary*): Self = StObject.set(x, "AssociationSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
