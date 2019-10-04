package typings.antd

import typings.antd.antdStrings.`additions text`
import typings.antd.antdStrings.`inline`
import typings.antd.antdStrings.additions
import typings.antd.antdStrings.all
import typings.antd.antdStrings.ascending
import typings.antd.antdStrings.assertive
import typings.antd.antdStrings.both
import typings.antd.antdStrings.copy
import typings.antd.antdStrings.date
import typings.antd.antdStrings.descending
import typings.antd.antdStrings.dialog
import typings.antd.antdStrings.execute
import typings.antd.antdStrings.grammar
import typings.antd.antdStrings.grid
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.link
import typings.antd.antdStrings.list
import typings.antd.antdStrings.listbox
import typings.antd.antdStrings.location
import typings.antd.antdStrings.menu
import typings.antd.antdStrings.mixed
import typings.antd.antdStrings.move
import typings.antd.antdStrings.none
import typings.antd.antdStrings.off
import typings.antd.antdStrings.on
import typings.antd.antdStrings.other
import typings.antd.antdStrings.page
import typings.antd.antdStrings.polite
import typings.antd.antdStrings.popup
import typings.antd.antdStrings.removals
import typings.antd.antdStrings.spelling
import typings.antd.antdStrings.step
import typings.antd.antdStrings.text
import typings.antd.antdStrings.time
import typings.antd.antdStrings.tree
import typings.antd.antdStrings.vertical
import typings.react.Anon_Html
import typings.react.reactMod.AnimationEventHandler
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClipboardEventHandler
import typings.react.reactMod.CompositionEventHandler
import typings.react.reactMod.DragEventHandler
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.PointerEventHandler
import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.TouchEventHandler
import typings.react.reactMod.TransitionEventHandler
import typings.react.reactMod.UIEventHandler
import typings.react.reactMod.Validator
import typings.react.reactMod.WheelEventHandler
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/layout/layout.BasicProps> */
trait WeakValidationMapBasicProps extends js.Object {
  var about: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var accessKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-activedescendant`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-atomic`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-autocomplete`: js.UndefOr[Validator[js.UndefOr[none | `inline` | list | both | Null]]] = js.undefined
  var `aria-busy`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-checked`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.undefined
  var `aria-colcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-colindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-colspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-controls`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-current`: js.UndefOr[Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]] = js.undefined
  var `aria-describedby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-details`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-disabled`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-dropeffect`: js.UndefOr[Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]] = js.undefined
  var `aria-errormessage`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-expanded`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-flowto`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-grabbed`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-haspopup`: js.UndefOr[Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]] = js.undefined
  var `aria-hidden`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-invalid`: js.UndefOr[Validator[js.UndefOr[grammar | spelling | Boolean | Null]]] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-labelledby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-level`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-live`: js.UndefOr[Validator[js.UndefOr[off | assertive | polite | Null]]] = js.undefined
  var `aria-modal`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-multiline`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-orientation`: js.UndefOr[Validator[js.UndefOr[horizontal | vertical | Null]]] = js.undefined
  var `aria-owns`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-placeholder`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-posinset`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-pressed`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.undefined
  var `aria-readonly`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-relevant`: js.UndefOr[
    Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]]
  ] = js.undefined
  var `aria-required`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-roledescription`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-rowcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-rowindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-rowspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-selected`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-setsize`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-sort`: js.UndefOr[Validator[js.UndefOr[none | ascending | descending | other | Null]]] = js.undefined
  var `aria-valuemax`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-valuemin`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-valuenow`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-valuetext`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var autoCapitalize: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var autoCorrect: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var autoSave: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var color: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var contentEditable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var contextMenu: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Validator[js.UndefOr[Anon_Html | Null]]] = js.undefined
  var datatype: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var defaultChecked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var defaultValue: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.undefined
  var dir: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var draggable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var hasSider: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var hidden: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var inlist: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
  var inputMode: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var is: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var itemID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var itemProp: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var itemRef: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var itemScope: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var itemType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var lang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var onAbort: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onAbortCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onAnimationEnd: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onAnimationEndCapture: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onAnimationIteration: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onAnimationStart: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onAnimationStartCapture: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onAuxClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onAuxClickCapture: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onBeforeInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onBeforeInputCapture: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onBlurCapture: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCanPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onCanPlayCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onCanPlayThrough: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onCanPlayThroughCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onChange: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onChangeCapture: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onClickCapture: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCompositionEnd: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCompositionEndCapture: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCompositionStart: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCompositionStartCapture: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCompositionUpdate: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onContextMenuCapture: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCopy: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCopyCapture: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCut: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onCutCapture: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDoubleClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDoubleClickCapture: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDrag: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragCapture: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragEnd: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragEndCapture: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragEnter: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragEnterCapture: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragExit: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragExitCapture: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragLeave: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragOver: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragOverCapture: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragStart: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDragStartCapture: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDrop: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDropCapture: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onDurationChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onDurationChangeCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onEmptied: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onEmptiedCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onEncrypted: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onEncryptedCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onEnded: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onEndedCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onError: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onErrorCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onFocusCapture: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onGotPointerCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onInputCapture: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onInvalid: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onInvalidCapture: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onKeyDownCapture: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onKeyPress: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onKeyPressCapture: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onKeyUp: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onKeyUpCapture: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onLoad: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onLoadCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onLoadStart: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onLoadStartCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onLoadedData: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onLoadedDataCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onLoadedMetadata: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onLoadedMetadataCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onLostPointerCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseDownCapture: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseMove: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseOut: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseOutCapture: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseOver: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseOverCapture: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseUpCapture: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onPaste: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onPasteCapture: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onPause: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onPauseCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onPlayCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onPlaying: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onPlayingCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerCancel: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerDown: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerDownCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerEnter: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerLeave: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerMove: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerOut: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerOutCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerOver: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerOverCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerUp: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onPointerUpCapture: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.undefined
  var onProgress: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onProgressCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onRateChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onRateChangeCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onReset: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onResetCapture: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onScroll: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[HTMLDivElement]]]] = js.undefined
  var onScrollCapture: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[HTMLDivElement]]]] = js.undefined
  var onSeeked: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onSeekedCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onSeeking: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onSeekingCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onSelectCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onStalled: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onStalledCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onSubmit: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onSubmitCapture: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onSuspend: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onSuspendCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onTimeUpdate: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onTimeUpdateCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onTouchCancel: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.undefined
  var onTouchCancelCapture: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.undefined
  var onTouchEnd: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.undefined
  var onTouchEndCapture: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.undefined
  var onTouchMove: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.undefined
  var onTouchMoveCapture: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.undefined
  var onTouchStart: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.undefined
  var onTouchStartCapture: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.undefined
  var onTransitionEnd: js.UndefOr[Validator[js.UndefOr[Null | TransitionEventHandler[HTMLDivElement]]]] = js.undefined
  var onTransitionEndCapture: js.UndefOr[Validator[js.UndefOr[Null | TransitionEventHandler[HTMLDivElement]]]] = js.undefined
  var onVolumeChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onVolumeChangeCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onWaiting: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onWaitingCapture: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.undefined
  var onWheel: js.UndefOr[Validator[js.UndefOr[Null | WheelEventHandler[HTMLDivElement]]]] = js.undefined
  var onWheelCapture: js.UndefOr[Validator[js.UndefOr[Null | WheelEventHandler[HTMLDivElement]]]] = js.undefined
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var prefix: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var property: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var radioGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var resource: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var results: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var security: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var slot: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var spellCheck: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var typeof: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var unselectable: js.UndefOr[Validator[js.UndefOr[on | off | Null]]] = js.undefined
  var vocab: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}

object WeakValidationMapBasicProps {
  @scala.inline
  def apply(
    about: Validator[js.UndefOr[Null | String]] = null,
    accessKey: Validator[js.UndefOr[Null | String]] = null,
    `aria-activedescendant`: Validator[js.UndefOr[Null | String]] = null,
    `aria-atomic`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-autocomplete`: Validator[js.UndefOr[none | `inline` | list | both | Null]] = null,
    `aria-busy`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-checked`: Validator[js.UndefOr[mixed | Boolean | Null]] = null,
    `aria-colcount`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-colindex`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-colspan`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-controls`: Validator[js.UndefOr[Null | String]] = null,
    `aria-current`: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]] = null,
    `aria-describedby`: Validator[js.UndefOr[Null | String]] = null,
    `aria-details`: Validator[js.UndefOr[Null | String]] = null,
    `aria-disabled`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-dropeffect`: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]] = null,
    `aria-errormessage`: Validator[js.UndefOr[Null | String]] = null,
    `aria-expanded`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-flowto`: Validator[js.UndefOr[Null | String]] = null,
    `aria-grabbed`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-haspopup`: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]] = null,
    `aria-hidden`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-invalid`: Validator[js.UndefOr[grammar | spelling | Boolean | Null]] = null,
    `aria-keyshortcuts`: Validator[js.UndefOr[Null | String]] = null,
    `aria-label`: Validator[js.UndefOr[Null | String]] = null,
    `aria-labelledby`: Validator[js.UndefOr[Null | String]] = null,
    `aria-level`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-live`: Validator[js.UndefOr[off | assertive | polite | Null]] = null,
    `aria-modal`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-multiline`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-multiselectable`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-orientation`: Validator[js.UndefOr[horizontal | vertical | Null]] = null,
    `aria-owns`: Validator[js.UndefOr[Null | String]] = null,
    `aria-placeholder`: Validator[js.UndefOr[Null | String]] = null,
    `aria-posinset`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-pressed`: Validator[js.UndefOr[mixed | Boolean | Null]] = null,
    `aria-readonly`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-relevant`: Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]] = null,
    `aria-required`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-roledescription`: Validator[js.UndefOr[Null | String]] = null,
    `aria-rowcount`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-rowindex`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-rowspan`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-selected`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-setsize`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-sort`: Validator[js.UndefOr[none | ascending | descending | other | Null]] = null,
    `aria-valuemax`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuemin`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuenow`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuetext`: Validator[js.UndefOr[Null | String]] = null,
    autoCapitalize: Validator[js.UndefOr[Null | String]] = null,
    autoCorrect: Validator[js.UndefOr[Null | String]] = null,
    autoSave: Validator[js.UndefOr[Null | String]] = null,
    children: Validator[js.UndefOr[Null | ReactNode]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    color: Validator[js.UndefOr[Null | String]] = null,
    contentEditable: Validator[js.UndefOr[Boolean | Null]] = null,
    contextMenu: Validator[js.UndefOr[Null | String]] = null,
    dangerouslySetInnerHTML: Validator[js.UndefOr[Anon_Html | Null]] = null,
    datatype: Validator[js.UndefOr[Null | String]] = null,
    defaultChecked: Validator[js.UndefOr[Boolean | Null]] = null,
    defaultValue: Validator[js.UndefOr[js.Array[String] | Double | Null | String]] = null,
    dir: Validator[js.UndefOr[Null | String]] = null,
    draggable: Validator[js.UndefOr[Boolean | Null]] = null,
    hasSider: Validator[js.UndefOr[Boolean | Null]] = null,
    hidden: Validator[js.UndefOr[Boolean | Null]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    inlist: Validator[js.UndefOr[_ | Null]] = null,
    inputMode: Validator[js.UndefOr[Null | String]] = null,
    is: Validator[js.UndefOr[Null | String]] = null,
    itemID: Validator[js.UndefOr[Null | String]] = null,
    itemProp: Validator[js.UndefOr[Null | String]] = null,
    itemRef: Validator[js.UndefOr[Null | String]] = null,
    itemScope: Validator[js.UndefOr[Boolean | Null]] = null,
    itemType: Validator[js.UndefOr[Null | String]] = null,
    lang: Validator[js.UndefOr[Null | String]] = null,
    onAbort: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onAnimationEnd: Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]] = null,
    onAnimationIteration: Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]] = null,
    onAnimationStart: Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]] = null,
    onAuxClick: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onBeforeInput: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]] = null,
    onBlur: Validator[js.UndefOr[FocusEventHandler[HTMLDivElement] | Null]] = null,
    onCanPlay: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onCanPlayThrough: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onChange: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]] = null,
    onClick: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onCompositionEnd: Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]] = null,
    onCompositionStart: Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]] = null,
    onCompositionUpdate: Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]] = null,
    onContextMenu: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onCopy: Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]] = null,
    onCut: Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]] = null,
    onDoubleClick: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onDrag: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]] = null,
    onDragEnd: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]] = null,
    onDragEnter: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]] = null,
    onDragExit: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]] = null,
    onDragLeave: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]] = null,
    onDragOver: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]] = null,
    onDragStart: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]] = null,
    onDrop: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]] = null,
    onDurationChange: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onEmptied: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onEncrypted: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onEnded: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onError: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onFocus: Validator[js.UndefOr[FocusEventHandler[HTMLDivElement] | Null]] = null,
    onInput: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]] = null,
    onInvalid: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]] = null,
    onKeyDown: Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]] = null,
    onKeyPress: Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]] = null,
    onKeyUp: Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]] = null,
    onLoad: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onLoadStart: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onLoadedData: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onLoadedMetadata: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onMouseDown: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onMouseEnter: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onMouseLeave: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onMouseMove: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onMouseOut: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onMouseOver: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onMouseUp: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onPaste: Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]] = null,
    onPause: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onPlay: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onPlaying: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onPointerCancel: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]] = null,
    onPointerDown: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]] = null,
    onPointerEnter: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]] = null,
    onPointerLeave: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]] = null,
    onPointerMove: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]] = null,
    onPointerOut: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]] = null,
    onPointerOver: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]] = null,
    onPointerUp: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]] = null,
    onProgress: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onRateChange: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onReset: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]] = null,
    onScroll: Validator[js.UndefOr[Null | UIEventHandler[HTMLDivElement]]] = null,
    onSeeked: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onSeeking: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onSelect: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onStalled: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onSubmit: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]] = null,
    onSuspend: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onTimeUpdate: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onTouchCancel: Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]] = null,
    onTouchEnd: Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]] = null,
    onTouchMove: Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]] = null,
    onTouchStart: Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]] = null,
    onTransitionEnd: Validator[js.UndefOr[Null | TransitionEventHandler[HTMLDivElement]]] = null,
    onVolumeChange: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onWaiting: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]] = null,
    onWheel: Validator[js.UndefOr[Null | WheelEventHandler[HTMLDivElement]]] = null,
    placeholder: Validator[js.UndefOr[Null | String]] = null,
    prefix: Validator[js.UndefOr[Null | String]] = null,
    prefixCls: Validator[js.UndefOr[Null | String]] = null,
    property: Validator[js.UndefOr[Null | String]] = null,
    radioGroup: Validator[js.UndefOr[Null | String]] = null,
    resource: Validator[js.UndefOr[Null | String]] = null,
    results: Validator[js.UndefOr[Double | Null]] = null,
    role: Validator[js.UndefOr[Null | String]] = null,
    security: Validator[js.UndefOr[Null | String]] = null,
    slot: Validator[js.UndefOr[Null | String]] = null,
    spellCheck: Validator[js.UndefOr[Boolean | Null]] = null,
    style: Validator[js.UndefOr[CSSProperties | Null]] = null,
    suppressContentEditableWarning: Validator[js.UndefOr[Boolean | Null]] = null,
    suppressHydrationWarning: Validator[js.UndefOr[Boolean | Null]] = null,
    tabIndex: Validator[js.UndefOr[Double | Null]] = null,
    title: Validator[js.UndefOr[Null | String]] = null,
    typeof: Validator[js.UndefOr[Null | String]] = null,
    unselectable: Validator[js.UndefOr[on | off | Null]] = null,
    vocab: Validator[js.UndefOr[Null | String]] = null
  ): WeakValidationMapBasicProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`)
    if (`aria-atomic` != null) __obj.updateDynamic("aria-atomic")(`aria-atomic`)
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`)
    if (`aria-busy` != null) __obj.updateDynamic("aria-busy")(`aria-busy`)
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`)
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`)
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`)
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`)
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`)
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`)
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`)
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`)
    if (`aria-disabled` != null) __obj.updateDynamic("aria-disabled")(`aria-disabled`)
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`)
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`)
    if (`aria-expanded` != null) __obj.updateDynamic("aria-expanded")(`aria-expanded`)
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`)
    if (`aria-grabbed` != null) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`)
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`)
    if (`aria-hidden` != null) __obj.updateDynamic("aria-hidden")(`aria-hidden`)
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`)
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`)
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`)
    if (`aria-modal` != null) __obj.updateDynamic("aria-modal")(`aria-modal`)
    if (`aria-multiline` != null) __obj.updateDynamic("aria-multiline")(`aria-multiline`)
    if (`aria-multiselectable` != null) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`)
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`)
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`)
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`)
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`)
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`)
    if (`aria-readonly` != null) __obj.updateDynamic("aria-readonly")(`aria-readonly`)
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`)
    if (`aria-required` != null) __obj.updateDynamic("aria-required")(`aria-required`)
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`)
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`)
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`)
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`)
    if (`aria-selected` != null) __obj.updateDynamic("aria-selected")(`aria-selected`)
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`)
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`)
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`)
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`)
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`)
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`)
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (defaultChecked != null) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (draggable != null) __obj.updateDynamic("draggable")(draggable)
    if (hasSider != null) __obj.updateDynamic("hasSider")(hasSider)
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inlist != null) __obj.updateDynamic("inlist")(inlist)
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode)
    if (is != null) __obj.updateDynamic("is")(is)
    if (itemID != null) __obj.updateDynamic("itemID")(itemID)
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp)
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef)
    if (itemScope != null) __obj.updateDynamic("itemScope")(itemScope)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd)
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(onAnimationIteration)
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart)
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(onAuxClick)
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay)
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd)
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart)
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (onCut != null) __obj.updateDynamic("onCut")(onCut)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange)
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied)
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted)
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart)
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData)
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying)
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(onPointerCancel)
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(onPointerDown)
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(onPointerEnter)
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(onPointerLeave)
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(onPointerMove)
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(onPointerOut)
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(onPointerOver)
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(onPointerUp)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange)
    if (onReset != null) __obj.updateDynamic("onReset")(onReset)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked)
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend)
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd)
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange)
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting)
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (property != null) __obj.updateDynamic("property")(property)
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (results != null) __obj.updateDynamic("results")(results)
    if (role != null) __obj.updateDynamic("role")(role)
    if (security != null) __obj.updateDynamic("security")(security)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (spellCheck != null) __obj.updateDynamic("spellCheck")(spellCheck)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suppressContentEditableWarning != null) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning)
    if (suppressHydrationWarning != null) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (title != null) __obj.updateDynamic("title")(title)
    if (typeof != null) __obj.updateDynamic("typeof")(typeof)
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable)
    if (vocab != null) __obj.updateDynamic("vocab")(vocab)
    __obj.asInstanceOf[WeakValidationMapBasicProps]
  }
}

