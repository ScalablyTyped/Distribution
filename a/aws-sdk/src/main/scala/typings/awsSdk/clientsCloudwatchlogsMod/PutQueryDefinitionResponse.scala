package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutQueryDefinitionResponse extends StObject {
  
  /**
    * The ID of the query definition.
    */
  var queryDefinitionId: js.UndefOr[QueryId] = js.undefined
}
object PutQueryDefinitionResponse {
  
  inline def apply(): PutQueryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutQueryDefinitionResponse]
  }
  
  extension [Self <: PutQueryDefinitionResponse](x: Self) {
    
    inline def setQueryDefinitionId(value: QueryId): Self = StObject.set(x, "queryDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setQueryDefinitionIdUndefined: Self = StObject.set(x, "queryDefinitionId", js.undefined)
  }
}
