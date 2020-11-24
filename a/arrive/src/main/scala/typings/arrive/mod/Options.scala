package typings.arrive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var existing: js.UndefOr[Boolean] = js.native
  
  var fireOnAttributesModification: js.UndefOr[Boolean] = js.native
  
  var onceOnly: js.UndefOr[Boolean] = js.native
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
    def setExisting(value: Boolean): Self = this.set("existing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExisting: Self = this.set("existing", js.undefined)
    
    @scala.inline
    def setFireOnAttributesModification(value: Boolean): Self = this.set("fireOnAttributesModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFireOnAttributesModification: Self = this.set("fireOnAttributesModification", js.undefined)
    
    @scala.inline
    def setOnceOnly(value: Boolean): Self = this.set("onceOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnceOnly: Self = this.set("onceOnly", js.undefined)
  }
}
