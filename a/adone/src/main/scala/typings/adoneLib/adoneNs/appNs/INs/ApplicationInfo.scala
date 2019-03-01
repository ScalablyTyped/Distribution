package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationInfo extends js.Object {
  var commandsGroups: js.UndefOr[js.Array[Group]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var subsystems: js.UndefOr[js.Array[SubsystemInfo]] = js.undefined
}

object ApplicationInfo {
  @scala.inline
  def apply(
    commandsGroups: js.Array[Group] = null,
    description: java.lang.String = null,
    name: java.lang.String = null,
    subsystems: js.Array[SubsystemInfo] = null
  ): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    if (commandsGroups != null) __obj.updateDynamic("commandsGroups")(commandsGroups)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subsystems != null) __obj.updateDynamic("subsystems")(subsystems)
    __obj.asInstanceOf[ApplicationInfo]
  }
}

