package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.icon_
import typings.antd.antdStrings.textSlashhtml
import typings.antd.antdStrings.textSlashplain
import typings.antd.antdStrings.text_
import typings.antd.tooltipMod.TooltipProps
import typings.antd.typographyTypographyMod.TypographyProps
import typings.rcTextarea.resizableTextAreaMod.AutoSizeType
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

object baseMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Base", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[InternalBlockProps & RefAttributes[Any]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.secondary
    - typings.antd.antdStrings.success
    - typings.antd.antdStrings.warning
    - typings.antd.antdStrings.danger
  */
  trait BaseType extends StObject
  object BaseType {
    
    inline def danger: typings.antd.antdStrings.danger = "danger".asInstanceOf[typings.antd.antdStrings.danger]
    
    inline def secondary: typings.antd.antdStrings.secondary = "secondary".asInstanceOf[typings.antd.antdStrings.secondary]
    
    inline def success: typings.antd.antdStrings.success = "success".asInstanceOf[typings.antd.antdStrings.success]
    
    inline def warning: typings.antd.antdStrings.warning = "warning".asInstanceOf[typings.antd.antdStrings.warning]
  }
  
  trait BlockProps
    extends StObject
       with TypographyProps {
    
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
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[BaseType] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object BlockProps {
    
    inline def apply(): BlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockProps]
    }
    
    extension [Self <: BlockProps](x: Self) {
      
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
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: BaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  trait CopyConfig extends StObject {
    
    var format: js.UndefOr[textSlashplain | textSlashhtml] = js.undefined
    
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
      
      inline def setFormat(value: textSlashplain | textSlashhtml): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
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
    
    var tooltip: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    var triggerType: js.UndefOr[js.Array[icon_ | text_]] = js.undefined
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
      
      inline def setTooltip(value: Boolean | ReactNode): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTriggerType(value: js.Array[icon_ | text_]): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      inline def setTriggerTypeVarargs(value: (icon_ | text_)*): Self = StObject.set(x, "triggerType", js.Array(value*))
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
  
  trait InternalBlockProps
    extends StObject
       with BlockProps {
    
    var component: String
  }
  object InternalBlockProps {
    
    inline def apply(component: String): InternalBlockProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalBlockProps]
    }
    
    extension [Self <: InternalBlockProps](x: Self) {
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[InternalBlockProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `baseMod.foo` */
  override def _to: ForwardRefExoticComponent[InternalBlockProps & RefAttributes[Any]] = default
}
