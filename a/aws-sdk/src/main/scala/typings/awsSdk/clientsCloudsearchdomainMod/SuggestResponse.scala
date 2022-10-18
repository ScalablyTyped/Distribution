package typings.awsSdk.clientsCloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestResponse extends StObject {
  
  /**
    * The status of a SuggestRequest. Contains the resource ID (rid) and how long it took to process the request (timems).
    */
  var status: js.UndefOr[SuggestStatus] = js.undefined
  
  /**
    * Container for the matching search suggestion information.
    */
  var suggest: js.UndefOr[SuggestModel] = js.undefined
}
object SuggestResponse {
  
  inline def apply(): SuggestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestResponse]
  }
  
  extension [Self <: SuggestResponse](x: Self) {
    
    inline def setStatus(value: SuggestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuggest(value: SuggestModel): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
  }
}
