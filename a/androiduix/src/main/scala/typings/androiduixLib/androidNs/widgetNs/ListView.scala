package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListView")
@js.native
class ListView protected () extends AbsListView {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mAreAllItemsSelectable: js.Any = js.native
  var mArrowScrollFocusResult: js.Any = js.native
  var mDivider: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDividerHeight: scala.Double = js.native
  var mDividerIsOpaque: js.Any = js.native
  var mDividerPaint: js.Any = js.native
  var mFocusSelector: js.Any = js.native
  var mFooterDividersEnabled: js.Any = js.native
  var mFooterViewInfos: js.Any = js.native
  var mHeaderDividersEnabled: js.Any = js.native
  var mHeaderViewInfos: js.Any = js.native
  var mIsCacheColorOpaque: js.Any = js.native
  var mItemsCanFocus: js.Any = js.native
  var mOverScrollFooter: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mOverScrollHeader: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mTempRect: js.Any = js.native
  def addFooterView(v: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def addFooterView(v: androiduixLib.androidNs.viewNs.View, data: js.Any): scala.Unit = js.native
  def addFooterView(v: androiduixLib.androidNs.viewNs.View, data: js.Any, isSelectable: scala.Boolean): scala.Unit = js.native
  def addHeaderView(v: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def addHeaderView(v: androiduixLib.androidNs.viewNs.View, data: js.Any): scala.Unit = js.native
  def addHeaderView(v: androiduixLib.androidNs.viewNs.View, data: js.Any, isSelectable: scala.Boolean): scala.Unit = js.native
  /* private */ def addViewAbove(theView: js.Any, position: js.Any): js.Any = js.native
  /* private */ def addViewBelow(theView: js.Any, position: js.Any): js.Any = js.native
  /* private */ def adjustViewsUpOrDown(): js.Any = js.native
  /* private */ def amountToScroll(direction: js.Any, nextSelectedPosition: js.Any): js.Any = js.native
  /* private */ def amountToScrollToNewFocus(direction: js.Any, newFocus: js.Any, positionOfNewFocus: js.Any): js.Any = js.native
  def areFooterDividersEnabled(): scala.Boolean = js.native
  def areHeaderDividersEnabled(): scala.Boolean = js.native
  def arrowScroll(direction: scala.Double): scala.Boolean = js.native
  /* private */ def arrowScrollFocused(direction: js.Any): js.Any = js.native
  /* private */ def arrowScrollImpl(direction: js.Any): js.Any = js.native
  /* private */ def clearRecycledState(infos: js.Any): js.Any = js.native
  /* private */ def commonKey(keyCode: js.Any, count: js.Any, event: js.Any): js.Any = js.native
  /* private */ def correctTooHigh(childCount: js.Any): js.Any = js.native
  /* private */ def correctTooLow(childCount: js.Any): js.Any = js.native
  /* private */ def distanceToView(descendant: js.Any): js.Any = js.native
  def drawDivider(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    bounds: androiduixLib.androidNs.graphicsNs.Rect,
    childIndex: scala.Double
  ): scala.Unit = js.native
  def drawOverscrollFooter(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    drawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    bounds: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Unit = js.native
  def drawOverscrollHeader(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    drawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    bounds: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Unit = js.native
  /* private */ def fillAboveAndBelow(sel: js.Any, position: js.Any): js.Any = js.native
  /* private */ def fillDown(pos: js.Any, nextTop: js.Any): js.Any = js.native
  /* private */ def fillFromMiddle(childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  /* private */ def fillFromSelection(selectedTop: js.Any, childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  /* private */ def fillFromTop(nextTop: js.Any): js.Any = js.native
  /* private */ def fillSpecific(position: js.Any, top: js.Any): js.Any = js.native
  /* private */ def fillUp(pos: js.Any, nextBottom: js.Any): js.Any = js.native
  def findViewByPredicateInHeadersOrFooters(
    where: androiduixLib.javaNs.utilNs.ArrayList[androiduixLib.androidNs.widgetNs.ListViewNs.FixedViewInfo],
    predicate: androiduixLib.androidNs.viewNs.ViewNs.Predicate[androiduixLib.androidNs.viewNs.View],
    childToSkip: androiduixLib.androidNs.viewNs.View
  ): androiduixLib.androidNs.viewNs.View = js.native
  def findViewInHeadersOrFooters(
    where: androiduixLib.javaNs.utilNs.ArrayList[androiduixLib.androidNs.widgetNs.ListViewNs.FixedViewInfo],
    id: java.lang.String
  ): androiduixLib.androidNs.viewNs.View = js.native
  def fullScroll(direction: scala.Double): scala.Boolean = js.native
  /* private */ def getArrowScrollPreviewLength(): js.Any = js.native
  /* private */ def getBottomSelectionPixel(childrenBottom: js.Any, fadingEdgeLength: js.Any, selectedPosition: js.Any): js.Any = js.native
  def getCheckItemIds(): js.Array[scala.Double] = js.native
  def getDivider(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getDividerHeight(): scala.Double = js.native
  def getItemsCanFocus(): scala.Boolean = js.native
  def getMaxScrollAmount(): scala.Double = js.native
  def getOverscrollFooter(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getOverscrollHeader(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  /* private */ def getTopSelectionPixel(childrenTop: js.Any, fadingEdgeLength: js.Any, selectedPosition: js.Any): js.Any = js.native
  /* private */ def handleHorizontalFocusWithinListItem(direction: js.Any): js.Any = js.native
  /* private */ def handleNewSelectionChange(selectedView: js.Any, direction: js.Any, newSelectedPosition: js.Any, newFocusAssigned: js.Any): js.Any = js.native
  /* private */ def isViewAncestorOf(child: js.Any, parent: js.Any): js.Any = js.native
  def lookForSelectablePositionAfter(current: scala.Double, position: scala.Double, lookDown: scala.Boolean): scala.Double = js.native
  /* private */ def lookForSelectablePositionOnScreen(direction: js.Any): js.Any = js.native
  /* private */ def makeAndAddView(position: js.Any, y: js.Any, flow: js.Any, childrenLeft: js.Any, selected: js.Any): js.Any = js.native
  /* private */ def measureAndAdjustDown(child: js.Any, childIndex: js.Any, numChildren: js.Any): js.Any = js.native
  def measureHeightOfChildren(
    widthMeasureSpec: scala.Double,
    startPosition: scala.Double,
    endPosition: scala.Double,
    maxHeight: scala.Double,
    disallowPartialChildPosition: scala.Double
  ): scala.Double = js.native
  /* private */ def measureItem(child: js.Any): js.Any = js.native
  /* private */ def measureScrapChild(child: js.Any, position: js.Any, widthMeasureSpec: js.Any): js.Any = js.native
  /* private */ def moveSelection(oldSel: js.Any, newSel: js.Any, delta: js.Any, childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  /* private */ def nextSelectedPositionForDirection(selectedView: js.Any, selectedPos: js.Any, direction: js.Any): js.Any = js.native
  def onKeyMultiple(keyCode: scala.Double, repeatCount: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  def pageScroll(direction: scala.Double): scala.Boolean = js.native
  /* private */ def positionOfNewFocus(newFocus: js.Any): js.Any = js.native
  /* protected */ def recycleOnMeasure(): scala.Boolean = js.native
  /* private */ def relayoutMeasuredItem(child: js.Any): js.Any = js.native
  /* private */ def removeFixedViewInfo(v: js.Any, where: js.Any): js.Any = js.native
  def removeFooterView(v: androiduixLib.androidNs.viewNs.View): scala.Boolean = js.native
  def removeHeaderView(v: androiduixLib.androidNs.viewNs.View): scala.Boolean = js.native
  /* private */ def scrollListItemsBy(amount: js.Any): js.Any = js.native
  def setDivider(divider: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setDividerHeight(height: scala.Double): scala.Unit = js.native
  def setFooterDividersEnabled(footerDividersEnabled: scala.Boolean): scala.Unit = js.native
  def setHeaderDividersEnabled(headerDividersEnabled: scala.Boolean): scala.Unit = js.native
  def setItemsCanFocus(itemsCanFocus: scala.Boolean): scala.Unit = js.native
  def setOverscrollFooter(footer: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setOverscrollHeader(header: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setSelectionAfterHeaderView(): scala.Unit = js.native
  def setSelectionFromTop(position: scala.Double, y: scala.Double): scala.Unit = js.native
  /* private */ def setupChild(
    child: js.Any,
    position: js.Any,
    y: js.Any,
    flowDown: js.Any,
    childrenLeft: js.Any,
    selected: js.Any,
    recycled: js.Any
  ): js.Any = js.native
  /* private */ def showingBottomFadingEdge(): js.Any = js.native
  /* private */ def showingTopFadingEdge(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.ListView")
@js.native
object ListView extends js.Object {
  var MAX_SCROLL_FACTOR: js.Any = js.native
  var MIN_SCROLL_PREVIEW_PIXELS: js.Any = js.native
  var NO_POSITION: scala.Double = js.native
}

