package typings.appBuilderLib.packageDependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeModuleInfo extends js.Object {
  val name: String
}

object NodeModuleInfo {
  @scala.inline
  def apply(name: String): NodeModuleInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeModuleInfo]
  }
}

