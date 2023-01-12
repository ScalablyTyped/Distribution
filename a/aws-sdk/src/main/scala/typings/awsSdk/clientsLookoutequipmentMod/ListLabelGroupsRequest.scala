package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLabelGroupsRequest extends StObject {
  
  /**
    *  The beginning of the name of the label groups to be listed. 
    */
  var LabelGroupNameBeginsWith: js.UndefOr[LabelGroupName] = js.undefined
  
  /**
    *  Specifies the maximum number of label groups to list. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.MaxResults] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of label groups. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListLabelGroupsRequest {
  
  inline def apply(): ListLabelGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLabelGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLabelGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setLabelGroupNameBeginsWith(value: LabelGroupName): Self = StObject.set(x, "LabelGroupNameBeginsWith", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupNameBeginsWithUndefined: Self = StObject.set(x, "LabelGroupNameBeginsWith", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
