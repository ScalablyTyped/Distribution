package typings.angularCore.mod

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
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonMinifiedName = nonMinifiedName.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], securityContext = securityContext.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingDef]
  }
}

