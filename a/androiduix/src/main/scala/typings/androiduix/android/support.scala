package typings.androiduix.android

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.support.v4.view.ViewPager.OnAdapterChangeListener
import typings.androiduix.android.support.v4.view.ViewPager.OnPageChangeListener
import typings.androiduix.android.support.v4.view.ViewPager.PageTransformer
import typings.androiduix.android.support.v4.widget.DrawerLayout.DrawerListener
import typings.androiduix.android.support.v4.widget.ViewDragHelper.Callback
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object support {
  
  object v4 {
    
    object view {
      
      @js.native
      trait PagerAdapter extends StObject {
        
        def destroyItem(container: ViewGroup, position: Double, `object`: js.Any): Unit = js.native
        
        def finishUpdate(container: ViewGroup): Unit = js.native
        
        def getCount(): Double = js.native
        
        def getItemPosition(`object`: js.Any): Double = js.native
        
        def getPageTitle(position: Double): String = js.native
        
        def getPageWidth(position: Double): Double = js.native
        
        def instantiateItem(container: ViewGroup, position: Double): js.Any = js.native
        
        def isViewFromObject(view: View, `object`: js.Any): Boolean = js.native
        
        var mObservable: js.Any = js.native
        
        def notifyDataSetChanged(): Unit = js.native
        
        def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
        
        def setPrimaryItem(container: ViewGroup, position: Double, `object`: js.Any): Unit = js.native
        
        def startUpdate(container: ViewGroup): Unit = js.native
        
        def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
      }
      object PagerAdapter {
        
        @scala.inline
        def apply(
          destroyItem: (ViewGroup, Double, js.Any) => Unit,
          finishUpdate: ViewGroup => Unit,
          getCount: () => Double,
          getItemPosition: js.Any => Double,
          getPageTitle: Double => String,
          getPageWidth: Double => Double,
          instantiateItem: (ViewGroup, Double) => js.Any,
          isViewFromObject: (View, js.Any) => Boolean,
          mObservable: js.Any,
          notifyDataSetChanged: () => Unit,
          registerDataSetObserver: DataSetObserver => Unit,
          setPrimaryItem: (ViewGroup, Double, js.Any) => Unit,
          startUpdate: ViewGroup => Unit,
          unregisterDataSetObserver: DataSetObserver => Unit
        ): PagerAdapter = {
          val __obj = js.Dynamic.literal(destroyItem = js.Any.fromFunction3(destroyItem), finishUpdate = js.Any.fromFunction1(finishUpdate), getCount = js.Any.fromFunction0(getCount), getItemPosition = js.Any.fromFunction1(getItemPosition), getPageTitle = js.Any.fromFunction1(getPageTitle), getPageWidth = js.Any.fromFunction1(getPageWidth), instantiateItem = js.Any.fromFunction2(instantiateItem), isViewFromObject = js.Any.fromFunction2(isViewFromObject), mObservable = mObservable.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), setPrimaryItem = js.Any.fromFunction3(setPrimaryItem), startUpdate = js.Any.fromFunction1(startUpdate), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
          __obj.asInstanceOf[PagerAdapter]
        }
        
        @scala.inline
        implicit class PagerAdapterMutableBuilder[Self <: PagerAdapter] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDestroyItem(value: (ViewGroup, Double, js.Any) => Unit): Self = StObject.set(x, "destroyItem", js.Any.fromFunction3(value))
          
          @scala.inline
          def setFinishUpdate(value: ViewGroup => Unit): Self = StObject.set(x, "finishUpdate", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
          
          @scala.inline
          def setGetItemPosition(value: js.Any => Double): Self = StObject.set(x, "getItemPosition", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetPageTitle(value: Double => String): Self = StObject.set(x, "getPageTitle", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetPageWidth(value: Double => Double): Self = StObject.set(x, "getPageWidth", js.Any.fromFunction1(value))
          
          @scala.inline
          def setInstantiateItem(value: (ViewGroup, Double) => js.Any): Self = StObject.set(x, "instantiateItem", js.Any.fromFunction2(value))
          
          @scala.inline
          def setIsViewFromObject(value: (View, js.Any) => Boolean): Self = StObject.set(x, "isViewFromObject", js.Any.fromFunction2(value))
          
          @scala.inline
          def setMObservable(value: js.Any): Self = StObject.set(x, "mObservable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNotifyDataSetChanged(value: () => Unit): Self = StObject.set(x, "notifyDataSetChanged", js.Any.fromFunction0(value))
          
          @scala.inline
          def setRegisterDataSetObserver(value: DataSetObserver => Unit): Self = StObject.set(x, "registerDataSetObserver", js.Any.fromFunction1(value))
          
          @scala.inline
          def setSetPrimaryItem(value: (ViewGroup, Double, js.Any) => Unit): Self = StObject.set(x, "setPrimaryItem", js.Any.fromFunction3(value))
          
          @scala.inline
          def setStartUpdate(value: ViewGroup => Unit): Self = StObject.set(x, "startUpdate", js.Any.fromFunction1(value))
          
          @scala.inline
          def setUnregisterDataSetObserver(value: DataSetObserver => Unit): Self = StObject.set(x, "unregisterDataSetObserver", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait ViewPager extends ViewGroup {
        
        /* private */ def _addViewOverride(child: js.Any, index: js.Any, params: js.Any): js.Any = js.native
        
        /* private */ def addNewItem(position: js.Any, index: js.Any): js.Any = js.native
        
        def addOnPageChangeListener(listener: OnPageChangeListener): Unit = js.native
        
        def arrowScroll(direction: Double): Boolean = js.native
        
        def beginFakeDrag(): Boolean = js.native
        
        /* private */ def calculatePageOffsets(curItem: js.Any, curIndex: js.Any, oldCurInfo: js.Any): js.Any = js.native
        
        def canScroll(v: View, checkV: Boolean, dx: Double, x: Double, y: Double): Boolean = js.native
        
        def clearOnPageChangeListeners(): Unit = js.native
        
        /* private */ def completeScroll(postEvents: js.Any): js.Any = js.native
        
        def dataSetChanged(): Unit = js.native
        
        /* private */ def determineTargetPage(currentPage: js.Any, pageOffset: js.Any, velocity: js.Any, deltaX: js.Any): js.Any = js.native
        
        /* private */ def dispatchOnPageScrolled(position: js.Any, offset: js.Any, offsetPixels: js.Any): js.Any = js.native
        
        /* private */ def dispatchOnPageSelected(position: js.Any): js.Any = js.native
        
        /* private */ def dispatchOnScrollStateChanged(state: js.Any): js.Any = js.native
        
        def distanceInfluenceForSnapDuration(f: Double): Double = js.native
        
        /* private */ def enableLayers(enable: js.Any): js.Any = js.native
        
        /* private */ def endDrag(): js.Any = js.native
        
        def endFakeDrag(): Unit = js.native
        
        def executeKeyEvent(event: KeyEvent): Boolean = js.native
        
        def fakeDragBy(xOffset: Double): Unit = js.native
        
        def getAdapter(): PagerAdapter = js.native
        
        /* private */ def getChildRectInPagerCoordinates(outRect: js.Any, child: js.Any): js.Any = js.native
        
        /* private */ def getClientWidth(): js.Any = js.native
        
        def getCurrentItem(): Double = js.native
        
        def getOffscreenPageLimit(): Double = js.native
        
        def getPageMargin(): Double = js.native
        
        /* private */ def infoForAnyChild(child: js.Any): js.Any = js.native
        
        /* private */ def infoForChild(child: js.Any): js.Any = js.native
        
        /* private */ def infoForCurrentScrollPosition(): js.Any = js.native
        
        /* private */ def infoForPosition(position: js.Any): js.Any = js.native
        
        /* private */ def initViewPager(): js.Any = js.native
        
        def isFakeDragging(): Boolean = js.native
        
        /* private */ def isGutterDrag(x: js.Any, dx: js.Any): js.Any = js.native
        
        var mActivePointerId: js.Any = js.native
        
        var mAdapter: js.Any = js.native
        
        var mAdapterChangeListener: js.Any = js.native
        
        var mBottomPageBounds: js.Any = js.native
        
        var mCalledSuper: js.Any = js.native
        
        var mChildHeightMeasureSpec: js.Any = js.native
        
        var mChildWidthMeasureSpec: js.Any = js.native
        
        var mCloseEnough: js.Any = js.native
        
        var mCurItem: js.Any = js.native
        
        var mDecorChildCount: js.Any = js.native
        
        var mDefaultGutterSize: js.Any = js.native
        
        var mDrawingOrder: js.Any = js.native
        
        var mDrawingOrderedChildren: js.Any = js.native
        
        var mEndScrollRunnable: js.Any = js.native
        
        var mExpectedAdapterCount: js.Any = js.native
        
        var mFakeDragBeginTime: js.Any = js.native
        
        var mFakeDragging: js.Any = js.native
        
        var mFirstLayout: js.Any = js.native
        
        var mFirstOffset: js.Any = js.native
        
        var mFlingDistance: js.Any = js.native
        
        var mGutterSize: js.Any = js.native
        
        var mInLayout: js.Any = js.native
        
        var mInitialMotionX: js.Any = js.native
        
        var mInitialMotionY: js.Any = js.native
        
        var mInternalPageChangeListener: js.Any = js.native
        
        var mIsBeingDragged: js.Any = js.native
        
        var mIsUnableToDrag: js.Any = js.native
        
        var mItems: js.Any = js.native
        
        var mLastMotionX: js.Any = js.native
        
        var mLastMotionY: js.Any = js.native
        
        var mLastOffset: js.Any = js.native
        
        var mMarginDrawable: js.Any = js.native
        
        var mMaximumVelocity: js.Any = js.native
        
        var mMinimumVelocity: js.Any = js.native
        
        var mNeedCalculatePageOffsets: js.Any = js.native
        
        var mObserver: js.Any = js.native
        
        var mOffscreenPageLimit: js.Any = js.native
        
        var mOnPageChangeListener: js.Any = js.native
        
        var mOnPageChangeListeners: js.Any = js.native
        
        var mPageMargin: js.Any = js.native
        
        var mPageTransformer: js.Any = js.native
        
        var mPopulatePending: js.Any = js.native
        
        var mRestoredCurItem: js.Any = js.native
        
        var mScrollState: js.Any = js.native
        
        var mScroller: js.Any = js.native
        
        var mScrollingCacheEnabled: js.Any = js.native
        
        var mTempItem: js.Any = js.native
        
        var mTempRect: js.Any = js.native
        
        var mTopPageBounds: js.Any = js.native
        
        var mVelocityTracker: js.Any = js.native
        
        /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): Unit = js.native
        
        def onPageScrolled(position: Double, offset: Double, offsetPixels: Double): Unit = js.native
        
        /* private */ def onSecondaryPointerUp(ev: js.Any): js.Any = js.native
        
        def pageLeft(): Boolean = js.native
        
        def pageRight(): Boolean = js.native
        
        /* private */ def pageScrolled(xpos: js.Any): js.Any = js.native
        
        /* private */ def performDrag(x: js.Any): js.Any = js.native
        
        def populate(): Unit = js.native
        def populate(newCurrentItem: Double): Unit = js.native
        
        /* private */ def recomputeScrollPosition(width: js.Any, oldWidth: js.Any, margin: js.Any, oldMargin: js.Any): js.Any = js.native
        
        /* private */ def removeNonDecorViews(): js.Any = js.native
        
        def removeOnPageChangeListener(listener: OnPageChangeListener): Unit = js.native
        
        /* private */ def requestParentDisallowInterceptTouchEvent(disallowIntercept: js.Any): js.Any = js.native
        
        /* private */ def resetTouch(): js.Any = js.native
        
        /* private */ def scrollToItem(item: js.Any, smoothScroll: js.Any, velocity: js.Any, dispatchSelected: js.Any): js.Any = js.native
        
        def setAdapter(adapter: PagerAdapter): Unit = js.native
        
        def setChildrenDrawingOrderEnabledCompat(): Unit = js.native
        def setChildrenDrawingOrderEnabledCompat(enable: Boolean): Unit = js.native
        
        def setCurrentItem(item: Double): Unit = js.native
        def setCurrentItem(item: Double, smoothScroll: Boolean): Unit = js.native
        
        def setCurrentItemInternal(item: Double, smoothScroll: Boolean, always: Boolean): Unit = js.native
        def setCurrentItemInternal(item: Double, smoothScroll: Boolean, always: Boolean, velocity: Double): Unit = js.native
        
        def setInternalPageChangeListener(listener: OnPageChangeListener): OnPageChangeListener = js.native
        
        def setOffscreenPageLimit(limit: Double): Unit = js.native
        
        def setOnAdapterChangeListener(listener: OnAdapterChangeListener): Unit = js.native
        
        def setOnPageChangeListener(listener: OnPageChangeListener): Unit = js.native
        
        def setPageMargin(marginPixels: Double): Unit = js.native
        
        def setPageMarginDrawable(d: Drawable): Unit = js.native
        
        def setPageTransformer(reverseDrawingOrder: Boolean, transformer: PageTransformer): Unit = js.native
        
        /* private */ def setScrollState(newState: js.Any): js.Any = js.native
        
        /* private */ def setScrollingCacheEnabled(enabled: js.Any): js.Any = js.native
        
        def smoothScrollTo(x: Double, y: Double): Unit = js.native
        def smoothScrollTo(x: Double, y: Double, velocity: Double): Unit = js.native
        
        /* private */ def sortChildDrawingOrder(): js.Any = js.native
      }
      object ViewPager {
        
        @js.native
        trait LayoutParams
          extends typings.androiduix.android.view.ViewGroup.LayoutParams {
          
          var childIndex: Double = js.native
          
          var gravity: Double = js.native
          
          var isDecor: Boolean = js.native
          
          var needsMeasure: Boolean = js.native
          
          var position: Double = js.native
          
          var widthFactor: Double = js.native
        }
        object LayoutParams {
          
          @scala.inline
          def apply(
            _attrBinder: js.Any,
            childIndex: Double,
            createClassAttrBinder: () => ClassBinderMap,
            equals_ : js.Any => Boolean,
            getAttrBinder: () => AttrBinder,
            gravity: Double,
            hash: js.Any,
            height: Double,
            initBindAttr: () => js.Any,
            isDecor: Boolean,
            needsMeasure: Boolean,
            position: Double,
            setBaseAttributes: (TypedArray, String, String) => Unit,
            width: Double,
            widthFactor: Double
          ): LayoutParams = {
            val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], childIndex = childIndex.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), getAttrBinder = js.Any.fromFunction0(getAttrBinder), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isDecor = isDecor.asInstanceOf[js.Any], needsMeasure = needsMeasure.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), width = width.asInstanceOf[js.Any], widthFactor = widthFactor.asInstanceOf[js.Any])
            __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
            __obj.asInstanceOf[LayoutParams]
          }
          
          @scala.inline
          implicit class LayoutParamsMutableBuilder[Self <: LayoutParams] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setChildIndex(value: Double): Self = StObject.set(x, "childIndex", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setIsDecor(value: Boolean): Self = StObject.set(x, "isDecor", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setNeedsMeasure(value: Boolean): Self = StObject.set(x, "needsMeasure", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setWidthFactor(value: Double): Self = StObject.set(x, "widthFactor", value.asInstanceOf[js.Any])
          }
        }
        
        @js.native
        trait OnAdapterChangeListener extends StObject {
          
          def onAdapterChanged(oldAdapter: PagerAdapter, newAdapter: PagerAdapter): Unit = js.native
        }
        object OnAdapterChangeListener {
          
          @scala.inline
          def apply(onAdapterChanged: (PagerAdapter, PagerAdapter) => Unit): OnAdapterChangeListener = {
            val __obj = js.Dynamic.literal(onAdapterChanged = js.Any.fromFunction2(onAdapterChanged))
            __obj.asInstanceOf[OnAdapterChangeListener]
          }
          
          @scala.inline
          implicit class OnAdapterChangeListenerMutableBuilder[Self <: OnAdapterChangeListener] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setOnAdapterChanged(value: (PagerAdapter, PagerAdapter) => Unit): Self = StObject.set(x, "onAdapterChanged", js.Any.fromFunction2(value))
          }
        }
        
        @js.native
        trait OnPageChangeListener extends StObject {
          
          def onPageScrollStateChanged(state: Double): Unit = js.native
          
          def onPageScrolled(position: Double, positionOffset: Double, positionOffsetPixels: Double): Unit = js.native
          
          def onPageSelected(position: Double): Unit = js.native
        }
        object OnPageChangeListener {
          
          @scala.inline
          def apply(
            onPageScrollStateChanged: Double => Unit,
            onPageScrolled: (Double, Double, Double) => Unit,
            onPageSelected: Double => Unit
          ): OnPageChangeListener = {
            val __obj = js.Dynamic.literal(onPageScrollStateChanged = js.Any.fromFunction1(onPageScrollStateChanged), onPageScrolled = js.Any.fromFunction3(onPageScrolled), onPageSelected = js.Any.fromFunction1(onPageSelected))
            __obj.asInstanceOf[OnPageChangeListener]
          }
          
          @scala.inline
          implicit class OnPageChangeListenerMutableBuilder[Self <: OnPageChangeListener] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setOnPageScrollStateChanged(value: Double => Unit): Self = StObject.set(x, "onPageScrollStateChanged", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnPageScrolled(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "onPageScrolled", js.Any.fromFunction3(value))
            
            @scala.inline
            def setOnPageSelected(value: Double => Unit): Self = StObject.set(x, "onPageSelected", js.Any.fromFunction1(value))
          }
        }
        
        @js.native
        trait PageTransformer extends StObject {
          
          def transformPage(page: View, position: Double): Unit = js.native
        }
        object PageTransformer {
          
          @scala.inline
          def apply(transformPage: (View, Double) => Unit): PageTransformer = {
            val __obj = js.Dynamic.literal(transformPage = js.Any.fromFunction2(transformPage))
            __obj.asInstanceOf[PageTransformer]
          }
          
          @scala.inline
          implicit class PageTransformerMutableBuilder[Self <: PageTransformer] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setTransformPage(value: (View, Double) => Unit): Self = StObject.set(x, "transformPage", js.Any.fromFunction2(value))
          }
        }
        
        @js.native
        trait SimpleOnPageChangeListener extends OnPageChangeListener
        object SimpleOnPageChangeListener {
          
          @scala.inline
          def apply(
            onPageScrollStateChanged: Double => Unit,
            onPageScrolled: (Double, Double, Double) => Unit,
            onPageSelected: Double => Unit
          ): SimpleOnPageChangeListener = {
            val __obj = js.Dynamic.literal(onPageScrollStateChanged = js.Any.fromFunction1(onPageScrollStateChanged), onPageScrolled = js.Any.fromFunction3(onPageScrolled), onPageSelected = js.Any.fromFunction1(onPageSelected))
            __obj.asInstanceOf[SimpleOnPageChangeListener]
          }
        }
      }
    }
    
    object widget {
      
      @js.native
      trait DrawerLayout extends ViewGroup {
        
        /* private */ def _closeDrawer_gravity(gravity: js.Any): js.Any = js.native
        
        /* private */ def _closeDrawer_view(drawerView: js.Any): js.Any = js.native
        
        /* private */ def _isDrawerOpen_gravity(drawerGravity: js.Any): js.Any = js.native
        
        /* private */ def _isDrawerOpen_view(drawer: js.Any): js.Any = js.native
        
        /* private */ def _isDrawerVisible_gravity(drawerGravity: js.Any): js.Any = js.native
        
        /* private */ def _isDrawerVisible_view(drawer: js.Any): js.Any = js.native
        
        /* private */ def _openDrawer_gravity(gravity: js.Any): js.Any = js.native
        
        /* private */ def _openDrawer_view(drawerView: js.Any): js.Any = js.native
        
        def cancelChildViewTouch(): Unit = js.native
        
        def checkDrawerViewAbsoluteGravity(drawerView: View, checkFor: Double): Boolean = js.native
        
        def closeDrawer(drawerView: View): Unit = js.native
        def closeDrawer(gravity: Double): Unit = js.native
        
        def closeDrawers(): Unit = js.native
        def closeDrawers(peekingOnly: Boolean): Unit = js.native
        
        def dispatchOnDrawerClosed(drawerView: View): Unit = js.native
        
        def dispatchOnDrawerOpened(drawerView: View): Unit = js.native
        
        def dispatchOnDrawerSlide(drawerView: View, slideOffset: Double): Unit = js.native
        
        def findDrawerWithGravity(gravity: Double): View = js.native
        
        def findOpenDrawer(): View = js.native
        
        /* private */ def findVisibleDrawer(): js.Any = js.native
        
        def getDrawerLockMode(edgeGravityOrView: Double): Double = js.native
        def getDrawerLockMode(edgeGravityOrView: View): Double = js.native
        
        def getDrawerViewAbsoluteGravity(drawerView: View): Double = js.native
        
        def getDrawerViewOffset(drawerView: View): Double = js.native
        
        /* private */ def hasPeekingDrawer(): js.Any = js.native
        
        /* private */ def hasVisibleDrawer(): js.Any = js.native
        
        def isContentView(child: View): Boolean = js.native
        
        def isDrawerOpen(drawerGravity: Double): Boolean = js.native
        def isDrawerOpen(drawer: View): Boolean = js.native
        
        def isDrawerView(child: View): Boolean = js.native
        
        def isDrawerVisible(drawerGravity: Double): Boolean = js.native
        def isDrawerVisible(drawer: View): Boolean = js.native
        
        var mChildrenCanceledTouch: js.Any = js.native
        
        var mDisallowInterceptRequested: js.Any = js.native
        
        var mDrawerState: js.Any = js.native
        
        var mFirstLayout: js.Any = js.native
        
        var mInLayout: js.Any = js.native
        
        var mInitialMotionX: js.Any = js.native
        
        var mInitialMotionY: js.Any = js.native
        
        var mLeftCallback: js.Any = js.native
        
        var mLeftDragger: js.Any = js.native
        
        var mListener: js.Any = js.native
        
        var mLockModeLeft: js.Any = js.native
        
        var mLockModeRight: js.Any = js.native
        
        var mMinDrawerMargin: js.Any = js.native
        
        var mRightCallback: js.Any = js.native
        
        var mRightDragger: js.Any = js.native
        
        var mScrimColor: js.Any = js.native
        
        var mScrimOpacity: js.Any = js.native
        
        var mScrimPaint: js.Any = js.native
        
        var mShadowLeft: js.Any = js.native
        
        var mShadowRight: js.Any = js.native
        
        def moveDrawerToOffset(drawerView: View, slideOffset: Double): Unit = js.native
        
        def openDrawer(drawerView: View): Unit = js.native
        def openDrawer(gravity: Double): Unit = js.native
        
        def setDrawerListener(listener: DrawerListener): Unit = js.native
        
        def setDrawerLockMode(lockMode: Double): Unit = js.native
        def setDrawerLockMode(lockMode: Double, edgeGravityOrView: Double): Unit = js.native
        def setDrawerLockMode(lockMode: Double, edgeGravityOrView: View): Unit = js.native
        
        def setDrawerShadow(shadowDrawable: Drawable, gravity: Double): Unit = js.native
        
        def setDrawerViewOffset(drawerView: View, slideOffset: Double): Unit = js.native
        
        def setScrimColor(color: Double): Unit = js.native
        
        def updateDrawerState(forGravity: Double, activeState: Double, activeDrawer: View): Unit = js.native
      }
      object DrawerLayout {
        
        @js.native
        trait DrawerListener extends StObject {
          
          def onDrawerClosed(drawerView: View): Unit = js.native
          
          def onDrawerOpened(drawerView: View): Unit = js.native
          
          def onDrawerSlide(drawerView: View, slideOffset: Double): Unit = js.native
          
          def onDrawerStateChanged(newState: Double): Unit = js.native
        }
        object DrawerListener {
          
          @scala.inline
          def apply(
            onDrawerClosed: View => Unit,
            onDrawerOpened: View => Unit,
            onDrawerSlide: (View, Double) => Unit,
            onDrawerStateChanged: Double => Unit
          ): DrawerListener = {
            val __obj = js.Dynamic.literal(onDrawerClosed = js.Any.fromFunction1(onDrawerClosed), onDrawerOpened = js.Any.fromFunction1(onDrawerOpened), onDrawerSlide = js.Any.fromFunction2(onDrawerSlide), onDrawerStateChanged = js.Any.fromFunction1(onDrawerStateChanged))
            __obj.asInstanceOf[DrawerListener]
          }
          
          @scala.inline
          implicit class DrawerListenerMutableBuilder[Self <: DrawerListener] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setOnDrawerClosed(value: View => Unit): Self = StObject.set(x, "onDrawerClosed", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnDrawerOpened(value: View => Unit): Self = StObject.set(x, "onDrawerOpened", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnDrawerSlide(value: (View, Double) => Unit): Self = StObject.set(x, "onDrawerSlide", js.Any.fromFunction2(value))
            
            @scala.inline
            def setOnDrawerStateChanged(value: Double => Unit): Self = StObject.set(x, "onDrawerStateChanged", js.Any.fromFunction1(value))
          }
        }
        
        @js.native
        trait LayoutParams extends MarginLayoutParams {
          
          var gravity: Double = js.native
          
          var isPeeking: Boolean = js.native
          
          var knownOpen: Boolean = js.native
          
          var onScreen: Double = js.native
        }
        object LayoutParams {
          
          @scala.inline
          def apply(
            _attrBinder: js.Any,
            bottomMargin: Double,
            createClassAttrBinder: () => ClassBinderMap,
            equals_ : js.Any => Boolean,
            getAttrBinder: () => AttrBinder,
            getLayoutDirection: () => Double,
            gravity: Double,
            hash: js.Any,
            height: Double,
            initBindAttr: () => js.Any,
            isLayoutRtl: () => Boolean,
            isPeeking: Boolean,
            knownOpen: Boolean,
            leftMargin: Double,
            onScreen: Double,
            resolveLayoutDirection: Double => Unit,
            rightMargin: Double,
            setBaseAttributes: (TypedArray, String, String) => Unit,
            setLayoutDirection: Double => Unit,
            setMargins: (Double, Double, Double, Double) => Unit,
            topMargin: Double,
            width: Double
          ): LayoutParams = {
            val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), isPeeking = isPeeking.asInstanceOf[js.Any], knownOpen = knownOpen.asInstanceOf[js.Any], leftMargin = leftMargin.asInstanceOf[js.Any], onScreen = onScreen.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), topMargin = topMargin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
            __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
            __obj.asInstanceOf[LayoutParams]
          }
          
          @scala.inline
          implicit class LayoutParamsMutableBuilder[Self <: LayoutParams] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setIsPeeking(value: Boolean): Self = StObject.set(x, "isPeeking", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setKnownOpen(value: Boolean): Self = StObject.set(x, "knownOpen", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setOnScreen(value: Double): Self = StObject.set(x, "onScreen", value.asInstanceOf[js.Any])
          }
        }
        
        @js.native
        trait SimpleDrawerListener extends DrawerListener
        object SimpleDrawerListener {
          
          @scala.inline
          def apply(
            onDrawerClosed: View => Unit,
            onDrawerOpened: View => Unit,
            onDrawerSlide: (View, Double) => Unit,
            onDrawerStateChanged: Double => Unit
          ): SimpleDrawerListener = {
            val __obj = js.Dynamic.literal(onDrawerClosed = js.Any.fromFunction1(onDrawerClosed), onDrawerOpened = js.Any.fromFunction1(onDrawerOpened), onDrawerSlide = js.Any.fromFunction2(onDrawerSlide), onDrawerStateChanged = js.Any.fromFunction1(onDrawerStateChanged))
            __obj.asInstanceOf[SimpleDrawerListener]
          }
        }
        
        @js.native
        trait ViewDragCallback extends Callback {
          
          var _DrawerLayout_this: DrawerLayout = js.native
          
          /* private */ def closeOtherDrawer(): js.Any = js.native
          
          var mAbsGravity: js.Any = js.native
          
          var mDragger: js.Any = js.native
          
          var mPeekRunnable: js.Any = js.native
          
          /* private */ def peekDrawer(): js.Any = js.native
          
          def removeCallbacks(): Unit = js.native
          
          def setDragger(dragger: ViewDragHelper): Unit = js.native
        }
        object ViewDragCallback {
          
          @scala.inline
          def apply(
            _DrawerLayout_this: DrawerLayout,
            clampViewPositionHorizontal: (View, Double, Double) => Double,
            clampViewPositionVertical: (View, Double, Double) => Double,
            closeOtherDrawer: () => js.Any,
            getOrderedChildIndex: Double => Double,
            getViewHorizontalDragRange: View => Double,
            getViewVerticalDragRange: View => Double,
            mAbsGravity: js.Any,
            mDragger: js.Any,
            mPeekRunnable: js.Any,
            onEdgeDragStarted: (Double, Double) => Unit,
            onEdgeLock: Double => Boolean,
            onEdgeTouched: (Double, Double) => Unit,
            onViewCaptured: (View, Double) => Unit,
            onViewDragStateChanged: Double => Unit,
            onViewPositionChanged: (View, Double, Double, Double, Double) => Unit,
            onViewReleased: (View, Double, Double) => Unit,
            peekDrawer: () => js.Any,
            removeCallbacks: () => Unit,
            setDragger: ViewDragHelper => Unit,
            tryCaptureView: (View, Double) => Boolean
          ): ViewDragCallback = {
            val __obj = js.Dynamic.literal(_DrawerLayout_this = _DrawerLayout_this.asInstanceOf[js.Any], clampViewPositionHorizontal = js.Any.fromFunction3(clampViewPositionHorizontal), clampViewPositionVertical = js.Any.fromFunction3(clampViewPositionVertical), closeOtherDrawer = js.Any.fromFunction0(closeOtherDrawer), getOrderedChildIndex = js.Any.fromFunction1(getOrderedChildIndex), getViewHorizontalDragRange = js.Any.fromFunction1(getViewHorizontalDragRange), getViewVerticalDragRange = js.Any.fromFunction1(getViewVerticalDragRange), mAbsGravity = mAbsGravity.asInstanceOf[js.Any], mDragger = mDragger.asInstanceOf[js.Any], mPeekRunnable = mPeekRunnable.asInstanceOf[js.Any], onEdgeDragStarted = js.Any.fromFunction2(onEdgeDragStarted), onEdgeLock = js.Any.fromFunction1(onEdgeLock), onEdgeTouched = js.Any.fromFunction2(onEdgeTouched), onViewCaptured = js.Any.fromFunction2(onViewCaptured), onViewDragStateChanged = js.Any.fromFunction1(onViewDragStateChanged), onViewPositionChanged = js.Any.fromFunction5(onViewPositionChanged), onViewReleased = js.Any.fromFunction3(onViewReleased), peekDrawer = js.Any.fromFunction0(peekDrawer), removeCallbacks = js.Any.fromFunction0(removeCallbacks), setDragger = js.Any.fromFunction1(setDragger), tryCaptureView = js.Any.fromFunction2(tryCaptureView))
            __obj.asInstanceOf[ViewDragCallback]
          }
          
          @scala.inline
          implicit class ViewDragCallbackMutableBuilder[Self <: ViewDragCallback] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setCloseOtherDrawer(value: () => js.Any): Self = StObject.set(x, "closeOtherDrawer", js.Any.fromFunction0(value))
            
            @scala.inline
            def setMAbsGravity(value: js.Any): Self = StObject.set(x, "mAbsGravity", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMDragger(value: js.Any): Self = StObject.set(x, "mDragger", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMPeekRunnable(value: js.Any): Self = StObject.set(x, "mPeekRunnable", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setPeekDrawer(value: () => js.Any): Self = StObject.set(x, "peekDrawer", js.Any.fromFunction0(value))
            
            @scala.inline
            def setRemoveCallbacks(value: () => Unit): Self = StObject.set(x, "removeCallbacks", js.Any.fromFunction0(value))
            
            @scala.inline
            def setSetDragger(value: ViewDragHelper => Unit): Self = StObject.set(x, "setDragger", js.Any.fromFunction1(value))
            
            @scala.inline
            def set_DrawerLayout_this(value: DrawerLayout): Self = StObject.set(x, "_DrawerLayout_this", value.asInstanceOf[js.Any])
          }
        }
      }
      
      @js.native
      trait ViewDragHelper extends StObject {
        
        /* private */ def _checkTouchSlop_1(directions: js.Any): js.Any = js.native
        
        /* private */ def _checkTouchSlop_2(directions: js.Any, pointerId: js.Any): js.Any = js.native
        
        /* private */ def _checkTouchSlop_3(child: js.Any, dx: js.Any, dy: js.Any): js.Any = js.native
        
        def abort(): Unit = js.native
        
        /* protected */ def canScroll(v: View, checkV: Boolean, dx: Double, dy: Double, x: Double, y: Double): Boolean = js.native
        
        def cancel(): Unit = js.native
        
        def captureChildView(childView: View, activePointerId: Double): Unit = js.native
        
        /* private */ def checkNewEdgeDrag(delta: js.Any, odelta: js.Any, pointerId: js.Any, edge: js.Any): js.Any = js.native
        
        def checkTouchSlop(child: View, dx: Double, dy: Double): Boolean = js.native
        def checkTouchSlop(directions: Double): Boolean = js.native
        def checkTouchSlop(directions: Double, pointerId: Double): Boolean = js.native
        
        /* private */ def clampMag(value: js.Any, absMin: js.Any, absMax: js.Any): js.Any = js.native
        
        /* private */ def clearMotionHistory(pointerId: js.Any): js.Any = js.native
        
        /* private */ def computeAxisDuration(delta: js.Any, velocity: js.Any, motionRange: js.Any): js.Any = js.native
        
        /* private */ def computeSettleDuration(child: js.Any, dx: js.Any, dy: js.Any, xvel: js.Any, yvel: js.Any): js.Any = js.native
        
        def continueSettling(deferCallbacks: Boolean): Boolean = js.native
        
        /* private */ def dispatchViewReleased(xvel: js.Any, yvel: js.Any): js.Any = js.native
        
        /* private */ def distanceInfluenceForSnapDuration(f: js.Any): js.Any = js.native
        
        /* private */ def dragTo(left: js.Any, top: js.Any, dx: js.Any, dy: js.Any): js.Any = js.native
        
        /* private */ def ensureMotionHistorySizeForId(pointerId: js.Any): js.Any = js.native
        
        def findTopChildUnder(x: Double, y: Double): View = js.native
        
        def flingCapturedView(minLeft: Double, minTop: Double, maxLeft: Double, maxTop: Double): Unit = js.native
        
        /* private */ def forceSettleCapturedViewAt(finalLeft: js.Any, finalTop: js.Any, xvel: js.Any, yvel: js.Any): js.Any = js.native
        
        def getActivePointerId(): Double = js.native
        
        def getCapturedView(): View = js.native
        
        def getEdgeSize(): Double = js.native
        
        /* private */ def getEdgesTouched(x: js.Any, y: js.Any): js.Any = js.native
        
        def getMinVelocity(): Double = js.native
        
        def getTouchSlop(): Double = js.native
        
        def getViewDragState(): Double = js.native
        
        def isCapturedViewUnder(x: Double, y: Double): Boolean = js.native
        
        def isEdgeTouched(edges: Double): Boolean = js.native
        def isEdgeTouched(edges: Double, pointerId: Double): Boolean = js.native
        
        def isPointerDown(pointerId: Double): Boolean = js.native
        
        def isViewUnder(view: View, x: Double, y: Double): Boolean = js.native
        
        var mActivePointerId: js.Any = js.native
        
        var mCallback: js.Any = js.native
        
        var mCapturedView: js.Any = js.native
        
        var mDragState: js.Any = js.native
        
        var mEdgeDragsInProgress: js.Any = js.native
        
        var mEdgeDragsLocked: js.Any = js.native
        
        var mEdgeSize: js.Any = js.native
        
        var mInitialEdgesTouched: js.Any = js.native
        
        var mInitialMotionX: js.Any = js.native
        
        var mInitialMotionY: js.Any = js.native
        
        var mLastMotionX: js.Any = js.native
        
        var mLastMotionY: js.Any = js.native
        
        var mMaxVelocity: js.Any = js.native
        
        var mMinVelocity: js.Any = js.native
        
        var mParentView: js.Any = js.native
        
        var mPointersDown: js.Any = js.native
        
        var mReleaseInProgress: js.Any = js.native
        
        var mScroller: js.Any = js.native
        
        var mSetIdleRunnable: js.Any = js.native
        
        var mTouchSlop: js.Any = js.native
        
        var mTrackingEdges: js.Any = js.native
        
        var mVelocityTracker: js.Any = js.native
        
        def processTouchEvent(ev: MotionEvent): Unit = js.native
        
        /* private */ def releaseViewForPointerUp(): js.Any = js.native
        
        /* private */ def reportNewEdgeDrags(dx: js.Any, dy: js.Any, pointerId: js.Any): js.Any = js.native
        
        /* private */ def saveInitialMotion(x: js.Any, y: js.Any, pointerId: js.Any): js.Any = js.native
        
        /* private */ def saveLastMotion(ev: js.Any): js.Any = js.native
        
        def setDragState(state: Double): Unit = js.native
        
        def setEdgeTrackingEnabled(edgeFlags: Double): Unit = js.native
        
        def setMinVelocity(minVel: Double): Unit = js.native
        
        def settleCapturedViewAt(finalLeft: Double, finalTop: Double): Boolean = js.native
        
        def shouldInterceptTouchEvent(ev: MotionEvent): Boolean = js.native
        
        def smoothSlideViewTo(child: View, finalLeft: Double, finalTop: Double): Boolean = js.native
        
        def tryCaptureViewForDrag(toCapture: View, pointerId: Double): Boolean = js.native
      }
      object ViewDragHelper {
        
        @js.native
        trait Callback extends StObject {
          
          def clampViewPositionHorizontal(child: View, left: Double, dx: Double): Double = js.native
          
          def clampViewPositionVertical(child: View, top: Double, dy: Double): Double = js.native
          
          def getOrderedChildIndex(index: Double): Double = js.native
          
          def getViewHorizontalDragRange(child: View): Double = js.native
          
          def getViewVerticalDragRange(child: View): Double = js.native
          
          def onEdgeDragStarted(edgeFlags: Double, pointerId: Double): Unit = js.native
          
          def onEdgeLock(edgeFlags: Double): Boolean = js.native
          
          def onEdgeTouched(edgeFlags: Double, pointerId: Double): Unit = js.native
          
          def onViewCaptured(capturedChild: View, activePointerId: Double): Unit = js.native
          
          def onViewDragStateChanged(state: Double): Unit = js.native
          
          def onViewPositionChanged(changedView: View, left: Double, top: Double, dx: Double, dy: Double): Unit = js.native
          
          def onViewReleased(releasedChild: View, xvel: Double, yvel: Double): Unit = js.native
          
          def tryCaptureView(child: View, pointerId: Double): Boolean = js.native
        }
        object Callback {
          
          @scala.inline
          def apply(
            clampViewPositionHorizontal: (View, Double, Double) => Double,
            clampViewPositionVertical: (View, Double, Double) => Double,
            getOrderedChildIndex: Double => Double,
            getViewHorizontalDragRange: View => Double,
            getViewVerticalDragRange: View => Double,
            onEdgeDragStarted: (Double, Double) => Unit,
            onEdgeLock: Double => Boolean,
            onEdgeTouched: (Double, Double) => Unit,
            onViewCaptured: (View, Double) => Unit,
            onViewDragStateChanged: Double => Unit,
            onViewPositionChanged: (View, Double, Double, Double, Double) => Unit,
            onViewReleased: (View, Double, Double) => Unit,
            tryCaptureView: (View, Double) => Boolean
          ): Callback = {
            val __obj = js.Dynamic.literal(clampViewPositionHorizontal = js.Any.fromFunction3(clampViewPositionHorizontal), clampViewPositionVertical = js.Any.fromFunction3(clampViewPositionVertical), getOrderedChildIndex = js.Any.fromFunction1(getOrderedChildIndex), getViewHorizontalDragRange = js.Any.fromFunction1(getViewHorizontalDragRange), getViewVerticalDragRange = js.Any.fromFunction1(getViewVerticalDragRange), onEdgeDragStarted = js.Any.fromFunction2(onEdgeDragStarted), onEdgeLock = js.Any.fromFunction1(onEdgeLock), onEdgeTouched = js.Any.fromFunction2(onEdgeTouched), onViewCaptured = js.Any.fromFunction2(onViewCaptured), onViewDragStateChanged = js.Any.fromFunction1(onViewDragStateChanged), onViewPositionChanged = js.Any.fromFunction5(onViewPositionChanged), onViewReleased = js.Any.fromFunction3(onViewReleased), tryCaptureView = js.Any.fromFunction2(tryCaptureView))
            __obj.asInstanceOf[Callback]
          }
          
          @scala.inline
          implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setClampViewPositionHorizontal(value: (View, Double, Double) => Double): Self = StObject.set(x, "clampViewPositionHorizontal", js.Any.fromFunction3(value))
            
            @scala.inline
            def setClampViewPositionVertical(value: (View, Double, Double) => Double): Self = StObject.set(x, "clampViewPositionVertical", js.Any.fromFunction3(value))
            
            @scala.inline
            def setGetOrderedChildIndex(value: Double => Double): Self = StObject.set(x, "getOrderedChildIndex", js.Any.fromFunction1(value))
            
            @scala.inline
            def setGetViewHorizontalDragRange(value: View => Double): Self = StObject.set(x, "getViewHorizontalDragRange", js.Any.fromFunction1(value))
            
            @scala.inline
            def setGetViewVerticalDragRange(value: View => Double): Self = StObject.set(x, "getViewVerticalDragRange", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnEdgeDragStarted(value: (Double, Double) => Unit): Self = StObject.set(x, "onEdgeDragStarted", js.Any.fromFunction2(value))
            
            @scala.inline
            def setOnEdgeLock(value: Double => Boolean): Self = StObject.set(x, "onEdgeLock", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnEdgeTouched(value: (Double, Double) => Unit): Self = StObject.set(x, "onEdgeTouched", js.Any.fromFunction2(value))
            
            @scala.inline
            def setOnViewCaptured(value: (View, Double) => Unit): Self = StObject.set(x, "onViewCaptured", js.Any.fromFunction2(value))
            
            @scala.inline
            def setOnViewDragStateChanged(value: Double => Unit): Self = StObject.set(x, "onViewDragStateChanged", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnViewPositionChanged(value: (View, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onViewPositionChanged", js.Any.fromFunction5(value))
            
            @scala.inline
            def setOnViewReleased(value: (View, Double, Double) => Unit): Self = StObject.set(x, "onViewReleased", js.Any.fromFunction3(value))
            
            @scala.inline
            def setTryCaptureView(value: (View, Double) => Boolean): Self = StObject.set(x, "tryCaptureView", js.Any.fromFunction2(value))
          }
        }
      }
    }
  }
}
