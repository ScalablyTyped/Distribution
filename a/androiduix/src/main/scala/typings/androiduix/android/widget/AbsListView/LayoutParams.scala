package typings.androiduix.android.widget.AbsListView

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsListView.LayoutParams")
@js.native
class LayoutParams protected ()
  extends typings.androiduix.android.view.ViewGroup.LayoutParams {
  def this(source: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
  def this(context: Context, attrs: HTMLElement) = this()
  def this(w: Double, h: Double) = this()
  def this(w: Double, h: Double, viewType: Double) = this()
  var forceAdd: Boolean = js.native
  var itemId: Double = js.native
  var recycledHeaderFooter: Boolean = js.native
  var scrappedFromPosition: Double = js.native
  var viewType: Double = js.native
}

