package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentsResponse extends StObject {
  
  /**
    * The list of components for the Amplify app.
    */
  var entities: ComponentSummaryList
  
  /**
    * The pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListComponentsResponse {
  
  inline def apply(entities: ComponentSummaryList): ListComponentsResponse = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentsResponse]
  }
  
  extension [Self <: ListComponentsResponse](x: Self) {
    
    inline def setEntities(value: ComponentSummaryList): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: ComponentSummary*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
