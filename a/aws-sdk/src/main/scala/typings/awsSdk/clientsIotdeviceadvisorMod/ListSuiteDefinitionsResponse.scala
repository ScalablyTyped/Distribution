package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSuiteDefinitionsResponse extends StObject {
  
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * An array of objects that provide summaries of information about the suite definitions in the list.
    */
  var suiteDefinitionInformationList: js.UndefOr[SuiteDefinitionInformationList] = js.undefined
}
object ListSuiteDefinitionsResponse {
  
  inline def apply(): ListSuiteDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSuiteDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSuiteDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSuiteDefinitionInformationList(value: SuiteDefinitionInformationList): Self = StObject.set(x, "suiteDefinitionInformationList", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionInformationListUndefined: Self = StObject.set(x, "suiteDefinitionInformationList", js.undefined)
    
    inline def setSuiteDefinitionInformationListVarargs(value: SuiteDefinitionInformation*): Self = StObject.set(x, "suiteDefinitionInformationList", js.Array(value*))
  }
}
