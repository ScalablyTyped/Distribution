package typings.androiduix.android.widget

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.AbsSpinner.RecycleBin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbsSpinner_ extends AdapterView[SpinnerAdapter] {
  
  def getChildHeight(child: View): Double = js.native
  
  def getChildWidth(child: View): Double = js.native
  
  /* private */ def initAbsSpinner(): js.Any = js.native
  
  def layoutSpinner(delta: Double, animate: Boolean): Unit = js.native
  
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
  
  def pointToPosition(x: Double, y: Double): Double = js.native
  
  def recycleAllViews(): Unit = js.native
  
  def resetList(): Unit = js.native
  
  def setSelection(position: Double, animate: Boolean): Unit = js.native
  
  def setSelectionInt(position: Double, animate: Boolean): Unit = js.native
}
