package typings.angularHttp.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/public_api", "URLSearchParams")
@js.native
class URLSearchParams ()
  extends typings.angularHttp.srcMod.URLSearchParams {
  def this(rawParams: String) = this()
  def this(
    rawParams: js.UndefOr[scala.Nothing],
    queryEncoder: typings.angularHttp.urlSearchParamsMod.QueryEncoder
  ) = this()
  def this(rawParams: String, queryEncoder: typings.angularHttp.urlSearchParamsMod.QueryEncoder) = this()
}
