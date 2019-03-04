package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgModuleProviderDef extends js.Object {
  var deps: js.Array[DepDef]
  var flags: NodeFlags
  var index: scala.Double
  var token: js.Any
  var value: js.Any
}

object NgModuleProviderDef {
  @scala.inline
  def apply(deps: js.Array[DepDef], flags: NodeFlags, index: scala.Double, token: js.Any, value: js.Any): NgModuleProviderDef = {
    val __obj = js.Dynamic.literal(deps = deps, flags = flags, index = index, token = token, value = value)
  
    __obj.asInstanceOf[NgModuleProviderDef]
  }
}

