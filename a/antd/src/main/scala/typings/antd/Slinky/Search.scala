package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.esInputSearchMod.SearchProps
import typings.antd.esInputSearchMod.default
import typings.react.NativeMouseEvent
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onDurationChangeCapture, onDoubleClickCapture, aria-valuetext, onProgressCapture, onAuxClickCapture, autoSave, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, name, aria-errormessage, onDragStart, formNoValidate, itemRef, onCanPlayThrough, onPointerEnterCapture, aria-haspopup, tabIndex, aria-rowcount, onInput, onTouchEndCapture, is, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, aria-autocomplete, accept, onAnimationStartCapture, step, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, readOnly, aria-labelledby, pattern, onWaiting, aria-describedby, onKeyPressCapture, onKeyDown, aria-activedescendant, onPause, aria-level, aria-live, contentEditable, security, role, onTouchStartCapture, checked, onPointerOverCapture, onSeeked, style, onPointerLeave, aria-dropeffect, onContextMenuCapture, aria-expanded, aria-rowspan, onEmptied, unselectable, aria-checked, aria-disabled, aria-multiselectable, onDragCapture, onKeyDownCapture, aria-pressed, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, aria-relevant, onReset, onLoadStartCapture, onResetCapture, hidden, onDrop, aria-hidden, aria-colcount, onDragStartCapture, onDragExit, onDragOver, itemID, onCut, onLoadedData, height, itemProp, radioGroup, onMouseOverCapture, onPlayingCapture, aria-sort, min, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, aria-colindex, onSubmit, onSelectCapture, onRateChange, color, onAbortCapture, onPointerDownCapture, placeholder, onAnimationEnd, suppressHydrationWarning, onEmptiedCapture, aria-keyshortcuts, aria-setsize, onWaitingCapture, aria-rowindex, inputMode, onCanPlayThroughCapture, inlist, aria-valuemin, crossOrigin, onMouseUp, autoFocus, onTouchEnd, autoCorrect, onKeyUp, onMouseOutCapture, onDurationChange, autoCapitalize, onMouseMove, onStalledCapture, onAnimationEndCapture, formTarget, aria-modal, itemScope, onMouseOver, onPointerDown, aria-colspan, onPlay, vocab, dir, onSeekedCapture, id, onLostPointerCaptureCapture, dangerouslySetInnerHTML, aria-owns, results, autoComplete, onError, onPointerLeaveCapture, max, onBlurCapture, draggable, onFocusCapture, onPointerUpCapture, onLoadedMetadata, resource, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, alt, onMouseDownCapture, onLostPointerCapture, aria-roledescription, suppressContentEditableWarning, aria-multiline, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, aria-grabbed, aria-valuenow, onAnimationStart, onCopy, aria-selected, onInputCapture, onVolumeChange, formMethod, onSubmitCapture, itemType, accessKey, className, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, src, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, typeof, onLoadStart, onEncryptedCapture, aria-placeholder, aria-busy, aria-orientation, onPointerMoveCapture, aria-details, onSuspend, onDragEnter, datatype, onPaste, disabled, property, onBeforeInput, onTouchMove, minLength, onSelect, spellCheck, onPointerUp, formEncType, onGotPointerCapture, onDragOverCapture, onKeyPress, aria-required, onEnded, multiple, defaultChecked, title, onTouchCancelCapture, lang, onErrorCapture, onAnimationIteration, type, form, onPauseCapture, required, aria-label, aria-posinset, aria-valuemax, onPlaying, onAbort, onTransitionEndCapture, aria-atomic, onWheelCapture, defaultValue, onLoad, aria-controls, about, capture, slot, aria-current, onPointerMove, width, onLoadedDataCapture, value, onMouseEnter, onClickCapture, onPlayCapture, maxLength, onCanPlayCapture, onLoadCapture, contextMenu, onDropCapture, aria-readonly, onAuxClick, onInvalidCapture, onPointerCancel, aria-invalid, onCompositionEnd, onTimeUpdate, aria-flowto, onDragEndCapture, formAction, onProgress, onCanPlay, list, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture */
object Search
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esInputSearchMod.default].asInstanceOf[String | js.Object]
  def apply(
    addonAfter: TagMod[Any] = null,
    addonBefore: TagMod[Any] = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    enterButton: Boolean | TagMod[Any] = null,
    inputPrefixCls: String = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    onPressEnter: KeyboardEvent[HTMLInputElement] => Unit = null,
    onSearch: (/* value */ String, /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLInputElement]]) => Unit = null,
    prefix: TagMod[Any] = null,
    prefixCls: String = null,
    size: small | typings.antd.antdStrings.default | large = null,
    suffix: TagMod[Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (addonAfter != null) __obj.updateDynamic("addonAfter")(addonAfter)
    if (addonBefore != null) __obj.updateDynamic("addonBefore")(addonBefore)
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (enterButton != null) __obj.updateDynamic("enterButton")(enterButton.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(js.Any.fromFunction1(onPressEnter))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SearchProps
}

