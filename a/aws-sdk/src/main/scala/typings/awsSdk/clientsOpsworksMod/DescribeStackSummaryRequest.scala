package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackSummaryRequest extends StObject {
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object DescribeStackSummaryRequest {
  
  inline def apply(StackId: String): DescribeStackSummaryRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackSummaryRequest]
  }
  
  extension [Self <: DescribeStackSummaryRequest](x: Self) {
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
