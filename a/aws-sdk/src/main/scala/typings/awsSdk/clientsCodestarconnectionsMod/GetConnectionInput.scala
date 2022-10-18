package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a connection.
    */
  var ConnectionArn: typings.awsSdk.clientsCodestarconnectionsMod.ConnectionArn
}
object GetConnectionInput {
  
  inline def apply(ConnectionArn: ConnectionArn): GetConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionInput]
  }
  
  extension [Self <: GetConnectionInput](x: Self) {
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
  }
}
