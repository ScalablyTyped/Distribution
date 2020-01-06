package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTypeInfo extends js.Object {
  /**
    * The ActivityType type structure representing the activity type.
    */
  var activityType: ActivityType = js.native
  /**
    * The date and time this activity type was created through RegisterActivityType.
    */
  var creationDate: Timestamp = js.native
  /**
    * If DEPRECATED, the date and time DeprecateActivityType was called.
    */
  var deprecationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the activity type provided in RegisterActivityType.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The current status of the activity type.
    */
  var status: RegistrationStatus = js.native
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
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (deprecationDate != null) __obj.updateDynamic("deprecationDate")(deprecationDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTypeInfo]
  }
}

