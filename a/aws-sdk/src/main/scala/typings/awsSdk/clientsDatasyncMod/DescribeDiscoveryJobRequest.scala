package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDiscoveryJobRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the discovery job that you want information about.
    */
  var DiscoveryJobArn: typings.awsSdk.clientsDatasyncMod.DiscoveryJobArn
}
object DescribeDiscoveryJobRequest {
  
  inline def apply(DiscoveryJobArn: DiscoveryJobArn): DescribeDiscoveryJobRequest = {
    val __obj = js.Dynamic.literal(DiscoveryJobArn = DiscoveryJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDiscoveryJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDiscoveryJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryJobArn(value: DiscoveryJobArn): Self = StObject.set(x, "DiscoveryJobArn", value.asInstanceOf[js.Any])
  }
}
