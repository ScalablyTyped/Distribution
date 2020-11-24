package typings.asana.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends js.Object {
  
  var opt_expand: js.UndefOr[String] = js.native
  
  var opt_fields: js.UndefOr[String] = js.native
}
object Params {
  
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    
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
    def setOpt_expand(value: String): Self = this.set("opt_expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpt_expand: Self = this.set("opt_expand", js.undefined)
    
    @scala.inline
    def setOpt_fields(value: String): Self = this.set("opt_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpt_fields: Self = this.set("opt_fields", js.undefined)
  }
}
