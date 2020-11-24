package typings.antd.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyContent extends js.Object {
  
  var bodyContent: js.UndefOr[js.Object | ReactElement | Null] = js.native
  
  var customize: Boolean = js.native
}
object BodyContent {
  
  @scala.inline
  def apply(customize: Boolean): BodyContent = {
    val __obj = js.Dynamic.literal(customize = customize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyContent]
  }
  
  @scala.inline
  implicit class BodyContentOps[Self <: BodyContent] (val x: Self) extends AnyVal {
    
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
    def setCustomize(value: Boolean): Self = this.set("customize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyContent(value: js.Object | ReactElement): Self = this.set("bodyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyContent: Self = this.set("bodyContent", js.undefined)
    
    @scala.inline
    def setBodyContentNull: Self = this.set("bodyContent", null)
  }
}
