package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteListenerInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsSdk.clientsElbv2Mod.ListenerArn
}
object DeleteListenerInput {
  
  inline def apply(ListenerArn: ListenerArn): DeleteListenerInput = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteListenerInput]
  }
  
  extension [Self <: DeleteListenerInput](x: Self) {
    
    inline def setListenerArn(value: ListenerArn): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
  }
}
