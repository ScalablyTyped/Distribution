package typings.autolinker.autolinkerMod

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
    if (!js.isUndefined(schemeMatches)) __obj.updateDynamic("schemeMatches")(schemeMatches.asInstanceOf[js.Any])
    if (!js.isUndefined(tldMatches)) __obj.updateDynamic("tldMatches")(tldMatches.asInstanceOf[js.Any])
    if (!js.isUndefined(wwwMatches)) __obj.updateDynamic("wwwMatches")(wwwMatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlsConfigObj]
  }
}

