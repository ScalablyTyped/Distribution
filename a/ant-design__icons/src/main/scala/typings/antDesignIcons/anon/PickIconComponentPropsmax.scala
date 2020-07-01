package typings.antDesignIcons.anon

import typings.antDesignIcons.antDesignIconsStrings.`additions text`
import typings.antDesignIcons.antDesignIconsStrings.`inline`
import typings.antDesignIcons.antDesignIconsStrings.additions
import typings.antDesignIcons.antDesignIconsStrings.all
import typings.antDesignIcons.antDesignIconsStrings.ascending
import typings.antDesignIcons.antDesignIconsStrings.assertive
import typings.antDesignIcons.antDesignIconsStrings.both
import typings.antDesignIcons.antDesignIconsStrings.copy
import typings.antDesignIcons.antDesignIconsStrings.date
import typings.antDesignIcons.antDesignIconsStrings.decimal
import typings.antDesignIcons.antDesignIconsStrings.descending
import typings.antDesignIcons.antDesignIconsStrings.dialog
import typings.antDesignIcons.antDesignIconsStrings.email
import typings.antDesignIcons.antDesignIconsStrings.execute
import typings.antDesignIcons.antDesignIconsStrings.grammar
import typings.antDesignIcons.antDesignIconsStrings.grid
import typings.antDesignIcons.antDesignIconsStrings.horizontal
import typings.antDesignIcons.antDesignIconsStrings.inherit
import typings.antDesignIcons.antDesignIconsStrings.link
import typings.antDesignIcons.antDesignIconsStrings.list
import typings.antDesignIcons.antDesignIconsStrings.listbox
import typings.antDesignIcons.antDesignIconsStrings.location
import typings.antDesignIcons.antDesignIconsStrings.menu
import typings.antDesignIcons.antDesignIconsStrings.mixed
import typings.antDesignIcons.antDesignIconsStrings.move
import typings.antDesignIcons.antDesignIconsStrings.no
import typings.antDesignIcons.antDesignIconsStrings.none
import typings.antDesignIcons.antDesignIconsStrings.numeric
import typings.antDesignIcons.antDesignIconsStrings.off
import typings.antDesignIcons.antDesignIconsStrings.on
import typings.antDesignIcons.antDesignIconsStrings.other
import typings.antDesignIcons.antDesignIconsStrings.page
import typings.antDesignIcons.antDesignIconsStrings.polite
import typings.antDesignIcons.antDesignIconsStrings.popup
import typings.antDesignIcons.antDesignIconsStrings.removals
import typings.antDesignIcons.antDesignIconsStrings.search
import typings.antDesignIcons.antDesignIconsStrings.spelling
import typings.antDesignIcons.antDesignIconsStrings.step
import typings.antDesignIcons.antDesignIconsStrings.tel
import typings.antDesignIcons.antDesignIconsStrings.text
import typings.antDesignIcons.antDesignIconsStrings.time
import typings.antDesignIcons.antDesignIconsStrings.tree
import typings.antDesignIcons.antDesignIconsStrings.url
import typings.antDesignIcons.antDesignIconsStrings.vertical
import typings.antDesignIcons.antDesignIconsStrings.yes
import typings.antDesignIcons.componentsIconMod.CustomIconComponentProps
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.ComponentType
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SVGProps
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.std.Event
import typings.std.HTMLSpanElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@ant-design/icons.@ant-design/icons/lib/components/Icon.IconComponentProps, 'max' | 'required' | 'default' | 'high' | 'low' | 'disabled' | 'start' | 'open' | 'media' | 'hidden' | 'cite' | 'data' | 'dir' | 'form' | 'label' | 'slot' | 'span' | 'style' | 'summary' | 'title' | 'pattern' | 'async' | 'defer' | 'manifest' | 'color' | 'content' | 'size' | 'wrap' | 'multiple' | 'key' | 'children' | 'list' | 'step' | 'aria-label' | 'viewBox' | 'component' | 'ariaLabel' | 'spin' | 'rotate' | 'accept' | 'acceptCharset' | 'action' | 'allowFullScreen' | 'allowTransparency' | 'alt' | 'as' | 'autoComplete' | 'autoFocus' | 'autoPlay' | 'capture' | 'cellPadding' | 'cellSpacing' | 'charSet' | 'challenge' | 'checked' | 'classID' | 'cols' | 'colSpan' | 'controls' | 'coords' | 'crossOrigin' | 'dateTime' | 'download' | 'encType' | 'formAction' | 'formEncType' | 'formMethod' | 'formNoValidate' | 'formTarget' | 'frameBorder' | 'headers' | 'height' | 'href' | 'hrefLang' | 'htmlFor' | 'httpEquiv' | 'integrity' | 'keyParams' | 'keyType' | 'kind' | 'loop' | 'marginHeight' | 'marginWidth' | 'maxLength' | 'mediaGroup' | 'method' | 'min' | 'minLength' | 'muted' | 'name' | 'nonce' | 'noValidate' | 'optimum' | 'placeholder' | 'playsInline' | 'poster' | 'preload' | 'readOnly' | 'rel' | 'reversed' | 'rows' | 'rowSpan' | 'sandbox' | 'scope' | 'scoped' | 'scrolling' | 'seamless' | 'selected' | 'shape' | 'sizes' | 'src' | 'srcDoc' | 'srcLang' | 'srcSet' | 'target' | 'type' | 'useMap' | 'value' | 'width' | 'wmode' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'draggable' | 'id' | 'lang' | 'spellCheck' | 'tabIndex' | 'translate' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture'> & react.react.RefAttributes<std.HTMLSpanElement> */
trait PickIconComponentPropsmax extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accept: js.UndefOr[String] = js.undefined
  var acceptCharset: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  var allowTransparency: js.UndefOr[Boolean] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var ariaLabel: js.UndefOr[String] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var capture: js.UndefOr[Boolean | String] = js.undefined
  var cellPadding: js.UndefOr[Double | String] = js.undefined
  var cellSpacing: js.UndefOr[Double | String] = js.undefined
  var challenge: js.UndefOr[String] = js.undefined
  var charSet: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var cite: js.UndefOr[String] = js.undefined
  var classID: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]]] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var coords: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var dateTime: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[Boolean] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var encType: js.UndefOr[String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var frameBorder: js.UndefOr[Double | String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var httpEquiv: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var keyParams: js.UndefOr[String] = js.undefined
  var keyType: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var manifest: js.UndefOr[String] = js.undefined
  var marginHeight: js.UndefOr[Double] = js.undefined
  var marginWidth: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var mediaGroup: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onAbortCapture: js.UndefOr[js.Any] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLSpanElement]] = js.undefined
  var onAnimationEndCapture: js.UndefOr[js.Any] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLSpanElement]] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[js.Any] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLSpanElement]] = js.undefined
  var onAnimationStartCapture: js.UndefOr[js.Any] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onAuxClickCapture: js.UndefOr[js.Any] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.undefined
  var onBeforeInputCapture: js.UndefOr[js.Any] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.undefined
  var onBlurCapture: js.UndefOr[js.Any] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onCanPlayCapture: js.UndefOr[js.Any] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onCanPlayThroughCapture: js.UndefOr[js.Any] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.undefined
  var onChangeCapture: js.UndefOr[js.Any] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onClickCapture: js.UndefOr[js.Any] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLSpanElement]] = js.undefined
  var onCompositionEndCapture: js.UndefOr[js.Any] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLSpanElement]] = js.undefined
  var onCompositionStartCapture: js.UndefOr[js.Any] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLSpanElement]] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[js.Any] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onContextMenuCapture: js.UndefOr[js.Any] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLSpanElement]] = js.undefined
  var onCopyCapture: js.UndefOr[js.Any] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLSpanElement]] = js.undefined
  var onCutCapture: js.UndefOr[js.Any] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onDoubleClickCapture: js.UndefOr[js.Any] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.undefined
  var onDragCapture: js.UndefOr[js.Any] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.undefined
  var onDragEndCapture: js.UndefOr[js.Any] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.undefined
  var onDragEnterCapture: js.UndefOr[js.Any] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.undefined
  var onDragExitCapture: js.UndefOr[js.Any] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[js.Any] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.undefined
  var onDragOverCapture: js.UndefOr[js.Any] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.undefined
  var onDragStartCapture: js.UndefOr[js.Any] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLSpanElement]] = js.undefined
  var onDropCapture: js.UndefOr[js.Any] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onDurationChangeCapture: js.UndefOr[js.Any] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onEmptiedCapture: js.UndefOr[js.Any] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onEncryptedCapture: js.UndefOr[js.Any] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onEndedCapture: js.UndefOr[js.Any] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onErrorCapture: js.UndefOr[js.Any] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.undefined
  var onFocusCapture: js.UndefOr[js.Any] = js.undefined
  var onGotPointerCapture: js.UndefOr[js.Any] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[js.Any] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.undefined
  var onInputCapture: js.UndefOr[js.Any] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.undefined
  var onInvalidCapture: js.UndefOr[js.Any] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.undefined
  var onKeyDownCapture: js.UndefOr[js.Any] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.undefined
  var onKeyPressCapture: js.UndefOr[js.Any] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.undefined
  var onKeyUpCapture: js.UndefOr[js.Any] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onLoadCapture: js.UndefOr[js.Any] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onLoadStartCapture: js.UndefOr[js.Any] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onLoadedDataCapture: js.UndefOr[js.Any] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onLoadedMetadataCapture: js.UndefOr[js.Any] = js.undefined
  var onLostPointerCapture: js.UndefOr[js.Any] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[js.Any] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseDownCapture: js.UndefOr[js.Any] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[js.Any] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseOutCapture: js.UndefOr[js.Any] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseOverCapture: js.UndefOr[js.Any] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseUpCapture: js.UndefOr[js.Any] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLSpanElement]] = js.undefined
  var onPasteCapture: js.UndefOr[js.Any] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onPauseCapture: js.UndefOr[js.Any] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onPlayCapture: js.UndefOr[js.Any] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onPlayingCapture: js.UndefOr[js.Any] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[js.Any] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.undefined
  var onPointerDownCapture: js.UndefOr[js.Any] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[js.Any] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[js.Any] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[js.Any] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.undefined
  var onPointerOutCapture: js.UndefOr[js.Any] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.undefined
  var onPointerOverCapture: js.UndefOr[js.Any] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLSpanElement]] = js.undefined
  var onPointerUpCapture: js.UndefOr[js.Any] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onProgressCapture: js.UndefOr[js.Any] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onRateChangeCapture: js.UndefOr[js.Any] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.undefined
  var onResetCapture: js.UndefOr[js.Any] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLSpanElement]] = js.undefined
  var onScrollCapture: js.UndefOr[js.Any] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onSeekedCapture: js.UndefOr[js.Any] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onSeekingCapture: js.UndefOr[js.Any] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onSelectCapture: js.UndefOr[js.Any] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onStalledCapture: js.UndefOr[js.Any] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLSpanElement]] = js.undefined
  var onSubmitCapture: js.UndefOr[js.Any] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onSuspendCapture: js.UndefOr[js.Any] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onTimeUpdateCapture: js.UndefOr[js.Any] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.undefined
  var onTouchCancelCapture: js.UndefOr[js.Any] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.undefined
  var onTouchEndCapture: js.UndefOr[js.Any] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.undefined
  var onTouchMoveCapture: js.UndefOr[js.Any] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.undefined
  var onTouchStartCapture: js.UndefOr[js.Any] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLSpanElement]] = js.undefined
  var onTransitionEndCapture: js.UndefOr[js.Any] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onVolumeChangeCapture: js.UndefOr[js.Any] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLSpanElement]] = js.undefined
  var onWaitingCapture: js.UndefOr[js.Any] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLSpanElement]] = js.undefined
  var onWheelCapture: js.UndefOr[js.Any] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var optimum: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[Ref[HTMLSpanElement]] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var sandbox: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var scoped: js.UndefOr[Boolean] = js.undefined
  var scrolling: js.UndefOr[String] = js.undefined
  var seamless: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var span: js.UndefOr[Double] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcDoc: js.UndefOr[String] = js.undefined
  var srcLang: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var wmode: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[String] = js.undefined
}

object PickIconComponentPropsmax {
  @scala.inline
  def apply(
    about: String = null,
    accept: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    action: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: js.UndefOr[Double] = js.undefined,
    `aria-colindex`: js.UndefOr[Double] = js.undefined,
    `aria-colspan`: js.UndefOr[Double] = js.undefined,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: js.UndefOr[Double] = js.undefined,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: js.UndefOr[Double] = js.undefined,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: js.UndefOr[Double] = js.undefined,
    `aria-rowindex`: js.UndefOr[Double] = js.undefined,
    `aria-rowspan`: js.UndefOr[Double] = js.undefined,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: js.UndefOr[Double] = js.undefined,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: js.UndefOr[Double] = js.undefined,
    `aria-valuemin`: js.UndefOr[Double] = js.undefined,
    `aria-valuenow`: js.UndefOr[Double] = js.undefined,
    `aria-valuetext`: String = null,
    ariaLabel: String = null,
    as: String = null,
    async: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: Boolean | String = null,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
    challenge: String = null,
    charSet: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    cite: String = null,
    classID: String = null,
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    color: String = null,
    cols: js.UndefOr[Double] = js.undefined,
    component: ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]] = null,
    content: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    coords: String = null,
    crossOrigin: String = null,
    dangerouslySetInnerHTML: Html = null,
    data: String = null,
    datatype: String = null,
    dateTime: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    download: js.Any = null,
    draggable: js.UndefOr[Booleanish] = js.undefined,
    encType: String = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    frameBorder: Double | String = null,
    headers: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    high: js.UndefOr[Double] = js.undefined,
    href: String = null,
    hrefLang: String = null,
    htmlFor: String = null,
    httpEquiv: String = null,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    integrity: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    key: Key = null,
    keyParams: String = null,
    keyType: String = null,
    kind: String = null,
    label: String = null,
    lang: String = null,
    list: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    low: js.UndefOr[Double] = js.undefined,
    manifest: String = null,
    marginHeight: js.UndefOr[Double] = js.undefined,
    marginWidth: js.UndefOr[Double] = js.undefined,
    max: Double | String = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    media: String = null,
    mediaGroup: String = null,
    method: String = null,
    min: Double | String = null,
    minLength: js.UndefOr[Double] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onAbort: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onAbortCapture: js.Any = null,
    onAnimationEnd: AnimationEvent[HTMLSpanElement] => Unit = null,
    onAnimationEndCapture: js.Any = null,
    onAnimationIteration: AnimationEvent[HTMLSpanElement] => Unit = null,
    onAnimationIterationCapture: js.Any = null,
    onAnimationStart: AnimationEvent[HTMLSpanElement] => Unit = null,
    onAnimationStartCapture: js.Any = null,
    onAuxClick: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onAuxClickCapture: js.Any = null,
    onBeforeInput: FormEvent[HTMLSpanElement] => Unit = null,
    onBeforeInputCapture: js.Any = null,
    onBlur: FocusEvent[HTMLSpanElement] => Unit = null,
    onBlurCapture: js.Any = null,
    onCanPlay: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onCanPlayCapture: js.Any = null,
    onCanPlayThrough: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onCanPlayThroughCapture: js.Any = null,
    onChange: FormEvent[HTMLSpanElement] => Unit = null,
    onChangeCapture: js.Any = null,
    onClick: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onClickCapture: js.Any = null,
    onCompositionEnd: CompositionEvent[HTMLSpanElement] => Unit = null,
    onCompositionEndCapture: js.Any = null,
    onCompositionStart: CompositionEvent[HTMLSpanElement] => Unit = null,
    onCompositionStartCapture: js.Any = null,
    onCompositionUpdate: CompositionEvent[HTMLSpanElement] => Unit = null,
    onCompositionUpdateCapture: js.Any = null,
    onContextMenu: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onContextMenuCapture: js.Any = null,
    onCopy: ClipboardEvent[HTMLSpanElement] => Unit = null,
    onCopyCapture: js.Any = null,
    onCut: ClipboardEvent[HTMLSpanElement] => Unit = null,
    onCutCapture: js.Any = null,
    onDoubleClick: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onDoubleClickCapture: js.Any = null,
    onDrag: DragEvent[HTMLSpanElement] => Unit = null,
    onDragCapture: js.Any = null,
    onDragEnd: DragEvent[HTMLSpanElement] => Unit = null,
    onDragEndCapture: js.Any = null,
    onDragEnter: DragEvent[HTMLSpanElement] => Unit = null,
    onDragEnterCapture: js.Any = null,
    onDragExit: DragEvent[HTMLSpanElement] => Unit = null,
    onDragExitCapture: js.Any = null,
    onDragLeave: DragEvent[HTMLSpanElement] => Unit = null,
    onDragLeaveCapture: js.Any = null,
    onDragOver: DragEvent[HTMLSpanElement] => Unit = null,
    onDragOverCapture: js.Any = null,
    onDragStart: DragEvent[HTMLSpanElement] => Unit = null,
    onDragStartCapture: js.Any = null,
    onDrop: DragEvent[HTMLSpanElement] => Unit = null,
    onDropCapture: js.Any = null,
    onDurationChange: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onDurationChangeCapture: js.Any = null,
    onEmptied: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onEmptiedCapture: js.Any = null,
    onEncrypted: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onEncryptedCapture: js.Any = null,
    onEnded: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onEndedCapture: js.Any = null,
    onError: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onErrorCapture: js.Any = null,
    onFocus: FocusEvent[HTMLSpanElement] => Unit = null,
    onFocusCapture: js.Any = null,
    onGotPointerCapture: js.Any = null,
    onGotPointerCaptureCapture: js.Any = null,
    onInput: FormEvent[HTMLSpanElement] => Unit = null,
    onInputCapture: js.Any = null,
    onInvalid: FormEvent[HTMLSpanElement] => Unit = null,
    onInvalidCapture: js.Any = null,
    onKeyDown: KeyboardEvent[HTMLSpanElement] => Unit = null,
    onKeyDownCapture: js.Any = null,
    onKeyPress: KeyboardEvent[HTMLSpanElement] => Unit = null,
    onKeyPressCapture: js.Any = null,
    onKeyUp: KeyboardEvent[HTMLSpanElement] => Unit = null,
    onKeyUpCapture: js.Any = null,
    onLoad: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onLoadCapture: js.Any = null,
    onLoadStart: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onLoadStartCapture: js.Any = null,
    onLoadedData: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onLoadedDataCapture: js.Any = null,
    onLoadedMetadata: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onLoadedMetadataCapture: js.Any = null,
    onLostPointerCapture: js.Any = null,
    onLostPointerCaptureCapture: js.Any = null,
    onMouseDown: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onMouseDownCapture: js.Any = null,
    onMouseEnter: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onMouseMoveCapture: js.Any = null,
    onMouseOut: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onMouseOutCapture: js.Any = null,
    onMouseOver: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onMouseOverCapture: js.Any = null,
    onMouseUp: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit = null,
    onMouseUpCapture: js.Any = null,
    onPaste: ClipboardEvent[HTMLSpanElement] => Unit = null,
    onPasteCapture: js.Any = null,
    onPause: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onPauseCapture: js.Any = null,
    onPlay: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onPlayCapture: js.Any = null,
    onPlaying: SyntheticEvent[HTMLSpanElement, Event] => Unit = null,
    onPlayingCapture: js.Any = null,
    onPointerCancel: PointerEvent[HTMLSpanElement] => Unit = null
  ): PickIconComponentPropsmax = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.get.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.get.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.get.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colcount`)) __obj.updateDynamic("aria-colcount")(`aria-colcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colindex`)) __obj.updateDynamic("aria-colindex")(`aria-colindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colspan`)) __obj.updateDynamic("aria-colspan")(`aria-colspan`.get.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.get.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.get.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.get.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.get.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-level`)) __obj.updateDynamic("aria-level")(`aria-level`.get.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.get.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-posinset`)) __obj.updateDynamic("aria-posinset")(`aria-posinset`.get.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.get.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.get.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowcount`)) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowindex`)) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowspan`)) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-setsize`)) __obj.updateDynamic("aria-setsize")(`aria-setsize`.get.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemax`)) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemin`)) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuenow`)) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.get.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (cite != null) __obj.updateDynamic("cite")(cite.asInstanceOf[js.Any])
    if (classID != null) __obj.updateDynamic("classID")(classID.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.get.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (!js.isUndefined(marginHeight)) __obj.updateDynamic("marginHeight")(marginHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginWidth)) __obj.updateDynamic("marginWidth")(marginWidth.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.get.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(onAbortCapture.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(onAnimationEndCapture.asInstanceOf[js.Any])
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(onAnimationIterationCapture.asInstanceOf[js.Any])
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(onAnimationStartCapture.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onAuxClickCapture != null) __obj.updateDynamic("onAuxClickCapture")(onAuxClickCapture.asInstanceOf[js.Any])
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBeforeInputCapture != null) __obj.updateDynamic("onBeforeInputCapture")(onBeforeInputCapture.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(onBlurCapture.asInstanceOf[js.Any])
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(onCanPlayCapture.asInstanceOf[js.Any])
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(onCanPlayThroughCapture.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(onChangeCapture.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(onClickCapture.asInstanceOf[js.Any])
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(onCompositionEndCapture.asInstanceOf[js.Any])
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(onCompositionStartCapture.asInstanceOf[js.Any])
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(onCompositionUpdateCapture.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(onContextMenuCapture.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(onCopyCapture.asInstanceOf[js.Any])
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(onCutCapture.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDoubleClickCapture != null) __obj.updateDynamic("onDoubleClickCapture")(onDoubleClickCapture.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(onDragCapture.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(onDragEndCapture.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(onDragEnterCapture.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(onDragExitCapture.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(onDragLeaveCapture.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(onDragOverCapture.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(onDragStartCapture.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(onDropCapture.asInstanceOf[js.Any])
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(onDurationChangeCapture.asInstanceOf[js.Any])
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(onEmptiedCapture.asInstanceOf[js.Any])
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEncryptedCapture != null) __obj.updateDynamic("onEncryptedCapture")(onEncryptedCapture.asInstanceOf[js.Any])
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(onEndedCapture.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(onErrorCapture.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(onFocusCapture.asInstanceOf[js.Any])
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(onGotPointerCapture.asInstanceOf[js.Any])
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(onGotPointerCaptureCapture.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(onInputCapture.asInstanceOf[js.Any])
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(onInvalidCapture.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(onKeyDownCapture.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(onKeyPressCapture.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(onKeyUpCapture.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(onLoadCapture.asInstanceOf[js.Any])
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(onLoadStartCapture.asInstanceOf[js.Any])
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(onLoadedDataCapture.asInstanceOf[js.Any])
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(onLoadedMetadataCapture.asInstanceOf[js.Any])
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(onLostPointerCapture.asInstanceOf[js.Any])
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(onLostPointerCaptureCapture.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(onMouseDownCapture.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(onMouseMoveCapture.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(onMouseOutCapture.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(onMouseOverCapture.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(onMouseUpCapture.asInstanceOf[js.Any])
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(onPasteCapture.asInstanceOf[js.Any])
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(onPauseCapture.asInstanceOf[js.Any])
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(onPlayCapture.asInstanceOf[js.Any])
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(onPlayingCapture.asInstanceOf[js.Any])
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    __obj.asInstanceOf[PickIconComponentPropsmax]
  }
}

