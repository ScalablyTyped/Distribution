package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.GridView")
@js.native
class GridView protected ()
  extends typings.androiduix.android.widget.GridView {
  def this(context: Context, attrs: HTMLElement) = this()
  def this(context: Context, attrs: HTMLElement, defStyle: Map[String, String]) = this()
}

/* static members */
@JSGlobal("android.widget.GridView")
@js.native
object GridView extends js.Object {
  var AUTO_FIT: Double = js.native
  var NO_STRETCH: Double = js.native
  var STRETCH_COLUMN_WIDTH: Double = js.native
  var STRETCH_SPACING: Double = js.native
  var STRETCH_SPACING_UNIFORM: Double = js.native
}

