package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterParameterStatus extends StObject {
  
  /**
    * The error that prevented the parameter from being applied to the database.
    */
  var ParameterApplyErrorDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the parameter that indicates whether the parameter is in sync with the database, waiting for a cluster reboot, or encountered an error when being applied. The following are possible statuses and descriptions.    in-sync: The parameter value is in sync with the database.    pending-reboot: The parameter value will be applied after the cluster reboots.    applying: The parameter value is being applied to the database.    invalid-parameter: Cannot apply the parameter value because it has an invalid value or syntax.    apply-deferred: The parameter contains static property changes. The changes are deferred until the cluster reboots.    apply-error: Cannot connect to the cluster. The parameter change will be applied after the cluster reboots.    unknown-error: Cannot apply the parameter change right now. The change will be applied after the cluster reboots.  
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.undefined
}
object ClusterParameterStatus {
  
  inline def apply(): ClusterParameterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterParameterStatus] (val x: Self) extends AnyVal {
    
    inline def setParameterApplyErrorDescription(value: String): Self = StObject.set(x, "ParameterApplyErrorDescription", value.asInstanceOf[js.Any])
    
    inline def setParameterApplyErrorDescriptionUndefined: Self = StObject.set(x, "ParameterApplyErrorDescription", js.undefined)
    
    inline def setParameterApplyStatus(value: String): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
    
    inline def setParameterName(value: String): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
  }
}
