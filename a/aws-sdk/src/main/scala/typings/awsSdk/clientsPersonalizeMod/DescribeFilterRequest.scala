package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFilterRequest extends StObject {
  
  /**
    * The ARN of the filter to describe.
    */
  var filterArn: Arn
}
object DescribeFilterRequest {
  
  inline def apply(filterArn: Arn): DescribeFilterRequest = {
    val __obj = js.Dynamic.literal(filterArn = filterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFilterRequest]
  }
  
  extension [Self <: DescribeFilterRequest](x: Self) {
    
    inline def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
  }
}
