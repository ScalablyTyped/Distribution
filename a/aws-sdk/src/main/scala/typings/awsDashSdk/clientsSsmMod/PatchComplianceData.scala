package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchComplianceData extends js.Object {
  /**
    * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
    */
  var Classification: PatchClassification
  /**
    * The date/time the patch was installed on the instance. Note that not all operating systems provide this level of information.
    */
  var InstalledTime: DateTime
  /**
    * The operating system-specific ID of the patch.
    */
  var KBId: PatchKbNumber
  /**
    * The severity of the patch (for example, Critical, Important, Moderate).
    */
  var Severity: PatchSeverity
  /**
    * The state of the patch on the instance, such as INSTALLED or FAILED. For descriptions of each patch state, see About Patch Compliance in the AWS Systems Manager User Guide.
    */
  var State: PatchComplianceDataState
  /**
    * The title of the patch.
    */
  var Title: PatchTitle
}

object PatchComplianceData {
  @scala.inline
  def apply(
    Classification: PatchClassification,
    InstalledTime: DateTime,
    KBId: PatchKbNumber,
    Severity: PatchSeverity,
    State: PatchComplianceDataState,
    Title: PatchTitle
  ): PatchComplianceData = {
    val __obj = js.Dynamic.literal(Classification = Classification, InstalledTime = InstalledTime, KBId = KBId, Severity = Severity, State = State.asInstanceOf[js.Any], Title = Title)
  
    __obj.asInstanceOf[PatchComplianceData]
  }
}

