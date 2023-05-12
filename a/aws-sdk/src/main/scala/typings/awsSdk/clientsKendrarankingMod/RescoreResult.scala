package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RescoreResult extends StObject {
  
  /**
    * The identifier associated with the scores that Amazon Kendra Intelligent Ranking gives to the results. Amazon Kendra Intelligent Ranking rescores or re-ranks the results for the search service.
    */
  var RescoreId: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.RescoreId] = js.undefined
  
  /**
    * A list of result items for documents with new relevancy scores. The results are in descending order.
    */
  var ResultItems: js.UndefOr[RescoreResultItemList] = js.undefined
}
object RescoreResult {
  
  inline def apply(): RescoreResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RescoreResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RescoreResult] (val x: Self) extends AnyVal {
    
    inline def setRescoreId(value: RescoreId): Self = StObject.set(x, "RescoreId", value.asInstanceOf[js.Any])
    
    inline def setRescoreIdUndefined: Self = StObject.set(x, "RescoreId", js.undefined)
    
    inline def setResultItems(value: RescoreResultItemList): Self = StObject.set(x, "ResultItems", value.asInstanceOf[js.Any])
    
    inline def setResultItemsUndefined: Self = StObject.set(x, "ResultItems", js.undefined)
    
    inline def setResultItemsVarargs(value: RescoreResultItem*): Self = StObject.set(x, "ResultItems", js.Array(value*))
  }
}
