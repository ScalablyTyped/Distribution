package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStartRecommendationsRequest extends StObject {
  
  /**
    * Provides information about source databases to analyze. After this analysis, Fleet Advisor recommends target engines for each source database.
    */
  var Data: js.UndefOr[StartRecommendationsRequestEntryList] = js.undefined
}
object BatchStartRecommendationsRequest {
  
  inline def apply(): BatchStartRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStartRecommendationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchStartRecommendationsRequest] (val x: Self) extends AnyVal {
    
    inline def setData(value: StartRecommendationsRequestEntryList): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setDataVarargs(value: StartRecommendationsRequestEntry*): Self = StObject.set(x, "Data", js.Array(value*))
  }
}
