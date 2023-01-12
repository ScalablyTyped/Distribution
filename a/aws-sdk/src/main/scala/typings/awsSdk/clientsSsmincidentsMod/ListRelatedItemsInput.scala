package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRelatedItemsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the incident record containing the listed related items.
    */
  var incidentRecordArn: Arn
  
  /**
    * The maximum number of related items per page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListRelatedItemsInput {
  
  inline def apply(incidentRecordArn: Arn): ListRelatedItemsInput = {
    val __obj = js.Dynamic.literal(incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRelatedItemsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRelatedItemsInput] (val x: Self) extends AnyVal {
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
