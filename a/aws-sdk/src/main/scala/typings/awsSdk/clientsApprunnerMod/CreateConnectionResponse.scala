package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionResponse extends StObject {
  
  /**
    * A description of the App Runner connection that's created by this request.
    */
  var Connection: typings.awsSdk.clientsApprunnerMod.Connection
}
object CreateConnectionResponse {
  
  inline def apply(Connection: Connection): CreateConnectionResponse = {
    val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionResponse]
  }
  
  extension [Self <: CreateConnectionResponse](x: Self) {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
  }
}
