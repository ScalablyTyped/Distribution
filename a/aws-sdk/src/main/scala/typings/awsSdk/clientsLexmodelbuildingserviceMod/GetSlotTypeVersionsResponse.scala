package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSlotTypeVersionsResponse extends StObject {
  
  /**
    * A pagination token for fetching the next page of slot type versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of SlotTypeMetadata objects, one for each numbered version of the slot type plus one for the $LATEST version.
    */
  var slotTypes: js.UndefOr[SlotTypeMetadataList] = js.undefined
}
object GetSlotTypeVersionsResponse {
  
  inline def apply(): GetSlotTypeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSlotTypeVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSlotTypeVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSlotTypes(value: SlotTypeMetadataList): Self = StObject.set(x, "slotTypes", value.asInstanceOf[js.Any])
    
    inline def setSlotTypesUndefined: Self = StObject.set(x, "slotTypes", js.undefined)
    
    inline def setSlotTypesVarargs(value: SlotTypeMetadata*): Self = StObject.set(x, "slotTypes", js.Array(value*))
  }
}
