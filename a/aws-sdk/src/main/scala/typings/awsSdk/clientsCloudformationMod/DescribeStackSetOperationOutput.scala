package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackSetOperationOutput extends StObject {
  
  /**
    * The specified stack set operation.
    */
  var StackSetOperation: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackSetOperation] = js.undefined
}
object DescribeStackSetOperationOutput {
  
  inline def apply(): DescribeStackSetOperationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSetOperationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStackSetOperationOutput] (val x: Self) extends AnyVal {
    
    inline def setStackSetOperation(value: StackSetOperation): Self = StObject.set(x, "StackSetOperation", value.asInstanceOf[js.Any])
    
    inline def setStackSetOperationUndefined: Self = StObject.set(x, "StackSetOperation", js.undefined)
  }
}
