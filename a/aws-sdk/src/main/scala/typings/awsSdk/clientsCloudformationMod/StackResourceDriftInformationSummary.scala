package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackResourceDriftInformationSummary extends StObject {
  
  /**
    * When CloudFormation last checked if the resource had drifted from its expected configuration.
    */
  var LastCheckTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Status of the resource's actual configuration compared to its expected configuration.    DELETED: The resource differs from its expected configuration in that it has been deleted.    MODIFIED: The resource differs from its expected configuration.    NOT_CHECKED: CloudFormation hasn't checked if the resource differs from its expected configuration. Any resources that don't currently support drift detection have a status of NOT_CHECKED. For more information, see Resources that Support Drift Detection. If you performed an ContinueUpdateRollback operation on a stack, any resources included in ResourcesToSkip will also have a status of NOT_CHECKED. For more information about skipping resources during rollback operations, see Continue Rolling Back an Update in the CloudFormation User Guide.    IN_SYNC: The resource's actual configuration matches its expected configuration.  
    */
  var StackResourceDriftStatus: typings.awsSdk.clientsCloudformationMod.StackResourceDriftStatus
}
object StackResourceDriftInformationSummary {
  
  inline def apply(StackResourceDriftStatus: StackResourceDriftStatus): StackResourceDriftInformationSummary = {
    val __obj = js.Dynamic.literal(StackResourceDriftStatus = StackResourceDriftStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDriftInformationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackResourceDriftInformationSummary] (val x: Self) extends AnyVal {
    
    inline def setLastCheckTimestamp(value: js.Date): Self = StObject.set(x, "LastCheckTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastCheckTimestampUndefined: Self = StObject.set(x, "LastCheckTimestamp", js.undefined)
    
    inline def setStackResourceDriftStatus(value: StackResourceDriftStatus): Self = StObject.set(x, "StackResourceDriftStatus", value.asInstanceOf[js.Any])
  }
}
