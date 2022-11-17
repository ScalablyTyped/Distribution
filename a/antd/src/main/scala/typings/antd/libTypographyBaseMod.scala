package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libTooltipMod.TooltipProps
import typings.antd.libTypographyTypographyMod.TypographyProps
import typings.rcTextarea.esResizableTextAreaMod.AutoSizeType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyBaseMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Base", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[
    (BlockProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with "a", "abbr", "address" */ String
    ]) & RefAttributes[HTMLElement]
  ] = js.native
  
  object BaseType {
    
    inline def danger: "danger" = "danger".asInstanceOf["danger"]
    
    inline def secondary: "secondary" = "secondary".asInstanceOf["secondary"]
    
    inline def success: "success" = "success".asInstanceOf["success"]
    
    inline def warning: "warning" = "warning".asInstanceOf["warning"]
  }
  type BaseType = "secondary" | "success" | "warning" | "danger"
  
  trait BlockProps[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with "a", "abbr", "address" */ String */]
    extends StObject
       with TypographyProps[C] {
    
    var code: js.UndefOr[Boolean] = js.undefined
    
    var copyable: js.UndefOr[Boolean | CopyConfig] = js.undefined
    
    var delete: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[Boolean | EditConfig] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean | EllipsisConfig] = js.undefined
    
    var italic: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var mark: js.UndefOr[Boolean] = js.undefined
    
    var strong: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[BaseType] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object BlockProps {
    
    inline def apply[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with "a", "abbr", "address" */ String */](): BlockProps[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockProps[C]]
    }
    
    extension [Self <: BlockProps[?], C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with "a", "abbr", "address" */ String */](x: Self & BlockProps[C]) {
      
      inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCopyable(value: Boolean | CopyConfig): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
      
      inline def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
      
      inline def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditable(value: Boolean | EditConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEllipsis(value: Boolean | EllipsisConfig): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setStrong(value: Boolean): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setType(value: BaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  trait CopyConfig extends StObject {
    
    var format: js.UndefOr["text/plain" | "text/html"] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var onCopy: js.UndefOr[
        js.Function1[/* event */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]], Unit]
      ] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var tooltips: js.UndefOr[Boolean | ReactNode] = js.undefined
  }
  object CopyConfig {
    
    inline def apply(): CopyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyConfig]
    }
    
    extension [Self <: CopyConfig](x: Self) {
      
      inline def setFormat(value: "text/plain" | "text/html"): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnCopy(value: /* event */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTooltips(value: Boolean | ReactNode): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      inline def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
    }
  }
  
  trait EditConfig extends StObject {
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.undefined
    
    var editing: js.UndefOr[Boolean] = js.undefined
    
    var enterIcon: js.UndefOr[ReactNode] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    var triggerType: js.UndefOr[js.Array["icon" | "text"]] = js.undefined
  }
  object EditConfig {
    
    inline def apply(): EditConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditConfig]
    }
    
    extension [Self <: EditConfig](x: Self) {
      
      inline def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
      
      inline def setEnterIcon(value: ReactNode): Self = StObject.set(x, "enterIcon", value.asInstanceOf[js.Any])
      
      inline def setEnterIconUndefined: Self = StObject.set(x, "enterIcon", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTooltip(value: Boolean | ReactNode): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTriggerType(value: js.Array["icon" | "text"]): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      inline def setTriggerTypeVarargs(value: ("icon" | "text")*): Self = StObject.set(x, "triggerType", js.Array(value*))
    }
  }
  
  trait EllipsisConfig extends StObject {
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var onEllipsis: js.UndefOr[js.Function1[/* ellipsis */ Boolean, Unit]] = js.undefined
    
    var onExpand: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var symbol: js.UndefOr[ReactNode] = js.undefined
    
    var tooltip: js.UndefOr[ReactNode | TooltipProps] = js.undefined
  }
  object EllipsisConfig {
    
    inline def apply(): EllipsisConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisConfig]
    }
    
    extension [Self <: EllipsisConfig](x: Self) {
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setOnEllipsis(value: /* ellipsis */ Boolean => Unit): Self = StObject.set(x, "onEllipsis", js.Any.fromFunction1(value))
      
      inline def setOnEllipsisUndefined: Self = StObject.set(x, "onEllipsis", js.undefined)
      
      inline def setOnExpand(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSymbol(value: ReactNode): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setTooltip(value: ReactNode | TooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[
    (BlockProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with "a", "abbr", "address" */ String
    ]) & RefAttributes[HTMLElement]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `libTypographyBaseMod.foo` */
  override def _to: ForwardRefExoticComponent[
    (BlockProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with "a", "abbr", "address" */ String
    ]) & RefAttributes[HTMLElement]
  ] = default
}
