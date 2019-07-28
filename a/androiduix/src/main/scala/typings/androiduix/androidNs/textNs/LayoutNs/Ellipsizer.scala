package typings.androiduix.androidNs.textNs.LayoutNs

import typings.androiduix.androidNs.textNs.Layout
import typings.androiduix.androidNs.textNs.TextUtilsNs.TruncateAt
import typings.std.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.Layout.Ellipsizer")
@js.native
class Ellipsizer protected () extends String {
  def this(s: java.lang.String) = this()
  var mLayout: Layout = js.native
  var mMethod: TruncateAt = js.native
  var mText: java.lang.String = js.native
  var mWidth: Double = js.native
}

