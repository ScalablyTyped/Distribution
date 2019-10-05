package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.AbsSpinner.RecycleBin
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsSpinner")
@js.native
abstract class AbsSpinner protected () extends AdapterView[SpinnerAdapter] {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mAdapter: SpinnerAdapter = js.native
  var mDataSetObserver: js.Any = js.native
  var mHeightMeasureSpec: Double = js.native
  var mRecycler: RecycleBin = js.native
  var mSelectionBottomPadding: Double = js.native
  var mSelectionLeftPadding: Double = js.native
  var mSelectionRightPadding: Double = js.native
  var mSelectionTopPadding: Double = js.native
  var mSpinnerPadding: Rect = js.native
  var mTouchFrame: js.Any = js.native
  var mWidthMeasureSpec: Double = js.native
  def getChildHeight(child: View): Double = js.native
  def getChildWidth(child: View): Double = js.native
  /* private */ def initAbsSpinner(): js.Any = js.native
  def layoutSpinner(delta: Double, animate: Boolean): Unit = js.native
  def pointToPosition(x: Double, y: Double): Double = js.native
  def recycleAllViews(): Unit = js.native
  def resetList(): Unit = js.native
  def setSelection(position: Double, animate: Boolean): Unit = js.native
  def setSelectionInt(position: Double, animate: Boolean): Unit = js.native
}

@JSGlobal("android.widget.AbsSpinner")
@js.native
object AbsSpinner extends js.Object {
  @js.native
  class RecycleBin protected () extends js.Object {
    def this(arg: AbsSpinner) = this()
    var _AbsSpinner_this: AbsSpinner = js.native
    var mScrapHeap: js.Any = js.native
    def clear(): Unit = js.native
    def get(position: Double): View = js.native
    def put(position: Double, v: View): Unit = js.native
  }
  
}

