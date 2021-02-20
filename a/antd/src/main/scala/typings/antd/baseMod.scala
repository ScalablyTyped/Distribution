package typings.antd

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.antd.typographyTypographyMod.TypographyProps
import typings.rcTextarea.resizableTextAreaMod.AutoSizeType
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("antd/lib/typography/Base", JSImport.Default)
  @js.native
  class default () extends Base
  object default {
    
    @JSImport("antd/lib/typography/Base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd/lib/typography/Base", "default.contextType")
    @js.native
    def contextType: Context[ConfigConsumerProps] = js.native
    @scala.inline
    def contextType_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd/lib/typography/Base", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/typography/Base", "default.defaultProps.children")
      @js.native
      def children: String = js.native
      @scala.inline
      def children_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("antd/lib/typography/Base", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: BlockProps): js.Object = js.native
  }
  
  @js.native
  trait Base
    extends Component[InternalBlockProps, BaseState, js.Any] {
    
    def canUseCSSEllipsis(): Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MBase(prevProps: BlockProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBase(): Unit = js.native
    
    var contentRef: RefObject[HTMLElement] = js.native
    
    @JSName("context")
    var context_Base: ConfigConsumerProps = js.native
    
    var copiedStr: js.UndefOr[String] = js.native
    
    var copyId: js.UndefOr[Double] = js.native
    
    var copyStr: js.UndefOr[String] = js.native
    
    var editIcon: js.UndefOr[HTMLDivElement] = js.native
    
    var editStr: js.UndefOr[String] = js.native
    
    var expandStr: js.UndefOr[String] = js.native
    
    def getEditable(): EditConfig = js.native
    def getEditable(props: BlockProps): EditConfig = js.native
    
    def getEllipsis(): EllipsisConfig = js.native
    def getEllipsis(props: BlockProps): EllipsisConfig = js.native
    
    def getPrefixCls(): String = js.native
    
    def onCopyClick(): Unit = js.native
    
    def onEditCancel(): Unit = js.native
    
    def onEditChange(value: String): Unit = js.native
    
    def onEditClick(): Unit = js.native
    
    var onExpandClick: MouseEventHandler[HTMLElement] = js.native
    
    var rafId: js.UndefOr[Double] = js.native
    
    def renderContent(): Element = js.native
    
    def renderCopy(): js.UndefOr[Element] = js.native
    
    def renderEdit(): js.UndefOr[Element] = js.native
    
    def renderEditInput(): Element = js.native
    
    def renderExpand(): Element | Null = js.native
    def renderExpand(forceRender: Boolean): Element | Null = js.native
    
    def renderOperations(): js.Array[js.UndefOr[Element | Null]] = js.native
    def renderOperations(forceRenderExpanded: Boolean): js.Array[js.UndefOr[Element | Null]] = js.native
    
    def resizeOnNextFrame(): Unit = js.native
    
    def setEditRef(node: HTMLDivElement): Unit = js.native
    
    def syncEllipsis(): Unit = js.native
    
    def triggerEdit(edit: Boolean): Unit = js.native
  }
  
  @js.native
  trait BaseState extends StObject {
    
    var clientRendered: Boolean = js.native
    
    var copied: Boolean = js.native
    
    var edit: Boolean = js.native
    
    var ellipsisContent: ReactNode = js.native
    
    var ellipsisText: String = js.native
    
    var expanded: Boolean = js.native
    
    var isEllipsis: Boolean = js.native
  }
  object BaseState {
    
    @scala.inline
    def apply(
      clientRendered: Boolean,
      copied: Boolean,
      edit: Boolean,
      ellipsisText: String,
      expanded: Boolean,
      isEllipsis: Boolean
    ): BaseState = {
      val __obj = js.Dynamic.literal(clientRendered = clientRendered.asInstanceOf[js.Any], copied = copied.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], ellipsisText = ellipsisText.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isEllipsis = isEllipsis.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseState]
    }
    
    @scala.inline
    implicit class BaseStateMutableBuilder[Self <: BaseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientRendered(value: Boolean): Self = StObject.set(x, "clientRendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopied(value: Boolean): Self = StObject.set(x, "copied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdit(value: Boolean): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisContent(value: ReactNode): Self = StObject.set(x, "ellipsisContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisContentUndefined: Self = StObject.set(x, "ellipsisContent", js.undefined)
      
      @scala.inline
      def setEllipsisText(value: String): Self = StObject.set(x, "ellipsisText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEllipsis(value: Boolean): Self = StObject.set(x, "isEllipsis", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.secondary
    - typings.antd.antdStrings.success
    - typings.antd.antdStrings.warning
    - typings.antd.antdStrings.danger
  */
  trait BaseType extends StObject
  object BaseType {
    
    @scala.inline
    def danger: typings.antd.antdStrings.danger = "danger".asInstanceOf[typings.antd.antdStrings.danger]
    
    @scala.inline
    def secondary: typings.antd.antdStrings.secondary = "secondary".asInstanceOf[typings.antd.antdStrings.secondary]
    
    @scala.inline
    def success: typings.antd.antdStrings.success = "success".asInstanceOf[typings.antd.antdStrings.success]
    
    @scala.inline
    def warning: typings.antd.antdStrings.warning = "warning".asInstanceOf[typings.antd.antdStrings.warning]
  }
  
  @js.native
  trait BlockProps extends TypographyProps {
    
    var code: js.UndefOr[Boolean] = js.native
    
    var copyable: js.UndefOr[Boolean | CopyConfig] = js.native
    
    var delete: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var editable: js.UndefOr[Boolean | EditConfig] = js.native
    
    var ellipsis: js.UndefOr[Boolean | EllipsisConfig] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mark: js.UndefOr[Boolean] = js.native
    
    var strong: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[BaseType] = js.native
    
    var underline: js.UndefOr[Boolean] = js.native
  }
  object BlockProps {
    
    @scala.inline
    def apply(): BlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockProps]
    }
    
    @scala.inline
    implicit class BlockPropsMutableBuilder[Self <: BlockProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCopyable(value: Boolean | CopyConfig): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
      
      @scala.inline
      def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean | EditConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setEllipsis(value: Boolean | EllipsisConfig): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setStrong(value: Boolean): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: BaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  @js.native
  trait CopyConfig extends StObject {
    
    var icon: js.UndefOr[ReactNode] = js.native
    
    var onCopy: js.UndefOr[js.Function0[Unit]] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var tooltips: js.UndefOr[Boolean | ReactNode] = js.native
  }
  object CopyConfig {
    
    @scala.inline
    def apply(): CopyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyConfig]
    }
    
    @scala.inline
    implicit class CopyConfigMutableBuilder[Self <: CopyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnCopy(value: () => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTooltips(value: Boolean | ReactNode): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
    }
  }
  
  @js.native
  trait EditConfig extends StObject {
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.native
    
    var editing: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactNode] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var tooltip: js.UndefOr[Boolean | ReactNode] = js.native
  }
  object EditConfig {
    
    @scala.inline
    def apply(): EditConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditConfig]
    }
    
    @scala.inline
    implicit class EditConfigMutableBuilder[Self <: EditConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      @scala.inline
      def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setTooltip(value: Boolean | ReactNode): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  @js.native
  trait EllipsisConfig extends StObject {
    
    var expandable: js.UndefOr[Boolean] = js.native
    
    var onEllipsis: js.UndefOr[js.Function1[/* ellipsis */ Boolean, Unit]] = js.native
    
    var onExpand: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var symbol: js.UndefOr[ReactNode] = js.native
  }
  object EllipsisConfig {
    
    @scala.inline
    def apply(): EllipsisConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisConfig]
    }
    
    @scala.inline
    implicit class EllipsisConfigMutableBuilder[Self <: EllipsisConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setOnEllipsis(value: /* ellipsis */ Boolean => Unit): Self = StObject.set(x, "onEllipsis", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEllipsisUndefined: Self = StObject.set(x, "onEllipsis", js.undefined)
      
      @scala.inline
      def setOnExpand(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setSymbol(value: ReactNode): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    }
  }
  
  @js.native
  trait InternalBlockProps extends BlockProps {
    
    var component: String = js.native
  }
  object InternalBlockProps {
    
    @scala.inline
    def apply(component: String): InternalBlockProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalBlockProps]
    }
    
    @scala.inline
    implicit class InternalBlockPropsMutableBuilder[Self <: InternalBlockProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
}
