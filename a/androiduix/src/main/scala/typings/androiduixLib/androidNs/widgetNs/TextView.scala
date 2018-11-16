package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.TextView")
@js.native
class TextView protected ()
  extends androiduixLib.androidNs.viewNs.View
     with androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnPreDrawListener {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mAllowTransformationLengthChange: js.Any = js.native
  var mAutoLinkMask: js.Any = js.native
  var mBoring: js.Any = js.native
  var mBufferType: js.Any = js.native
  var mChangeWatcher: js.Any = js.native
  var mCurHintTextColor: js.Any = js.native
  var mCurTextColor: js.Any = js.native
  var mCursorDrawableRes: scala.Double = js.native
  var mDeferScroll: js.Any = js.native
  var mDesiredHeightAtMeasure: js.Any = js.native
  var mDispatchTemporaryDetach: js.Any = js.native
  var mDrawables: androiduixLib.androidNs.widgetNs.TextViewNs.Drawables = js.native
  var mEditor: js.Any = js.native
  var mEllipsize: js.Any = js.native
  var mFilters: js.Any = js.native
  var mFreezesText: js.Any = js.native
  var mGravity: js.Any = js.native
  var mHighlightColor: scala.Double = js.native
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
  var mSkipDrawText: scala.Boolean = js.native
  var mSpacingAdd: js.Any = js.native
  var mSpacingMult: js.Any = js.native
  var mSpannableFactory: js.Any = js.native
  var mTempRect: js.Any = js.native
  var mTemporaryDetach: js.Any = js.native
  var mText: js.Any = js.native
  var mTextColor: js.Any = js.native
  var mTextDir: js.Any = js.native
  var mTextEditSuggestionItemLayout: scala.Double = js.native
  var mTextPaint: js.Any = js.native
  var mTextSelectHandleLeftRes: scala.Double = js.native
  var mTextSelectHandleRes: scala.Double = js.native
  var mTextSelectHandleRightRes: scala.Double = js.native
  var mTransformation: js.Any = js.native
  var mTransformed: js.Any = js.native
  var mUserSetTextScaleX: js.Any = js.native
  def addTextChangedListener(watcher: androiduixLib.androidNs.textNs.TextWatcher): scala.Unit = js.native
  /* private */ def applySingleLine(singleLine: js.Any, applyTransformation: js.Any, changeMaxLines: js.Any): js.Any = js.native
  /* private */ def assumeLayout(): js.Any = js.native
  def bringPointIntoView(offset: scala.Double): scala.Boolean = js.native
  /* private */ def bringTextIntoView(): js.Any = js.native
  def canCopy(): scala.Boolean = js.native
  def canCut(): scala.Boolean = js.native
  /* private */ def canMarquee(): js.Any = js.native
  def canPaste(): scala.Boolean = js.native
  /* private */ def canSelectText(): js.Any = js.native
  /* private */ def checkForRelayout(): js.Any = js.native
  /* private */ def checkForResize(): js.Any = js.native
  def clearComposingText(): scala.Unit = js.native
  /* private */ def compressText(width: js.Any): js.Any = js.native
  /* private */ def convertFromViewportToContentCoordinates(r: js.Any): js.Any = js.native
  def convertToLocalHorizontalCoordinate(x: scala.Double): scala.Double = js.native
  /* private */ def createEditorIfNeeded(): js.Any = js.native
  /* protected */ def deleteText_internal(start: scala.Double, end: scala.Double): scala.Unit = js.native
  def didTouchFocusSelect(): scala.Boolean = js.native
  /* private */ def doKeyDown(keyCode: js.Any, event: js.Any, otherEvent: js.Any): js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MTextView(d: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  /* private */ def fixFocusableAndClickableSettings(): js.Any = js.native
  def getAutoLinkMask(): scala.Double = js.native
  /* protected */ def getBottomPaddingOffset(): scala.Double = js.native
  /* private */ def getBottomVerticalOffset(forceNormal: js.Any): js.Any = js.native
  /* private */ def getBoxHeight(l: js.Any): js.Any = js.native
  def getCompoundDrawablePadding(): scala.Double = js.native
  def getCompoundDrawables(): js.Array[androiduixLib.androidNs.graphicsNs.drawableNs.Drawable] = js.native
  def getCompoundDrawablesRelative(): js.Array[androiduixLib.androidNs.graphicsNs.drawableNs.Drawable] = js.native
  def getCompoundPaddingBottom(): scala.Double = js.native
  def getCompoundPaddingEnd(): scala.Double = js.native
  def getCompoundPaddingLeft(): scala.Double = js.native
  def getCompoundPaddingRight(): scala.Double = js.native
  def getCompoundPaddingStart(): scala.Double = js.native
  def getCompoundPaddingTop(): scala.Double = js.native
  def getCurrentHintTextColor(): scala.Double = js.native
  def getCurrentTextColor(): scala.Double = js.native
  def getCustomSelectionActionModeCallback(): js.Any = js.native
  /* protected */ def getDefaultEditable(): scala.Boolean = js.native
  /* protected */ def getDefaultMovementMethod(): androiduixLib.androidNs.textNs.methodNs.MovementMethod = js.native
  /* private */ def getDesiredHeight(): js.Any = js.native
  /* private */ def getDesiredHeight(layout: js.Any): js.Any = js.native
  /* private */ def getDesiredHeight(layout: js.Any, cap: js.Any): js.Any = js.native
  def getEditableText(): js.Any = js.native
  def getEllipsize(): androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt = js.native
  def getExtendedPaddingBottom(): scala.Double = js.native
  def getExtendedPaddingTop(): scala.Double = js.native
  /* protected */ def getFadeHeight(offsetRequired: scala.Boolean): scala.Double = js.native
  /* protected */ def getFadeTop(offsetRequired: scala.Boolean): scala.Double = js.native
  def getFilters(): js.Array[_] = js.native
  def getFreezesText(): scala.Boolean = js.native
  def getGravity(): scala.Double = js.native
  def getHighlightColor(): scala.Double = js.native
  def getHint(): java.lang.String = js.native
  def getHintLayout(): androiduixLib.androidNs.textNs.Layout = js.native
  def getHintTextColors(): androiduixLib.androidNs.contentNs.resNs.ColorStateList = js.native
  def getHorizontalOffsetForDrawables(): scala.Double = js.native
  def getHorizontallyScrolling(): scala.Boolean = js.native
  def getImeActionId(): scala.Double = js.native
  def getImeActionLabel(): java.lang.String = js.native
  def getImeOptions(): scala.Double = js.native
  def getIncludeFontPadding(): scala.Boolean = js.native
  def getInputType(): scala.Double = js.native
  /* private */ def getInterestingRect(r: js.Any, line: js.Any): js.Any = js.native
  def getKeyListener(): js.Any = js.native
  def getLayout(): androiduixLib.androidNs.textNs.Layout = js.native
  /* private */ def getLayoutAlignment(): js.Any = js.native
  /* protected */ def getLeftPaddingOffset(): scala.Double = js.native
  def getLineAtCoordinate(y: scala.Double): scala.Double = js.native
  def getLineBounds(line: scala.Double, bounds: androiduixLib.androidNs.graphicsNs.Rect): scala.Double = js.native
  def getLineCount(): scala.Double = js.native
  def getLineHeight(): scala.Double = js.native
  def getLineSpacingExtra(): scala.Double = js.native
  def getLineSpacingMultiplier(): scala.Double = js.native
  def getLinkTextColors(): androiduixLib.androidNs.contentNs.resNs.ColorStateList = js.native
  def getLinksClickable(): scala.Boolean = js.native
  def getMarqueeRepeatLimit(): scala.Double = js.native
  def getMaxEms(): scala.Double = js.native
  def getMaxHeight(): scala.Double = js.native
  def getMaxLines(): scala.Double = js.native
  def getMaxWidth(): scala.Double = js.native
  def getMinEms(): scala.Double = js.native
  def getMinHeight(): scala.Double = js.native
  def getMinLines(): scala.Double = js.native
  def getMinWidth(): scala.Double = js.native
  def getMovementMethod(): androiduixLib.androidNs.textNs.methodNs.MovementMethod = js.native
  /* private */ def getOffsetAtCoordinate(line: js.Any, x: js.Any): js.Any = js.native
  def getOffsetForPosition(x: scala.Double, y: scala.Double): scala.Double = js.native
  def getPaint(): androiduixLib.androidNs.textNs.TextPaint = js.native
  def getPaintFlags(): scala.Double = js.native
  /* protected */ def getRightPaddingOffset(): scala.Double = js.native
  def getSelectionEnd(): scala.Double = js.native
  def getSelectionStart(): scala.Double = js.native
  def getShadowColor(): scala.Double = js.native
  def getShadowDx(): scala.Double = js.native
  def getShadowDy(): scala.Double = js.native
  def getShadowRadius(): scala.Double = js.native
  def getShowSoftInputOnFocus(): scala.Boolean = js.native
  def getText(): java.lang.String = js.native
  def getTextColors(): androiduixLib.androidNs.contentNs.resNs.ColorStateList = js.native
  def getTextDirectionHeuristic(): androiduixLib.androidNs.textNs.TextDirectionHeuristic = js.native
  def getTextLocale(): js.Any = js.native
  def getTextScaleX(): scala.Double = js.native
  def getTextSize(): scala.Double = js.native
  /* protected */ def getTopPaddingOffset(): scala.Double = js.native
  def getTotalPaddingBottom(): scala.Double = js.native
  def getTotalPaddingEnd(): scala.Double = js.native
  def getTotalPaddingLeft(): scala.Double = js.native
  def getTotalPaddingRight(): scala.Double = js.native
  def getTotalPaddingStart(): scala.Double = js.native
  def getTotalPaddingTop(): scala.Double = js.native
  def getTransformationMethod(): androiduixLib.androidNs.textNs.methodNs.TransformationMethod = js.native
  def getTransformedText(start: scala.Double, end: scala.Double): java.lang.String = js.native
  def getTypeface(): js.Any = js.native
  def getUndoManager(): js.Any = js.native
  /* private */ def getUpdatedHighlightPath(): js.Any = js.native
  def getUrls(): js.Array[_] = js.native
  def getVerticalOffset(forceNormal: scala.Boolean): scala.Double = js.native
  def handleTextChanged(buffer: java.lang.String, start: scala.Double, before: scala.Double, after: scala.Double): scala.Unit = js.native
  /* private */ def hasPasswordTransformationMethod(): js.Any = js.native
  def hasSelection(): scala.Boolean = js.native
  def hideErrorIfUnchanged(): scala.Unit = js.native
  def invalidateRegion(start: scala.Double, end: scala.Double, invalidateCursor: scala.Boolean): scala.Unit = js.native
  def isCursorVisible(): scala.Boolean = js.native
  def isInBatchEditMode(): scala.Boolean = js.native
  /* protected */ def isPaddingOffsetRequired(): scala.Boolean = js.native
  /* private */ def isShowingHint(): js.Any = js.native
  def isSingleLine(): scala.Boolean = js.native
  def isSuggestionsEnabled(): scala.Boolean = js.native
  def isTextEditable(): scala.Boolean = js.native
  def isTextSelectable(): scala.Boolean = js.native
  def length(): scala.Double = js.native
  /* protected */ def makeNewLayout(
    wantWidth: scala.Double,
    hintWidth: scala.Double,
    boring: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics,
    hintBoring: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics,
    ellipsisWidth: scala.Double,
    bringIntoView: scala.Boolean
  ): scala.Unit = js.native
  /* private */ def makeSingleLayout(
    wantWidth: js.Any,
    boring: js.Any,
    ellipsisWidth: js.Any,
    alignment: js.Any,
    shouldEllipsize: js.Any,
    effectiveEllipsize: js.Any,
    useSaved: js.Any
  ): js.Any = js.native
  def moveCursorToVisibleOffset(): scala.Boolean = js.native
  /* private */ def nullLayouts(): js.Any = js.native
  def onCheckIsTextEditor(): scala.Boolean = js.native
  /* CompleteClass */
  override def onPreDraw(): scala.Boolean = js.native
  def onResolveDrawables(layoutDirection: scala.Double): scala.Unit = js.native
  /* protected */ def onSelectionChanged(selStart: scala.Double, selEnd: scala.Double): scala.Unit = js.native
  /* protected */ def onTextChanged(text: java.lang.String, start: scala.Double, lengthBefore: scala.Double, lengthAfter: scala.Double): scala.Unit = js.native
  /* private */ def registerForPreDraw(): js.Any = js.native
  def removeAdjacentSuggestionSpans(pos: scala.Double): scala.Unit = js.native
  def removeMisspelledSpans(spannable: androiduixLib.androidNs.textNs.Spannable): scala.Unit = js.native
  def removeSuggestionSpans(text: java.lang.String): java.lang.String = js.native
  def removeTextChangedListener(watcher: androiduixLib.androidNs.textNs.TextWatcher): scala.Unit = js.native
  /* protected */ def replaceText_internal(start: scala.Double, end: scala.Double, text: java.lang.String): scala.Unit = js.native
  def resetErrorChangedFlag(): scala.Unit = js.native
  /* protected */ def resetResolvedDrawables(): scala.Unit = js.native
  /* private */ def restartMarqueeIfNeeded(): js.Any = js.native
  def selectAllText(): scala.Boolean = js.native
  def sendAfterTextChanged(text: js.Any): scala.Unit = js.native
  /* private */ def sendBeforeTextChanged(text: js.Any, start: js.Any, before: js.Any, after: js.Any): js.Any = js.native
  def sendOnTextChanged(text: java.lang.String, start: scala.Double, before: scala.Double, after: scala.Double): scala.Unit = js.native
  def setAllCaps(allCaps: scala.Boolean): scala.Unit = js.native
  def setAutoLinkMask(mask: scala.Double): scala.Unit = js.native
  def setCompoundDrawablePadding(pad: scala.Double): scala.Unit = js.native
  def setCompoundDrawables(
    left: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    top: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    right: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    bottom: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable
  ): scala.Unit = js.native
  def setCompoundDrawablesRelative(
    start: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    top: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    end: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    bottom: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable
  ): scala.Unit = js.native
  def setCompoundDrawablesRelativeWithIntrinsicBounds(
    start: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    top: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    end: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    bottom: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable
  ): scala.Unit = js.native
  def setCompoundDrawablesWithIntrinsicBounds(
    left: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    top: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    right: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    bottom: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable
  ): scala.Unit = js.native
  /* protected */ def setCursorPosition_internal(start: scala.Double, end: scala.Double): scala.Unit = js.native
  def setCursorVisible(visible: scala.Boolean): scala.Unit = js.native
  def setCustomSelectionActionModeCallback(actionModeCallback: js.Any): scala.Unit = js.native
  def setEllipsize(where: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt): scala.Unit = js.native
  def setEms(ems: scala.Double): scala.Unit = js.native
  def setFilters(e: js.Any, filters: js.Array[_]): scala.Unit = js.native
  def setFilters(filters: js.Array[_]): scala.Unit = js.native
  def setFreezesText(freezesText: scala.Boolean): scala.Unit = js.native
  def setGravity(gravity: scala.Double): scala.Unit = js.native
  def setHeight(pixels: scala.Double): scala.Unit = js.native
  def setHighlightColor(color: scala.Double): scala.Unit = js.native
  def setHint(hint: java.lang.String): scala.Unit = js.native
  def setHintTextColor(colors: androiduixLib.androidNs.contentNs.resNs.ColorStateList): scala.Unit = js.native
  def setHintTextColor(colors: scala.Double): scala.Unit = js.native
  def setHorizontallyScrolling(whether: scala.Boolean): scala.Unit = js.native
  def setImeActionLabel(label: java.lang.String, actionId: scala.Double): scala.Unit = js.native
  def setImeOptions(imeOptions: scala.Double): scala.Unit = js.native
  def setIncludeFontPadding(includepad: scala.Boolean): scala.Unit = js.native
  def setInputType(`type`: scala.Double): scala.Unit = js.native
  def setInputType(`type`: scala.Double, direct: scala.Boolean): scala.Unit = js.native
  /* private */ def setInputTypeSingleLine(singleLine: js.Any): js.Any = js.native
  def setKeyListener(input: js.Any): scala.Unit = js.native
  /* private */ def setKeyListenerOnly(input: js.Any): js.Any = js.native
  def setLineSpacing(add: scala.Double, mult: scala.Double): scala.Unit = js.native
  def setLines(lines: scala.Double): scala.Unit = js.native
  def setLinkTextColor(colors: androiduixLib.androidNs.contentNs.resNs.ColorStateList): scala.Unit = js.native
  def setLinkTextColor(colors: scala.Double): scala.Unit = js.native
  def setLinksClickable(whether: scala.Boolean): scala.Unit = js.native
  def setMarqueeRepeatLimit(marqueeLimit: scala.Double): scala.Unit = js.native
  def setMaxEms(maxems: scala.Double): scala.Unit = js.native
  def setMaxHeight(maxHeight: scala.Double): scala.Unit = js.native
  def setMaxLines(maxlines: scala.Double): scala.Unit = js.native
  def setMaxWidth(maxpixels: scala.Double): scala.Unit = js.native
  def setMinEms(minems: scala.Double): scala.Unit = js.native
  def setMinHeight(minHeight: scala.Double): scala.Unit = js.native
  def setMinLines(minlines: scala.Double): scala.Unit = js.native
  def setMinWidth(minpixels: scala.Double): scala.Unit = js.native
  def setMovementMethod(movement: androiduixLib.androidNs.textNs.methodNs.MovementMethod): scala.Unit = js.native
  def setOnEditorActionListener(l: androiduixLib.androidNs.widgetNs.TextViewNs.OnEditorActionListener): scala.Unit = js.native
  def setPaintFlags(flags: scala.Double): scala.Unit = js.native
  def setRawInputType(`type`: scala.Double): scala.Unit = js.native
  /* protected */ def setRawTextSize(size: scala.Double): scala.Unit = js.native
  /* private */ def setRelativeDrawablesIfNeeded(start: js.Any, end: js.Any): js.Any = js.native
  def setScroller(s: OverScroller): scala.Unit = js.native
  def setSelectAllOnFocus(selectAllOnFocus: scala.Boolean): scala.Unit = js.native
  def setShadowLayer(radius: scala.Double, dx: scala.Double, dy: scala.Double, color: scala.Double): scala.Unit = js.native
  def setShowSoftInputOnFocus(show: scala.Boolean): scala.Unit = js.native
  def setSingleLine(): scala.Unit = js.native
  def setSingleLine(singleLine: scala.Boolean): scala.Unit = js.native
  /* protected */ def setSpan_internal(span: js.Any, start: scala.Double, end: scala.Double, flags: scala.Double): scala.Unit = js.native
  def setSpannableFactory(factory: androiduixLib.androidNs.textNs.SpannableNs.Factory): scala.Unit = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
  def setText(text: java.lang.String, `type`: androiduixLib.androidNs.widgetNs.TextViewNs.BufferType): scala.Unit = js.native
  def setText(
    text: java.lang.String,
    `type`: androiduixLib.androidNs.widgetNs.TextViewNs.BufferType,
    notifyBefore: scala.Boolean
  ): scala.Unit = js.native
  def setText(
    text: java.lang.String,
    `type`: androiduixLib.androidNs.widgetNs.TextViewNs.BufferType,
    notifyBefore: scala.Boolean,
    oldlen: scala.Double
  ): scala.Unit = js.native
  def setTextColor(colors: androiduixLib.androidNs.contentNs.resNs.ColorStateList): scala.Unit = js.native
  def setTextColor(colors: scala.Double): scala.Unit = js.native
  def setTextIsSelectable(selectable: scala.Boolean): scala.Unit = js.native
  def setTextLocale(locale: js.Any): scala.Unit = js.native
  def setTextScaleX(size: scala.Double): scala.Unit = js.native
  def setTextSize(size: scala.Double): scala.Unit = js.native
  def setTextSize(unit: java.lang.String, size: scala.Double): scala.Unit = js.native
  def setTransformationMethod(method: androiduixLib.androidNs.textNs.methodNs.TransformationMethod): scala.Unit = js.native
  def setTypeface(tf: js.Any, style: scala.Double): scala.Unit = js.native
  /* private */ def setTypefaceFromAttrs(familyName: js.Any, typefaceIndex: js.Any, styleIndex: js.Any): js.Any = js.native
  def setUndoManager(undoManager: js.Any, tag: java.lang.String): scala.Unit = js.native
  def setWidth(pixels: scala.Double): scala.Unit = js.native
  /* private */ def shouldAdvanceFocusOnEnter(): js.Any = js.native
  /* private */ def shouldAdvanceFocusOnTab(): js.Any = js.native
  def spanChange(
    buf: androiduixLib.androidNs.textNs.Spanned,
    what: js.Any,
    oldStart: scala.Double,
    newStart: scala.Double,
    oldEnd: scala.Double,
    newEnd: scala.Double
  ): scala.Unit = js.native
  /* private */ def startMarquee(): js.Any = js.native
  /* private */ def startStopMarquee(start: js.Any): js.Any = js.native
  /* private */ def stopMarquee(): js.Any = js.native
  /* protected */ def stopSelectionActionMode(): scala.Unit = js.native
  def textCanBeSelected(): scala.Boolean = js.native
  def updateAfterEdit(): scala.Unit = js.native
  /* protected */ def updateTextColors(): scala.Unit = js.native
  def viewportToContentHorizontalOffset(): scala.Double = js.native
  def viewportToContentVerticalOffset(): scala.Double = js.native
}

@JSGlobal("android.widget.TextView")
@js.native
object TextView extends js.Object {
  var ANIMATED_SCROLL_GAP: js.Any = js.native
  var CHANGE_WATCHER_PRIORITY: js.Any = js.native
  var DEBUG_EXTRACT: scala.Boolean = js.native
  var DECIMAL: js.Any = js.native
  var EMS: js.Any = js.native
  var LAST_CUT_OR_COPY_TIME: scala.Double = js.native
  var LINES: js.Any = js.native
  var LOG_TAG: java.lang.String = js.native
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
  def getTextColor(`def`: scala.Double): scala.Double = js.native
  def getTextColors(): androiduixLib.androidNs.contentNs.resNs.ColorStateList = js.native
  /* private */ def isMultilineInputType(`type`: js.Any): js.Any = js.native
  /* private */ def isPasswordInputType(inputType: js.Any): js.Any = js.native
  /* private */ def isVisiblePasswordInputType(inputType: js.Any): js.Any = js.native
}

