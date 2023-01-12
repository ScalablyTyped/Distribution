package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportThemesResponse extends StObject {
  
  /**
    * Represents the configuration of the exported themes.
    */
  var entities: ThemeList
  
  /**
    * The pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ExportThemesResponse {
  
  inline def apply(entities: ThemeList): ExportThemesResponse = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportThemesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportThemesResponse] (val x: Self) extends AnyVal {
    
    inline def setEntities(value: ThemeList): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Theme*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
