package typings.androiduix.android.widget

import typings.androiduix.android.content.res.ColorStateList
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.os.Handler
import typings.androiduix.android.text.BoringLayout.Metrics
import typings.androiduix.android.text.Layout
import typings.androiduix.android.text.SpanWatcher
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
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewTreeObserver.OnPreDrawListener
import typings.androiduix.android.widget.TextView.BufferType
import typings.androiduix.android.widget.TextView.Drawables
import typings.androiduix.android.widget.TextView.OnEditorActionListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextView
  extends View
     with OnPreDrawListener {
  
  def addTextChangedListener(watcher: TextWatcher): Unit = js.native
  
  /* private */ def applySingleLine(singleLine: js.Any, applyTransformation: js.Any, changeMaxLines: js.Any): js.Any = js.native
  
  /* private */ def assumeLayout(): js.Any = js.native
  
  def bringPointIntoView(offset: Double): Boolean = js.native
  
  /* private */ def bringTextIntoView(): js.Any = js.native
  
  def canCopy(): Boolean = js.native
  
  def canCut(): Boolean = js.native
  
  /* private */ def canMarquee(): js.Any = js.native
  
  def canPaste(): Boolean = js.native
  
  /* private */ def canSelectText(): js.Any = js.native
  
  /* private */ def checkForRelayout(): js.Any = js.native
  
  /* private */ def checkForResize(): js.Any = js.native
  
  def clearComposingText(): Unit = js.native
  
  /* private */ def compressText(width: js.Any): js.Any = js.native
  
  /* private */ def convertFromViewportToContentCoordinates(r: js.Any): js.Any = js.native
  
  def convertToLocalHorizontalCoordinate(x: Double): Double = js.native
  
  /* private */ def createEditorIfNeeded(): js.Any = js.native
  
  /* protected */ def deleteText_internal(start: Double, end: Double): Unit = js.native
  
  def didTouchFocusSelect(): Boolean = js.native
  
  /* private */ def doKeyDown(keyCode: js.Any, event: js.Any, otherEvent: js.Any): js.Any = js.native
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MTextView(d: Drawable): Unit = js.native
  
  /* private */ def fixFocusableAndClickableSettings(): js.Any = js.native
  
  def getAutoLinkMask(): Double = js.native
  
  /* protected */ def getBottomPaddingOffset(): Double = js.native
  
  /* private */ def getBottomVerticalOffset(forceNormal: js.Any): js.Any = js.native
  
  /* private */ def getBoxHeight(l: js.Any): js.Any = js.native
  
  def getCompoundDrawablePadding(): Double = js.native
  
  def getCompoundDrawables(): js.Array[Drawable] = js.native
  
  def getCompoundDrawablesRelative(): js.Array[Drawable] = js.native
  
  def getCompoundPaddingBottom(): Double = js.native
  
  def getCompoundPaddingEnd(): Double = js.native
  
  def getCompoundPaddingLeft(): Double = js.native
  
  def getCompoundPaddingRight(): Double = js.native
  
  def getCompoundPaddingStart(): Double = js.native
  
  def getCompoundPaddingTop(): Double = js.native
  
  def getCurrentHintTextColor(): Double = js.native
  
  def getCurrentTextColor(): Double = js.native
  
  def getCustomSelectionActionModeCallback(): js.Any = js.native
  
  /* protected */ def getDefaultEditable(): Boolean = js.native
  
  /* protected */ def getDefaultMovementMethod(): MovementMethod = js.native
  
  /* private */ def getDesiredHeight(layout: js.Any, cap: js.Any): js.Any = js.native
  
  def getEditableText(): js.Any = js.native
  
  def getEllipsize(): TruncateAt = js.native
  
  def getExtendedPaddingBottom(): Double = js.native
  
  def getExtendedPaddingTop(): Double = js.native
  
  /* protected */ def getFadeHeight(offsetRequired: Boolean): Double = js.native
  
  /* protected */ def getFadeTop(offsetRequired: Boolean): Double = js.native
  
  def getFilters(): js.Array[_] = js.native
  
  def getFreezesText(): Boolean = js.native
  
  def getGravity(): Double = js.native
  
  def getHighlightColor(): Double = js.native
  
  def getHint(): String = js.native
  
  def getHintLayout(): Layout = js.native
  
  def getHintTextColors(): ColorStateList = js.native
  
  def getHorizontalOffsetForDrawables(): Double = js.native
  
  def getHorizontallyScrolling(): Boolean = js.native
  
  def getImeActionId(): Double = js.native
  
  def getImeActionLabel(): String = js.native
  
  def getImeOptions(): Double = js.native
  
  def getIncludeFontPadding(): Boolean = js.native
  
  def getInputType(): Double = js.native
  
  /* private */ def getInterestingRect(r: js.Any, line: js.Any): js.Any = js.native
  
  def getKeyListener(): js.Any = js.native
  
  def getLayout(): Layout = js.native
  
  /* private */ def getLayoutAlignment(): js.Any = js.native
  
  /* protected */ def getLeftPaddingOffset(): Double = js.native
  
  def getLineAtCoordinate(y: Double): Double = js.native
  
  def getLineBounds(line: Double, bounds: Rect): Double = js.native
  
  def getLineCount(): Double = js.native
  
  def getLineHeight(): Double = js.native
  
  def getLineSpacingExtra(): Double = js.native
  
  def getLineSpacingMultiplier(): Double = js.native
  
  def getLinkTextColors(): ColorStateList = js.native
  
  def getLinksClickable(): Boolean = js.native
  
  def getMarqueeRepeatLimit(): Double = js.native
  
  def getMaxEms(): Double = js.native
  
  def getMaxHeight(): Double = js.native
  
  def getMaxLines(): Double = js.native
  
  def getMaxWidth(): Double = js.native
  
  def getMinEms(): Double = js.native
  
  def getMinHeight(): Double = js.native
  
  def getMinLines(): Double = js.native
  
  def getMinWidth(): Double = js.native
  
  def getMovementMethod(): MovementMethod = js.native
  
  /* private */ def getOffsetAtCoordinate(line: js.Any, x: js.Any): js.Any = js.native
  
  def getOffsetForPosition(x: Double, y: Double): Double = js.native
  
  def getPaint(): TextPaint = js.native
  
  def getPaintFlags(): Double = js.native
  
  /* protected */ def getRightPaddingOffset(): Double = js.native
  
  def getSelectionEnd(): Double = js.native
  
  def getSelectionStart(): Double = js.native
  
  def getShadowColor(): Double = js.native
  
  def getShadowDx(): Double = js.native
  
  def getShadowDy(): Double = js.native
  
  def getShadowRadius(): Double = js.native
  
  def getShowSoftInputOnFocus(): Boolean = js.native
  
  def getText(): String = js.native
  
  def getTextColors(): ColorStateList = js.native
  
  def getTextDirectionHeuristic(): TextDirectionHeuristic = js.native
  
  def getTextLocale(): js.Any = js.native
  
  def getTextScaleX(): Double = js.native
  
  def getTextSize(): Double = js.native
  
  /* protected */ def getTopPaddingOffset(): Double = js.native
  
  def getTotalPaddingBottom(): Double = js.native
  
  def getTotalPaddingEnd(): Double = js.native
  
  def getTotalPaddingLeft(): Double = js.native
  
  def getTotalPaddingRight(): Double = js.native
  
  def getTotalPaddingStart(): Double = js.native
  
  def getTotalPaddingTop(): Double = js.native
  
  def getTransformationMethod(): TransformationMethod = js.native
  
  def getTransformedText(start: Double, end: Double): String = js.native
  
  def getTypeface(): js.Any = js.native
  
  def getUndoManager(): js.Any = js.native
  
  /* private */ def getUpdatedHighlightPath(): js.Any = js.native
  
  def getUrls(): js.Array[_] = js.native
  
  def getVerticalOffset(forceNormal: Boolean): Double = js.native
  
  def handleTextChanged(buffer: String, start: Double, before: Double, after: Double): Unit = js.native
  
  /* private */ def hasPasswordTransformationMethod(): js.Any = js.native
  
  def hasSelection(): Boolean = js.native
  
  def hideErrorIfUnchanged(): Unit = js.native
  
  def invalidateRegion(start: Double, end: Double, invalidateCursor: Boolean): Unit = js.native
  
  def isCursorVisible(): Boolean = js.native
  
  def isInBatchEditMode(): Boolean = js.native
  
  /* protected */ def isPaddingOffsetRequired(): Boolean = js.native
  
  /* private */ def isShowingHint(): js.Any = js.native
  
  def isSingleLine(): Boolean = js.native
  
  def isSuggestionsEnabled(): Boolean = js.native
  
  def isTextEditable(): Boolean = js.native
  
  def isTextSelectable(): Boolean = js.native
  
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
  
  def moveCursorToVisibleOffset(): Boolean = js.native
  
  /* private */ def nullLayouts(): js.Any = js.native
  
  def onCheckIsTextEditor(): Boolean = js.native
  
  def onResolveDrawables(layoutDirection: Double): Unit = js.native
  
  /* protected */ def onSelectionChanged(selStart: Double, selEnd: Double): Unit = js.native
  
  /* protected */ def onTextChanged(text: String, start: Double, lengthBefore: Double, lengthAfter: Double): Unit = js.native
  
  /* private */ def registerForPreDraw(): js.Any = js.native
  
  def removeAdjacentSuggestionSpans(pos: Double): Unit = js.native
  
  def removeMisspelledSpans(spannable: Spannable): Unit = js.native
  
  def removeSuggestionSpans(text: String): String = js.native
  
  def removeTextChangedListener(watcher: TextWatcher): Unit = js.native
  
  /* protected */ def replaceText_internal(start: Double, end: Double, text: String): Unit = js.native
  
  def resetErrorChangedFlag(): Unit = js.native
  
  /* protected */ def resetResolvedDrawables(): Unit = js.native
  
  /* private */ def restartMarqueeIfNeeded(): js.Any = js.native
  
  def selectAllText(): Boolean = js.native
  
  def sendAfterTextChanged(text: js.Any): Unit = js.native
  
  /* private */ def sendBeforeTextChanged(text: js.Any, start: js.Any, before: js.Any, after: js.Any): js.Any = js.native
  
  def sendOnTextChanged(text: String, start: Double, before: Double, after: Double): Unit = js.native
  
  def setAllCaps(allCaps: Boolean): Unit = js.native
  
  def setAutoLinkMask(mask: Double): Unit = js.native
  
  def setCompoundDrawablePadding(pad: Double): Unit = js.native
  
  def setCompoundDrawables(left: Drawable, top: Drawable, right: Drawable, bottom: Drawable): Unit = js.native
  
  def setCompoundDrawablesRelative(start: Drawable, top: Drawable, end: Drawable, bottom: Drawable): Unit = js.native
  
  def setCompoundDrawablesRelativeWithIntrinsicBounds(start: Drawable, top: Drawable, end: Drawable, bottom: Drawable): Unit = js.native
  
  def setCompoundDrawablesWithIntrinsicBounds(left: Drawable, top: Drawable, right: Drawable, bottom: Drawable): Unit = js.native
  
  /* protected */ def setCursorPosition_internal(start: Double, end: Double): Unit = js.native
  
  def setCursorVisible(visible: Boolean): Unit = js.native
  
  def setCustomSelectionActionModeCallback(actionModeCallback: js.Any): Unit = js.native
  
  def setEllipsize(where: TruncateAt): Unit = js.native
  
  def setEms(ems: Double): Unit = js.native
  
  def setFilters(e: js.Any, filters: js.Array[_]): Unit = js.native
  def setFilters(filters: js.Array[_]): Unit = js.native
  
  def setFreezesText(freezesText: Boolean): Unit = js.native
  
  def setGravity(gravity: Double): Unit = js.native
  
  def setHeight(pixels: Double): Unit = js.native
  
  def setHighlightColor(color: Double): Unit = js.native
  
  def setHint(hint: String): Unit = js.native
  
  def setHintTextColor(colors: Double): Unit = js.native
  def setHintTextColor(colors: ColorStateList): Unit = js.native
  
  def setHorizontallyScrolling(whether: Boolean): Unit = js.native
  
  def setImeActionLabel(label: String, actionId: Double): Unit = js.native
  
  def setImeOptions(imeOptions: Double): Unit = js.native
  
  def setIncludeFontPadding(includepad: Boolean): Unit = js.native
  
  def setInputType(`type`: Double): Unit = js.native
  def setInputType(`type`: Double, direct: Boolean): Unit = js.native
  
  /* private */ def setInputTypeSingleLine(singleLine: js.Any): js.Any = js.native
  
  def setKeyListener(input: js.Any): Unit = js.native
  
  /* private */ def setKeyListenerOnly(input: js.Any): js.Any = js.native
  
  def setLineSpacing(add: Double, mult: Double): Unit = js.native
  
  def setLines(lines: Double): Unit = js.native
  
  def setLinkTextColor(colors: Double): Unit = js.native
  def setLinkTextColor(colors: ColorStateList): Unit = js.native
  
  def setLinksClickable(whether: Boolean): Unit = js.native
  
  def setMarqueeRepeatLimit(marqueeLimit: Double): Unit = js.native
  
  def setMaxEms(maxems: Double): Unit = js.native
  
  def setMaxHeight(maxHeight: Double): Unit = js.native
  
  def setMaxLines(maxlines: Double): Unit = js.native
  
  def setMaxWidth(maxpixels: Double): Unit = js.native
  
  def setMinEms(minems: Double): Unit = js.native
  
  def setMinHeight(minHeight: Double): Unit = js.native
  
  def setMinLines(minlines: Double): Unit = js.native
  
  def setMinWidth(minpixels: Double): Unit = js.native
  
  def setMovementMethod(movement: MovementMethod): Unit = js.native
  
  def setOnEditorActionListener(l: OnEditorActionListener): Unit = js.native
  
  def setPaintFlags(flags: Double): Unit = js.native
  
  def setRawInputType(`type`: Double): Unit = js.native
  
  /* protected */ def setRawTextSize(size: Double): Unit = js.native
  
  /* private */ def setRelativeDrawablesIfNeeded(start: js.Any, end: js.Any): js.Any = js.native
  
  def setScroller(s: OverScroller): Unit = js.native
  
  def setSelectAllOnFocus(selectAllOnFocus: Boolean): Unit = js.native
  
  def setShadowLayer(radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
  
  def setShowSoftInputOnFocus(show: Boolean): Unit = js.native
  
  def setSingleLine(): Unit = js.native
  def setSingleLine(singleLine: Boolean): Unit = js.native
  
  /* protected */ def setSpan_internal(span: js.Any, start: Double, end: Double, flags: Double): Unit = js.native
  
  def setSpannableFactory(factory: Factory): Unit = js.native
  
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
  
  def setTextColor(colors: Double): Unit = js.native
  def setTextColor(colors: ColorStateList): Unit = js.native
  
  def setTextIsSelectable(selectable: Boolean): Unit = js.native
  
  def setTextLocale(locale: js.Any): Unit = js.native
  
  def setTextScaleX(size: Double): Unit = js.native
  
  def setTextSize(size: Double): Unit = js.native
  def setTextSize(unit: String, size: Double): Unit = js.native
  
  def setTransformationMethod(method: TransformationMethod): Unit = js.native
  
  def setTypeface(tf: js.Any, style: Double): Unit = js.native
  
  /* private */ def setTypefaceFromAttrs(familyName: js.Any, typefaceIndex: js.Any, styleIndex: js.Any): js.Any = js.native
  
  def setUndoManager(undoManager: js.Any, tag: String): Unit = js.native
  
  def setWidth(pixels: Double): Unit = js.native
  
  /* private */ def shouldAdvanceFocusOnEnter(): js.Any = js.native
  
  /* private */ def shouldAdvanceFocusOnTab(): js.Any = js.native
  
  def spanChange(buf: Spanned, what: js.Any, oldStart: Double, newStart: Double, oldEnd: Double, newEnd: Double): Unit = js.native
  
  /* private */ def startMarquee(): js.Any = js.native
  
  /* private */ def startStopMarquee(start: js.Any): js.Any = js.native
  
  /* private */ def stopMarquee(): js.Any = js.native
  
  /* protected */ def stopSelectionActionMode(): Unit = js.native
  
  def textCanBeSelected(): Boolean = js.native
  
  def updateAfterEdit(): Unit = js.native
  
  /* protected */ def updateTextColors(): Unit = js.native
  
  def viewportToContentHorizontalOffset(): Double = js.native
  
  def viewportToContentVerticalOffset(): Double = js.native
}
object TextView {
  
  @js.native
  sealed trait BufferType extends StObject
  @JSGlobal("android.widget.TextView.BufferType")
  @js.native
  object BufferType extends StObject {
    
    @js.native
    sealed trait EDITABLE extends BufferType
    
    @js.native
    sealed trait NORMAL extends BufferType
    
    @js.native
    sealed trait SPANNABLE extends BufferType
  }
  
  @js.native
  trait ChangeWatcher
    extends TextWatcher
       with SpanWatcher {
    
    var _TextView_this: TextView = js.native
    
    var mBeforeText: js.Any = js.native
  }
  object ChangeWatcher {
    
    @scala.inline
    def apply(
      _TextView_this: TextView,
      afterTextChanged: String => Unit,
      beforeTextChanged: (String, Double, Double, Double) => Unit,
      mBeforeText: js.Any,
      onSpanAdded: (Spannable, js.Any, Double, Double) => Unit,
      onSpanChanged: (Spannable, js.Any, Double, Double, Double, Double) => Unit,
      onSpanRemoved: (Spannable, js.Any, Double, Double) => Unit,
      onTextChanged: (String, Double, Double, Double) => Unit
    ): ChangeWatcher = {
      val __obj = js.Dynamic.literal(_TextView_this = _TextView_this.asInstanceOf[js.Any], afterTextChanged = js.Any.fromFunction1(afterTextChanged), beforeTextChanged = js.Any.fromFunction4(beforeTextChanged), mBeforeText = mBeforeText.asInstanceOf[js.Any], onSpanAdded = js.Any.fromFunction4(onSpanAdded), onSpanChanged = js.Any.fromFunction6(onSpanChanged), onSpanRemoved = js.Any.fromFunction4(onSpanRemoved), onTextChanged = js.Any.fromFunction4(onTextChanged))
      __obj.asInstanceOf[ChangeWatcher]
    }
    
    @scala.inline
    implicit class ChangeWatcherMutableBuilder[Self <: ChangeWatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMBeforeText(value: js.Any): Self = StObject.set(x, "mBeforeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_TextView_this(value: TextView): Self = StObject.set(x, "_TextView_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Drawables extends StObject {
    
    /* private */ def applyErrorDrawableIfNeeded(layoutDirection: js.Any): js.Any = js.native
    
    var mCompoundRect: Rect = js.native
    
    var mDrawableBottom: Drawable = js.native
    
    var mDrawableEnd: Drawable = js.native
    
    var mDrawableError: Drawable = js.native
    
    var mDrawableHeightEnd: Double = js.native
    
    var mDrawableHeightError: Double = js.native
    
    var mDrawableHeightLeft: Double = js.native
    
    var mDrawableHeightRight: Double = js.native
    
    var mDrawableHeightStart: Double = js.native
    
    var mDrawableHeightTemp: Double = js.native
    
    var mDrawableLeft: Drawable = js.native
    
    var mDrawableLeftInitial: Drawable = js.native
    
    var mDrawablePadding: Double = js.native
    
    var mDrawableRight: Drawable = js.native
    
    var mDrawableRightInitial: Drawable = js.native
    
    var mDrawableSaved: Double = js.native
    
    var mDrawableSizeBottom: Double = js.native
    
    var mDrawableSizeEnd: Double = js.native
    
    var mDrawableSizeError: Double = js.native
    
    var mDrawableSizeLeft: Double = js.native
    
    var mDrawableSizeRight: Double = js.native
    
    var mDrawableSizeStart: Double = js.native
    
    var mDrawableSizeTemp: Double = js.native
    
    var mDrawableSizeTop: Double = js.native
    
    var mDrawableStart: Drawable = js.native
    
    var mDrawableTemp: Drawable = js.native
    
    var mDrawableTop: Drawable = js.native
    
    var mDrawableWidthBottom: Double = js.native
    
    var mDrawableWidthTop: Double = js.native
    
    var mIsRtlCompatibilityMode: Boolean = js.native
    
    var mOverride: Boolean = js.native
    
    def resolveWithLayoutDirection(layoutDirection: Double): Unit = js.native
    
    def setErrorDrawable(dr: Drawable, tv: TextView): Unit = js.native
    
    /* private */ def updateDrawablesLayoutDirection(layoutDirection: js.Any): js.Any = js.native
  }
  object Drawables {
    
    @scala.inline
    def apply(
      applyErrorDrawableIfNeeded: js.Any => js.Any,
      mCompoundRect: Rect,
      mDrawableBottom: Drawable,
      mDrawableEnd: Drawable,
      mDrawableError: Drawable,
      mDrawableHeightEnd: Double,
      mDrawableHeightError: Double,
      mDrawableHeightLeft: Double,
      mDrawableHeightRight: Double,
      mDrawableHeightStart: Double,
      mDrawableHeightTemp: Double,
      mDrawableLeft: Drawable,
      mDrawableLeftInitial: Drawable,
      mDrawablePadding: Double,
      mDrawableRight: Drawable,
      mDrawableRightInitial: Drawable,
      mDrawableSaved: Double,
      mDrawableSizeBottom: Double,
      mDrawableSizeEnd: Double,
      mDrawableSizeError: Double,
      mDrawableSizeLeft: Double,
      mDrawableSizeRight: Double,
      mDrawableSizeStart: Double,
      mDrawableSizeTemp: Double,
      mDrawableSizeTop: Double,
      mDrawableStart: Drawable,
      mDrawableTemp: Drawable,
      mDrawableTop: Drawable,
      mDrawableWidthBottom: Double,
      mDrawableWidthTop: Double,
      mIsRtlCompatibilityMode: Boolean,
      mOverride: Boolean,
      resolveWithLayoutDirection: Double => Unit,
      setErrorDrawable: (Drawable, TextView) => Unit,
      updateDrawablesLayoutDirection: js.Any => js.Any
    ): Drawables = {
      val __obj = js.Dynamic.literal(applyErrorDrawableIfNeeded = js.Any.fromFunction1(applyErrorDrawableIfNeeded), mCompoundRect = mCompoundRect.asInstanceOf[js.Any], mDrawableBottom = mDrawableBottom.asInstanceOf[js.Any], mDrawableEnd = mDrawableEnd.asInstanceOf[js.Any], mDrawableError = mDrawableError.asInstanceOf[js.Any], mDrawableHeightEnd = mDrawableHeightEnd.asInstanceOf[js.Any], mDrawableHeightError = mDrawableHeightError.asInstanceOf[js.Any], mDrawableHeightLeft = mDrawableHeightLeft.asInstanceOf[js.Any], mDrawableHeightRight = mDrawableHeightRight.asInstanceOf[js.Any], mDrawableHeightStart = mDrawableHeightStart.asInstanceOf[js.Any], mDrawableHeightTemp = mDrawableHeightTemp.asInstanceOf[js.Any], mDrawableLeft = mDrawableLeft.asInstanceOf[js.Any], mDrawableLeftInitial = mDrawableLeftInitial.asInstanceOf[js.Any], mDrawablePadding = mDrawablePadding.asInstanceOf[js.Any], mDrawableRight = mDrawableRight.asInstanceOf[js.Any], mDrawableRightInitial = mDrawableRightInitial.asInstanceOf[js.Any], mDrawableSaved = mDrawableSaved.asInstanceOf[js.Any], mDrawableSizeBottom = mDrawableSizeBottom.asInstanceOf[js.Any], mDrawableSizeEnd = mDrawableSizeEnd.asInstanceOf[js.Any], mDrawableSizeError = mDrawableSizeError.asInstanceOf[js.Any], mDrawableSizeLeft = mDrawableSizeLeft.asInstanceOf[js.Any], mDrawableSizeRight = mDrawableSizeRight.asInstanceOf[js.Any], mDrawableSizeStart = mDrawableSizeStart.asInstanceOf[js.Any], mDrawableSizeTemp = mDrawableSizeTemp.asInstanceOf[js.Any], mDrawableSizeTop = mDrawableSizeTop.asInstanceOf[js.Any], mDrawableStart = mDrawableStart.asInstanceOf[js.Any], mDrawableTemp = mDrawableTemp.asInstanceOf[js.Any], mDrawableTop = mDrawableTop.asInstanceOf[js.Any], mDrawableWidthBottom = mDrawableWidthBottom.asInstanceOf[js.Any], mDrawableWidthTop = mDrawableWidthTop.asInstanceOf[js.Any], mIsRtlCompatibilityMode = mIsRtlCompatibilityMode.asInstanceOf[js.Any], mOverride = mOverride.asInstanceOf[js.Any], resolveWithLayoutDirection = js.Any.fromFunction1(resolveWithLayoutDirection), setErrorDrawable = js.Any.fromFunction2(setErrorDrawable), updateDrawablesLayoutDirection = js.Any.fromFunction1(updateDrawablesLayoutDirection))
      __obj.asInstanceOf[Drawables]
    }
    
    @scala.inline
    implicit class DrawablesMutableBuilder[Self <: Drawables] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyErrorDrawableIfNeeded(value: js.Any => js.Any): Self = StObject.set(x, "applyErrorDrawableIfNeeded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMCompoundRect(value: Rect): Self = StObject.set(x, "mCompoundRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableBottom(value: Drawable): Self = StObject.set(x, "mDrawableBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableEnd(value: Drawable): Self = StObject.set(x, "mDrawableEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableError(value: Drawable): Self = StObject.set(x, "mDrawableError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableHeightEnd(value: Double): Self = StObject.set(x, "mDrawableHeightEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableHeightError(value: Double): Self = StObject.set(x, "mDrawableHeightError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableHeightLeft(value: Double): Self = StObject.set(x, "mDrawableHeightLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableHeightRight(value: Double): Self = StObject.set(x, "mDrawableHeightRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableHeightStart(value: Double): Self = StObject.set(x, "mDrawableHeightStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableHeightTemp(value: Double): Self = StObject.set(x, "mDrawableHeightTemp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableLeft(value: Drawable): Self = StObject.set(x, "mDrawableLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableLeftInitial(value: Drawable): Self = StObject.set(x, "mDrawableLeftInitial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawablePadding(value: Double): Self = StObject.set(x, "mDrawablePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableRight(value: Drawable): Self = StObject.set(x, "mDrawableRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableRightInitial(value: Drawable): Self = StObject.set(x, "mDrawableRightInitial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableSaved(value: Double): Self = StObject.set(x, "mDrawableSaved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableSizeBottom(value: Double): Self = StObject.set(x, "mDrawableSizeBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableSizeEnd(value: Double): Self = StObject.set(x, "mDrawableSizeEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableSizeError(value: Double): Self = StObject.set(x, "mDrawableSizeError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableSizeLeft(value: Double): Self = StObject.set(x, "mDrawableSizeLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableSizeRight(value: Double): Self = StObject.set(x, "mDrawableSizeRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableSizeStart(value: Double): Self = StObject.set(x, "mDrawableSizeStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableSizeTemp(value: Double): Self = StObject.set(x, "mDrawableSizeTemp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableSizeTop(value: Double): Self = StObject.set(x, "mDrawableSizeTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableStart(value: Drawable): Self = StObject.set(x, "mDrawableStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableTemp(value: Drawable): Self = StObject.set(x, "mDrawableTemp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableTop(value: Drawable): Self = StObject.set(x, "mDrawableTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableWidthBottom(value: Double): Self = StObject.set(x, "mDrawableWidthBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableWidthTop(value: Double): Self = StObject.set(x, "mDrawableWidthTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIsRtlCompatibilityMode(value: Boolean): Self = StObject.set(x, "mIsRtlCompatibilityMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOverride(value: Boolean): Self = StObject.set(x, "mOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveWithLayoutDirection(value: Double => Unit): Self = StObject.set(x, "resolveWithLayoutDirection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetErrorDrawable(value: (Drawable, TextView) => Unit): Self = StObject.set(x, "setErrorDrawable", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateDrawablesLayoutDirection(value: js.Any => js.Any): Self = StObject.set(x, "updateDrawablesLayoutDirection", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Marquee extends Handler {
    
    def getGhostOffset(): Double = js.native
    
    def getMaxFadeScroll(): Double = js.native
    
    def getScroll(): Double = js.native
    
    def isRunning(): Boolean = js.native
    
    def isStopped(): Boolean = js.native
    
    var mFadeStop: js.Any = js.native
    
    var mGhostOffset: js.Any = js.native
    
    var mGhostStart: js.Any = js.native
    
    var mMaxFadeScroll: js.Any = js.native
    
    var mMaxScroll: js.Any = js.native
    
    var mRepeatLimit: js.Any = js.native
    
    var mScroll: js.Any = js.native
    
    var mScrollUnit: js.Any = js.native
    
    var mStatus: js.Any = js.native
    
    var mView: js.Any = js.native
    
    /* private */ def resetScroll(): js.Any = js.native
    
    def shouldDrawGhost(): Boolean = js.native
    
    def shouldDrawLeftFade(): Boolean = js.native
    
    def start(repeatLimit: Double): Unit = js.native
    
    def stop(): Unit = js.native
    
    def tick(): Unit = js.native
  }
  
  @js.native
  trait OnEditorActionListener extends StObject {
    
    def onEditorAction(v: TextView, actionId: Double, event: KeyEvent): Boolean = js.native
  }
  object OnEditorActionListener {
    
    @scala.inline
    def apply(onEditorAction: (TextView, Double, KeyEvent) => Boolean): OnEditorActionListener = {
      val __obj = js.Dynamic.literal(onEditorAction = js.Any.fromFunction3(onEditorAction))
      __obj.asInstanceOf[OnEditorActionListener]
    }
    
    @scala.inline
    implicit class OnEditorActionListenerMutableBuilder[Self <: OnEditorActionListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnEditorAction(value: (TextView, Double, KeyEvent) => Boolean): Self = StObject.set(x, "onEditorAction", js.Any.fromFunction3(value))
    }
  }
}
