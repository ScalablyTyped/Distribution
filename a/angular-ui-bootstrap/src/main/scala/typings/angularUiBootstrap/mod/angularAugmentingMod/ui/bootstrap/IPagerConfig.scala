package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPagerConfig extends js.Object {
  /**
    * Whether to align each link to the sides.
    *
    * @default true
    */
  var align: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of items per page. A value less than one indicates all items on one page.
    *
    * @default 10
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  /**
    * Text for Next button.
    *
    * @default 'Next »'
    */
  var nextText: js.UndefOr[String] = js.native
  /**
    * Text for Previous button.
    *
    * @default '« Previous'
    */
  var previousText: js.UndefOr[String] = js.native
}

object IPagerConfig {
  @scala.inline
  def apply(): IPagerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPagerConfig]
  }
  @scala.inline
  implicit class IPagerConfigOps[Self <: IPagerConfig] (val x: Self) extends AnyVal {
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
    def setAlign(value: Boolean): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
    @scala.inline
    def setNextText(value: String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    @scala.inline
    def setPreviousText(value: String): Self = this.set("previousText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousText: Self = this.set("previousText", js.undefined)
  }
  
}

