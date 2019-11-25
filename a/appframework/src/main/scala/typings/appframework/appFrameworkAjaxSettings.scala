package typings.appframework

import typings.std.Error
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait appFrameworkAjaxSettings extends js.Object {
  var beforeSend: js.UndefOr[
    js.Function2[/* xhr */ XMLHttpRequest, /* settings */ appFrameworkAjaxSettings, Boolean]
  ] = js.undefined
  var complete: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* status */ String, Unit]] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var crossDomain: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error, Unit]
  ] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object appFrameworkAjaxSettings {
  @scala.inline
  def apply(
    beforeSend: (/* xhr */ XMLHttpRequest, /* settings */ appFrameworkAjaxSettings) => Boolean = null,
    complete: (/* xhr */ XMLHttpRequest, /* status */ String) => Unit = null,
    contentType: String = null,
    context: js.Any = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    dataType: String = null,
    error: (/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error) => Unit = null,
    headers: js.Any = null,
    success: (/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest) => Unit = null,
    timeout: Int | Double = null,
    `type`: String = null,
    url: String = null
  ): appFrameworkAjaxSettings = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction2(beforeSend))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2(complete))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[appFrameworkAjaxSettings]
  }
}

