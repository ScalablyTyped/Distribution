package typings.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends js.Object {
  var credentials: js.UndefOr[String] = js.undefined
  var fetch: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GlobalFetch * / any['fetch'] */ js.Any
  ] = js.undefined
  var fetchOptions: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var includeExtensions: js.UndefOr[Boolean] = js.undefined
  var uri: js.UndefOr[String | UriFunction] = js.undefined
}

object HttpOptions {
  @scala.inline
  def apply(
    credentials: String = null,
    fetch: /* import warning: ImportType.apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GlobalFetch * / any['fetch'] */ js.Any = null,
    fetchOptions: js.Any = null,
    headers: js.Any = null,
    includeExtensions: js.UndefOr[Boolean] = js.undefined,
    uri: String | UriFunction = null
  ): HttpOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(includeExtensions)) __obj.updateDynamic("includeExtensions")(includeExtensions)
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOptions]
  }
}

