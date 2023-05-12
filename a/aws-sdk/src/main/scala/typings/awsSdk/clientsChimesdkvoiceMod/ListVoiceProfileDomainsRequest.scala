package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVoiceProfileDomainsRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  
  /**
    * The token used to return the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListVoiceProfileDomainsRequest {
  
  inline def apply(): ListVoiceProfileDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceProfileDomainsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVoiceProfileDomainsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ResultMax): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
