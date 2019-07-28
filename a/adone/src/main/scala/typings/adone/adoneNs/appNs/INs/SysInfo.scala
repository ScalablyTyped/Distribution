package typings.adone.adoneNs.appNs.INs

import typings.adone.adoneNs.appNs.Subsystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SysInfo extends js.Object {
  var configureArgs: js.Array[_]
  var description: String
  var group: String
  var instance: Subsystem
  var name: String
  var path: String | Null
}

object SysInfo {
  @scala.inline
  def apply(
    configureArgs: js.Array[_],
    description: String,
    group: String,
    instance: Subsystem,
    name: String,
    path: String = null
  ): SysInfo = {
    val __obj = js.Dynamic.literal(configureArgs = configureArgs, description = description, group = group, instance = instance, name = name)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[SysInfo]
  }
}

