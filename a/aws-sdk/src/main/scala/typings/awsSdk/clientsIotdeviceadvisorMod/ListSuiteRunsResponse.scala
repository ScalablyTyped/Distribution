package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSuiteRunsResponse extends StObject {
  
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * An array of objects that provide summaries of information about the suite runs in the list.
    */
  var suiteRunsList: js.UndefOr[SuiteRunsList] = js.undefined
}
object ListSuiteRunsResponse {
  
  inline def apply(): ListSuiteRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSuiteRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSuiteRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSuiteRunsList(value: SuiteRunsList): Self = StObject.set(x, "suiteRunsList", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunsListUndefined: Self = StObject.set(x, "suiteRunsList", js.undefined)
    
    inline def setSuiteRunsListVarargs(value: SuiteRunInformation*): Self = StObject.set(x, "suiteRunsList", js.Array(value*))
  }
}
