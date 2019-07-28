package typings.adone.adoneNs.appNs.INs

import typings.adone.adoneNs.appNs.Subsystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SysInfoWithPath extends SysInfo {
  @JSName("path")
  var path_SysInfoWithPath: String
}

object SysInfoWithPath {
  @scala.inline
  def apply(
    configureArgs: js.Array[_],
    description: String,
    group: String,
    instance: Subsystem,
    name: String,
    path: String
  ): SysInfoWithPath = {
    val __obj = js.Dynamic.literal(configureArgs = configureArgs, description = description, group = group, instance = instance, name = name, path = path)
  
    __obj.asInstanceOf[SysInfoWithPath]
  }
}

