package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingDef extends js.Object {
  var flags: ɵBindingFlags
  var name: String | Null
  var nonMinifiedName: String | Null
  var ns: String | Null
  var securityContext: SecurityContext | Null
  var suffix: String | Null
}

object BindingDef {
  @scala.inline
  def apply(
    flags: ɵBindingFlags,
    name: String = null,
    nonMinifiedName: String = null,
    ns: String = null,
    securityContext: SecurityContext = null,
    suffix: String = null
  ): BindingDef = {
    val __obj = js.Dynamic.literal(flags = flags)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nonMinifiedName != null) __obj.updateDynamic("nonMinifiedName")(nonMinifiedName)
    if (ns != null) __obj.updateDynamic("ns")(ns)
    if (securityContext != null) __obj.updateDynamic("securityContext")(securityContext)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[BindingDef]
  }
}

