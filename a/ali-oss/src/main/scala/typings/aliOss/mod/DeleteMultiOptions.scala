package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMultiOptions extends js.Object {
  
  var quite: js.UndefOr[Boolean] = js.native
  
   // quite mode or verbose mode, default is false
  var timeout: js.UndefOr[Double] = js.native
}
object DeleteMultiOptions {
  
  @scala.inline
  def apply(): DeleteMultiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMultiOptions]
  }
  
  @scala.inline
  implicit class DeleteMultiOptionsOps[Self <: DeleteMultiOptions] (val x: Self) extends AnyVal {
    
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
    def setQuite(value: Boolean): Self = this.set("quite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuite: Self = this.set("quite", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
