package typings.androiduix.android.widget

import typings.androiduix.android.view.KeyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridView extends AbsListView {
  
  /* private */ def adjustForBottomFadingEdge(childInSelectedRow: js.Any, topSelectionPixel: js.Any, bottomSelectionPixel: js.Any): js.Any = js.native
  
  /* private */ def adjustForTopFadingEdge(childInSelectedRow: js.Any, topSelectionPixel: js.Any, bottomSelectionPixel: js.Any): js.Any = js.native
  
  /* private */ def adjustViewsUpOrDown(): js.Any = js.native
  
  def arrowScroll(direction: Double): Boolean = js.native
  
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
  
  def fullScroll(direction: Double): Boolean = js.native
  
  /* private */ def getBottomSelectionPixel(childrenBottom: js.Any, fadingEdgeLength: js.Any, numColumns: js.Any, rowStart: js.Any): js.Any = js.native
  
  def getColumnWidth(): Double = js.native
  
  def getGravity(): Double = js.native
  
  def getHorizontalSpacing(): Double = js.native
  
  def getNumColumns(): Double = js.native
  
  def getRequestedColumnWidth(): Double = js.native
  
  def getRequestedHorizontalSpacing(): Double = js.native
  
  def getStretchMode(): Double = js.native
  
  /* private */ def getTopSelectionPixel(childrenTop: js.Any, fadingEdgeLength: js.Any, rowStart: js.Any): js.Any = js.native
  
  def getVerticalSpacing(): Double = js.native
  
  /* private */ def isCandidateSelection(childIndex: js.Any, direction: js.Any): js.Any = js.native
  
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
  
  /* private */ def makeAndAddView(position: js.Any, y: js.Any, flow: js.Any, childrenLeft: js.Any, selected: js.Any, where: js.Any): js.Any = js.native
  
  /* private */ def makeRow(startPos: js.Any, y: js.Any, flow: js.Any): js.Any = js.native
  
  /* private */ def moveSelection(delta: js.Any, childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  
  def onKeyMultiple(keyCode: Double, repeatCount: Double, event: KeyEvent): Boolean = js.native
  
  def pageScroll(direction: Double): Boolean = js.native
  
  /* private */ def pinToBottom(childrenBottom: js.Any): js.Any = js.native
  
  /* private */ def pinToTop(childrenTop: js.Any): js.Any = js.native
  
  def sequenceScroll(direction: Double): Boolean = js.native
  
  def setColumnWidth(columnWidth: Double): Unit = js.native
  
  def setGravity(gravity: Double): Unit = js.native
  
  def setHorizontalSpacing(horizontalSpacing: Double): Unit = js.native
  
  def setNumColumns(numColumns: Double): Unit = js.native
  
  def setStretchMode(stretchMode: Double): Unit = js.native
  
  def setVerticalSpacing(verticalSpacing: Double): Unit = js.native
  
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
