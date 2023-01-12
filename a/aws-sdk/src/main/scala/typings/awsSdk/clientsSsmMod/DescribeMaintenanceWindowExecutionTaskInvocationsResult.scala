package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * Information about the task invocation results per invocation.
    */
  var WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList] = js.undefined
}
object DescribeMaintenanceWindowExecutionTaskInvocationsResult {
  
  inline def apply(): DescribeMaintenanceWindowExecutionTaskInvocationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMaintenanceWindowExecutionTaskInvocationsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWindowExecutionTaskInvocationIdentities(value: MaintenanceWindowExecutionTaskInvocationIdentityList): Self = StObject.set(x, "WindowExecutionTaskInvocationIdentities", value.asInstanceOf[js.Any])
    
    inline def setWindowExecutionTaskInvocationIdentitiesUndefined: Self = StObject.set(x, "WindowExecutionTaskInvocationIdentities", js.undefined)
    
    inline def setWindowExecutionTaskInvocationIdentitiesVarargs(value: MaintenanceWindowExecutionTaskInvocationIdentity*): Self = StObject.set(x, "WindowExecutionTaskInvocationIdentities", js.Array(value*))
  }
}
