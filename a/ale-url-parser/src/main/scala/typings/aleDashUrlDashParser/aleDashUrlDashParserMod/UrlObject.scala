package typings.aleDashUrlDashParser.aleDashUrlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlObject extends js.Object {
  var hash: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[js.Array[String]] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[QueryParams] = js.undefined
}

object UrlObject {
  @scala.inline
  def apply(
    hash: String = null,
    host: String = null,
    path: js.Array[String] = null,
    protocol: String = null,
    query: QueryParams = null
  ): UrlObject = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[UrlObject]
  }
}

