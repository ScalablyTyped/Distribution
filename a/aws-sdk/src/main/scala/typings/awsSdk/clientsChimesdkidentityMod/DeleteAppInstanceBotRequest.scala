package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppInstanceBotRequest extends StObject {
  
  /**
    * The ARN of the AppInstanceBot being deleted.
    */
  var AppInstanceBotArn: ChimeArn
}
object DeleteAppInstanceBotRequest {
  
  inline def apply(AppInstanceBotArn: ChimeArn): DeleteAppInstanceBotRequest = {
    val __obj = js.Dynamic.literal(AppInstanceBotArn = AppInstanceBotArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppInstanceBotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppInstanceBotRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceBotArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceBotArn", value.asInstanceOf[js.Any])
  }
}
