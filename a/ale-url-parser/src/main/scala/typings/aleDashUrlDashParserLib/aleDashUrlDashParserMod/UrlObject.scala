package typings
package aleDashUrlDashParserLib.aleDashUrlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlObject extends js.Object {
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[QueryParams] = js.undefined
}

object UrlObject {
  @scala.inline
  def apply(
    hash: java.lang.String = null,
    host: java.lang.String = null,
    path: js.Array[java.lang.String] = null,
    protocol: java.lang.String = null,
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

