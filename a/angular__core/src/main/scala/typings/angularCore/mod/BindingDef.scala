package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingDef extends js.Object {
  var flags: ɵBindingFlags = js.native
  var name: String | Null = js.native
  var nonMinifiedName: String | Null = js.native
  var ns: String | Null = js.native
  var securityContext: SecurityContext | Null = js.native
  var suffix: String | Null = js.native
}

object BindingDef {
  @scala.inline
  def apply(flags: ɵBindingFlags): BindingDef = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingDef]
  }
  @scala.inline
  implicit class BindingDefOps[Self <: BindingDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlags(value: ɵBindingFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setNonMinifiedName(value: String): Self = this.set("nonMinifiedName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonMinifiedNameNull: Self = this.set("nonMinifiedName", null)
    @scala.inline
    def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
    @scala.inline
    def setNsNull: Self = this.set("ns", null)
    @scala.inline
    def setSecurityContext(value: SecurityContext): Self = this.set("securityContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityContextNull: Self = this.set("securityContext", null)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffixNull: Self = this.set("suffix", null)
  }
  
}

