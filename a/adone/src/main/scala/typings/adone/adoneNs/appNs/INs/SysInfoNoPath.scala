package typings.adone.adoneNs.appNs.INs

import typings.adone.adoneNs.appNs.Subsystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SysInfoNoPath extends SysInfo {
  @JSName("path")
  var path_SysInfoNoPath: Null
}

object SysInfoNoPath {
  @scala.inline
  def apply(
    configureArgs: js.Array[_],
    description: String,
    group: String,
    instance: Subsystem,
    name: String,
    path: Null
  ): SysInfoNoPath = {
    val __obj = js.Dynamic.literal(configureArgs = configureArgs, description = description, group = group, instance = instance, name = name, path = path)
  
    __obj.asInstanceOf[SysInfoNoPath]
  }
}

