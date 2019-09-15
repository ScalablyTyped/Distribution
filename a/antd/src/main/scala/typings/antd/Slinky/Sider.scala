package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.lg
import typings.antd.antdStrings.md
import typings.antd.antdStrings.sm
import typings.antd.antdStrings.xl
import typings.antd.antdStrings.xs
import typings.antd.antdStrings.xxl
import typings.antd.esLayoutSiderMod.CollapseType
import typings.antd.esLayoutSiderMod.SiderProps
import typings.antd.esLayoutSiderMod.SiderTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: aria-valuetext, aria-errormessage, aria-haspopup, aria-rowcount, aria-autocomplete, aria-labelledby, aria-describedby, aria-activedescendant, aria-level, aria-live, aria-dropeffect, aria-expanded, aria-rowspan, aria-checked, aria-disabled, aria-multiselectable, aria-pressed, aria-relevant, aria-hidden, aria-colcount, aria-sort, aria-colindex, aria-keyshortcuts, aria-setsize, aria-rowindex, aria-valuemin, aria-modal, aria-colspan, aria-owns, aria-roledescription, aria-multiline, aria-grabbed, aria-valuenow, aria-selected, aria-placeholder, aria-busy, aria-orientation, aria-details, aria-required, aria-label, aria-posinset, aria-valuemax, aria-atomic, aria-controls, aria-current, aria-readonly, aria-invalid, aria-flowto, onDurationChangeCapture, onDoubleClickCapture, onProgressCapture, onAuxClickCapture, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, children, onDragStart, onCanPlayThrough, onPointerEnterCapture, onInput, onTouchEndCapture, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, onWaiting, onKeyPressCapture, onKeyDown, onPause, onTouchStartCapture, onPointerOverCapture, onSeeked, onPointerLeave, onContextMenuCapture, onEmptied, onChange, onDragCapture, onKeyDownCapture, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, onReset, onLoadStartCapture, onResetCapture, onDrop, onDragStartCapture, onDragExit, onDragOver, onCut, onLoadedData, onMouseOverCapture, onPlayingCapture, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, onSubmit, onSelectCapture, onRateChange, onAbortCapture, onPointerDownCapture, onAnimationEnd, onEmptiedCapture, onWaitingCapture, onCanPlayThroughCapture, onMouseUp, onTouchEnd, onKeyUp, onMouseOutCapture, onDurationChange, onMouseMove, onStalledCapture, onAnimationEndCapture, onMouseOver, onPointerDown, onPlay, onSeekedCapture, onLostPointerCaptureCapture, dangerouslySetInnerHTML, onError, onPointerLeaveCapture, onBlurCapture, onFocusCapture, onPointerUpCapture, onLoadedMetadata, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, onAnimationStart, onCopy, onInputCapture, onVolumeChange, onSubmitCapture, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, onLoadStart, onEncryptedCapture, onPointerMoveCapture, onSuspend, onDragEnter, onPaste, onBeforeInput, onTouchMove, onSelect, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, onEnded, onTouchCancelCapture, onErrorCapture, onAnimationIteration, onPauseCapture, onPlaying, onAbort, onTransitionEndCapture, onWheelCapture, onLoad, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, onDropCapture, onAuxClick, onInvalidCapture, onPointerCancel, onCompositionEnd, onTimeUpdate, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture, autoSave, itemRef, tabIndex, is, contentEditable, security, role, style, unselectable, prefix, hidden, itemID, itemProp, radioGroup, color, placeholder, suppressHydrationWarning, inputMode, inlist, autoCorrect, autoCapitalize, itemScope, vocab, dir, id, results, draggable, resource, suppressContentEditableWarning, itemType, accessKey, className, typeof, datatype, property, spellCheck, defaultChecked, title, lang, defaultValue, about, slot, contextMenu, width */
object Sider
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esLayoutMod.default.Sider.asInstanceOf[String | js.Object]
  def apply(
    breakpoint: xs | sm | md | lg | xl | xxl = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedWidth: Double | String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    defaultCollapsed: js.UndefOr[Boolean] = js.undefined,
    onBreakpoint: /* broken */ Boolean => Unit = null,
    onCollapse: (/* collapsed */ Boolean, /* type */ CollapseType) => Unit = null,
    prefixCls: String = null,
    reverseArrow: js.UndefOr[Boolean] = js.undefined,
    theme: SiderTheme = null,
    trigger: TagMod[Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsedWidth != null) __obj.updateDynamic("collapsedWidth")(collapsedWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (!js.isUndefined(defaultCollapsed)) __obj.updateDynamic("defaultCollapsed")(defaultCollapsed)
    if (onBreakpoint != null) __obj.updateDynamic("onBreakpoint")(js.Any.fromFunction1(onBreakpoint))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction2(onCollapse))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(reverseArrow)) __obj.updateDynamic("reverseArrow")(reverseArrow)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SiderProps
}

