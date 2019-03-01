package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SysInfo extends js.Object {
  var configureArgs: js.Array[_]
  var description: java.lang.String
  var group: java.lang.String
  var instance: adoneLib.adoneNs.appNs.Subsystem
  var name: java.lang.String
  var path: java.lang.String | scala.Null
}

object SysInfo {
  @scala.inline
  def apply(
    configureArgs: js.Array[_],
    description: java.lang.String,
    group: java.lang.String,
    instance: adoneLib.adoneNs.appNs.Subsystem,
    name: java.lang.String,
    path: java.lang.String = null
  ): SysInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configureArgs")(configureArgs)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[SysInfo]
  }
}

