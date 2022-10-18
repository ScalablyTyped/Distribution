package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociationsRequest extends StObject {
  
  /**
    * A filter that returns only associations of the specified type.
    */
  var AssociationType: js.UndefOr[AssociationEdgeType] = js.undefined
  
  /**
    * A filter that returns only associations created on or after the specified time.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only associations created on or before the specified time.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only associations with the specified destination Amazon Resource Name (ARN).
    */
  var DestinationArn: js.UndefOr[AssociationEntityArn] = js.undefined
  
  /**
    * A filter that returns only associations with the specified destination type.
    */
  var DestinationType: js.UndefOr[String256] = js.undefined
  
  /**
    * The maximum number of associations to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * If the previous call to ListAssociations didn't return the full set of associations, the call returns a token for getting the next set of associations.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[SortAssociationsBy] = js.undefined
  
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
  
  /**
    * A filter that returns only associations with the specified source ARN.
    */
  var SourceArn: js.UndefOr[AssociationEntityArn] = js.undefined
  
  /**
    * A filter that returns only associations with the specified source type.
    */
  var SourceType: js.UndefOr[String256] = js.undefined
}
object ListAssociationsRequest {
  
  inline def apply(): ListAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociationsRequest]
  }
  
  extension [Self <: ListAssociationsRequest](x: Self) {
    
    inline def setAssociationType(value: AssociationEdgeType): Self = StObject.set(x, "AssociationType", value.asInstanceOf[js.Any])
    
    inline def setAssociationTypeUndefined: Self = StObject.set(x, "AssociationType", js.undefined)
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setDestinationArn(value: AssociationEntityArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setDestinationType(value: String256): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "DestinationType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: SortAssociationsBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setSourceArn(value: AssociationEntityArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setSourceType(value: String256): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
