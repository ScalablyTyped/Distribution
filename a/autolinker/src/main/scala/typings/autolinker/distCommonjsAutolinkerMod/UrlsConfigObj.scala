package typings.autolinker.distCommonjsAutolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlsConfigObj extends js.Object {
  var schemeMatches: js.UndefOr[Boolean] = js.undefined
  var tldMatches: js.UndefOr[Boolean] = js.undefined
  var wwwMatches: js.UndefOr[Boolean] = js.undefined
}

object UrlsConfigObj {
  @scala.inline
  def apply(
    schemeMatches: js.UndefOr[Boolean] = js.undefined,
    tldMatches: js.UndefOr[Boolean] = js.undefined,
    wwwMatches: js.UndefOr[Boolean] = js.undefined
  ): UrlsConfigObj = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(schemeMatches)) __obj.updateDynamic("schemeMatches")(schemeMatches)
    if (!js.isUndefined(tldMatches)) __obj.updateDynamic("tldMatches")(tldMatches)
    if (!js.isUndefined(wwwMatches)) __obj.updateDynamic("wwwMatches")(wwwMatches)
    __obj.asInstanceOf[UrlsConfigObj]
  }
}

