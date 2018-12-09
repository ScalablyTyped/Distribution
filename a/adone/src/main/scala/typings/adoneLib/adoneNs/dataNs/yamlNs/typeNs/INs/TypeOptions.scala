package typings
package adoneLib.adoneNs.dataNs.yamlNs.typeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TypeOptions[T] extends js.Object {
  var construct: js.UndefOr[js.Function1[/* data */ java.lang.String, T]] = js.undefined
  var defaultStyle: js.UndefOr[java.lang.String] = js.undefined
  var instanceOf: js.UndefOr[js.Object] = js.undefined
  var kind: Kind
  var predicate: js.UndefOr[js.Function1[/* obj */ js.Any, scala.Boolean]] = js.undefined
  var represent: js.UndefOr[
    (js.Function2[/* obj */ js.Any, /* style */ java.lang.String, java.lang.String]) | (ScalablyTyped.runtime.StringDictionary[js.Function2[/* obj */ js.Any, /* style */ java.lang.String, java.lang.String]])
  ] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* data */ java.lang.String, scala.Boolean]] = js.undefined
  var styleAliases: js.UndefOr[js.Object] = js.undefined
}

