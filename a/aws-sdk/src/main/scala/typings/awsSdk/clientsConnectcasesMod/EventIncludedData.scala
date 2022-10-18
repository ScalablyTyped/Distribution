package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventIncludedData extends StObject {
  
  /**
    * Details of what case data is published through the case event stream.
    */
  var caseData: js.UndefOr[CaseEventIncludedData] = js.undefined
  
  /**
    * Details of what related item data is published through the case event stream.
    */
  var relatedItemData: js.UndefOr[RelatedItemEventIncludedData] = js.undefined
}
object EventIncludedData {
  
  inline def apply(): EventIncludedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventIncludedData]
  }
  
  extension [Self <: EventIncludedData](x: Self) {
    
    inline def setCaseData(value: CaseEventIncludedData): Self = StObject.set(x, "caseData", value.asInstanceOf[js.Any])
    
    inline def setCaseDataUndefined: Self = StObject.set(x, "caseData", js.undefined)
    
    inline def setRelatedItemData(value: RelatedItemEventIncludedData): Self = StObject.set(x, "relatedItemData", value.asInstanceOf[js.Any])
    
    inline def setRelatedItemDataUndefined: Self = StObject.set(x, "relatedItemData", js.undefined)
  }
}
