package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowsForTargetResult extends StObject {
  
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * Information about the maintenance window targets and tasks a managed node is associated with.
    */
  var WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList] = js.undefined
}
object DescribeMaintenanceWindowsForTargetResult {
  
  inline def apply(): DescribeMaintenanceWindowsForTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMaintenanceWindowsForTargetResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWindowIdentities(value: MaintenanceWindowsForTargetList): Self = StObject.set(x, "WindowIdentities", value.asInstanceOf[js.Any])
    
    inline def setWindowIdentitiesUndefined: Self = StObject.set(x, "WindowIdentities", js.undefined)
    
    inline def setWindowIdentitiesVarargs(value: MaintenanceWindowIdentityForTarget*): Self = StObject.set(x, "WindowIdentities", js.Array(value*))
  }
}
