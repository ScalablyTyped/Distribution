package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStartRecommendationsResponse extends StObject {
  
  /**
    * A list with error details about the analysis of each source database.
    */
  var ErrorEntries: js.UndefOr[BatchStartRecommendationsErrorEntryList] = js.undefined
}
object BatchStartRecommendationsResponse {
  
  inline def apply(): BatchStartRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStartRecommendationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchStartRecommendationsResponse] (val x: Self) extends AnyVal {
    
    inline def setErrorEntries(value: BatchStartRecommendationsErrorEntryList): Self = StObject.set(x, "ErrorEntries", value.asInstanceOf[js.Any])
    
    inline def setErrorEntriesUndefined: Self = StObject.set(x, "ErrorEntries", js.undefined)
    
    inline def setErrorEntriesVarargs(value: BatchStartRecommendationsErrorEntry*): Self = StObject.set(x, "ErrorEntries", js.Array(value*))
  }
}
