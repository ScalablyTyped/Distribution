package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNamedQueryInput extends StObject {
  
  /**
    * The unique ID of the query. Use ListNamedQueries to get query IDs.
    */
  var NamedQueryId: typings.awsSdk.clientsAthenaMod.NamedQueryId
}
object GetNamedQueryInput {
  
  inline def apply(NamedQueryId: NamedQueryId): GetNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryId = NamedQueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamedQueryInput]
  }
  
  extension [Self <: GetNamedQueryInput](x: Self) {
    
    inline def setNamedQueryId(value: NamedQueryId): Self = StObject.set(x, "NamedQueryId", value.asInstanceOf[js.Any])
  }
}
