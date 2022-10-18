package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationDependenciesResponse extends StObject {
  
  /**
    * An array of application summaries nested in the application.
    */
  var Dependencies: js.UndefOr[listOfApplicationDependencySummary] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListApplicationDependenciesResponse {
  
  inline def apply(): ListApplicationDependenciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationDependenciesResponse]
  }
  
  extension [Self <: ListApplicationDependenciesResponse](x: Self) {
    
    inline def setDependencies(value: listOfApplicationDependencySummary): Self = StObject.set(x, "Dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "Dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: ApplicationDependencySummary*): Self = StObject.set(x, "Dependencies", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
