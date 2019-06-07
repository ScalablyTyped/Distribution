package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * Information about the activity described in a finding.
    */
  var Action: js.UndefOr[Action] = js.undefined
  /**
    * Indicates whether this finding is archived.
    */
  var Archived: js.UndefOr[Boolean] = js.undefined
  /**
    * Total count of the occurrences of this finding type.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  /**
    * Detector ID for the GuardDuty service.
    */
  var DetectorId: js.UndefOr[DetectorId] = js.undefined
  /**
    * First seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventFirstSeen: js.UndefOr[String] = js.undefined
  /**
    * Last seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventLastSeen: js.UndefOr[String] = js.undefined
  /**
    * Resource role information for this finding.
    */
  var ResourceRole: js.UndefOr[String] = js.undefined
  /**
    * The name of the AWS service (GuardDuty) that generated a finding.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  /**
    * Feedback left about the finding.
    */
  var UserFeedback: js.UndefOr[String] = js.undefined
}

object Service {
  @scala.inline
  def apply(
    Action: Action = null,
    Archived: js.UndefOr[Boolean] = js.undefined,
    Count: js.UndefOr[Integer] = js.undefined,
    DetectorId: DetectorId = null,
    EventFirstSeen: String = null,
    EventLastSeen: String = null,
    ResourceRole: String = null,
    ServiceName: String = null,
    UserFeedback: String = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action)
    if (!js.isUndefined(Archived)) __obj.updateDynamic("Archived")(Archived)
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count)
    if (DetectorId != null) __obj.updateDynamic("DetectorId")(DetectorId)
    if (EventFirstSeen != null) __obj.updateDynamic("EventFirstSeen")(EventFirstSeen)
    if (EventLastSeen != null) __obj.updateDynamic("EventLastSeen")(EventLastSeen)
    if (ResourceRole != null) __obj.updateDynamic("ResourceRole")(ResourceRole)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (UserFeedback != null) __obj.updateDynamic("UserFeedback")(UserFeedback)
    __obj.asInstanceOf[Service]
  }
}

