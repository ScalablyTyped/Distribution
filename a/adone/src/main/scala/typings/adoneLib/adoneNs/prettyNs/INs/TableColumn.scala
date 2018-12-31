package typings
package adoneLib.adoneNs.prettyNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumn extends js.Object {
  var align: js.UndefOr[
    adoneLib.adoneLibStrings.right | adoneLib.adoneLibStrings.center | adoneLib.adoneLibStrings.left
  ] = js.undefined
  var format: js.UndefOr[
    java.lang.String | (js.Function2[/* val */ js.Any, /* item */ js.Object, java.lang.String])
  ] = js.undefined
  var handle: js.UndefOr[js.Function1[/* item */ js.Object, java.lang.String]] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var maxWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var style: js.UndefOr[
    java.lang.String | (js.Function2[/* val */ js.Any, /* str */ java.lang.String, java.lang.String])
  ] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var wordwrap: js.UndefOr[
    adoneLib.adoneLibStrings.soft | adoneLib.adoneLibStrings.hard | adoneLib.adoneNs.textNs.INs.WordWrapOptions
  ] = js.undefined
}

