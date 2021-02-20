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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.ChartProps> */
@js.native
trait ReadonlyChartProps extends StObject {
  
  val animate: js.UndefOr[Boolean] = js.native
  
  val background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.native
  
  val children: js.UndefOr[ReactNode] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  val data: js.UndefOr[js.Any] = js.native
  
  val filter: js.UndefOr[js.Array[_]] = js.native
  
  val forceFit: js.UndefOr[Boolean] = js.native
  
  val height: Double = js.native
  
  val key: js.UndefOr[typings.react.mod.Key] = js.native
  
  val onAbort: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[js.Object]] = js.native
  
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[js.Object]] = js.native
  
  val onAnimationStart: js.UndefOr[AnimationEventHandler[js.Object]] = js.native
  
  val onAuxClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onBeforeInput: js.UndefOr[FormEventHandler[js.Object]] = js.native
  
  val onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  
  val onCanPlay: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onChange: js.UndefOr[FormEventHandler[js.Object]] = js.native
  
  val onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[js.Object]] = js.native
  
  val onCompositionStart: js.UndefOr[CompositionEventHandler[js.Object]] = js.native
  
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[js.Object]] = js.native
  
  val onContextMenu: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onCopy: js.UndefOr[ClipboardEventHandler[js.Object]] = js.native
  
  val onCut: js.UndefOr[ClipboardEventHandler[js.Object]] = js.native
  
  val onDoubleClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onDrag: js.UndefOr[DragEventHandler[js.Object]] = js.native
  
  val onDragEnd: js.UndefOr[DragEventHandler[js.Object]] = js.native
  
  val onDragEnter: js.UndefOr[DragEventHandler[js.Object]] = js.native
  
  val onDragExit: js.UndefOr[DragEventHandler[js.Object]] = js.native
  
  val onDragLeave: js.UndefOr[DragEventHandler[js.Object]] = js.native
  
  val onDragOver: js.UndefOr[DragEventHandler[js.Object]] = js.native
  
  val onDragStart: js.UndefOr[DragEventHandler[js.Object]] = js.native
  
  val onDrop: js.UndefOr[DragEventHandler[js.Object]] = js.native
  
  val onDurationChange: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onEmptied: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onEncrypted: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onEnded: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onError: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  
  val onGetG2Instance: js.UndefOr[js.Function1[/* chart */ Chart, Unit]] = js.native
  
  val onInput: js.UndefOr[FormEventHandler[js.Object]] = js.native
  
  val onInvalid: js.UndefOr[FormEventHandler[js.Object]] = js.native
  
  val onItemSelected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  val onItemSelectedChange: js.UndefOr[js.Function1[/* ev */ Data, Unit]] = js.native
  
  val onItemUnselected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  val onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  
  val onKeyPress: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  
  val onKeyUp: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  
  val onLoad: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onLoadStart: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onLoadedData: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onMouseMove: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onMouseOut: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onMouseOver: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  val onPaste: js.UndefOr[ClipboardEventHandler[js.Object]] = js.native
  
  val onPause: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onPlay: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onPlaying: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onPlotClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  val onPlotDblClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  val onPlotEnter: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  val onPlotLeave: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  val onPlotMove: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  val onPointerCancel: js.UndefOr[PointerEventHandler[js.Object]] = js.native
  
  val onPointerDown: js.UndefOr[PointerEventHandler[js.Object]] = js.native
  
  val onPointerEnter: js.UndefOr[PointerEventHandler[js.Object]] = js.native
  
  val onPointerLeave: js.UndefOr[PointerEventHandler[js.Object]] = js.native
  
  val onPointerMove: js.UndefOr[PointerEventHandler[js.Object]] = js.native
  
  val onPointerOut: js.UndefOr[PointerEventHandler[js.Object]] = js.native
  
  val onPointerOver: js.UndefOr[PointerEventHandler[js.Object]] = js.native
  
  val onPointerUp: js.UndefOr[PointerEventHandler[js.Object]] = js.native
  
  val onProgress: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onRateChange: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onReset: js.UndefOr[FormEventHandler[js.Object]] = js.native
  
  val onScroll: js.UndefOr[UIEventHandler[js.Object]] = js.native
  
  val onSeeked: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onSeeking: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onSelect: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onStalled: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onSubmit: js.UndefOr[FormEventHandler[js.Object]] = js.native
  
  val onSuspend: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onTimeUpdate: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onTooltipChange: js.UndefOr[js.Function1[/* ev */ Items, Unit]] = js.native
  
  val onTooltipHide: js.UndefOr[js.Function1[/* ev */ TooltipAny, Unit]] = js.native
  
  val onTooltipShow: js.UndefOr[js.Function1[/* ev */ Tooltip, Unit]] = js.native
  
  val onTouchCancel: js.UndefOr[TouchEventHandler[js.Object]] = js.native
  
  val onTouchEnd: js.UndefOr[TouchEventHandler[js.Object]] = js.native
  
  val onTouchMove: js.UndefOr[TouchEventHandler[js.Object]] = js.native
  
  val onTouchStart: js.UndefOr[TouchEventHandler[js.Object]] = js.native
  
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[js.Object]] = js.native
  
  val onVolumeChange: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onWaiting: js.UndefOr[ReactEventHandler[js.Object]] = js.native
  
  val onWheel: js.UndefOr[WheelEventHandler[js.Object]] = js.native
  
  val padding: js.UndefOr[
    String | Bottom | Double | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
  ] = js.native
  
  val pixelRatio: js.UndefOr[Double] = js.native
  
  val placeholder: js.UndefOr[ReactElement | String | Boolean] = js.native
  
  val plotBackground: js.UndefOr[typings.antvG2.mod.Styles.background] = js.native
  
  val ref: js.UndefOr[LegacyRef[_]] = js.native
  
  val scale: js.UndefOr[js.Any] = js.native
  
  val style: js.UndefOr[CSSProperties] = js.native
  
  val width: js.UndefOr[Double] = js.native
}
object ReadonlyChartProps {
  
  @scala.inline
  def apply(height: Double): ReadonlyChartProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyChartProps]
  }
  
  @scala.inline
  implicit class ReadonlyChartPropsMutableBuilder[Self <: ReadonlyChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBackground(value: background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Array[_]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOnAbort(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: AnimationEvent[js.Object] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: AnimationEvent[js.Object] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: AnimationEvent[js.Object] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[js.Object] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    @scala.inline
    def setOnChange(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[js.Object] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[js.Object] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEvent[js.Object] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: ClipboardEvent[js.Object] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: ClipboardEvent[js.Object] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnd(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEvent[js.Object] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[js.Object] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnGetG2Instance(value: /* chart */ Chart => Unit): Self = StObject.set(x, "onGetG2Instance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGetG2InstanceUndefined: Self = StObject.set(x, "onGetG2Instance", js.undefined)
    
    @scala.inline
    def setOnInput(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    @scala.inline
    def setOnItemSelected(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemSelectedChange(value: /* ev */ Data => Unit): Self = StObject.set(x, "onItemSelectedChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemSelectedChangeUndefined: Self = StObject.set(x, "onItemSelectedChange", js.undefined)
    
    @scala.inline
    def setOnItemSelectedUndefined: Self = StObject.set(x, "onItemSelected", js.undefined)
    
    @scala.inline
    def setOnItemUnselected(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onItemUnselected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemUnselectedUndefined: Self = StObject.set(x, "onItemUnselected", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: ClipboardEvent[js.Object] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    @scala.inline
    def setOnPlotClick(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlotClickUndefined: Self = StObject.set(x, "onPlotClick", js.undefined)
    
    @scala.inline
    def setOnPlotDblClick(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlotDblClickUndefined: Self = StObject.set(x, "onPlotDblClick", js.undefined)
    
    @scala.inline
    def setOnPlotEnter(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlotEnterUndefined: Self = StObject.set(x, "onPlotEnter", js.undefined)
    
    @scala.inline
    def setOnPlotLeave(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlotLeaveUndefined: Self = StObject.set(x, "onPlotLeave", js.undefined)
    
    @scala.inline
    def setOnPlotMove(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlotMoveUndefined: Self = StObject.set(x, "onPlotMove", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: PointerEvent[js.Object] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: UIEvent[js.Object, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: FormEvent[js.Object] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTooltipChange(value: /* ev */ Items => Unit): Self = StObject.set(x, "onTooltipChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTooltipChangeUndefined: Self = StObject.set(x, "onTooltipChange", js.undefined)
    
    @scala.inline
    def setOnTooltipHide(value: /* ev */ TooltipAny => Unit): Self = StObject.set(x, "onTooltipHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTooltipHideUndefined: Self = StObject.set(x, "onTooltipHide", js.undefined)
    
    @scala.inline
    def setOnTooltipShow(value: /* ev */ Tooltip => Unit): Self = StObject.set(x, "onTooltipShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTooltipShowUndefined: Self = StObject.set(x, "onTooltipShow", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: TouchEvent[js.Object] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: TransitionEvent[js.Object] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[js.Object, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: WheelEvent[js.Object] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setPadding(
      value: String | Bottom | Double | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: ReactElement | String | Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPlotBackground(value: background): Self = StObject.set(x, "plotBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBackgroundUndefined: Self = StObject.set(x, "plotBackground", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setScale(value: js.Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
