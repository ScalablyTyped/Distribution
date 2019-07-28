package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.contentNs.resNs.ColorStateList
import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.textNs.BoringLayoutNs.Metrics
import typings.androiduix.androidNs.textNs.Layout
import typings.androiduix.androidNs.textNs.Spannable
import typings.androiduix.androidNs.textNs.SpannableNs.Factory
import typings.androiduix.androidNs.textNs.Spanned
import typings.androiduix.androidNs.textNs.TextDirectionHeuristic
import typings.androiduix.androidNs.textNs.TextPaint
import typings.androiduix.androidNs.textNs.TextUtilsNs.TruncateAt
import typings.androiduix.androidNs.textNs.TextWatcher
import typings.androiduix.androidNs.textNs.methodNs.MovementMethod
import typings.androiduix.androidNs.textNs.methodNs.TransformationMethod
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewTreeObserverNs.OnPreDrawListener
import typings.androiduix.androidNs.widgetNs.TextViewNs.BufferType
import typings.androiduix.androidNs.widgetNs.TextViewNs.Drawables
import typings.androiduix.androidNs.widgetNs.TextViewNs.OnEditorActionListener
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.TextView")
@js.native
class TextView protected ()
  extends View
     with OnPreDrawListener {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
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
  /* private */ def getDesiredHeight(): js.Any = js.native
  /* private */ def getDesiredHeight(layout: js.Any): js.Any = js.native
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
  /* CompleteClass */
  override def onPreDraw(): Boolean = js.native
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
  def setText(text: String, `type`: BufferType): Unit = js.native
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

/* static members */
@JSGlobal("android.widget.TextView")
@js.native
object TextView extends js.Object {
  var ANIMATED_SCROLL_GAP: js.Any = js.native
  var CHANGE_WATCHER_PRIORITY: js.Any = js.native
  var DEBUG_EXTRACT: Boolean = js.native
  var DECIMAL: js.Any = js.native
  var EMS: js.Any = js.native
  var LAST_CUT_OR_COPY_TIME: Double = js.native
  var LINES: js.Any = js.native
  var LOG_TAG: String = js.native
  var MARQUEE_FADE_NORMAL: js.Any = js.native
  var MARQUEE_FADE_SWITCH_SHOW_ELLIPSIS: js.Any = js.native
  var MARQUEE_FADE_SWITCH_SHOW_FADE: js.Any = js.native
  var MONOSPACE: js.Any = js.native
  var MULTILINE_STATE_SET: js.Any = js.native
  var NO_FILTERS: js.Any = js.native
  var PIXELS: js.Any = js.native
  var SANS: js.Any = js.native
  var SERIF: js.Any = js.native
  var SIGNED: js.Any = js.native
  var TEMP_RECTF: js.Any = js.native
  var UNKNOWN_BORING: js.Any = js.native
  var VERY_WIDE: js.Any = js.native
  /* private */ def desired(layout: js.Any): js.Any = js.native
  def getTextColor(`def`: Double): Double = js.native
  def getTextColors(): ColorStateList = js.native
  /* private */ def isMultilineInputType(`type`: js.Any): js.Any = js.native
  /* private */ def isPasswordInputType(inputType: js.Any): js.Any = js.native
  /* private */ def isVisiblePasswordInputType(inputType: js.Any): js.Any = js.native
}

