package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQuickConnectRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier for the quick connect.
    */
  var QuickConnectId: typings.awsSdk.clientsConnectMod.QuickConnectId
}
object DescribeQuickConnectRequest {
  
  inline def apply(InstanceId: InstanceId, QuickConnectId: QuickConnectId): DescribeQuickConnectRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QuickConnectId = QuickConnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeQuickConnectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeQuickConnectRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectId(value: QuickConnectId): Self = StObject.set(x, "QuickConnectId", value.asInstanceOf[js.Any])
  }
}
