package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIndexResponse extends StObject {
  
  /**
    * The unique identifier of the index. Use this identifier when you query an index, set up a data source, or index a document.
    */
  var Id: js.UndefOr[IndexId] = js.undefined
}
object CreateIndexResponse {
  
  inline def apply(): CreateIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexResponse]
  }
  
  extension [Self <: CreateIndexResponse](x: Self) {
    
    inline def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
