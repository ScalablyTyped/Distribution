package typings.atom.statusBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTileOptions extends js.Object {
  /**
    *  A DOM element, a jQuery object, or a model object for which a view provider
    *  has been registered in the the view registry.
    */
  var item: js.Object = js.native
  /**
    *  Determines the placement of the tile within the status bar. Lower priority
    *  will result in closer placement to the anchor.
    */
  var priority: Double = js.native
}

object AddTileOptions {
  @scala.inline
  def apply(item: js.Object, priority: Double): AddTileOptions = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTileOptions]
  }
  @scala.inline
  implicit class AddTileOptionsOps[Self <: AddTileOptions] (val x: Self) extends AnyVal {
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
    def setItem(value: js.Object): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
  }
  
}

