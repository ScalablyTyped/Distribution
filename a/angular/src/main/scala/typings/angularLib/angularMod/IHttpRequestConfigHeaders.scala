package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpRequestConfigHeaders
  extends /* requestType */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var common: js.UndefOr[js.Any] = js.undefined
  var get: js.UndefOr[js.Any] = js.undefined
  var patch: js.UndefOr[js.Any] = js.undefined
  var post: js.UndefOr[js.Any] = js.undefined
  var put: js.UndefOr[js.Any] = js.undefined
}

object IHttpRequestConfigHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* requestType */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    common: js.Any = null,
    get: js.Any = null,
    patch: js.Any = null,
    post: js.Any = null,
    put: js.Any = null
  ): IHttpRequestConfigHeaders = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (common != null) __obj.updateDynamic("common")(common)
    if (get != null) __obj.updateDynamic("get")(get)
    if (patch != null) __obj.updateDynamic("patch")(patch)
    if (post != null) __obj.updateDynamic("post")(post)
    if (put != null) __obj.updateDynamic("put")(put)
    __obj.asInstanceOf[IHttpRequestConfigHeaders]
  }
}

