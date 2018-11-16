package typings
package arangodbLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestOptions extends js.Object {
  var auth: js.UndefOr[arangodbLib.Anon_Username | arangodbLib.Anon_Bearer] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var followRedirect: js.UndefOr[scala.Boolean] = js.undefined
  var form: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
  var qs: js.UndefOr[js.Object] = js.undefined
  var returnBodyOnError: js.UndefOr[scala.Boolean] = js.undefined
  var sslProtocol: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var useQuerystring: js.UndefOr[scala.Boolean] = js.undefined
}

