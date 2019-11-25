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
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nonMinifiedName != null) __obj.updateDynamic("nonMinifiedName")(nonMinifiedName.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (securityContext != null) __obj.updateDynamic("securityContext")(securityContext.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingDef]
  }
}

