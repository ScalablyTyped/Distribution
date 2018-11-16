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

