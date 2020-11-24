package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadonlyEditOptions extends js.Object {
  
  /** Whether the readonly protections on the text editor should be ignored. */
  var bypassReadOnly: js.UndefOr[Boolean] = js.native
}
object ReadonlyEditOptions {
  
  @scala.inline
  def apply(): ReadonlyEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyEditOptions]
  }
  
  @scala.inline
  implicit class ReadonlyEditOptionsOps[Self <: ReadonlyEditOptions] (val x: Self) extends AnyVal {
    
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
    def setBypassReadOnly(value: Boolean): Self = this.set("bypassReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassReadOnly: Self = this.set("bypassReadOnly", js.undefined)
  }
}
