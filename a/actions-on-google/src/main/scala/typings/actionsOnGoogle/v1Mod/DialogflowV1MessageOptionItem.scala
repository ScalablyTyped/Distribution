package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageOptionItem extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var image: js.UndefOr[DialogflowV1MessageImage] = js.native
  
  var optionInfo: js.UndefOr[DialogflowV1MessageOptionInfo] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object DialogflowV1MessageOptionItem {
  
  @scala.inline
  def apply(): DialogflowV1MessageOptionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageOptionItem]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageOptionItemOps[Self <: DialogflowV1MessageOptionItem] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setImage(value: DialogflowV1MessageImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setOptionInfo(value: DialogflowV1MessageOptionInfo): Self = this.set("optionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionInfo: Self = this.set("optionInfo", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
