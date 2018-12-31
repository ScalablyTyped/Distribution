package typings
package adoneLib.adoneNs.utilNs.querystringNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var allowDots: js.UndefOr[scala.Boolean] = js.undefined
  var allowPrototypes: js.UndefOr[scala.Boolean] = js.undefined
  var arrayLimit: js.UndefOr[scala.Double] = js.undefined
  var decoder: js.UndefOr[
    js.Function2[
      /* str */ java.lang.String, 
      /* defaultDecoder */ js.Function1[/* str */ java.lang.String, java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var ignoreQueryPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var parameterLimit: js.UndefOr[scala.Double] = js.undefined
  var parseArrays: js.UndefOr[scala.Boolean] = js.undefined
  var plainObjects: js.UndefOr[scala.Boolean] = js.undefined
  var strictNullHandling: js.UndefOr[scala.Boolean] = js.undefined
}

