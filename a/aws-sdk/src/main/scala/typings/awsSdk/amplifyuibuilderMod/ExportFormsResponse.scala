package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportFormsResponse extends StObject {
  
  /**
    * Represents the configuration of the exported forms.
    */
  var entities: FormList
  
  /**
    * The pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ExportFormsResponse {
  
  inline def apply(entities: FormList): ExportFormsResponse = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportFormsResponse]
  }
  
  extension [Self <: ExportFormsResponse](x: Self) {
    
    inline def setEntities(value: FormList): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Form*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
