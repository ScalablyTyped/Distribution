package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.res.ColorStateList
import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Matrix
import typings.androiduix.android.graphics.Point
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.os.Handler
import typings.androiduix.android.text.BoringLayout.Metrics
import typings.androiduix.android.text.Layout
import typings.androiduix.android.text.Spannable
import typings.androiduix.android.text.Spannable.Factory
import typings.androiduix.android.text.Spanned
import typings.androiduix.android.text.TextDirectionHeuristic
import typings.androiduix.android.text.TextPaint
import typings.androiduix.android.text.TextUtils.TruncateAt
import typings.androiduix.android.text.TextWatcher
import typings.androiduix.android.text.method.MovementMethod
import typings.androiduix.android.text.method.TransformationMethod
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.KeyEvent.DispatcherState
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.TouchDelegate
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.AttachInfo
import typings.androiduix.android.view.View.ListenerInfo
import typings.androiduix.android.view.View.OnAttachStateChangeListener
import typings.androiduix.android.view.View.OnClickListener
import typings.androiduix.android.view.View.OnFocusChangeListener
import typings.androiduix.android.view.View.OnKeyListener
import typings.androiduix.android.view.View.OnLayoutChangeListener
import typings.androiduix.android.view.View.OnLongClickListener
import typings.androiduix.android.view.View.OnTouchListener
import typings.androiduix.android.view.View.Predicate
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.android.view.ViewParent
import typings.androiduix.android.view.ViewRootImpl
import typings.androiduix.android.view.ViewTreeObserver
import typings.androiduix.android.view.ViewTreeObserver.OnPreDrawListener
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.widget.TextView.BufferType
import typings.androiduix.android.widget.TextView.Drawables
import typings.androiduix.android.widget.TextView.OnEditorActionListener
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typings.androiduix.java_.lang.Runnable
import typings.androiduix.java_.util.ArrayList
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextView_
  extends View
     with OnPreDrawListener {
  
  /* InferMemberOverrides */
  /* private */ override def _fireStateChangeToAttribute(oldState: js.Any, newState: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  /* private */ override def _getBinderAttrValue(key: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  /* private */ override def _initAttrObserver(): js.Any = js.native
  
  /* InferMemberOverrides */
  /* private */ override def _invalidateCache(invalidateCache: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  /* private */ override def _invalidateRect(l: js.Any, t: js.Any, r: js.Any, b: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def _syncBoundAndScrollToElement(): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def _syncMatrixToElement(): Unit = js.native
  
  /* InferMemberOverrides */
  override def addFocusables(views: ArrayList[View], direction: Double): Unit = js.native
  /* InferMemberOverrides */
  override def addFocusables(views: ArrayList[View], direction: Double, focusableMode: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def addOnAttachStateChangeListener(listener: OnAttachStateChangeListener): Unit = js.native
  
  /* InferMemberOverrides */
  override def addOnLayoutChangeListener(listener: OnLayoutChangeListener): Unit = js.native
  
  def addTextChangedListener(watcher: TextWatcher): Unit = js.native
  
  /* InferMemberOverrides */
  override def addTouchables(views: ArrayList[View]): Unit = js.native
  
  /* private */ def applySingleLine(singleLine: js.Any, applyTransformation: js.Any, changeMaxLines: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def assignParent(parent: ViewParent): Unit = js.native
  
  /* private */ def assumeLayout(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def awakenScrollBars(): Boolean = js.native
  /* InferMemberOverrides */
  override def awakenScrollBars(startDelay: js.UndefOr[scala.Nothing], invalidate: Boolean): Boolean = js.native
  /* InferMemberOverrides */
  override def awakenScrollBars(startDelay: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def awakenScrollBars(startDelay: Double, invalidate: Boolean): Boolean = js.native
  
  def bringPointIntoView(offset: Double): Boolean = js.native
  
  /* private */ def bringTextIntoView(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def bringToFront(): Unit = js.native
  
  /* InferMemberOverrides */
  override def buildDrawingCache(): Unit = js.native
  /* InferMemberOverrides */
  override def buildDrawingCache(autoScale: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def callOnClick(): Boolean = js.native
  
  def canCopy(): Boolean = js.native
  
  def canCut(): Boolean = js.native
  
  /* private */ def canMarquee(): js.Any = js.native
  
  def canPaste(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def canScrollHorizontally(direction: Double): Boolean = js.native
  
  /* InferMemberOverrides */
  override def canScrollVertically(direction: Double): Boolean = js.native
  
  /* private */ def canSelectText(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def cancelLongPress(): Unit = js.native
  
  /* InferMemberOverrides */
  override def cancelPendingInputEvents(): Unit = js.native
  
  /* InferMemberOverrides */
  /* private */ override def checkForLongClick(delayOffset: js.Any): js.Any = js.native
  
  /* private */ def checkForRelayout(): js.Any = js.native
  
  /* private */ def checkForResize(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def cleanupDraw(): Unit = js.native
  
  /* InferMemberOverrides */
  override def clearAnimation(): Unit = js.native
  
  def clearComposingText(): Unit = js.native
  
  /* InferMemberOverrides */
  override def clearFocus(): Unit = js.native
  
  /* InferMemberOverrides */
  override def clearFocusInternal(propagate: Boolean, refocus: Boolean): Unit = js.native
  
  /* private */ def compressText(width: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def computeHorizontalScrollExtent(): Double = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def computeHorizontalScrollOffset(): Double = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def computeHorizontalScrollRange(): Double = js.native
  
  /* InferMemberOverrides */
  /* private */ override def computeOpaqueFlags(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def computeScroll(): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def computeVerticalScrollExtent(): Double = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def computeVerticalScrollOffset(): Double = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def computeVerticalScrollRange(): Double = js.native
  
  /* private */ def convertFromViewportToContentCoordinates(r: js.Any): js.Any = js.native
  
  def convertToLocalHorizontalCoordinate(x: Double): Double = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def createClassAttrBinder(): ClassBinderMap = js.native
  
  /* private */ def createEditorIfNeeded(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def debug(): Unit = js.native
  /* InferMemberOverrides */
  override def debug(depth: Double): Unit = js.native
  
  /* protected */ def deleteText_internal(start: Double, end: Double): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def dependOnDebugLayout(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def destroyDrawingCache(): Unit = js.native
  
  def didTouchFocusSelect(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def dispatchAttachedToWindow(info: AttachInfo, visibility: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchCancelPendingInputEvents(): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchDetachedFromWindow(): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchDisplayHint(hint: Double): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def dispatchDraw(canvas: Canvas): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchFinishTemporaryDetach(): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchGenericMotionEvent(event: MotionEvent): Boolean = js.native
  
  /* InferMemberOverrides */
  /* private */ override def dispatchGenericMotionEventInternal(event: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def dispatchGenericPointerEvent(event: MotionEvent): Boolean = js.native
  
  /* InferMemberOverrides */
  override def dispatchKeyEvent(event: KeyEvent): Boolean = js.native
  
  /* InferMemberOverrides */
  override def dispatchSetActivated(activated: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchSetPressed(pressed: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchSetSelected(selected: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchStartTemporaryDetach(): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchTouchEvent(event: MotionEvent): Boolean = js.native
  
  /* InferMemberOverrides */
  override def dispatchUnhandledMove(focused: View, direction: Double): Boolean = js.native
  
  /* InferMemberOverrides */
  override def dispatchVisibilityChanged(changedView: View, visibility: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchWindowFocusChanged(hasFocus: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def dispatchWindowVisibilityChanged(visibility: Double): Unit = js.native
  
  /* private */ def doKeyDown(keyCode: js.Any, event: js.Any, otherEvent: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def draw(canvas: Canvas): Unit = js.native
  
  /* InferMemberOverrides */
  /* private */ override def drawAnimation(parent: js.Any, drawingTime: js.Any, a: js.Any, scalingRequired: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def drawFromParent(canvas: Canvas, parent: ViewGroup, drawingTime: Double): Boolean = js.native
  
  /* InferMemberOverrides */
  /* private */ override def drawShadow(canvas: js.Any): js.Any = js.native
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MTextView_(d: Drawable): Unit = js.native
  /* InferMemberOverrides */
  @JSName("drawableSizeChange")
  override def drawableSizeChange_MView_(who: Drawable): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def drawableStateChanged(): Unit = js.native
  
  /* InferMemberOverrides */
  override def ensureTransformationInfo(): Unit = js.native
  
  /* InferMemberOverrides */
  override def findFocus(): View = js.native
  
  /* InferMemberOverrides */
  override def findUserSetNextFocus(root: View, direction: Double): View = js.native
  
  /* InferMemberOverrides */
  override def findViewById(id: String): View = js.native
  
  /* InferMemberOverrides */
  override def findViewByPredicate(predicate: Predicate[View]): View = js.native
  
  /* InferMemberOverrides */
  override def findViewByPredicateInsideOut(start: View, predicate: Predicate[View]): View = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def findViewByPredicateTraversal(predicate: Predicate[View], childToSkip: View): View = js.native
  
  /* InferMemberOverrides */
  /* private */ override def findViewInsideOutShouldExist(root: js.Any, id: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def findViewTraversal(id: String): View = js.native
  
  /* InferMemberOverrides */
  override def findViewWithTag(tag: js.Any): View = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def findViewWithTagTraversal(tag: js.Any): View = js.native
  
  /* private */ def fixFocusableAndClickableSettings(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def focusSearch(direction: Double): View = js.native
  
  /* InferMemberOverrides */
  override def forceLayout(): Unit = js.native
  
  /* InferMemberOverrides */
  override def getAlpha(): Double = js.native
  
  /* InferMemberOverrides */
  override def getAnimation(): Animation = js.native
  
  def getAutoLinkMask(): Double = js.native
  
  /* InferMemberOverrides */
  override def getBackground(): Drawable = js.native
  
  /* InferMemberOverrides */
  override def getBaseline(): Double = js.native
  
  /* InferMemberOverrides */
  override def getBottom(): Double = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def getBottomFadingEdgeStrength(): Double = js.native
  
  /* protected */ def getBottomPaddingOffset(): Double = js.native
  
  /* private */ def getBottomVerticalOffset(forceNormal: js.Any): js.Any = js.native
  
  /* private */ def getBoxHeight(l: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def getClipBounds(): Rect = js.native
  
  def getCompoundDrawablePadding(): Double = js.native
  
  def getCompoundDrawables(): js.Array[Drawable] = js.native
  
  def getCompoundDrawablesRelative(): js.Array[Drawable] = js.native
  
  def getCompoundPaddingBottom(): Double = js.native
  
  def getCompoundPaddingEnd(): Double = js.native
  
  def getCompoundPaddingLeft(): Double = js.native
  
  def getCompoundPaddingRight(): Double = js.native
  
  def getCompoundPaddingStart(): Double = js.native
  
  def getCompoundPaddingTop(): Double = js.native
  
  /* InferMemberOverrides */
  override def getContext(): Context = js.native
  
  /* InferMemberOverrides */
  override def getCornerRadiusBottomLeft(): Double = js.native
  
  /* InferMemberOverrides */
  override def getCornerRadiusBottomRight(): Double = js.native
  
  /* InferMemberOverrides */
  override def getCornerRadiusTopLeft(): Double = js.native
  
  /* InferMemberOverrides */
  override def getCornerRadiusTopRight(): Double = js.native
  
  def getCurrentHintTextColor(): Double = js.native
  
  def getCurrentTextColor(): Double = js.native
  
  def getCustomSelectionActionModeCallback(): js.Any = js.native
  
  /* protected */ def getDefaultEditable(): Boolean = js.native
  
  /* protected */ def getDefaultMovementMethod(): MovementMethod = js.native
  
  /* private */ def getDesiredHeight(layout: js.Any, cap: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def getDrawableState(): js.Array[Double] = js.native
  
  /* InferMemberOverrides */
  override def getDrawingCache(): Canvas = js.native
  /* InferMemberOverrides */
  override def getDrawingCache(autoScale: Boolean): Canvas = js.native
  
  /* InferMemberOverrides */
  override def getDrawingCacheBackgroundColor(): Double = js.native
  
  /* InferMemberOverrides */
  override def getDrawingRect(outRect: Rect): Unit = js.native
  
  /* InferMemberOverrides */
  override def getDrawingTime(): Double = js.native
  
  def getEditableText(): js.Any = js.native
  
  def getEllipsize(): TruncateAt = js.native
  
  def getExtendedPaddingBottom(): Double = js.native
  
  def getExtendedPaddingTop(): Double = js.native
  
  /* protected */ def getFadeHeight(offsetRequired: Boolean): Double = js.native
  
  /* protected */ def getFadeTop(offsetRequired: Boolean): Double = js.native
  
  def getFilters(): js.Array[_] = js.native
  
  /* InferMemberOverrides */
  /* private */ override def getFinalAlpha(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def getFocusables(direction: Double): ArrayList[View] = js.native
  
  /* InferMemberOverrides */
  override def getFocusedRect(r: Rect): Unit = js.native
  
  def getFreezesText(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def getGlobalVisibleRect(r: Rect): Boolean = js.native
  /* InferMemberOverrides */
  override def getGlobalVisibleRect(r: Rect, globalOffset: Point): Boolean = js.native
  
  def getGravity(): Double = js.native
  
  /* InferMemberOverrides */
  override def getHandler(): Handler = js.native
  
  /* InferMemberOverrides */
  override def getHeight(): Double = js.native
  
  def getHighlightColor(): Double = js.native
  
  def getHint(): String = js.native
  
  def getHintLayout(): Layout = js.native
  
  def getHintTextColors(): ColorStateList = js.native
  
  /* InferMemberOverrides */
  override def getHitRect(outRect: Rect): Unit = js.native
  
  /* InferMemberOverrides */
  override def getHorizontalFadingEdgeLength(): Double = js.native
  
  def getHorizontalOffsetForDrawables(): Double = js.native
  
  /* InferMemberOverrides */
  override def getHorizontalScrollFactor(): Double = js.native
  
  /* InferMemberOverrides */
  override def getHorizontalScrollbarHeight(): Double = js.native
  
  def getHorizontallyScrolling(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def getId(): String = js.native
  
  def getImeActionId(): Double = js.native
  
  def getImeActionLabel(): String = js.native
  
  def getImeOptions(): Double = js.native
  
  def getIncludeFontPadding(): Boolean = js.native
  
  def getInputType(): Double = js.native
  
  /* private */ def getInterestingRect(r: js.Any, line: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def getKeyDispatcherState(): DispatcherState = js.native
  
  def getKeyListener(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def getLayerType(): Double = js.native
  
  def getLayout(): Layout = js.native
  
  /* private */ def getLayoutAlignment(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def getLayoutDirection(): Double = js.native
  
  /* InferMemberOverrides */
  override def getLayoutParams(): LayoutParams = js.native
  
  /* InferMemberOverrides */
  override def getLeft(): Double = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def getLeftFadingEdgeStrength(): Double = js.native
  
  /* protected */ def getLeftPaddingOffset(): Double = js.native
  
  def getLineAtCoordinate(y: Double): Double = js.native
  
  def getLineBounds(line: Double, bounds: Rect): Double = js.native
  
  def getLineCount(): Double = js.native
  
  def getLineHeight(): Double = js.native
  
  def getLineSpacingExtra(): Double = js.native
  
  def getLineSpacingMultiplier(): Double = js.native
  
  def getLinkTextColors(): ColorStateList = js.native
  
  def getLinksClickable(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def getListenerInfo(): ListenerInfo = js.native
  
  /* InferMemberOverrides */
  override def getLocationInWindow(location: js.Array[Double]): Unit = js.native
  
  /* InferMemberOverrides */
  override def getLocationOnScreen(location: js.Array[Double]): Unit = js.native
  
  def getMarqueeRepeatLimit(): Double = js.native
  
  /* InferMemberOverrides */
  override def getMatrix(): Matrix = js.native
  
  def getMaxEms(): Double = js.native
  
  def getMaxHeight(): Double = js.native
  
  def getMaxLines(): Double = js.native
  
  def getMaxWidth(): Double = js.native
  
  /* InferMemberOverrides */
  override def getMeasuredHeight(): Double = js.native
  
  /* InferMemberOverrides */
  override def getMeasuredHeightAndState(): Double = js.native
  
  /* InferMemberOverrides */
  override def getMeasuredState(): Double = js.native
  
  /* InferMemberOverrides */
  override def getMeasuredWidth(): Double = js.native
  
  /* InferMemberOverrides */
  override def getMeasuredWidthAndState(): Double = js.native
  
  def getMinEms(): Double = js.native
  
  def getMinHeight(): Double = js.native
  
  def getMinLines(): Double = js.native
  
  def getMinWidth(): Double = js.native
  
  /* InferMemberOverrides */
  override def getMinimumHeight(): Double = js.native
  
  /* InferMemberOverrides */
  override def getMinimumWidth(): Double = js.native
  
  def getMovementMethod(): MovementMethod = js.native
  
  /* InferMemberOverrides */
  override def getNextFocusDownId(): String = js.native
  
  /* InferMemberOverrides */
  override def getNextFocusForwardId(): String = js.native
  
  /* InferMemberOverrides */
  override def getNextFocusLeftId(): String = js.native
  
  /* InferMemberOverrides */
  override def getNextFocusRightId(): String = js.native
  
  /* InferMemberOverrides */
  override def getNextFocusUpId(): String = js.native
  
  /* private */ def getOffsetAtCoordinate(line: js.Any, x: js.Any): js.Any = js.native
  
  def getOffsetForPosition(x: Double, y: Double): Double = js.native
  
  /* InferMemberOverrides */
  override def getOnFocusChangeListener(): OnFocusChangeListener = js.native
  
  /* InferMemberOverrides */
  override def getOverScrollMode(): Double = js.native
  
  /* InferMemberOverrides */
  override def getPaddingBottom(): Double = js.native
  
  /* InferMemberOverrides */
  override def getPaddingLeft(): Double = js.native
  
  /* InferMemberOverrides */
  override def getPaddingRight(): Double = js.native
  
  /* InferMemberOverrides */
  override def getPaddingTop(): Double = js.native
  
  def getPaint(): TextPaint = js.native
  
  def getPaintFlags(): Double = js.native
  
  /* InferMemberOverrides */
  override def getParent(): ViewParent = js.native
  
  /* InferMemberOverrides */
  override def getPivotX(): Double = js.native
  
  /* InferMemberOverrides */
  override def getPivotY(): Double = js.native
  
  /* InferMemberOverrides */
  override def getResources(): Resources = js.native
  
  /* InferMemberOverrides */
  override def getRight(): Double = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def getRightFadingEdgeStrength(): Double = js.native
  
  /* protected */ def getRightPaddingOffset(): Double = js.native
  
  /* InferMemberOverrides */
  override def getRootView(): View = js.native
  
  /* InferMemberOverrides */
  override def getRotation(): Double = js.native
  
  /* InferMemberOverrides */
  override def getRotationX(): Double = js.native
  
  /* InferMemberOverrides */
  override def getRotationY(): Double = js.native
  
  /* InferMemberOverrides */
  override def getScaleX(): Double = js.native
  
  /* InferMemberOverrides */
  override def getScaleY(): Double = js.native
  
  /* InferMemberOverrides */
  override def getScrollBarDefaultDelayBeforeFade(): Double = js.native
  
  /* InferMemberOverrides */
  override def getScrollBarFadeDuration(): Double = js.native
  
  /* InferMemberOverrides */
  override def getScrollBarSize(): Double = js.native
  
  /* InferMemberOverrides */
  /* private */ override def getScrollCache(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def getScrollX(): Double = js.native
  
  /* InferMemberOverrides */
  override def getScrollY(): Double = js.native
  
  def getSelectionEnd(): Double = js.native
  
  def getSelectionStart(): Double = js.native
  
  def getShadowColor(): Double = js.native
  
  def getShadowDx(): Double = js.native
  
  def getShadowDy(): Double = js.native
  
  def getShadowRadius(): Double = js.native
  
  def getShowSoftInputOnFocus(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def getSuggestedMinimumHeight(): Double = js.native
  
  /* InferMemberOverrides */
  override def getSuggestedMinimumWidth(): Double = js.native
  
  /* InferMemberOverrides */
  override def getTag(): js.Any = js.native
  
  def getText(): String = js.native
  
  /* InferMemberOverrides */
  override def getTextAlignment(): Double = js.native
  
  def getTextColors(): ColorStateList = js.native
  
  /* InferMemberOverrides */
  override def getTextDirection(): Double = js.native
  
  def getTextDirectionHeuristic(): TextDirectionHeuristic = js.native
  
  def getTextLocale(): js.Any = js.native
  
  def getTextScaleX(): Double = js.native
  
  def getTextSize(): Double = js.native
  
  /* InferMemberOverrides */
  override def getTop(): Double = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def getTopFadingEdgeStrength(): Double = js.native
  
  /* protected */ def getTopPaddingOffset(): Double = js.native
  
  def getTotalPaddingBottom(): Double = js.native
  
  def getTotalPaddingEnd(): Double = js.native
  
  def getTotalPaddingLeft(): Double = js.native
  
  def getTotalPaddingRight(): Double = js.native
  
  def getTotalPaddingStart(): Double = js.native
  
  def getTotalPaddingTop(): Double = js.native
  
  /* InferMemberOverrides */
  override def getTouchDelegate(): TouchDelegate = js.native
  
  /* InferMemberOverrides */
  override def getTouchables(): ArrayList[View] = js.native
  
  def getTransformationMethod(): TransformationMethod = js.native
  
  def getTransformedText(start: Double, end: Double): String = js.native
  
  /* InferMemberOverrides */
  override def getTransitionAlpha(): Double = js.native
  
  /* InferMemberOverrides */
  override def getTranslationX(): Double = js.native
  
  /* InferMemberOverrides */
  override def getTranslationY(): Double = js.native
  
  def getTypeface(): js.Any = js.native
  
  def getUndoManager(): js.Any = js.native
  
  /* private */ def getUpdatedHighlightPath(): js.Any = js.native
  
  def getUrls(): js.Array[_] = js.native
  
  /* InferMemberOverrides */
  override def getVerticalFadingEdgeLength(): Double = js.native
  
  def getVerticalOffset(forceNormal: Boolean): Double = js.native
  
  /* InferMemberOverrides */
  override def getVerticalScrollFactor(): Double = js.native
  
  /* InferMemberOverrides */
  override def getVerticalScrollbarWidth(): Double = js.native
  
  /* InferMemberOverrides */
  override def getViewRootImpl(): ViewRootImpl = js.native
  
  /* InferMemberOverrides */
  override def getViewTreeObserver(): ViewTreeObserver = js.native
  
  /* InferMemberOverrides */
  override def getVisibility(): Double = js.native
  
  /* InferMemberOverrides */
  override def getWidth(): Double = js.native
  
  /* InferMemberOverrides */
  override def getWindowAttachCount(): Double = js.native
  
  /* InferMemberOverrides */
  override def getWindowVisibility(): Double = js.native
  
  /* InferMemberOverrides */
  override def getWindowVisibleDisplayFrame(outRect: Rect): Unit = js.native
  
  /* InferMemberOverrides */
  override def getX(): Double = js.native
  
  /* InferMemberOverrides */
  override def getY(): Double = js.native
  
  /* InferMemberOverrides */
  override def handleFocusGainInternal(direction: Double, previouslyFocusedRect: Rect): Unit = js.native
  
  def handleTextChanged(buffer: String, start: Double, before: Double, after: Double): Unit = js.native
  
  /* InferMemberOverrides */
  /* private */ override def hasAncestorThatBlocksDescendantFocus(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def hasFocus(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def hasFocusable(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def hasIdentityMatrix(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def hasOnClickListeners(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def hasOpaqueScrollbars(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def hasOverlappingRendering(): Boolean = js.native
  
  /* private */ def hasPasswordTransformationMethod(): js.Any = js.native
  
  def hasSelection(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def hasTransientState(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def hasWindowFocus(): Boolean = js.native
  
  def hideErrorIfUnchanged(): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def initBindAttr(): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def initBindElement(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def initBindElement(bindElement: HTMLElement): Unit = js.native
  
  /* InferMemberOverrides */
  override def initScrollCache(): Unit = js.native
  
  /* InferMemberOverrides */
  /* private */ override def initialAwakenScrollBars(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def initializeScrollbars(): Unit = js.native
  /* InferMemberOverrides */
  override def initializeScrollbars(a: TypedArray): Unit = js.native
  
  /* InferMemberOverrides */
  override def invalidate(): js.Any = js.native
  /* InferMemberOverrides */
  override def invalidate(dirty: Rect): js.Any = js.native
  /* InferMemberOverrides */
  override def invalidate(invalidateCache: Boolean): js.Any = js.native
  /* InferMemberOverrides */
  override def invalidate(l: Double, t: Double, r: Double, b: Double): js.Any = js.native
  
  /* InferMemberOverrides */
  override def invalidateParentCaches(): Unit = js.native
  
  /* InferMemberOverrides */
  override def invalidateParentIfNeeded(): Unit = js.native
  
  def invalidateRegion(start: Double, end: Double, invalidateCursor: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def invalidateViewProperty(invalidateParent: Boolean, forceRedraw: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def isActivated(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isAttachedToWindow(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isClickable(): Boolean = js.native
  
  def isCursorVisible(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isDirty(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isDrawingCacheEnabled(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isEnabled(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isFocusable(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isFocusableInTouchMode(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isFocused(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isHardwareAccelerated(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isHorizontalScrollBarEnabled(): Boolean = js.native
  
  def isInBatchEditMode(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isInEditMode(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isInLayout(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isInScrollingContainer(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isInTouchMode(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isLaidOut(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isLayoutRequested(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isLayoutRtl(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isLongClickable(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isOpaque(): Boolean = js.native
  
  /* protected */ def isPaddingOffsetRequired(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isPressed(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isRootNamespace(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isScrollContainer(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isScrollbarFadingEnabled(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isSelected(): Boolean = js.native
  
  /* private */ def isShowingHint(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def isShown(): Boolean = js.native
  
  def isSingleLine(): Boolean = js.native
  
  def isSuggestionsEnabled(): Boolean = js.native
  
  def isTextEditable(): Boolean = js.native
  
  def isTextSelectable(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isVerticalScrollBarEnabled(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isVerticalScrollBarHidden(): Boolean = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def isVisibleToUser(): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def isVisibleToUser(boundInView: Rect): Boolean = js.native
  
  /* InferMemberOverrides */
  override def jumpDrawablesToCurrentState(): Unit = js.native
  
  /* InferMemberOverrides */
  override def layout(l: Double, t: Double, r: Double, b: Double): Unit = js.native
  
  def length(): Double = js.native
  
  var mAllowTransformationLengthChange: js.Any = js.native
  
  var mAutoLinkMask: js.Any = js.native
  
  var mBoring: js.Any = js.native
  
  var mBufferType: js.Any = js.native
  
  var mChangeWatcher: js.Any = js.native
  
  var mCurHintTextColor: js.Any = js.native
  
  var mCurTextColor: js.Any = js.native
  
  var mCursorDrawableRes: Double = js.native
  
  var mDeferScroll: js.Any = js.native
  
  var mDesiredHeightAtMeasure: js.Any = js.native
  
  var mDispatchTemporaryDetach: js.Any = js.native
  
  var mDrawables: Drawables = js.native
  
  var mEditor: js.Any = js.native
  
  var mEllipsize: js.Any = js.native
  
  var mFilters: js.Any = js.native
  
  var mFreezesText: js.Any = js.native
  
  var mGravity: js.Any = js.native
  
  var mHighlightColor: Double = js.native
  
  var mHighlightPaint: js.Any = js.native
  
  var mHighlightPath: js.Any = js.native
  
  var mHighlightPathBogus: js.Any = js.native
  
  var mHint: js.Any = js.native
  
  var mHintBoring: js.Any = js.native
  
  var mHintLayout: js.Any = js.native
  
  var mHintTextColor: js.Any = js.native
  
  var mHorizontallyScrolling: js.Any = js.native
  
  var mIncludePad: js.Any = js.native
  
  var mLastLayoutDirection: js.Any = js.native
  
  var mLastScroll: js.Any = js.native
  
  var mLayout: js.Any = js.native
  
  var mLinkTextColor: js.Any = js.native
  
  var mLinksClickable: js.Any = js.native
  
  var mListeners: js.Any = js.native
  
  var mMarquee: js.Any = js.native
  
  var mMarqueeFadeMode: js.Any = js.native
  
  var mMarqueeRepeatLimit: js.Any = js.native
  
  var mMaxMode: js.Any = js.native
  
  var mMaxWidthMode: js.Any = js.native
  
  var mMaxWidthValue: js.Any = js.native
  
  var mMaximum: js.Any = js.native
  
  var mMinMode: js.Any = js.native
  
  var mMinWidthMode: js.Any = js.native
  
  var mMinWidthValue: js.Any = js.native
  
  var mMinimum: js.Any = js.native
  
  var mMovement: js.Any = js.native
  
  var mOldMaxMode: js.Any = js.native
  
  var mOldMaximum: js.Any = js.native
  
  var mPreDrawRegistered: js.Any = js.native
  
  var mPreventDefaultMovement: js.Any = js.native
  
  var mRestartMarquee: js.Any = js.native
  
  var mSavedHintLayout: js.Any = js.native
  
  var mSavedLayout: js.Any = js.native
  
  var mSavedMarqueeModeLayout: js.Any = js.native
  
  var mScroller: js.Any = js.native
  
  var mShadowDx: js.Any = js.native
  
  var mShadowDy: js.Any = js.native
  
  var mShadowRadius: js.Any = js.native
  
  var mSingleLine: js.Any = js.native
  
  var mSkipDrawText: Boolean = js.native
  
  var mSpacingAdd: js.Any = js.native
  
  var mSpacingMult: js.Any = js.native
  
  var mSpannableFactory: js.Any = js.native
  
  var mTempRect: js.Any = js.native
  
  var mTemporaryDetach: js.Any = js.native
  
  var mText: js.Any = js.native
  
  var mTextColor: js.Any = js.native
  
  var mTextDir: js.Any = js.native
  
  var mTextEditSuggestionItemLayout: Double = js.native
  
  var mTextPaint: js.Any = js.native
  
  var mTextSelectHandleLeftRes: Double = js.native
  
  var mTextSelectHandleRes: Double = js.native
  
  var mTextSelectHandleRightRes: Double = js.native
  
  var mTransformation: js.Any = js.native
  
  var mTransformed: js.Any = js.native
  
  var mUserSetTextScaleX: js.Any = js.native
  
  /* protected */ def makeNewLayout(
    wantWidth: Double,
    hintWidth: Double,
    boring: Metrics,
    hintBoring: Metrics,
    ellipsisWidth: Double,
    bringIntoView: Boolean
  ): Unit = js.native
  
  /* private */ def makeSingleLayout(
    wantWidth: js.Any,
    boring: js.Any,
    ellipsisWidth: js.Any,
    alignment: js.Any,
    shouldEllipsize: js.Any,
    effectiveEllipsize: js.Any,
    useSaved: js.Any
  ): js.Any = js.native
  
  /* InferMemberOverrides */
  override def measure(widthMeasureSpec: Double, heightMeasureSpec: Double): Unit = js.native
  
  def moveCursorToVisibleOffset(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def notifyGlobalFocusCleared(oldFocus: View): Unit = js.native
  
  /* private */ def nullLayouts(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def offsetLeftAndRight(offset: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def offsetTopAndBottom(offset: Double): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onAnimationEnd(): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onAnimationStart(): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onAttachedToWindow(): Unit = js.native
  
  /* InferMemberOverrides */
  /* private */ override def onBindElementAttributeChanged(attributeName: js.Any, oldVal: js.Any, newVal: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def onCancelPendingInputEvents(): Unit = js.native
  
  def onCheckIsTextEditor(): Boolean = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onCreateDrawableState(extraSpace: Double): js.Array[Double] = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onDetachedFromWindow(): Unit = js.native
  
  /* InferMemberOverrides */
  override def onDisplayHint(hint: Double): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onDraw(canvas: Canvas): Unit = js.native
  
  /* InferMemberOverrides */
  override def onDrawHorizontalScrollBar(canvas: Canvas, scrollBar: Drawable, l: Double, t: Double, r: Double, b: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def onDrawScrollBars(canvas: Canvas): Unit = js.native
  
  /* InferMemberOverrides */
  override def onDrawVerticalScrollBar(canvas: Canvas, scrollBar: Drawable, l: Double, t: Double, r: Double, b: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def onFilterTouchEventForSecurity(event: MotionEvent): Boolean = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onFinishInflate(): Unit = js.native
  
  /* InferMemberOverrides */
  override def onFinishTemporaryDetach(): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onFocusChanged(gainFocus: Boolean, direction: Double, previouslyFocusedRect: Rect): Unit = js.native
  
  /* InferMemberOverrides */
  override def onFocusLost(): Unit = js.native
  
  /* InferMemberOverrides */
  override def onGenericMotionEvent(event: MotionEvent): Boolean = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onLayout(changed: Boolean, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onMeasure(widthMeasureSpec: Double, heightMeasureSpec: Double): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onOverScrolled(scrollX: Double, scrollY: Double, clampedX: Boolean, clampedY: Boolean): Unit = js.native
  
  def onResolveDrawables(layoutDirection: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def onScrollChanged(l: Double, t: Double, oldl: Double, oldt: Double): Unit = js.native
  
  /* protected */ def onSelectionChanged(selStart: Double, selEnd: Double): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onSetAlpha(alpha: Double): Boolean = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onSizeChanged(w: Double, h: Double, oldw: Double, oldh: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def onStartTemporaryDetach(): Unit = js.native
  
  /* protected */ def onTextChanged(text: String, start: Double, lengthBefore: Double, lengthAfter: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def onTouchEvent(event: MotionEvent): Boolean = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def onVisibilityChanged(changedView: View, visibility: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def onWindowFocusChanged(hasWindowFocus: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def onWindowVisibilityChanged(visibility: Double): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def overScrollBy(
    deltaX: Double,
    deltaY: Double,
    scrollX: Double,
    scrollY: Double,
    scrollRangeX: Double,
    scrollRangeY: Double,
    maxOverScrollX: Double,
    maxOverScrollY: Double,
    isTouchEvent: Boolean
  ): Boolean = js.native
  
  /* InferMemberOverrides */
  override def performButtonActionOnTouchDown(event: MotionEvent): Boolean = js.native
  
  /* InferMemberOverrides */
  override def performClick(): Boolean = js.native
  /* InferMemberOverrides */
  override def performClick(event: MotionEvent): Boolean = js.native
  
  /* InferMemberOverrides */
  override def performHapticFeedback(feedbackConstant: Double): Boolean = js.native
  
  /* InferMemberOverrides */
  override def performLongClick(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def playSoundEffect(soundConstant: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def pointInView(localX: Double, localY: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def pointInView(localX: Double, localY: Double, slop: Double): Boolean = js.native
  
  /* InferMemberOverrides */
  override def post(action: Runnable): Boolean = js.native
  
  /* InferMemberOverrides */
  override def postDelayed(action: Runnable, delayMillis: Double): Boolean = js.native
  
  /* InferMemberOverrides */
  override def postInvalidate(): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(
    l: js.UndefOr[scala.Nothing],
    t: js.UndefOr[scala.Nothing],
    r: js.UndefOr[scala.Nothing],
    b: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: js.UndefOr[scala.Nothing], r: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: js.UndefOr[scala.Nothing], r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double, r: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double, r: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double, r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: js.UndefOr[scala.Nothing], r: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: js.UndefOr[scala.Nothing], r: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: js.UndefOr[scala.Nothing], r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: Double, r: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: Double, r: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: Double, r: Double, b: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: Double,
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: js.UndefOr[scala.Nothing], top: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: Double,
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: js.UndefOr[scala.Nothing], top: Double, right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: Double,
    right: Double,
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: Double,
    top: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: js.UndefOr[scala.Nothing], right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: Double,
    top: js.UndefOr[scala.Nothing],
    right: Double,
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: Double,
    top: Double,
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: Double, right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double, right: js.UndefOr[scala.Nothing], bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double, right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double, right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: js.UndefOr[scala.Nothing], right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: js.UndefOr[scala.Nothing], right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: Double, right: js.UndefOr[scala.Nothing], bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: Double, right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def postOnAnimation(action: Runnable): Boolean = js.native
  
  /* InferMemberOverrides */
  override def postOnAnimationDelayed(action: Runnable, delayMillis: Double): Boolean = js.native
  
  /* InferMemberOverrides */
  override def refreshDrawableState(): Unit = js.native
  
  /* private */ def registerForPreDraw(): js.Any = js.native
  
  def removeAdjacentSuggestionSpans(pos: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeCallbacks(action: Runnable): Boolean = js.native
  
  /* InferMemberOverrides */
  /* private */ override def removeLongPressCallback(): js.Any = js.native
  
  def removeMisspelledSpans(spannable: Spannable): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeOnAttachStateChangeListener(listener: OnAttachStateChangeListener): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeOnLayoutChangeListener(listener: OnLayoutChangeListener): Unit = js.native
  
  /* InferMemberOverrides */
  /* private */ override def removePerformClickCallback(): js.Any = js.native
  
  def removeSuggestionSpans(text: String): String = js.native
  
  /* InferMemberOverrides */
  /* private */ override def removeTapCallback(): js.Any = js.native
  
  def removeTextChangedListener(watcher: TextWatcher): Unit = js.native
  
  /* InferMemberOverrides */
  /* private */ override def removeUnsetPressCallback(): js.Any = js.native
  
  /* protected */ def replaceText_internal(start: Double, end: Double, text: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def requestFocus(): Boolean = js.native
  /* InferMemberOverrides */
  override def requestFocus(direction: js.UndefOr[scala.Nothing], previouslyFocusedRect: js.Any): Boolean = js.native
  /* InferMemberOverrides */
  override def requestFocus(direction: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def requestFocus(direction: Double, previouslyFocusedRect: js.Any): Boolean = js.native
  
  /* InferMemberOverrides */
  override def requestFocusFromTouch(): Boolean = js.native
  
  /* InferMemberOverrides */
  /* private */ override def requestFocusNoSearch(direction: js.Any, previouslyFocusedRect: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def requestLayout(): Unit = js.native
  
  /* InferMemberOverrides */
  override def requestRectangleOnScreen(rectangle: Rect): Boolean = js.native
  /* InferMemberOverrides */
  override def requestRectangleOnScreen(rectangle: Rect, immediate: Boolean): Boolean = js.native
  
  /* InferMemberOverrides */
  override def requestSyncBoundToElement(): Unit = js.native
  /* InferMemberOverrides */
  override def requestSyncBoundToElement(immediately: Boolean): Unit = js.native
  
  def resetErrorChangedFlag(): Unit = js.native
  
  /* InferMemberOverrides */
  override def resetPressedState(): Unit = js.native
  
  /* protected */ def resetResolvedDrawables(): Unit = js.native
  
  /* InferMemberOverrides */
  override def resolveDrawables(): Unit = js.native
  
  /* InferMemberOverrides */
  override def resolvePadding(): Unit = js.native
  
  /* private */ def restartMarqueeIfNeeded(): js.Any = js.native
  
  /* InferMemberOverrides */
  override def rootViewRequestFocus(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def scrollBy(x: Double, y: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def scrollTo(x: Double, y: Double): Unit = js.native
  
  def selectAllText(): Boolean = js.native
  
  def sendAfterTextChanged(text: js.Any): Unit = js.native
  
  /* private */ def sendBeforeTextChanged(text: js.Any, start: js.Any, before: js.Any, after: js.Any): js.Any = js.native
  
  def sendOnTextChanged(text: String, start: Double, before: Double, after: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setActivated(activated: Boolean): Unit = js.native
  
  def setAllCaps(allCaps: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setAlpha(alpha: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setAlphaNoInvalidation(alpha: Double): Boolean = js.native
  
  /* InferMemberOverrides */
  override def setAnimation(animation: Animation): Unit = js.native
  
  def setAutoLinkMask(mask: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setBackground(background: Drawable): Unit = js.native
  
  /* InferMemberOverrides */
  override def setBackgroundColor(color: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setBackgroundDrawable(background: Drawable): Unit = js.native
  
  /* InferMemberOverrides */
  override def setBottom(bottom: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setClickable(clickable: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setClipBounds(clipBounds: Rect): Unit = js.native
  
  def setCompoundDrawablePadding(pad: Double): Unit = js.native
  
  def setCompoundDrawables(left: Drawable, top: Drawable, right: Drawable, bottom: Drawable): Unit = js.native
  
  def setCompoundDrawablesRelative(start: Drawable, top: Drawable, end: Drawable, bottom: Drawable): Unit = js.native
  
  def setCompoundDrawablesRelativeWithIntrinsicBounds(start: Drawable, top: Drawable, end: Drawable, bottom: Drawable): Unit = js.native
  
  def setCompoundDrawablesWithIntrinsicBounds(left: Drawable, top: Drawable, right: Drawable, bottom: Drawable): Unit = js.native
  
  /* InferMemberOverrides */
  override def setCornerRadius(radiusTopLeft: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(
    radiusTopLeft: Double,
    radiusTopRight: js.UndefOr[scala.Nothing],
    radiusBottomRight: js.UndefOr[scala.Nothing],
    radiusBottomLeft: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(radiusTopLeft: Double, radiusTopRight: js.UndefOr[scala.Nothing], radiusBottomRight: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(
    radiusTopLeft: Double,
    radiusTopRight: js.UndefOr[scala.Nothing],
    radiusBottomRight: Double,
    radiusBottomLeft: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(radiusTopLeft: Double, radiusTopRight: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: js.UndefOr[scala.Nothing],
    radiusBottomLeft: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(radiusTopLeft: Double, radiusTopRight: Double, radiusBottomRight: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(radiusTopLeft: Double, radiusTopRight: Double, radiusBottomRight: Double, radiusBottomLeft: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setCornerRadiusBottomLeft(value: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setCornerRadiusBottomRight(value: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setCornerRadiusTopLeft(value: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setCornerRadiusTopRight(value: Double): Unit = js.native
  
  /* protected */ def setCursorPosition_internal(start: Double, end: Double): Unit = js.native
  
  def setCursorVisible(visible: Boolean): Unit = js.native
  
  def setCustomSelectionActionModeCallback(actionModeCallback: js.Any): Unit = js.native
  
  /* InferMemberOverrides */
  override def setDrawingCacheBackgroundColor(color: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setDrawingCacheEnabled(enabled: Boolean): Unit = js.native
  
  def setEllipsize(where: TruncateAt): Unit = js.native
  
  def setEms(ems: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setEnabled(enabled: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setFadingEdgeLength(length: Double): Unit = js.native
  
  def setFilters(e: js.Any, filters: js.Array[_]): Unit = js.native
  def setFilters(filters: js.Array[_]): Unit = js.native
  
  /* InferMemberOverrides */
  override def setFlags(flags: Double, mask: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setFocusable(focusable: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setFocusableInTouchMode(focusableInTouchMode: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def setFrame(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  
  def setFreezesText(freezesText: Boolean): Unit = js.native
  
  def setGravity(gravity: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setHasTransientState(hasTransientState: Boolean): Unit = js.native
  
  def setHeight(pixels: Double): Unit = js.native
  
  def setHighlightColor(color: Double): Unit = js.native
  
  def setHint(hint: String): Unit = js.native
  
  def setHintTextColor(colors: Double): Unit = js.native
  def setHintTextColor(colors: ColorStateList): Unit = js.native
  
  /* InferMemberOverrides */
  override def setHorizontalFadingEdgeEnabled(enable: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setHorizontalScrollBarEnabled(horizontalScrollBarEnabled: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setHorizontalScrollbarPosition(position: Double): Unit = js.native
  
  def setHorizontallyScrolling(whether: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setId(id: String): Unit = js.native
  
  def setImeActionLabel(label: String, actionId: Double): Unit = js.native
  
  def setImeOptions(imeOptions: Double): Unit = js.native
  
  def setIncludeFontPadding(includepad: Boolean): Unit = js.native
  
  def setInputType(`type`: Double): Unit = js.native
  def setInputType(`type`: Double, direct: Boolean): Unit = js.native
  
  /* private */ def setInputTypeSingleLine(singleLine: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def setIsRootNamespace(isRoot: Boolean): Unit = js.native
  
  def setKeyListener(input: js.Any): Unit = js.native
  
  /* private */ def setKeyListenerOnly(input: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def setLayerType(layerType: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setLayoutDirection(layoutDirection: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setLayoutParams(params: LayoutParams): Unit = js.native
  
  /* InferMemberOverrides */
  override def setLeft(left: Double): Unit = js.native
  
  def setLineSpacing(add: Double, mult: Double): Unit = js.native
  
  def setLines(lines: Double): Unit = js.native
  
  def setLinkTextColor(colors: Double): Unit = js.native
  def setLinkTextColor(colors: ColorStateList): Unit = js.native
  
  def setLinksClickable(whether: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setLongClickable(longClickable: Boolean): Unit = js.native
  
  def setMarqueeRepeatLimit(marqueeLimit: Double): Unit = js.native
  
  def setMaxEms(maxems: Double): Unit = js.native
  
  def setMaxHeight(maxHeight: Double): Unit = js.native
  
  def setMaxLines(maxlines: Double): Unit = js.native
  
  def setMaxWidth(maxpixels: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setMeasuredDimension(measuredWidth: js.Any, measuredHeight: js.Any): Unit = js.native
  
  def setMinEms(minems: Double): Unit = js.native
  
  def setMinHeight(minHeight: Double): Unit = js.native
  
  def setMinLines(minlines: Double): Unit = js.native
  
  def setMinWidth(minpixels: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setMinimumHeight(minHeight: js.Any): Unit = js.native
  
  /* InferMemberOverrides */
  override def setMinimumWidth(minWidth: js.Any): Unit = js.native
  
  def setMovementMethod(movement: MovementMethod): Unit = js.native
  
  /* InferMemberOverrides */
  override def setNextFocusDownId(nextFocusDownId: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def setNextFocusForwardId(nextFocusForwardId: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def setNextFocusLeftId(nextFocusLeftId: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def setNextFocusRightId(nextFocusRightId: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def setNextFocusUpId(nextFocusUpId: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def setOnClickListener(l: js.Function1[/* v */ this.type, Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def setOnClickListener(l: OnClickListener): Unit = js.native
  
  /* InferMemberOverrides */
  /* private */ override def setOnClickListenerByAttrValueString(onClickAttrString: js.Any): js.Any = js.native
  
  def setOnEditorActionListener(l: OnEditorActionListener): Unit = js.native
  
  /* InferMemberOverrides */
  override def setOnFocusChangeListener(l: js.Function2[/* v */ this.type, /* hasFocus */ Boolean, Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def setOnFocusChangeListener(l: OnFocusChangeListener): Unit = js.native
  
  /* InferMemberOverrides */
  override def setOnKeyListener(l: js.Function3[/* v */ this.type, /* keyCode */ Double, /* event */ KeyEvent, Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def setOnKeyListener(l: OnKeyListener): Unit = js.native
  
  /* InferMemberOverrides */
  override def setOnLongClickListener(l: js.Function1[/* v */ this.type, Boolean]): Unit = js.native
  /* InferMemberOverrides */
  override def setOnLongClickListener(l: OnLongClickListener): Unit = js.native
  
  /* InferMemberOverrides */
  override def setOnTouchListener(l: js.Function2[/* v */ this.type, /* event */ MotionEvent, Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def setOnTouchListener(l: OnTouchListener): Unit = js.native
  
  /* InferMemberOverrides */
  override def setOverScrollMode(overScrollMode: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setPadding(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setPaddingBottom(bottom: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setPaddingLeft(left: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setPaddingRight(right: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setPaddingTop(top: Double): Unit = js.native
  
  def setPaintFlags(flags: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setPivotX(pivotX: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setPivotY(pivotY: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setPressed(pressed: Boolean): Unit = js.native
  
  def setRawInputType(`type`: Double): Unit = js.native
  
  /* protected */ def setRawTextSize(size: Double): Unit = js.native
  
  /* private */ def setRelativeDrawablesIfNeeded(start: js.Any, end: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def setRight(right: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setRotation(rotation: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setRotationX(rotationX: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setRotationY(rotationY: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setScaleX(scaleX: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setScaleY(scaleY: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setScrollBarFadeDuration(scrollBarFadeDuration: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setScrollBarSize(scrollBarSize: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setScrollBarStyle(position: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setScrollContainer(isScrollContainer: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setScrollX(value: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setScrollY(value: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setScrollbarFadingEnabled(fadeScrollbars: Boolean): Unit = js.native
  
  def setScroller(s: OverScroller): Unit = js.native
  
  def setSelectAllOnFocus(selectAllOnFocus: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setSelected(selected: Boolean): Unit = js.native
  
  def setShadowLayer(radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setShadowView(radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
  
  def setShowSoftInputOnFocus(show: Boolean): Unit = js.native
  
  def setSingleLine(): Unit = js.native
  def setSingleLine(singleLine: Boolean): Unit = js.native
  
  /* protected */ def setSpan_internal(span: js.Any, start: Double, end: Double, flags: Double): Unit = js.native
  
  def setSpannableFactory(factory: Factory): Unit = js.native
  
  /* InferMemberOverrides */
  override def setTag(tag: js.Any): Unit = js.native
  
  def setText(text: String): Unit = js.native
  def setText(
    text: String,
    `type`: js.UndefOr[scala.Nothing],
    notifyBefore: js.UndefOr[scala.Nothing],
    oldlen: Double
  ): Unit = js.native
  def setText(text: String, `type`: js.UndefOr[scala.Nothing], notifyBefore: Boolean): Unit = js.native
  def setText(text: String, `type`: js.UndefOr[scala.Nothing], notifyBefore: Boolean, oldlen: Double): Unit = js.native
  def setText(text: String, `type`: BufferType): Unit = js.native
  def setText(text: String, `type`: BufferType, notifyBefore: js.UndefOr[scala.Nothing], oldlen: Double): Unit = js.native
  def setText(text: String, `type`: BufferType, notifyBefore: Boolean): Unit = js.native
  def setText(text: String, `type`: BufferType, notifyBefore: Boolean, oldlen: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setTextAlignment(textAlignment: Double): Unit = js.native
  
  def setTextColor(colors: Double): Unit = js.native
  def setTextColor(colors: ColorStateList): Unit = js.native
  
  /* InferMemberOverrides */
  override def setTextDirection(textDirection: Double): Unit = js.native
  
  def setTextIsSelectable(selectable: Boolean): Unit = js.native
  
  def setTextLocale(locale: js.Any): Unit = js.native
  
  def setTextScaleX(size: Double): Unit = js.native
  
  def setTextSize(size: Double): Unit = js.native
  def setTextSize(unit: String, size: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setTop(top: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setTouchDelegate(delegate: TouchDelegate): Unit = js.native
  
  def setTransformationMethod(method: TransformationMethod): Unit = js.native
  
  /* InferMemberOverrides */
  override def setTransitionAlpha(alpha: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setTranslationX(translationX: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setTranslationY(translationY: Double): Unit = js.native
  
  def setTypeface(tf: js.Any, style: Double): Unit = js.native
  
  /* private */ def setTypefaceFromAttrs(familyName: js.Any, typefaceIndex: js.Any, styleIndex: js.Any): js.Any = js.native
  
  def setUndoManager(undoManager: js.Any, tag: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def setVerticalFadingEdgeEnabled(enable: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setVerticalScrollBarEnabled(verticalScrollBarEnabled: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setVerticalScrollbarPosition(position: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setVisibility(visibility: Double): Unit = js.native
  
  def setWidth(pixels: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setWillNotCacheDrawing(willNotCacheDrawing: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setWillNotDraw(willNotDraw: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def setX(x: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def setY(y: Double): Unit = js.native
  
  /* private */ def shouldAdvanceFocusOnEnter(): js.Any = js.native
  
  /* private */ def shouldAdvanceFocusOnTab(): js.Any = js.native
  
  /* InferMemberOverrides */
  /* private */ override def sizeChange(newWidth: js.Any, newHeight: js.Any, oldWidth: js.Any, oldHeight: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  /* private */ override def skipInvalidate(): js.Any = js.native
  
  def spanChange(buf: Spanned, what: js.Any, oldStart: Double, newStart: Double, oldEnd: Double, newEnd: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def startAnimation(animation: Animation): Unit = js.native
  
  /* private */ def startMarquee(): js.Any = js.native
  
  /* private */ def startStopMarquee(start: js.Any): js.Any = js.native
  
  /* private */ def stopMarquee(): js.Any = js.native
  
  /* protected */ def stopSelectionActionMode(): Unit = js.native
  
  /* InferMemberOverrides */
  override def syncVisibleToElement(): Unit = js.native
  
  /* InferMemberOverrides */
  override def tagName(): String = js.native
  
  def textCanBeSelected(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def transformRect(rect: Rect): Unit = js.native
  
  /* InferMemberOverrides */
  override def unFocus(): Unit = js.native
  
  /* InferMemberOverrides */
  override def unscheduleDrawable(who: Drawable): Unit = js.native
  
  def updateAfterEdit(): Unit = js.native
  
  /* InferMemberOverrides */
  /* private */ override def updateMatrix(): js.Any = js.native
  
  /* protected */ def updateTextColors(): Unit = js.native
  
  /* InferMemberOverrides */
  /* protected */ override def verifyDrawable(who: Drawable): Boolean = js.native
  
  def viewportToContentHorizontalOffset(): Double = js.native
  
  def viewportToContentVerticalOffset(): Double = js.native
  
  /* InferMemberOverrides */
  override def willNotCacheDrawing(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def willNotDraw(): Boolean = js.native
}
