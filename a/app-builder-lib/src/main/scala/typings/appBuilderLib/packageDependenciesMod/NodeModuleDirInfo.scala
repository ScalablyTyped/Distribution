package typings.appBuilderLib.packageDependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeModuleDirInfo extends js.Object {
  val deps: js.Array[NodeModuleInfo]
  val dir: String
}

object NodeModuleDirInfo {
  @scala.inline
  def apply(deps: js.Array[NodeModuleInfo], dir: String): NodeModuleDirInfo = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeModuleDirInfo]
  }
}

