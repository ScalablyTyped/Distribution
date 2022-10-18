package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLabelsResponse extends StObject {
  
  /**
    *  A summary of the items in the label group. 
    */
  var LabelSummaries: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelSummaries] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of datasets. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListLabelsResponse {
  
  inline def apply(): ListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLabelsResponse]
  }
  
  extension [Self <: ListLabelsResponse](x: Self) {
    
    inline def setLabelSummaries(value: LabelSummaries): Self = StObject.set(x, "LabelSummaries", value.asInstanceOf[js.Any])
    
    inline def setLabelSummariesUndefined: Self = StObject.set(x, "LabelSummaries", js.undefined)
    
    inline def setLabelSummariesVarargs(value: LabelSummary*): Self = StObject.set(x, "LabelSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
