package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactData extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.native
  /**
    * Status of a contact.
    */
  var contactStatus: js.UndefOr[ContactStatus] = js.native
  /**
    * End time of a contact.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * Error message of a contact.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[String] = js.native
  /**
    * Maximum elevation angle of a contact.
    */
  var maximumElevation: js.UndefOr[Elevation] = js.native
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.native
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var postPassEndTime: js.UndefOr[Timestamp] = js.native
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var prePassStartTime: js.UndefOr[Timestamp] = js.native
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsDashSdk.clientsGroundstationMod.satelliteArn] = js.native
  /**
    * Start time of a contact.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object ContactData {
  @scala.inline
  def apply(
    contactId: String = null,
    contactStatus: ContactStatus = null,
    endTime: Timestamp = null,
    errorMessage: String = null,
    groundStation: String = null,
    maximumElevation: Elevation = null,
    missionProfileArn: MissionProfileArn = null,
    postPassEndTime: Timestamp = null,
    prePassStartTime: Timestamp = null,
    satelliteArn: satelliteArn = null,
    startTime: Timestamp = null,
    tags: TagsMap = null
  ): ContactData = {
    val __obj = js.Dynamic.literal()
    if (contactId != null) __obj.updateDynamic("contactId")(contactId.asInstanceOf[js.Any])
    if (contactStatus != null) __obj.updateDynamic("contactStatus")(contactStatus.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (groundStation != null) __obj.updateDynamic("groundStation")(groundStation.asInstanceOf[js.Any])
    if (maximumElevation != null) __obj.updateDynamic("maximumElevation")(maximumElevation.asInstanceOf[js.Any])
    if (missionProfileArn != null) __obj.updateDynamic("missionProfileArn")(missionProfileArn.asInstanceOf[js.Any])
    if (postPassEndTime != null) __obj.updateDynamic("postPassEndTime")(postPassEndTime.asInstanceOf[js.Any])
    if (prePassStartTime != null) __obj.updateDynamic("prePassStartTime")(prePassStartTime.asInstanceOf[js.Any])
    if (satelliteArn != null) __obj.updateDynamic("satelliteArn")(satelliteArn.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactData]
  }
}

