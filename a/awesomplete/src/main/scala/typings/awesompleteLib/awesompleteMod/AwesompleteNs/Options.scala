package typings
package awesompleteLib.awesompleteMod.AwesompleteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoFirst: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[
    js.Function2[/* item */ Suggestion, /* input */ java.lang.String, java.lang.String]
  ] = js.undefined
  var filter: js.UndefOr[
    js.Function2[/* text */ java.lang.String, /* input */ java.lang.String, scala.Boolean]
  ] = js.undefined
  var item: js.UndefOr[
    js.Function2[/* text */ java.lang.String, /* input */ java.lang.String, stdLib.HTMLElement]
  ] = js.undefined
  var list: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | stdLib.Element | js.Array[awesompleteLib.Anon_LabelValue] | (js.Array[js.Tuple2[java.lang.String, java.lang.String]])
  ] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var minChars: js.UndefOr[scala.Double] = js.undefined
  var replace: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  var sort: js.UndefOr[scala.Boolean | SortFunction] = js.undefined
}

