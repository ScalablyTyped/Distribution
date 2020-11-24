package typings.actionsOnGoogle.carouselMod

import typings.actionsOnGoogle.optionOptionMod.OptionItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselOptionItem extends OptionItem {
  
  /**
    * Description text of the item.
    * @public
    */
  @JSName("description")
  var description_CarouselOptionItem: String = js.native
}
object CarouselOptionItem {
  
  @scala.inline
  def apply(description: String, title: String): CarouselOptionItem = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselOptionItem]
  }
  
  @scala.inline
  implicit class CarouselOptionItemOps[Self <: CarouselOptionItem] (val x: Self) extends AnyVal {
    
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
  }
}
