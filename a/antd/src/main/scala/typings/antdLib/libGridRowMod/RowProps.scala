package typings
package antdLib.libGridRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RowProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  var align: js.UndefOr[
    antdLib.antdLibStrings.top | antdLib.antdLibStrings.middle | antdLib.antdLibStrings.bottom
  ] = js.undefined
  var gutter: js.UndefOr[scala.Double | (stdLib.Partial[stdLib.Record[Breakpoint, scala.Double]])] = js.undefined
  var justify: js.UndefOr[
    antdLib.antdLibStrings.start | antdLib.antdLibStrings.end | antdLib.antdLibStrings.center | antdLib.antdLibStrings.`space-around` | antdLib.antdLibStrings.`space-between`
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[antdLib.antdLibStrings.flex] = js.undefined
}

