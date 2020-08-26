package typings.appBuilderLib.macOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DmgWindow extends js.Object {
  /**
    * The height. Defaults to background image height or 380.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The width. Defaults to background image width or 540.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The X position relative to left of the screen.
    * @default 400
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The Y position relative to bottom of the screen.
    * @default 100
    */
  var y: js.UndefOr[Double] = js.native
}

object DmgWindow {
  @scala.inline
  def apply(): DmgWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DmgWindow]
  }
  @scala.inline
  implicit class DmgWindowOps[Self <: DmgWindow] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

