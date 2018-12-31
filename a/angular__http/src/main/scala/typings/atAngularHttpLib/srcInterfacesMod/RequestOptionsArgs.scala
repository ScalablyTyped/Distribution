package typings
package atAngularHttpLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptionsArgs extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[atAngularHttpLib.srcHeadersMod.Headers | scala.Null] = js.undefined
  var method: js.UndefOr[java.lang.String | atAngularHttpLib.srcEnumsMod.RequestMethod | scala.Null] = js.undefined
  var params: js.UndefOr[
    java.lang.String | atAngularHttpLib.srcUrlUnderscoreSearchUnderscoreParamsMod.URLSearchParams | (org.scalablytyped.runtime.StringDictionary[js.Any | js.Array[_]]) | scala.Null
  ] = js.undefined
  var responseType: js.UndefOr[atAngularHttpLib.srcEnumsMod.ResponseContentType | scala.Null] = js.undefined
  /** @deprecated from 4.0.0. Use params instead. */
  var search: js.UndefOr[
    java.lang.String | atAngularHttpLib.srcUrlUnderscoreSearchUnderscoreParamsMod.URLSearchParams | (org.scalablytyped.runtime.StringDictionary[js.Any | js.Array[_]]) | scala.Null
  ] = js.undefined
  var url: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
}

