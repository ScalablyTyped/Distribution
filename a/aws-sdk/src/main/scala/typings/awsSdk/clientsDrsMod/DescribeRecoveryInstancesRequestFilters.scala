package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecoveryInstancesRequestFilters extends StObject {
  
  /**
    * An array of Recovery Instance IDs that should be returned. An empty array means all Recovery Instances.
    */
  var recoveryInstanceIDs: js.UndefOr[RecoveryInstanceIDs] = js.undefined
  
  /**
    * An array of Source Server IDs for which associated Recovery Instances should be returned.
    */
  var sourceServerIDs: js.UndefOr[SourceServerIDs] = js.undefined
}
object DescribeRecoveryInstancesRequestFilters {
  
  inline def apply(): DescribeRecoveryInstancesRequestFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecoveryInstancesRequestFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRecoveryInstancesRequestFilters] (val x: Self) extends AnyVal {
    
    inline def setRecoveryInstanceIDs(value: RecoveryInstanceIDs): Self = StObject.set(x, "recoveryInstanceIDs", value.asInstanceOf[js.Any])
    
    inline def setRecoveryInstanceIDsUndefined: Self = StObject.set(x, "recoveryInstanceIDs", js.undefined)
    
    inline def setRecoveryInstanceIDsVarargs(value: RecoveryInstanceID*): Self = StObject.set(x, "recoveryInstanceIDs", js.Array(value*))
    
    inline def setSourceServerIDs(value: SourceServerIDs): Self = StObject.set(x, "sourceServerIDs", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDsUndefined: Self = StObject.set(x, "sourceServerIDs", js.undefined)
    
    inline def setSourceServerIDsVarargs(value: SourceServerID*): Self = StObject.set(x, "sourceServerIDs", js.Array(value*))
  }
}
