package typings.angular.angularMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpRequestConfigHeaders
  extends /* requestType */ StringDictionary[js.Any] {
  var common: js.UndefOr[js.Any] = js.undefined
  var get: js.UndefOr[js.Any] = js.undefined
  var patch: js.UndefOr[js.Any] = js.undefined
  var post: js.UndefOr[js.Any] = js.undefined
  var put: js.UndefOr[js.Any] = js.undefined
}

object IHttpRequestConfigHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* requestType */ StringDictionary[js.Any] = null,
    common: js.Any = null,
    get: js.Any = null,
    patch: js.Any = null,
    post: js.Any = null,
    put: js.Any = null
  ): IHttpRequestConfigHeaders = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (put != null) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttpRequestConfigHeaders]
  }
}

