package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsRequest extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the resources.
    */
  var resourceArns: ResourceArnList
}
object DescribeTagsRequest {
  
  inline def apply(resourceArns: ResourceArnList): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal(resourceArns = resourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsRequest]
  }
  
  extension [Self <: DescribeTagsRequest](x: Self) {
    
    inline def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "resourceArns", js.Array(value*))
  }
}
