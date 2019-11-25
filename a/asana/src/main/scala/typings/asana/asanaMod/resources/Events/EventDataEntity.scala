package typings.asana.asanaMod.resources.Events

import typings.asana.asanaMod.resources.Users.ShortType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDataEntity extends js.Object {
  var action: String
  var created_at: String
  var parent: EventTask | EventProject | EventSection | Null
  var resource: EventTask | EventProject | EventSection | EventStory
  var `type`: String
  var user: ShortType | Null
}

object EventDataEntity {
  @scala.inline
  def apply(
    action: String,
    created_at: String,
    resource: EventTask | EventProject | EventSection | EventStory,
    `type`: String,
    parent: EventTask | EventProject | EventSection = null,
    user: ShortType = null
  ): EventDataEntity = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDataEntity]
  }
}

