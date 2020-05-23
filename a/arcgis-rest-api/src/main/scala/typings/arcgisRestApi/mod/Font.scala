package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.`line-through`
import typings.arcgisRestApi.arcgisRestApiStrings.bold
import typings.arcgisRestApi.arcgisRestApiStrings.bolder
import typings.arcgisRestApi.arcgisRestApiStrings.italic
import typings.arcgisRestApi.arcgisRestApiStrings.lighter
import typings.arcgisRestApi.arcgisRestApiStrings.none
import typings.arcgisRestApi.arcgisRestApiStrings.normal
import typings.arcgisRestApi.arcgisRestApiStrings.oblique
import typings.arcgisRestApi.arcgisRestApiStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var decoration: js.UndefOr[`line-through` | underline | none] = js.undefined
  var family: js.UndefOr[String] = js.undefined
   // "<fontFamily>";
  var size: js.UndefOr[Double] = js.undefined
   // <fontSize>;
  var style: js.UndefOr[italic | normal | oblique] = js.undefined
  var weight: js.UndefOr[bold | bolder | lighter | normal] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    decoration: `line-through` | underline | none = null,
    family: String = null,
    size: js.UndefOr[Double] = js.undefined,
    style: italic | normal | oblique = null,
    weight: bold | bolder | lighter | normal = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (decoration != null) __obj.updateDynamic("decoration")(decoration.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

