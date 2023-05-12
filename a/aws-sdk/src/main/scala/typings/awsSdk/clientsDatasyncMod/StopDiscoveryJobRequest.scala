package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDiscoveryJobRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the discovery job that you want to stop. 
    */
  var DiscoveryJobArn: typings.awsSdk.clientsDatasyncMod.DiscoveryJobArn
}
object StopDiscoveryJobRequest {
  
  inline def apply(DiscoveryJobArn: DiscoveryJobArn): StopDiscoveryJobRequest = {
    val __obj = js.Dynamic.literal(DiscoveryJobArn = DiscoveryJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDiscoveryJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopDiscoveryJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryJobArn(value: DiscoveryJobArn): Self = StObject.set(x, "DiscoveryJobArn", value.asInstanceOf[js.Any])
  }
}
