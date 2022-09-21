package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined auth0.auth0.ObjectWithId & {  connection_id :string} */
trait ObjectWithIdconnectionids extends StObject {
  
  var connection_id: String
  
  var id: String
}
object ObjectWithIdconnectionids {
  
  inline def apply(connection_id: String, id: String): ObjectWithIdconnectionids = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithIdconnectionids]
  }
  
  extension [Self <: ObjectWithIdconnectionids](x: Self) {
    
    inline def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
