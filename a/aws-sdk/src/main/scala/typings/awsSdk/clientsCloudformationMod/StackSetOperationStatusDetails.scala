package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSetOperationStatusDetails extends StObject {
  
  /**
    * The number of stack instances for which the StackSet operation failed.
    */
  var FailedStackInstancesCount: js.UndefOr[typings.awsSdk.clientsCloudformationMod.FailedStackInstancesCount] = js.undefined
}
object StackSetOperationStatusDetails {
  
  inline def apply(): StackSetOperationStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperationStatusDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackSetOperationStatusDetails] (val x: Self) extends AnyVal {
    
    inline def setFailedStackInstancesCount(value: FailedStackInstancesCount): Self = StObject.set(x, "FailedStackInstancesCount", value.asInstanceOf[js.Any])
    
    inline def setFailedStackInstancesCountUndefined: Self = StObject.set(x, "FailedStackInstancesCount", js.undefined)
  }
}
