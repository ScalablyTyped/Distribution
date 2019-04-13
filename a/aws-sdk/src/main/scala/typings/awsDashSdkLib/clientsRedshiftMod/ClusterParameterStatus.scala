package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterStatus extends js.Object {
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
  @scala.inline
  def apply(
    ParameterApplyErrorDescription: String = null,
    ParameterApplyStatus: String = null,
    ParameterName: String = null
  ): ClusterParameterStatus = {
    val __obj = js.Dynamic.literal()
    if (ParameterApplyErrorDescription != null) __obj.updateDynamic("ParameterApplyErrorDescription")(ParameterApplyErrorDescription)
    if (ParameterApplyStatus != null) __obj.updateDynamic("ParameterApplyStatus")(ParameterApplyStatus)
    if (ParameterName != null) __obj.updateDynamic("ParameterName")(ParameterName)
    __obj.asInstanceOf[ClusterParameterStatus]
  }
}

