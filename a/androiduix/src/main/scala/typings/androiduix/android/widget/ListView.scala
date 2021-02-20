package typings.androiduix.android.widget

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.Predicate
import typings.androiduix.android.widget.ListView.FixedViewInfo
import typings.androiduix.java_.lang.Runnable
import typings.androiduix.java_.util.ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListView extends AbsListView {
  
  def addFooterView(v: View): Unit = js.native
  def addFooterView(v: View, data: js.UndefOr[scala.Nothing], isSelectable: Boolean): Unit = js.native
  def addFooterView(v: View, data: js.Any): Unit = js.native
  def addFooterView(v: View, data: js.Any, isSelectable: Boolean): Unit = js.native
  
  def addHeaderView(v: View): Unit = js.native
  def addHeaderView(v: View, data: js.UndefOr[scala.Nothing], isSelectable: Boolean): Unit = js.native
  def addHeaderView(v: View, data: js.Any): Unit = js.native
  def addHeaderView(v: View, data: js.Any, isSelectable: Boolean): Unit = js.native
  
  /* private */ def addViewAbove(theView: js.Any, position: js.Any): js.Any = js.native
  
  /* private */ def addViewBelow(theView: js.Any, position: js.Any): js.Any = js.native
  
  /* private */ def adjustViewsUpOrDown(): js.Any = js.native
  
  /* private */ def amountToScroll(direction: js.Any, nextSelectedPosition: js.Any): js.Any = js.native
  
  /* private */ def amountToScrollToNewFocus(direction: js.Any, newFocus: js.Any, positionOfNewFocus: js.Any): js.Any = js.native
  
  def areFooterDividersEnabled(): Boolean = js.native
  
  def areHeaderDividersEnabled(): Boolean = js.native
  
  def arrowScroll(direction: Double): Boolean = js.native
  
  /* private */ def arrowScrollFocused(direction: js.Any): js.Any = js.native
  
  /* private */ def arrowScrollImpl(direction: js.Any): js.Any = js.native
  
  /* private */ def clearRecycledState(infos: js.Any): js.Any = js.native
  
  /* private */ def commonKey(keyCode: js.Any, count: js.Any, event: js.Any): js.Any = js.native
  
  /* private */ def correctTooHigh(childCount: js.Any): js.Any = js.native
  
  /* private */ def correctTooLow(childCount: js.Any): js.Any = js.native
  
  /* private */ def distanceToView(descendant: js.Any): js.Any = js.native
  
  def drawDivider(canvas: Canvas, bounds: Rect, childIndex: Double): Unit = js.native
  
  def drawOverscrollFooter(canvas: Canvas, drawable: Drawable, bounds: Rect): Unit = js.native
  
  def drawOverscrollHeader(canvas: Canvas, drawable: Drawable, bounds: Rect): Unit = js.native
  
  /* private */ def fillAboveAndBelow(sel: js.Any, position: js.Any): js.Any = js.native
  
  /* private */ def fillDown(pos: js.Any, nextTop: js.Any): js.Any = js.native
  
  /* private */ def fillFromMiddle(childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  
  /* private */ def fillFromSelection(selectedTop: js.Any, childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  
  /* private */ def fillFromTop(nextTop: js.Any): js.Any = js.native
  
  /* private */ def fillSpecific(position: js.Any, top: js.Any): js.Any = js.native
  
  /* private */ def fillUp(pos: js.Any, nextBottom: js.Any): js.Any = js.native
  
  def findViewByPredicateInHeadersOrFooters(where: ArrayList[FixedViewInfo], predicate: Predicate[View], childToSkip: View): View = js.native
  
  def findViewInHeadersOrFooters(where: ArrayList[FixedViewInfo], id: String): View = js.native
  
  def fullScroll(direction: Double): Boolean = js.native
  
  /* private */ def getArrowScrollPreviewLength(): js.Any = js.native
  
  /* private */ def getBottomSelectionPixel(childrenBottom: js.Any, fadingEdgeLength: js.Any, selectedPosition: js.Any): js.Any = js.native
  
  def getCheckItemIds(): js.Array[Double] = js.native
  
  def getDivider(): Drawable = js.native
  
  def getDividerHeight(): Double = js.native
  
  def getItemsCanFocus(): Boolean = js.native
  
  def getMaxScrollAmount(): Double = js.native
  
  def getOverscrollFooter(): Drawable = js.native
  
  def getOverscrollHeader(): Drawable = js.native
  
  /* private */ def getTopSelectionPixel(childrenTop: js.Any, fadingEdgeLength: js.Any, selectedPosition: js.Any): js.Any = js.native
  
  /* private */ def handleHorizontalFocusWithinListItem(direction: js.Any): js.Any = js.native
  
  /* private */ def handleNewSelectionChange(selectedView: js.Any, direction: js.Any, newSelectedPosition: js.Any, newFocusAssigned: js.Any): js.Any = js.native
  
  /* private */ def isViewAncestorOf(child: js.Any, parent: js.Any): js.Any = js.native
  
  def lookForSelectablePositionAfter(current: Double, position: Double, lookDown: Boolean): Double = js.native
  
  /* private */ def lookForSelectablePositionOnScreen(direction: js.Any): js.Any = js.native
  
  var mAreAllItemsSelectable: js.Any = js.native
  
  var mArrowScrollFocusResult: js.Any = js.native
  
  var mDivider: Drawable = js.native
  
  var mDividerHeight: Double = js.native
  
  var mDividerIsOpaque: js.Any = js.native
  
  var mDividerPaint: js.Any = js.native
  
  var mFocusSelector: js.Any = js.native
  
  var mFooterDividersEnabled: js.Any = js.native
  
  var mFooterViewInfos: js.Any = js.native
  
  var mHeaderDividersEnabled: js.Any = js.native
  
  var mHeaderViewInfos: js.Any = js.native
  
  var mIsCacheColorOpaque: js.Any = js.native
  
  var mItemsCanFocus: js.Any = js.native
  
  var mOverScrollFooter: Drawable = js.native
  
  var mOverScrollHeader: Drawable = js.native
  
  var mTempRect: js.Any = js.native
  
  /* private */ def makeAndAddView(position: js.Any, y: js.Any, flow: js.Any, childrenLeft: js.Any, selected: js.Any): js.Any = js.native
  
  /* private */ def measureAndAdjustDown(child: js.Any, childIndex: js.Any, numChildren: js.Any): js.Any = js.native
  
  def measureHeightOfChildren(
    widthMeasureSpec: Double,
    startPosition: Double,
    endPosition: Double,
    maxHeight: Double,
    disallowPartialChildPosition: Double
  ): Double = js.native
  
  /* private */ def measureItem(child: js.Any): js.Any = js.native
  
  /* private */ def measureScrapChild(child: js.Any, position: js.Any, widthMeasureSpec: js.Any): js.Any = js.native
  
  /* private */ def moveSelection(oldSel: js.Any, newSel: js.Any, delta: js.Any, childrenTop: js.Any, childrenBottom: js.Any): js.Any = js.native
  
  /* private */ def nextSelectedPositionForDirection(selectedView: js.Any, selectedPos: js.Any, direction: js.Any): js.Any = js.native
  
  def onKeyMultiple(keyCode: Double, repeatCount: Double, event: KeyEvent): Boolean = js.native
  
  def pageScroll(direction: Double): Boolean = js.native
  
  /* private */ def positionOfNewFocus(newFocus: js.Any): js.Any = js.native
  
  /* protected */ def recycleOnMeasure(): Boolean = js.native
  
  /* private */ def relayoutMeasuredItem(child: js.Any): js.Any = js.native
  
  /* private */ def removeFixedViewInfo(v: js.Any, where: js.Any): js.Any = js.native
  
  def removeFooterView(v: View): Boolean = js.native
  
  def removeHeaderView(v: View): Boolean = js.native
  
  /* private */ def scrollListItemsBy(amount: js.Any): js.Any = js.native
  
  def setDivider(divider: Drawable): Unit = js.native
  
  def setDividerHeight(height: Double): Unit = js.native
  
  def setFooterDividersEnabled(footerDividersEnabled: Boolean): Unit = js.native
  
  def setHeaderDividersEnabled(headerDividersEnabled: Boolean): Unit = js.native
  
  def setItemsCanFocus(itemsCanFocus: Boolean): Unit = js.native
  
  def setOverscrollFooter(footer: Drawable): Unit = js.native
  
  def setOverscrollHeader(header: Drawable): Unit = js.native
  
  def setSelectionAfterHeaderView(): Unit = js.native
  
  def setSelectionFromTop(position: Double, y: Double): Unit = js.native
  
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
object ListView {
  
  @js.native
  trait ArrowScrollFocusResult extends StObject {
    
    def getAmountToScroll(): Double = js.native
    
    def getSelectedPosition(): Double = js.native
    
    var mAmountToScroll: js.Any = js.native
    
    var mSelectedPosition: js.Any = js.native
    
    def populate(selectedPosition: Double, amountToScroll: Double): Unit = js.native
  }
  object ArrowScrollFocusResult {
    
    @scala.inline
    def apply(
      getAmountToScroll: () => Double,
      getSelectedPosition: () => Double,
      mAmountToScroll: js.Any,
      mSelectedPosition: js.Any,
      populate: (Double, Double) => Unit
    ): ArrowScrollFocusResult = {
      val __obj = js.Dynamic.literal(getAmountToScroll = js.Any.fromFunction0(getAmountToScroll), getSelectedPosition = js.Any.fromFunction0(getSelectedPosition), mAmountToScroll = mAmountToScroll.asInstanceOf[js.Any], mSelectedPosition = mSelectedPosition.asInstanceOf[js.Any], populate = js.Any.fromFunction2(populate))
      __obj.asInstanceOf[ArrowScrollFocusResult]
    }
    
    @scala.inline
    implicit class ArrowScrollFocusResultMutableBuilder[Self <: ArrowScrollFocusResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAmountToScroll(value: () => Double): Self = StObject.set(x, "getAmountToScroll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectedPosition(value: () => Double): Self = StObject.set(x, "getSelectedPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMAmountToScroll(value: js.Any): Self = StObject.set(x, "mAmountToScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMSelectedPosition(value: js.Any): Self = StObject.set(x, "mSelectedPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulate(value: (Double, Double) => Unit): Self = StObject.set(x, "populate", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait FixedViewInfo extends StObject {
    
    var _ListView_this: ListView = js.native
    
    var data: js.Any = js.native
    
    var isSelectable: Boolean = js.native
    
    var view: View = js.native
  }
  object FixedViewInfo {
    
    @scala.inline
    def apply(_ListView_this: ListView, data: js.Any, isSelectable: Boolean, view: View): FixedViewInfo = {
      val __obj = js.Dynamic.literal(_ListView_this = _ListView_this.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isSelectable = isSelectable.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedViewInfo]
    }
    
    @scala.inline
    implicit class FixedViewInfoMutableBuilder[Self <: FixedViewInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectable(value: Boolean): Self = StObject.set(x, "isSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_ListView_this(value: ListView): Self = StObject.set(x, "_ListView_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FocusSelector extends Runnable {
    
    var _ListView_this: ListView = js.native
    
    var mPosition: js.Any = js.native
    
    var mPositionTop: js.Any = js.native
    
    def setup(position: Double, top: Double): FocusSelector = js.native
  }
  object FocusSelector {
    
    @scala.inline
    def apply(
      _ListView_this: ListView,
      mPosition: js.Any,
      mPositionTop: js.Any,
      run: () => js.Any,
      setup: (Double, Double) => FocusSelector
    ): FocusSelector = {
      val __obj = js.Dynamic.literal(_ListView_this = _ListView_this.asInstanceOf[js.Any], mPosition = mPosition.asInstanceOf[js.Any], mPositionTop = mPositionTop.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), setup = js.Any.fromFunction2(setup))
      __obj.asInstanceOf[FocusSelector]
    }
    
    @scala.inline
    implicit class FocusSelectorMutableBuilder[Self <: FocusSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMPosition(value: js.Any): Self = StObject.set(x, "mPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPositionTop(value: js.Any): Self = StObject.set(x, "mPositionTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetup(value: (Double, Double) => FocusSelector): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_ListView_this(value: ListView): Self = StObject.set(x, "_ListView_this", value.asInstanceOf[js.Any])
    }
  }
}
