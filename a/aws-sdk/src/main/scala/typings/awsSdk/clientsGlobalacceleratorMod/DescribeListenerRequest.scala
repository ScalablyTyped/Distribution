package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeListenerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener to describe.
    */
  var ListenerArn: GenericString
}
object DescribeListenerRequest {
  
  inline def apply(ListenerArn: GenericString): DescribeListenerRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeListenerRequest]
  }
  
  extension [Self <: DescribeListenerRequest](x: Self) {
    
    inline def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
  }
}
