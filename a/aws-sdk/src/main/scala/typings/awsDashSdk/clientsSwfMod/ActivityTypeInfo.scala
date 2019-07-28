package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityTypeInfo extends js.Object {
  /**
    * The ActivityType type structure representing the activity type.
    */
  var activityType: ActivityType
  /**
    * The date and time this activity type was created through RegisterActivityType.
    */
  var creationDate: Timestamp
  /**
    * If DEPRECATED, the date and time DeprecateActivityType was called.
    */
  var deprecationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description of the activity type provided in RegisterActivityType.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The current status of the activity type.
    */
  var status: RegistrationStatus
}

object ActivityTypeInfo {
  @scala.inline
  def apply(
    activityType: ActivityType,
    creationDate: Timestamp,
    status: RegistrationStatus,
    deprecationDate: Timestamp = null,
    description: Description = null
  ): ActivityTypeInfo = {
    val __obj = js.Dynamic.literal(activityType = activityType, creationDate = creationDate, status = status.asInstanceOf[js.Any])
    if (deprecationDate != null) __obj.updateDynamic("deprecationDate")(deprecationDate)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ActivityTypeInfo]
  }
}

