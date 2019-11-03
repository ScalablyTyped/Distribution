package typings.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distCommonjsAutolinkerMod {
  import typings.autolinker.distCommonjsHtmlDashTagMod.HtmlTag
  import typings.autolinker.distCommonjsMatchMatchMod.Match

  type ReplaceFn = js.Function1[/* match */ Match, ReplaceFnReturn]
  type ReplaceFnReturn = js.UndefOr[Boolean | String | HtmlTag | Null | Unit]
  type StripPrefixConfig = Boolean | StripPrefixConfigObj
  type TruncateConfig = Double | TruncateConfigObj
  type UrlsConfig = Boolean | UrlsConfigObj
}
