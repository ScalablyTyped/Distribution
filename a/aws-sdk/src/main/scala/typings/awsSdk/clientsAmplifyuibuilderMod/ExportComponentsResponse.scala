package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportComponentsResponse extends StObject {
  
  /**
    * Represents the configuration of the exported components.
    */
  var entities: ComponentList
  
  /**
    * The pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ExportComponentsResponse {
  
  inline def apply(entities: ComponentList): ExportComponentsResponse = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportComponentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportComponentsResponse] (val x: Self) extends AnyVal {
    
    inline def setEntities(value: ComponentList): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Component*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
