package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsSpinner")
@js.native
abstract class AbsSpinner protected () extends AdapterView[SpinnerAdapter] {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mAdapter: SpinnerAdapter = js.native
  var mDataSetObserver: js.Any = js.native
  var mHeightMeasureSpec: scala.Double = js.native
  var mRecycler: androiduixLib.androidNs.widgetNs.AbsSpinnerNs.RecycleBin = js.native
  var mSelectionBottomPadding: scala.Double = js.native
  var mSelectionLeftPadding: scala.Double = js.native
  var mSelectionRightPadding: scala.Double = js.native
  var mSelectionTopPadding: scala.Double = js.native
  var mSpinnerPadding: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mTouchFrame: js.Any = js.native
  var mWidthMeasureSpec: scala.Double = js.native
  def getChildHeight(child: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  def getChildWidth(child: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  /* private */ def initAbsSpinner(): js.Any = js.native
  def layoutSpinner(delta: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  def pointToPosition(x: scala.Double, y: scala.Double): scala.Double = js.native
  def recycleAllViews(): scala.Unit = js.native
  def resetList(): scala.Unit = js.native
  def setSelection(position: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  def setSelectionInt(position: scala.Double, animate: scala.Boolean): scala.Unit = js.native
}

