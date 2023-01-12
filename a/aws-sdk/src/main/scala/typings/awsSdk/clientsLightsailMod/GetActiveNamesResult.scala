package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActiveNamesResult extends StObject {
  
  /**
    * The list of active names returned by the get active names request.
    */
  var activeNames: js.UndefOr[StringList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetActiveNames request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetActiveNamesResult {
  
  inline def apply(): GetActiveNamesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetActiveNamesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetActiveNamesResult] (val x: Self) extends AnyVal {
    
    inline def setActiveNames(value: StringList): Self = StObject.set(x, "activeNames", value.asInstanceOf[js.Any])
    
    inline def setActiveNamesUndefined: Self = StObject.set(x, "activeNames", js.undefined)
    
    inline def setActiveNamesVarargs(value: String*): Self = StObject.set(x, "activeNames", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
