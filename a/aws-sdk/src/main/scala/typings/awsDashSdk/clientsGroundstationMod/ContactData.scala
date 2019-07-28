package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactData extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.undefined
  /**
    * Status of a contact.
    */
  var contactStatus: js.UndefOr[ContactStatus] = js.undefined
  /**
    * End time of a contact.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Error message of a contact.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[String] = js.undefined
  /**
    * Maximum elevation angle of a contact.
    */
  var maximumElevation: js.UndefOr[Elevation] = js.undefined
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var postPassEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var prePassStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsDashSdk.clientsGroundstationMod.satelliteArn] = js.undefined
  /**
    * Start time of a contact.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
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
    if (contactId != null) __obj.updateDynamic("contactId")(contactId)
    if (contactStatus != null) __obj.updateDynamic("contactStatus")(contactStatus.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (groundStation != null) __obj.updateDynamic("groundStation")(groundStation)
    if (maximumElevation != null) __obj.updateDynamic("maximumElevation")(maximumElevation)
    if (missionProfileArn != null) __obj.updateDynamic("missionProfileArn")(missionProfileArn)
    if (postPassEndTime != null) __obj.updateDynamic("postPassEndTime")(postPassEndTime)
    if (prePassStartTime != null) __obj.updateDynamic("prePassStartTime")(prePassStartTime)
    if (satelliteArn != null) __obj.updateDynamic("satelliteArn")(satelliteArn)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ContactData]
  }
}

