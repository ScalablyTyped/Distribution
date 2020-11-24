package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.`Brand for OpaqueViewState that nothing will match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpaqueViewState extends js.Object {
  
  var __brand__ : `Brand for OpaqueViewState that nothing will match` = js.native
}
object OpaqueViewState {
  
  @scala.inline
  def apply(__brand__ : `Brand for OpaqueViewState that nothing will match`): OpaqueViewState = {
    val __obj = js.Dynamic.literal(__brand__ = __brand__.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpaqueViewState]
  }
  
  @scala.inline
  implicit class OpaqueViewStateOps[Self <: OpaqueViewState] (val x: Self) extends AnyVal {
    
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
    def set__brand__(value: `Brand for OpaqueViewState that nothing will match`): Self = this.set("__brand__", value.asInstanceOf[js.Any])
  }
}
