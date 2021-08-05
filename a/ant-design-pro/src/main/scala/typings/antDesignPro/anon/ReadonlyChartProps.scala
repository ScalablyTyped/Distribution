package typings.antDesignPro.anon

import typings.antvG2.mod.Chart
import typings.antvG2.mod.EventParams
import typings.antvG2.mod.Styles.background
import typings.bizcharts.anon.Bottom
import typings.bizcharts.anon.Data
import typings.bizcharts.anon.Items
import typings.bizcharts.anon.Tooltip
import typings.bizcharts.anon.TooltipAny
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.ChartProps> */
trait ReadonlyChartProps extends StObject {
  
  val animate: js.UndefOr[Boolean] = js.undefined
  
  val background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.undefined
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val className: js.UndefOr[String] = js.undefined
  
  val dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  val data: js.UndefOr[js.Any] = js.undefined
  
  val filter: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  val forceFit: js.UndefOr[Boolean] = js.undefined
  
  val height: Double
  
  val key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  val onAbort: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[js.Object]] = js.undefined
  
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[js.Object]] = js.undefined
  
  val onAnimationStart: js.UndefOr[AnimationEventHandler[js.Object]] = js.undefined
  
  val onAuxClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onBeforeInput: js.UndefOr[FormEventHandler[js.Object]] = js.undefined
  
  val onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  
  val onCanPlay: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onChange: js.UndefOr[FormEventHandler[js.Object]] = js.undefined
  
  val onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[js.Object]] = js.undefined
  
  val onCompositionStart: js.UndefOr[CompositionEventHandler[js.Object]] = js.undefined
  
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[js.Object]] = js.undefined
  
  val onContextMenu: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onCopy: js.UndefOr[ClipboardEventHandler[js.Object]] = js.undefined
  
  val onCut: js.UndefOr[ClipboardEventHandler[js.Object]] = js.undefined
  
  val onDoubleClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onDrag: js.UndefOr[DragEventHandler[js.Object]] = js.undefined
  
  val onDragEnd: js.UndefOr[DragEventHandler[js.Object]] = js.undefined
  
  val onDragEnter: js.UndefOr[DragEventHandler[js.Object]] = js.undefined
  
  val onDragExit: js.UndefOr[DragEventHandler[js.Object]] = js.undefined
  
  val onDragLeave: js.UndefOr[DragEventHandler[js.Object]] = js.undefined
  
  val onDragOver: js.UndefOr[DragEventHandler[js.Object]] = js.undefined
  
  val onDragStart: js.UndefOr[DragEventHandler[js.Object]] = js.undefined
  
  val onDrop: js.UndefOr[DragEventHandler[js.Object]] = js.undefined
  
  val onDurationChange: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onEmptied: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onEncrypted: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onEnded: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onError: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  
  val onGetG2Instance: js.UndefOr[js.Function1[/* chart */ Chart, Unit]] = js.undefined
  
  val onInput: js.UndefOr[FormEventHandler[js.Object]] = js.undefined
  
  val onInvalid: js.UndefOr[FormEventHandler[js.Object]] = js.undefined
  
  val onItemSelected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  val onItemSelectedChange: js.UndefOr[js.Function1[/* ev */ Data, Unit]] = js.undefined
  
  val onItemUnselected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  val onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  
  val onKeyPress: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  
  val onKeyUp: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  
  val onLoad: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onLoadStart: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onLoadedData: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onMouseMove: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onMouseOut: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onMouseOver: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  val onPaste: js.UndefOr[ClipboardEventHandler[js.Object]] = js.undefined
  
  val onPause: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onPlay: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onPlaying: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onPlotClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  val onPlotDblClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  val onPlotEnter: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  val onPlotLeave: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  val onPlotMove: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  val onPointerCancel: js.UndefOr[PointerEventHandler[js.Object]] = js.undefined
  
  val onPointerDown: js.UndefOr[PointerEventHandler[js.Object]] = js.undefined
  
  val onPointerEnter: js.UndefOr[PointerEventHandler[js.Object]] = js.undefined
  
  val onPointerLeave: js.UndefOr[PointerEventHandler[js.Object]] = js.undefined
  
  val onPointerMove: js.UndefOr[PointerEventHandler[js.Object]] = js.undefined
  
  val onPointerOut: js.UndefOr[PointerEventHandler[js.Object]] = js.undefined
  
  val onPointerOver: js.UndefOr[PointerEventHandler[js.Object]] = js.undefined
  
  val onPointerUp: js.UndefOr[PointerEventHandler[js.Object]] = js.undefined
  
  val onProgress: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onRateChange: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onReset: js.UndefOr[FormEventHandler[js.Object]] = js.undefined
  
  val onScroll: js.UndefOr[UIEventHandler[js.Object]] = js.undefined
  
  val onSeeked: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onSeeking: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onSelect: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onStalled: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onSubmit: js.UndefOr[FormEventHandler[js.Object]] = js.undefined
  
  val onSuspend: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onTimeUpdate: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onTooltipChange: js.UndefOr[js.Function1[/* ev */ Items, Unit]] = js.undefined
  
  val onTooltipHide: js.UndefOr[js.Function1[/* ev */ TooltipAny, Unit]] = js.undefined
  
  val onTooltipShow: js.UndefOr[js.Function1[/* ev */ Tooltip, Unit]] = js.undefined
  
  val onTouchCancel: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
  
  val onTouchEnd: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
  
  val onTouchMove: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
  
  val onTouchStart: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
  
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[js.Object]] = js.undefined
  
  val onVolumeChange: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onWaiting: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  val onWheel: js.UndefOr[WheelEventHandler[js.Object]] = js.undefined
  
  val padding: js.UndefOr[
    String | Bottom | Double | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
  ] = js.undefined
  
  val pixelRatio: js.UndefOr[Double] = js.undefined
  
  val placeholder: js.UndefOr[ReactElement | String | Boolean] = js.undefined
  
  val plotBackground: js.UndefOr[typings.antvG2.mod.Styles.background] = js.undefined
  
  val ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
  
  val scale: js.UndefOr[js.Any] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val width: js.UndefOr[Double] = js.undefined
}
object ReadonlyChartProps {
  
  inline def apply(height: Double): ReadonlyChartProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyChartProps]
  }
  
  extension [Self <: ReadonlyChartProps](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBackground(value: background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFilter(value: js.Array[js.Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    inline def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
    
    inline def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnAbort(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: AnimationEvent[js.Object] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: AnimationEvent[js.Object] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: AnimationEvent[js.Object] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAuxClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: FocusEvent[js.Object] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayThrough(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: CompositionEvent[js.Object] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: CompositionEvent[js.Object] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: CompositionEvent[js.Object] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: ClipboardEvent[js.Object] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: ClipboardEvent[js.Object] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDoubleClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    inline def setOnDragEnd(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: FocusEvent[js.Object] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnGetG2Instance(value: /* chart */ Chart => Unit): Self = StObject.set(x, "onGetG2Instance", js.Any.fromFunction1(value))
    
    inline def setOnGetG2InstanceUndefined: Self = StObject.set(x, "onGetG2Instance", js.undefined)
    
    inline def setOnInput(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnItemSelected(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1(value))
    
    inline def setOnItemSelectedChange(value: /* ev */ Data => Unit): Self = StObject.set(x, "onItemSelectedChange", js.Any.fromFunction1(value))
    
    inline def setOnItemSelectedChangeUndefined: Self = StObject.set(x, "onItemSelectedChange", js.undefined)
    
    inline def setOnItemSelectedUndefined: Self = StObject.set(x, "onItemSelected", js.undefined)
    
    inline def setOnItemUnselected(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onItemUnselected", js.Any.fromFunction1(value))
    
    inline def setOnItemUnselectedUndefined: Self = StObject.set(x, "onItemUnselected", js.undefined)
    
    inline def setOnKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadStart(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnMouseDown(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: ClipboardEvent[js.Object] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPlotClick(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotClick", js.Any.fromFunction1(value))
    
    inline def setOnPlotClickUndefined: Self = StObject.set(x, "onPlotClick", js.undefined)
    
    inline def setOnPlotDblClick(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotDblClick", js.Any.fromFunction1(value))
    
    inline def setOnPlotDblClickUndefined: Self = StObject.set(x, "onPlotDblClick", js.undefined)
    
    inline def setOnPlotEnter(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotEnter", js.Any.fromFunction1(value))
    
    inline def setOnPlotEnterUndefined: Self = StObject.set(x, "onPlotEnter", js.undefined)
    
    inline def setOnPlotLeave(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotLeave", js.Any.fromFunction1(value))
    
    inline def setOnPlotLeaveUndefined: Self = StObject.set(x, "onPlotLeave", js.undefined)
    
    inline def setOnPlotMove(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotMove", js.Any.fromFunction1(value))
    
    inline def setOnPlotMoveUndefined: Self = StObject.set(x, "onPlotMove", js.undefined)
    
    inline def setOnPointerCancel(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll(value: UIEvent[js.Object, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTooltipChange(value: /* ev */ Items => Unit): Self = StObject.set(x, "onTooltipChange", js.Any.fromFunction1(value))
    
    inline def setOnTooltipChangeUndefined: Self = StObject.set(x, "onTooltipChange", js.undefined)
    
    inline def setOnTooltipHide(value: /* ev */ TooltipAny => Unit): Self = StObject.set(x, "onTooltipHide", js.Any.fromFunction1(value))
    
    inline def setOnTooltipHideUndefined: Self = StObject.set(x, "onTooltipHide", js.undefined)
    
    inline def setOnTooltipShow(value: /* ev */ Tooltip => Unit): Self = StObject.set(x, "onTooltipShow", js.Any.fromFunction1(value))
    
    inline def setOnTooltipShowUndefined: Self = StObject.set(x, "onTooltipShow", js.undefined)
    
    inline def setOnTouchCancel(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: TransitionEvent[js.Object] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: WheelEvent[js.Object] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setPadding(
      value: String | Bottom | Double | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setPlaceholder(value: ReactElement | String | Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPlotBackground(value: background): Self = StObject.set(x, "plotBackground", value.asInstanceOf[js.Any])
    
    inline def setPlotBackgroundUndefined: Self = StObject.set(x, "plotBackground", js.undefined)
    
    inline def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setScale(value: js.Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
