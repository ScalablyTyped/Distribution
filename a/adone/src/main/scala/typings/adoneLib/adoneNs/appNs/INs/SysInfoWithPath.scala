package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SysInfoWithPath extends SysInfo {
  @JSName("path")
  var path_SysInfoWithPath: java.lang.String
}

object SysInfoWithPath {
  @scala.inline
  def apply(
    configureArgs: js.Array[_],
    description: java.lang.String,
    group: java.lang.String,
    instance: adoneLib.adoneNs.appNs.Subsystem,
    name: java.lang.String,
    path: java.lang.String
  ): SysInfoWithPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configureArgs")(configureArgs)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[SysInfoWithPath]
  }
}

