package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSuiteRunsRequest extends StObject {
  
  /**
    * The maximum number of results to return at once.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Lists the test suite runs of the specified test suite based on suite definition ID.
    */
  var suiteDefinitionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Must be passed along with suiteDefinitionId. Lists the test suite runs of the specified test suite based on suite definition version.
    */
  var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
}
object ListSuiteRunsRequest {
  
  inline def apply(): ListSuiteRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSuiteRunsRequest]
  }
  
  extension [Self <: ListSuiteRunsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionIdUndefined: Self = StObject.set(x, "suiteDefinitionId", js.undefined)
    
    inline def setSuiteDefinitionVersion(value: SuiteDefinitionVersion): Self = StObject.set(x, "suiteDefinitionVersion", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionVersionUndefined: Self = StObject.set(x, "suiteDefinitionVersion", js.undefined)
  }
}
