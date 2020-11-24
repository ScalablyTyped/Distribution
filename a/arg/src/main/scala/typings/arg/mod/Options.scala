package typings.arg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var argv: js.UndefOr[js.Array[String]] = js.native
  
  var permissive: js.UndefOr[Boolean] = js.native
  
  var stopAtPositional: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setArgvVarargs(value: String*): Self = this.set("argv", js.Array(value :_*))
    
    @scala.inline
    def setArgv(value: js.Array[String]): Self = this.set("argv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgv: Self = this.set("argv", js.undefined)
    
    @scala.inline
    def setPermissive(value: Boolean): Self = this.set("permissive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissive: Self = this.set("permissive", js.undefined)
    
    @scala.inline
    def setStopAtPositional(value: Boolean): Self = this.set("stopAtPositional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopAtPositional: Self = this.set("stopAtPositional", js.undefined)
  }
}
