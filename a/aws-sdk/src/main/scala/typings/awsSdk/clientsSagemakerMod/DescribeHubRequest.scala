package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHubRequest extends StObject {
  
  /**
    * The name of the hub to describe.
    */
  var HubName: typings.awsSdk.clientsSagemakerMod.HubName
}
object DescribeHubRequest {
  
  inline def apply(HubName: HubName): DescribeHubRequest = {
    val __obj = js.Dynamic.literal(HubName = HubName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHubRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeHubRequest] (val x: Self) extends AnyVal {
    
    inline def setHubName(value: HubName): Self = StObject.set(x, "HubName", value.asInstanceOf[js.Any])
  }
}
