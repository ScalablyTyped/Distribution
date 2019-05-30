package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingDef extends js.Object {
  var flags: ɵBindingFlags
  var name: java.lang.String | scala.Null
  var nonMinifiedName: java.lang.String | scala.Null
  var ns: java.lang.String | scala.Null
  var securityContext: SecurityContext | scala.Null
  var suffix: java.lang.String | scala.Null
}

object BindingDef {
  @scala.inline
  def apply(
    flags: ɵBindingFlags,
    name: java.lang.String = null,
    nonMinifiedName: java.lang.String = null,
    ns: java.lang.String = null,
    securityContext: SecurityContext = null,
    suffix: java.lang.String = null
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

