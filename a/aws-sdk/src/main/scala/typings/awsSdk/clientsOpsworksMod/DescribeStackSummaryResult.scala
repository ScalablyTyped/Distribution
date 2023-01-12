package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackSummaryResult extends StObject {
  
  /**
    * A StackSummary object that contains the results.
    */
  var StackSummary: js.UndefOr[typings.awsSdk.clientsOpsworksMod.StackSummary] = js.undefined
}
object DescribeStackSummaryResult {
  
  inline def apply(): DescribeStackSummaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSummaryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStackSummaryResult] (val x: Self) extends AnyVal {
    
    inline def setStackSummary(value: StackSummary): Self = StObject.set(x, "StackSummary", value.asInstanceOf[js.Any])
    
    inline def setStackSummaryUndefined: Self = StObject.set(x, "StackSummary", js.undefined)
  }
}
