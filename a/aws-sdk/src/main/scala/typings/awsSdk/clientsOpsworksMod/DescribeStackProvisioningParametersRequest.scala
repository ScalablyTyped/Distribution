package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackProvisioningParametersRequest extends StObject {
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object DescribeStackProvisioningParametersRequest {
  
  inline def apply(StackId: String): DescribeStackProvisioningParametersRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackProvisioningParametersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStackProvisioningParametersRequest] (val x: Self) extends AnyVal {
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
