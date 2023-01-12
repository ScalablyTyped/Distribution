package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the connection to be deleted.  The ARN is never reused if the connection is deleted. 
    */
  var ConnectionArn: typings.awsSdk.clientsCodestarconnectionsMod.ConnectionArn
}
object DeleteConnectionInput {
  
  inline def apply(ConnectionArn: ConnectionArn): DeleteConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConnectionInput] (val x: Self) extends AnyVal {
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
  }
}
