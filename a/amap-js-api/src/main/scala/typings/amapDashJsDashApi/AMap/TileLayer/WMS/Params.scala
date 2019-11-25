package typings.amapDashJsDashApi.AMap.TileLayer.WMS

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
    if (BGCOLOR != null) __obj.updateDynamic("BGCOLOR")(BGCOLOR.asInstanceOf[js.Any])
    if (ELEVATION != null) __obj.updateDynamic("ELEVATION")(ELEVATION.asInstanceOf[js.Any])
    if (EXCEPTIONS != null) __obj.updateDynamic("EXCEPTIONS")(EXCEPTIONS.asInstanceOf[js.Any])
    if (FORMAT != null) __obj.updateDynamic("FORMAT")(FORMAT.asInstanceOf[js.Any])
    if (LAYERS != null) __obj.updateDynamic("LAYERS")(LAYERS.asInstanceOf[js.Any])
    if (STYLES != null) __obj.updateDynamic("STYLES")(STYLES.asInstanceOf[js.Any])
    if (TIME != null) __obj.updateDynamic("TIME")(TIME.asInstanceOf[js.Any])
    if (TRANSPARENT != null) __obj.updateDynamic("TRANSPARENT")(TRANSPARENT.asInstanceOf[js.Any])
    if (VERSION != null) __obj.updateDynamic("VERSION")(VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

