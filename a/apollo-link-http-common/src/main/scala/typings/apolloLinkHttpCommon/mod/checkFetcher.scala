package typings.apolloLinkHttpCommon.mod

import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-http-common", "checkFetcher")
@js.native
object checkFetcher extends js.Object {
  def apply(
    fetcher: js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
  ): Unit = js.native
}

