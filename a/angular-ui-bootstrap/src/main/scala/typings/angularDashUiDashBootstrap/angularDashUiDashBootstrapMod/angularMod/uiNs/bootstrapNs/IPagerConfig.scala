package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPagerConfig extends js.Object {
  /**
    * Whether to align each link to the sides.
    *
    * @default true
    */
  var align: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum number of items per page. A value less than one indicates all items on one page.
    *
    * @default 10
    */
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * Text for Next button.
    *
    * @default 'Next »'
    */
  var nextText: js.UndefOr[String] = js.undefined
  /**
    * Text for Previous button.
    *
    * @default '« Previous'
    */
  var previousText: js.UndefOr[String] = js.undefined
}

object IPagerConfig {
  @scala.inline
  def apply(
    align: js.UndefOr[Boolean] = js.undefined,
    itemsPerPage: Int | Double = null,
    nextText: String = null,
    previousText: String = null
  ): IPagerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(align)) __obj.updateDynamic("align")(align)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (previousText != null) __obj.updateDynamic("previousText")(previousText)
    __obj.asInstanceOf[IPagerConfig]
  }
}

