package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedScriptURL extends js.Object {
  
  var __brand__ : typings.angularCore.angularCoreStrings.TrustedScriptURL = js.native
}
object TrustedScriptURL {
  
  @scala.inline
  def apply(__brand__ : typings.angularCore.angularCoreStrings.TrustedScriptURL): TrustedScriptURL = {
    val __obj = js.Dynamic.literal(__brand__ = __brand__.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedScriptURL]
  }
  
  @scala.inline
  implicit class TrustedScriptURLOps[Self <: TrustedScriptURL] (val x: Self) extends AnyVal {
    
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
    def set__brand__(value: typings.angularCore.angularCoreStrings.TrustedScriptURL): Self = this.set("__brand__", value.asInstanceOf[js.Any])
  }
}
