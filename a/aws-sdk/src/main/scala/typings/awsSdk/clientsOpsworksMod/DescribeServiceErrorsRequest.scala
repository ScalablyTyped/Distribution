package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceErrorsRequest extends StObject {
  
  /**
    * The instance ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of service error IDs. If you use this parameter, DescribeServiceErrors returns descriptions of the specified errors. Otherwise, it returns a description of every error.
    */
  var ServiceErrorIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The stack ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object DescribeServiceErrorsRequest {
  
  inline def apply(): DescribeServiceErrorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceErrorsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeServiceErrorsRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setServiceErrorIds(value: Strings): Self = StObject.set(x, "ServiceErrorIds", value.asInstanceOf[js.Any])
    
    inline def setServiceErrorIdsUndefined: Self = StObject.set(x, "ServiceErrorIds", js.undefined)
    
    inline def setServiceErrorIdsVarargs(value: String*): Self = StObject.set(x, "ServiceErrorIds", js.Array(value*))
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
