package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner connection that you want to delete.
    */
  var ConnectionArn: AppRunnerResourceArn
}
object DeleteConnectionRequest {
  
  inline def apply(ConnectionArn: AppRunnerResourceArn): DeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
  }
}
