package typings
package appframeworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait appFrameworkAjaxSettings extends js.Object {
  var beforeSend: js.UndefOr[
    js.Function2[
      /* xhr */ stdLib.XMLHttpRequest, 
      /* settings */ appFrameworkAjaxSettings, 
      scala.Boolean
    ]
  ] = js.undefined
  var complete: js.UndefOr[
    js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* status */ java.lang.String, scala.Unit]
  ] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var crossDomain: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* xhr */ stdLib.XMLHttpRequest, 
      /* errorType */ java.lang.String, 
      /* error */ stdLib.Error, 
      scala.Unit
    ]
  ] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* data */ js.Any, 
      /* status */ java.lang.String, 
      /* xhr */ stdLib.XMLHttpRequest, 
      scala.Unit
    ]
  ] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object appFrameworkAjaxSettings {
  @scala.inline
  def apply(
    beforeSend: (/* xhr */ stdLib.XMLHttpRequest, /* settings */ appFrameworkAjaxSettings) => scala.Boolean = null,
    complete: (/* xhr */ stdLib.XMLHttpRequest, /* status */ java.lang.String) => scala.Unit = null,
    contentType: java.lang.String = null,
    context: js.Any = null,
    crossDomain: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    dataType: java.lang.String = null,
    error: (/* xhr */ stdLib.XMLHttpRequest, /* errorType */ java.lang.String, /* error */ stdLib.Error) => scala.Unit = null,
    headers: js.Any = null,
    success: (/* data */ js.Any, /* status */ java.lang.String, /* xhr */ stdLib.XMLHttpRequest) => scala.Unit = null,
    timeout: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null
  ): appFrameworkAjaxSettings = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction2(beforeSend))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2(complete))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[appFrameworkAjaxSettings]
  }
}

