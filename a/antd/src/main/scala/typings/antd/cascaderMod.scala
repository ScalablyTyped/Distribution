package typings.antd

import org.scalablytyped.runtime.StringDictionary
import typings.antd.anon.PartialCascaderState
import typings.antd.antdBooleans.`false`
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.antd.configProviderContextMod.DirectionType
import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.renderEmptyMod.RenderEmptyHandler
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascaderMod {
  
  @JSImport("antd/lib/cascader", JSImport.Default)
  @js.native
  class default protected () extends Cascader {
    def this(props: CascaderProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd/lib/cascader", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/cascader", "default.defaultProps.allowClear")
      @js.native
      def allowClear: Boolean = js.native
      @scala.inline
      def allowClear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/cascader", "default.defaultProps.bordered")
      @js.native
      def bordered: Boolean = js.native
      @scala.inline
      def bordered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bordered")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/cascader", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/cascader", "default.defaultProps.options")
      @js.native
      def options: js.Array[scala.Nothing] = js.native
      @scala.inline
      def options_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/cascader", "default.defaultProps.transitionName")
      @js.native
      def transitionName: String = js.native
      @scala.inline
      def transitionName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("antd/lib/cascader", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: CascaderProps, hasPrevProps: CascaderState): PartialCascaderState = js.native
  }
  
  @js.native
  trait Cascader
    extends Component[CascaderProps, CascaderState, js.Any] {
    
    def blur(): Unit = js.native
    
    var cachedOptions: js.Array[CascaderOptionType] = js.native
    
    def clearSelection(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    
    var clearSelectionTimeout: js.Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCascader(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def generateFilteredOptions(prefixCls: js.UndefOr[scala.Nothing], renderEmpty: RenderEmptyHandler): js.Array[CascaderOptionType] = js.native
    def generateFilteredOptions(prefixCls: String, renderEmpty: RenderEmptyHandler): js.Array[CascaderOptionType] = js.native
    
    def getLabel(): js.Any = js.native
    
    def getPopupPlacement(): String = js.native
    def getPopupPlacement(direction: DirectionType): String = js.native
    
    def handleChange(value: js.Any, selectedOptions: js.Array[CascaderOptionType]): Unit = js.native
    
    def handleInputBlur(): Unit = js.native
    
    def handleInputChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def handleInputClick(e: MouseEvent[HTMLInputElement, NativeMouseEvent]): Unit = js.native
    
    def handleKeyDown(e: KeyboardEvent[HTMLInputElement]): Unit = js.native
    
    def handlePopupVisibleChange(popupVisible: Boolean): Unit = js.native
    
    var input: js.Any = js.native
    
    def renderCascader(hasGetPopupContainerGetPrefixClsRenderEmptyDirection: ConfigConsumerProps, locale: CascaderLocale): Element = js.native
    
    def saveInput(node: typings.antd.inputMod.default): Unit = js.native
    
    def setValue(value: CascaderValueType): Unit = js.native
    def setValue(value: CascaderValueType, selectedOptions: js.Array[CascaderOptionType]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.click
    - typings.antd.antdStrings.hover
  */
  trait CascaderExpandTrigger extends StObject
  object CascaderExpandTrigger {
    
    @scala.inline
    def click: typings.antd.antdStrings.click = "click".asInstanceOf[typings.antd.antdStrings.click]
    
    @scala.inline
    def hover: typings.antd.antdStrings.hover = "hover".asInstanceOf[typings.antd.antdStrings.hover]
  }
  
  @js.native
  trait CascaderLocale extends StObject {
    
    var placeholder: js.UndefOr[String] = js.native
  }
  object CascaderLocale {
    
    @scala.inline
    def apply(): CascaderLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderLocale]
    }
    
    @scala.inline
    implicit class CascaderLocaleMutableBuilder[Self <: CascaderLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  @js.native
  trait CascaderOptionType
    extends /* customProp */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[js.Array[CascaderOptionType]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[ReactNode] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object CascaderOptionType {
    
    @scala.inline
    def apply(): CascaderOptionType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderOptionType]
    }
    
    @scala.inline
    implicit class CascaderOptionTypeMutableBuilder[Self <: CascaderOptionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[CascaderOptionType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: CascaderOptionType*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CascaderProps extends StObject {
    
    /** 是否支持清除 */
    var allowClear: js.UndefOr[Boolean] = js.native
    
    /** 自动获取焦点 */
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    /** whether has border style */
    var bordered: js.UndefOr[Boolean] = js.native
    
    /** 当此项为 true 时，点选每级菜单选项值都会发生变化 */
    var changeOnSelect: js.UndefOr[Boolean] = js.native
    
    /** 自定义类名 */
    var className: js.UndefOr[String] = js.native
    
    /** 默认的选中项 */
    var defaultValue: js.UndefOr[CascaderValueType] = js.native
    
    /** 禁用 */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** 选择后展示的渲染函数 */
    var displayRender: js.UndefOr[
        js.Function2[
          /* label */ js.Array[String], 
          /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], 
          ReactNode
        ]
      ] = js.native
    
    var dropdownRender: js.UndefOr[js.Function1[/* menus */ ReactNode, ReactNode]] = js.native
    
    var expandIcon: js.UndefOr[ReactNode] = js.native
    
    /** 次级菜单的展开方式，可选 'click' 和 'hover' */
    var expandTrigger: js.UndefOr[CascaderExpandTrigger] = js.native
    
    /** use this after antd@3.7.0 */
    var fieldNames: js.UndefOr[FieldNamesType] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    /** 输入框id */
    var id: js.UndefOr[String] = js.native
    
    var inputPrefixCls: js.UndefOr[String] = js.native
    
    var loadData: js.UndefOr[
        js.Function1[/* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], Unit]
      ] = js.native
    
    /** 输入框name */
    var name: js.UndefOr[String] = js.native
    
    var notFoundContent: js.UndefOr[ReactNode] = js.native
    
    /** 选择完成后的回调 */
    var onChange: js.UndefOr[
        js.Function2[
          /* value */ CascaderValueType, 
          /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], 
          Unit
        ]
      ] = js.native
    
    /** 浮层可见变化时回调 */
    var onPopupVisibleChange: js.UndefOr[js.Function1[/* popupVisible */ Boolean, Unit]] = js.native
    
    /** 可选项数据源 */
    var options: js.Array[CascaderOptionType] = js.native
    
    /** 输入框占位文本 */
    var placeholder: js.UndefOr[String] = js.native
    
    /** 自定义浮层类名 */
    var popupClassName: js.UndefOr[String] = js.native
    
    /** 浮层预设位置：`bottomLeft` `bottomRight` `topLeft` `topRight` */
    var popupPlacement: js.UndefOr[String] = js.native
    
    var popupVisible: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var showSearch: js.UndefOr[Boolean | ShowSearchType] = js.native
    
    /** 输入框大小，可选 `large` `default` `small` */
    var size: js.UndefOr[SizeType] = js.native
    
    /** 自定义样式 */
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suffixIcon: js.UndefOr[ReactNode] = js.native
    
    /** 指定选中项 */
    var value: js.UndefOr[CascaderValueType] = js.native
  }
  object CascaderProps {
    
    @scala.inline
    def apply(options: js.Array[CascaderOptionType]): CascaderProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CascaderProps]
    }
    
    @scala.inline
    implicit class CascaderPropsMutableBuilder[Self <: CascaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setChangeOnSelect(value: Boolean): Self = StObject.set(x, "changeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOnSelectUndefined: Self = StObject.set(x, "changeOnSelect", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: CascaderValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: (String | Double)*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisplayRender(
        value: (/* label */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => ReactNode
      ): Self = StObject.set(x, "displayRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisplayRenderUndefined: Self = StObject.set(x, "displayRender", js.undefined)
      
      @scala.inline
      def setDropdownRender(value: /* menus */ ReactNode => ReactNode): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: ReactNode): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setExpandTrigger(value: CascaderExpandTrigger): Self = StObject.set(x, "expandTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandTriggerUndefined: Self = StObject.set(x, "expandTrigger", js.undefined)
      
      @scala.inline
      def setFieldNames(value: FieldNamesType): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputPrefixCls(value: String): Self = StObject.set(x, "inputPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPrefixClsUndefined: Self = StObject.set(x, "inputPrefixCls", js.undefined)
      
      @scala.inline
      def setLoadData(value: /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]] => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotFoundContent(value: ReactNode): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* value */ CascaderValueType, /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnPopupVisibleChange(value: /* popupVisible */ Boolean => Unit): Self = StObject.set(x, "onPopupVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[CascaderOptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: CascaderOptionType*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPopupPlacement(value: String): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      @scala.inline
      def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShowSearch(value: Boolean | ShowSearchType): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffixIcon(value: ReactNode): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      @scala.inline
      def setValue(value: CascaderValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CascaderState extends StObject {
    
    var flattenOptions: js.UndefOr[js.Array[js.Array[CascaderOptionType]]] = js.native
    
    var inputFocused: Boolean = js.native
    
    var inputValue: String = js.native
    
    var popupVisible: js.UndefOr[Boolean] = js.native
    
    var prevProps: CascaderProps = js.native
    
    var value: CascaderValueType = js.native
  }
  object CascaderState {
    
    @scala.inline
    def apply(inputFocused: Boolean, inputValue: String, prevProps: CascaderProps, value: CascaderValueType): CascaderState = {
      val __obj = js.Dynamic.literal(inputFocused = inputFocused.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CascaderState]
    }
    
    @scala.inline
    implicit class CascaderStateMutableBuilder[Self <: CascaderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlattenOptions(value: js.Array[js.Array[CascaderOptionType]]): Self = StObject.set(x, "flattenOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenOptionsUndefined: Self = StObject.set(x, "flattenOptions", js.undefined)
      
      @scala.inline
      def setFlattenOptionsVarargs(value: js.Array[CascaderOptionType]*): Self = StObject.set(x, "flattenOptions", js.Array(value :_*))
      
      @scala.inline
      def setInputFocused(value: Boolean): Self = StObject.set(x, "inputFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      @scala.inline
      def setPrevProps(value: CascaderProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: CascaderValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type CascaderValueType = js.Array[String | Double]
  
  @js.native
  trait FieldNamesType extends StObject {
    
    var children: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object FieldNamesType {
    
    @scala.inline
    def apply(): FieldNamesType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNamesType]
    }
    
    @scala.inline
    implicit class FieldNamesTypeMutableBuilder[Self <: FieldNamesType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait FilledFieldNamesType extends StObject {
    
    var children: String = js.native
    
    var label: String = js.native
    
    var value: String | Double = js.native
  }
  object FilledFieldNamesType {
    
    @scala.inline
    def apply(children: String, label: String, value: String | Double): FilledFieldNamesType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilledFieldNamesType]
    }
    
    @scala.inline
    implicit class FilledFieldNamesTypeMutableBuilder[Self <: FilledFieldNamesType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShowSearchType extends StObject {
    
    var filter: js.UndefOr[
        js.Function3[
          /* inputValue */ String, 
          /* path */ js.Array[CascaderOptionType], 
          /* names */ FilledFieldNamesType, 
          Boolean
        ]
      ] = js.native
    
    var limit: js.UndefOr[Double | `false`] = js.native
    
    var matchInputWidth: js.UndefOr[Boolean] = js.native
    
    var render: js.UndefOr[
        js.Function4[
          /* inputValue */ String, 
          /* path */ js.Array[CascaderOptionType], 
          /* prefixCls */ js.UndefOr[String], 
          /* names */ FilledFieldNamesType, 
          ReactNode
        ]
      ] = js.native
    
    var sort: js.UndefOr[
        js.Function4[
          /* a */ js.Array[CascaderOptionType], 
          /* b */ js.Array[CascaderOptionType], 
          /* inputValue */ String, 
          /* names */ FilledFieldNamesType, 
          Double
        ]
      ] = js.native
  }
  object ShowSearchType {
    
    @scala.inline
    def apply(): ShowSearchType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowSearchType]
    }
    
    @scala.inline
    implicit class ShowSearchTypeMutableBuilder[Self <: ShowSearchType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* inputValue */ String, /* path */ js.Array[CascaderOptionType], /* names */ FilledFieldNamesType) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLimit(value: Double | `false`): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMatchInputWidth(value: Boolean): Self = StObject.set(x, "matchInputWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchInputWidthUndefined: Self = StObject.set(x, "matchInputWidth", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* inputValue */ String, /* path */ js.Array[CascaderOptionType], /* prefixCls */ js.UndefOr[String], /* names */ FilledFieldNamesType) => ReactNode
      ): Self = StObject.set(x, "render", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSort(
        value: (/* a */ js.Array[CascaderOptionType], /* b */ js.Array[CascaderOptionType], /* inputValue */ String, /* names */ FilledFieldNamesType) => Double
      ): Self = StObject.set(x, "sort", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
