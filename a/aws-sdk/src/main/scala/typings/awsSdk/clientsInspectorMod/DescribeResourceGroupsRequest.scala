package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourceGroupsRequest extends StObject {
  
  /**
    * The ARN that specifies the resource group that you want to describe.
    */
  var resourceGroupArns: BatchDescribeArnList
}
object DescribeResourceGroupsRequest {
  
  inline def apply(resourceGroupArns: BatchDescribeArnList): DescribeResourceGroupsRequest = {
    val __obj = js.Dynamic.literal(resourceGroupArns = resourceGroupArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeResourceGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceGroupArns(value: BatchDescribeArnList): Self = StObject.set(x, "resourceGroupArns", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupArnsVarargs(value: Arn*): Self = StObject.set(x, "resourceGroupArns", js.Array(value*))
  }
}
