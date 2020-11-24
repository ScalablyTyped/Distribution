package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedScript extends js.Object {
  
  var __brand__ : typings.angularCore.angularCoreStrings.TrustedScript = js.native
}
object TrustedScript {
  
  @scala.inline
  def apply(__brand__ : typings.angularCore.angularCoreStrings.TrustedScript): TrustedScript = {
    val __obj = js.Dynamic.literal(__brand__ = __brand__.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedScript]
  }
  
  @scala.inline
  implicit class TrustedScriptOps[Self <: TrustedScript] (val x: Self) extends AnyVal {
    
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
    def set__brand__(value: typings.angularCore.angularCoreStrings.TrustedScript): Self = this.set("__brand__", value.asInstanceOf[js.Any])
  }
}
