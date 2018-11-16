package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.GridView")
@js.native
class GridView protected () extends AbsListView {
  def this(context: androiduixLib.androidNs.contentNs.Context, attrs: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, attrs: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mColumnWidth: js.Any = js.native
  var mGravity: js.Any = js.native
  var mHorizontalSpacing: js.Any = js.native
  var mNumColumns: js.Any = js.native
  var mReferenceView: js.Any = js.native
  var mReferenceViewInSelectedRow: js.Any = js.native
  var mRequestedColumnWidth: js.Any = js.native
  var mRequestedHorizontalSpacing: js.Any = js.native
  var mRequestedNumColumns: js.Any = js.native
  var mStretchMode: js.Any = js.native
  var mTempRect: js.Any = js.native
  var mVerticalSpacing: js.Any = js.native
  /* private */ def adjustForBottomFadingEdge(childInSelectedRow: js.Any, topSelectionPixel: js.Any, bottomSelectionPixel: js.Any): js.Any = js.native
  /* private */ def adjustForTopFadingEdge(childInSelectedRow: js.Any, topSelectionPixel: js.Any, bottomSelectionPixel: js.Any): js.Any = js.native
  /* private */ def adjustViewsUpOrDown(): js.Any = js.native
  def arrowScroll(direction: scala.Double): scala.Boolean = js.native
  /* private */ def commonKey(keyCode: js.Any, count: js.Any, event: js.Any): js.Any = js.native
  /* private */ def correctTooHigh(numColumns: js.Any, verticalSpacing: js.Any, childCount: js.Any): js.Any = js.native
  /* private */ def correctTooLow(numColumns: js.Any, verticalSpacing: js.Any, childCount: js.Any): js.Any = js.native
  /* private */ def determineColumns(availableSpace: js.Any): js.Any = js.native
  /* private */ def fillDown(pos: js.Any, nextTop: js.Any): js.Any = js.native
  /* private */ def fillFromBottom(lastPosition: js.Any, nextBottom: js.Any): js.Any = js.native
  /* private */ def fillFromSelection(selectedTop: js.Any, childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  /* private */ def fillFromTop(nextTop: js.Any): js.Any = js.native
  /* private */ def fillSelection(childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  /* private */ def fillSpecific(position: js.Any, top: js.Any): js.Any = js.native
  /* private */ def fillUp(pos: js.Any, nextBottom: js.Any): js.Any = js.native
  def fullScroll(direction: scala.Double): scala.Boolean = js.native
  /* private */ def getBottomSelectionPixel(childrenBottom: js.Any, fadingEdgeLength: js.Any, numColumns: js.Any, rowStart: js.Any): js.Any = js.native
  def getColumnWidth(): scala.Double = js.native
  def getGravity(): scala.Double = js.native
  def getHorizontalSpacing(): scala.Double = js.native
  def getNumColumns(): scala.Double = js.native
  def getRequestedColumnWidth(): scala.Double = js.native
  def getRequestedHorizontalSpacing(): scala.Double = js.native
  def getStretchMode(): scala.Double = js.native
  /* private */ def getTopSelectionPixel(childrenTop: js.Any, fadingEdgeLength: js.Any, rowStart: js.Any): js.Any = js.native
  def getVerticalSpacing(): scala.Double = js.native
  /* private */ def isCandidateSelection(childIndex: js.Any, direction: js.Any): js.Any = js.native
  /* private */ def makeAndAddView(position: js.Any, y: js.Any, flow: js.Any, childrenLeft: js.Any, selected: js.Any, where: js.Any): js.Any = js.native
  /* private */ def makeRow(startPos: js.Any, y: js.Any, flow: js.Any): js.Any = js.native
  /* private */ def moveSelection(delta: js.Any, childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  def onKeyMultiple(keyCode: scala.Double, repeatCount: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  def pageScroll(direction: scala.Double): scala.Boolean = js.native
  /* private */ def pinToBottom(childrenBottom: js.Any): js.Any = js.native
  /* private */ def pinToTop(childrenTop: js.Any): js.Any = js.native
  def sequenceScroll(direction: scala.Double): scala.Boolean = js.native
  def setColumnWidth(columnWidth: scala.Double): scala.Unit = js.native
  def setGravity(gravity: scala.Double): scala.Unit = js.native
  def setHorizontalSpacing(horizontalSpacing: scala.Double): scala.Unit = js.native
  def setNumColumns(numColumns: scala.Double): scala.Unit = js.native
  def setStretchMode(stretchMode: scala.Double): scala.Unit = js.native
  def setVerticalSpacing(verticalSpacing: scala.Double): scala.Unit = js.native
  /* private */ def setupChild(
    child: js.Any,
    position: js.Any,
    y: js.Any,
    flow: js.Any,
    childrenLeft: js.Any,
    selected: js.Any,
    recycled: js.Any,
    where: js.Any
  ): js.Any = js.native
}

@JSGlobal("android.widget.GridView")
@js.native
object GridView extends js.Object {
  var AUTO_FIT: scala.Double = js.native
  var NO_STRETCH: scala.Double = js.native
  var STRETCH_COLUMN_WIDTH: scala.Double = js.native
  var STRETCH_SPACING: scala.Double = js.native
  var STRETCH_SPACING_UNIFORM: scala.Double = js.native
}

