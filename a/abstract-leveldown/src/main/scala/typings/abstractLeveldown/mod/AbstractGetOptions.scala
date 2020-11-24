package typings.abstractLeveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractGetOptions extends AbstractOptions {
  
  var asBuffer: js.UndefOr[Boolean] = js.native
}
object AbstractGetOptions {
  
  @scala.inline
  def apply(): AbstractGetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractGetOptions]
  }
  
  @scala.inline
  implicit class AbstractGetOptionsOps[Self <: AbstractGetOptions] (val x: Self) extends AnyVal {
    
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
    def setAsBuffer(value: Boolean): Self = this.set("asBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsBuffer: Self = this.set("asBuffer", js.undefined)
  }
}
