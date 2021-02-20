package typings.androiduix.androidui

import typings.androiduix.android.content.Context
import typings.androiduix.android.support.v4.view.PagerAdapter
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.widget.BaseAdapter
import typings.androiduix.android.widget.FrameLayout
import typings.androiduix.android.widget.ImageView.ScaleType
import typings.androiduix.android.widget.ProgressBar
import typings.androiduix.android.widget.TextView
import typings.androiduix.androidui.widget.PullRefreshLoadLayout.FooterView
import typings.androiduix.androidui.widget.PullRefreshLoadLayout.HeaderView
import typings.androiduix.androidui.widget.PullRefreshLoadLayout.RefreshLoadListener
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widget {
  
  @js.native
  trait HtmlBaseView extends View {
    
    def isHtmlTouchAble(): Boolean = js.native
    
    var mHtmlTouchAble: js.Any = js.native
    
    def setHtmlTouchAble(enable: Boolean): Unit = js.native
  }
  
  @js.native
  trait HtmlDataAdapter extends StObject {
    
    def onInflateAdapter(bindElement: HTMLElement): Unit = js.native
    def onInflateAdapter(bindElement: HTMLElement, context: js.UndefOr[scala.Nothing], parent: ViewGroup): Unit = js.native
    def onInflateAdapter(bindElement: HTMLElement, context: Context): Unit = js.native
    def onInflateAdapter(bindElement: HTMLElement, context: Context, parent: ViewGroup): Unit = js.native
  }
  
  @js.native
  trait HtmlDataListAdapter
    extends BaseAdapter
       with HtmlDataAdapter {
    
    var bindElementData: HTMLElement = js.native
    
    /* private */ def checkReplaceWithRef(element: js.Any): js.Any = js.native
    
    var mContext: Context = js.native
    
    def notifyDataSizeWillChange(): Unit = js.native
    
    /* private */ def registerHtmlDataObserver(): js.Any = js.native
    
    /* private */ def removeElementRefAndRestoreToAdapter(childElement: js.Any): js.Any = js.native
  }
  
  @js.native
  trait HtmlDataPagerAdapter
    extends PagerAdapter
       with HtmlDataAdapter {
    
    var bindElementData: HTMLElement = js.native
    
    /* private */ def checkReplaceWithRef(element: js.Any): js.Any = js.native
    
    def getItem(position: Double): Element = js.native
    
    var mContext: Context = js.native
    
    def notifyDataSizeWillChange(): Unit = js.native
    
    /* private */ def registerHtmlDataObserver(): js.Any = js.native
    
    /* private */ def removeElementRefAndRestoreToAdapter(childElement: js.Any): js.Any = js.native
  }
  
  @js.native
  trait HtmlDataPickerAdapter extends HtmlDataAdapter {
    
    var bindElementData: HTMLElement = js.native
  }
  
  @js.native
  trait HtmlImageView extends HtmlBaseView {
    
    /* private */ def configureBounds(): js.Any = js.native
    
    def getAdjustViewBounds(): Boolean = js.native
    
    def getImageAlpha(): Double = js.native
    
    def getMaxHeight(): Double = js.native
    
    def getMaxWidth(): Double = js.native
    
    def getScaleType(): ScaleType = js.native
    
    /* private */ def initImageView(): js.Any = js.native
    
    var mAdjustViewBounds: js.Any = js.native
    
    var mAdjustViewBoundsCompat: js.Any = js.native
    
    var mAlpha: js.Any = js.native
    
    var mDrawableHeight: js.Any = js.native
    
    var mDrawableWidth: js.Any = js.native
    
    var mHaveFrame: js.Any = js.native
    
    var mImgElement: js.Any = js.native
    
    var mMaxHeight: js.Any = js.native
    
    var mMaxWidth: js.Any = js.native
    
    var mScaleType: js.Any = js.native
    
    /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): Unit = js.native
    
    /* private */ def resolveAdjustedSize(desiredSize: js.Any, maxSize: js.Any, measureSpec: js.Any): js.Any = js.native
    
    def setAdjustViewBounds(adjustViewBounds: Boolean): Unit = js.native
    
    def setImageAlpha(alpha: Double): Unit = js.native
    
    def setImageURI(uri: String): Unit = js.native
    
    def setMaxHeight(maxHeight: Double): Unit = js.native
    
    def setMaxWidth(maxWidth: Double): Unit = js.native
    
    def setScaleType(scaleType: ScaleType): Unit = js.native
  }
  
  @js.native
  trait HtmlView extends HtmlBaseView {
    
    def getHtml(): String = js.native
    
    /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): Unit = js.native
    
    def setHtml(html: String): Unit = js.native
  }
  
  @js.native
  trait OverScrollLocker extends StObject {
    
    def getScrollContentBottom(): Double = js.native
    
    def lockOverScrollBottom(lockBottom: Double): Unit = js.native
    
    def lockOverScrollTop(lockTop: Double): Unit = js.native
  }
  object OverScrollLocker {
    
    @scala.inline
    def apply(
      getScrollContentBottom: () => Double,
      lockOverScrollBottom: Double => Unit,
      lockOverScrollTop: Double => Unit
    ): OverScrollLocker = {
      val __obj = js.Dynamic.literal(getScrollContentBottom = js.Any.fromFunction0(getScrollContentBottom), lockOverScrollBottom = js.Any.fromFunction1(lockOverScrollBottom), lockOverScrollTop = js.Any.fromFunction1(lockOverScrollTop))
      __obj.asInstanceOf[OverScrollLocker]
    }
    
    @scala.inline
    implicit class OverScrollLockerMutableBuilder[Self <: OverScrollLocker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetScrollContentBottom(value: () => Double): Self = StObject.set(x, "getScrollContentBottom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLockOverScrollBottom(value: Double => Unit): Self = StObject.set(x, "lockOverScrollBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLockOverScrollTop(value: Double => Unit): Self = StObject.set(x, "lockOverScrollTop", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PullRefreshLoadLayout extends FrameLayout {
    
    var autoLoadScrollAtBottom: js.Any = js.native
    
    /* private */ def checkHeaderFooterPosition(): js.Any = js.native
    
    /* private */ def checkLockOverScroll(): js.Any = js.native
    
    /* private */ def configContentView(): js.Any = js.native
    
    /* private */ def configFooterView(): js.Any = js.native
    
    /* private */ def configHeaderView(): js.Any = js.native
    
    var contentOverY: js.Any = js.native
    
    var contentView: js.Any = js.native
    
    var footerView: js.Any = js.native
    
    var footerViewReadyDistance: js.Any = js.native
    
    def getFooterState(): Double = js.native
    
    def getHeaderState(): Double = js.native
    
    var headerView: js.Any = js.native
    
    /* private */ def onContentOverScroll(scrollRangeY: js.Any, maxOverScrollY: js.Any, isTouchEvent: js.Any): js.Any = js.native
    
    var overScrollLocker: js.Any = js.native
    
    var refreshLoadListener: js.Any = js.native
    
    def setAutoLoadMoreWhenScrollBottom(autoLoad: Boolean): Unit = js.native
    
    def setContentView(contentView: View): Unit = js.native
    
    def setFooterState(newState: Double): Unit = js.native
    
    def setFooterView(footerView: FooterView): Unit = js.native
    
    /* private */ def setFooterViewAppearDistance(distance: js.Any): js.Any = js.native
    
    def setHeaderState(newState: Double): Unit = js.native
    
    def setHeaderView(headerView: HeaderView): Unit = js.native
    
    /* private */ def setHeaderViewAppearDistance(distance: js.Any): js.Any = js.native
    
    def setLoadEnable(enable: Boolean): Unit = js.native
    
    def setRefreshEnable(enable: Boolean): Unit = js.native
    
    def setRefreshLoadListener(refreshLoadListener: RefreshLoadListener): Unit = js.native
    
    def startLoadMore(): Unit = js.native
    
    def startRefresh(): Unit = js.native
  }
  object PullRefreshLoadLayout {
    
    @js.native
    trait DefaultFooterView extends FooterView {
      
      var progressBar: ProgressBar = js.native
      
      var textView: TextView = js.native
    }
    
    @js.native
    trait DefaultHeaderView extends HeaderView {
      
      var progressBar: ProgressBar = js.native
      
      var textView: TextView = js.native
    }
    
    @js.native
    trait FooterView extends FrameLayout {
      
      def onStateChange(newState: Double, oldState: Double): Unit = js.native
      
      /* protected */ def setStateInner(prll: PullRefreshLoadLayout, state: Double): Unit = js.native
      
      var state: js.Any = js.native
      
      var stateBeforeReady: js.Any = js.native
    }
    
    @js.native
    trait HeaderView extends FrameLayout {
      
      def onStateChange(newState: Double, oldState: Double): Unit = js.native
      
      /* protected */ def setStateInner(prll: PullRefreshLoadLayout, state: Double): Unit = js.native
      
      var state: js.Any = js.native
      
      var stateBeforeReady: js.Any = js.native
    }
    
    @js.native
    trait RefreshLoadListener extends StObject {
      
      def onLoadMore(prll: PullRefreshLoadLayout): Unit = js.native
      
      def onRefresh(prll: PullRefreshLoadLayout): Unit = js.native
    }
    object RefreshLoadListener {
      
      @scala.inline
      def apply(onLoadMore: PullRefreshLoadLayout => Unit, onRefresh: PullRefreshLoadLayout => Unit): RefreshLoadListener = {
        val __obj = js.Dynamic.literal(onLoadMore = js.Any.fromFunction1(onLoadMore), onRefresh = js.Any.fromFunction1(onRefresh))
        __obj.asInstanceOf[RefreshLoadListener]
      }
      
      @scala.inline
      implicit class RefreshLoadListenerMutableBuilder[Self <: RefreshLoadListener] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnLoadMore(value: PullRefreshLoadLayout => Unit): Self = StObject.set(x, "onLoadMore", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnRefresh(value: PullRefreshLoadLayout => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction1(value))
      }
    }
  }
}
