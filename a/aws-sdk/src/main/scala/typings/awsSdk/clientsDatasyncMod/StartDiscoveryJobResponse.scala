package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDiscoveryJobResponse extends StObject {
  
  /**
    * The ARN of the discovery job that you started.
    */
  var DiscoveryJobArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.DiscoveryJobArn] = js.undefined
}
object StartDiscoveryJobResponse {
  
  inline def apply(): StartDiscoveryJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDiscoveryJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDiscoveryJobResponse] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryJobArn(value: DiscoveryJobArn): Self = StObject.set(x, "DiscoveryJobArn", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryJobArnUndefined: Self = StObject.set(x, "DiscoveryJobArn", js.undefined)
  }
}
