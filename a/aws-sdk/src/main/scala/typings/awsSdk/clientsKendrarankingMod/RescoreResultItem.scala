package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RescoreResultItem extends StObject {
  
  /**
    * The identifier of the document from the search service.
    */
  var DocumentId: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.DocumentId] = js.undefined
  
  /**
    * The relevancy score or rank that Amazon Kendra Intelligent Ranking gives to the result.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object RescoreResultItem {
  
  inline def apply(): RescoreResultItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RescoreResultItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RescoreResultItem] (val x: Self) extends AnyVal {
    
    inline def setDocumentId(value: DocumentId): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "DocumentId", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
