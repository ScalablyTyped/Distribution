package typings.amapDashJsDashApi.AMapNs.TileLayerNs.WMSNs

import typings.amapDashJsDashApi.amapDashJsDashApiStrings.FALSE
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.TRUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var BGCOLOR: js.UndefOr[String] = js.undefined
  var ELEVATION: js.UndefOr[String] = js.undefined
  var EXCEPTIONS: js.UndefOr[String] = js.undefined
  var FORMAT: js.UndefOr[String] = js.undefined
  var LAYERS: js.UndefOr[String] = js.undefined
  var STYLES: js.UndefOr[String] = js.undefined
  var TIME: js.UndefOr[String] = js.undefined
  var TRANSPARENT: js.UndefOr[TRUE | FALSE] = js.undefined
  var VERSION: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    BGCOLOR: String = null,
    ELEVATION: String = null,
    EXCEPTIONS: String = null,
    FORMAT: String = null,
    LAYERS: String = null,
    STYLES: String = null,
    TIME: String = null,
    TRANSPARENT: TRUE | FALSE = null,
    VERSION: String = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (BGCOLOR != null) __obj.updateDynamic("BGCOLOR")(BGCOLOR)
    if (ELEVATION != null) __obj.updateDynamic("ELEVATION")(ELEVATION)
    if (EXCEPTIONS != null) __obj.updateDynamic("EXCEPTIONS")(EXCEPTIONS)
    if (FORMAT != null) __obj.updateDynamic("FORMAT")(FORMAT)
    if (LAYERS != null) __obj.updateDynamic("LAYERS")(LAYERS)
    if (STYLES != null) __obj.updateDynamic("STYLES")(STYLES)
    if (TIME != null) __obj.updateDynamic("TIME")(TIME)
    if (TRANSPARENT != null) __obj.updateDynamic("TRANSPARENT")(TRANSPARENT.asInstanceOf[js.Any])
    if (VERSION != null) __obj.updateDynamic("VERSION")(VERSION)
    __obj.asInstanceOf[Params]
  }
}

