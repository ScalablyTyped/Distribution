package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBridgeRequest extends StObject {
  
  /**
    * The ARN of the bridge that you want to describe.
    */
  var BridgeArn: string
}
object DescribeBridgeRequest {
  
  inline def apply(BridgeArn: string): DescribeBridgeRequest = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBridgeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBridgeRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
  }
}
