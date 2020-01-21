package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1SyncName extends js.Object {
  var defaultNames: js.Array[String]
  var name: String
  var nicknames: js.Array[String]
}

object SmartHomeV1SyncName {
  @scala.inline
  def apply(defaultNames: js.Array[String], name: String, nicknames: js.Array[String]): SmartHomeV1SyncName = {
    val __obj = js.Dynamic.literal(defaultNames = defaultNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nicknames = nicknames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1SyncName]
  }
}

