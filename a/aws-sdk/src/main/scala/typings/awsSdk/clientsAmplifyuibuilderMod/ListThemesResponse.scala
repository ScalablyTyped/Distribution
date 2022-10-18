package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThemesResponse extends StObject {
  
  /**
    * The list of themes for the Amplify app.
    */
  var entities: ThemeSummaryList
  
  /**
    * The pagination token that's returned if more results are available.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListThemesResponse {
  
  inline def apply(entities: ThemeSummaryList): ListThemesResponse = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThemesResponse]
  }
  
  extension [Self <: ListThemesResponse](x: Self) {
    
    inline def setEntities(value: ThemeSummaryList): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: ThemeSummary*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
