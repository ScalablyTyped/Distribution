package typings.antDesignProProvider

import typings.antDesignCssinjs.esHooksUseStyleRegisterMod.CSSInterpolation
import typings.antDesignCssinjs.esHooksUseStyleRegisterMod.CSSObject
import typings.antDesignCssinjs.mod.Theme
import typings.antDesignProProvider.anon.AutoClearCache
import typings.antDesignProProvider.anon.HashId
import typings.antDesignProProvider.anon.OmitProFieldFCRenderProps
import typings.antDesignProProvider.esUseStyleMod.ProAliasToken
import typings.antDesignProProvider.esUseStyleMod.UseStyleResult
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.ReactText
import typings.react.mod.global.JSX.Element
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/pro-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-provider", JSImport.Default)
  @js.native
  val default: Context[ConfigContextPropsType] = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(ProConfigProvider) */ @JSImport("@ant-design/pro-provider", "ConfigConsumer")
  @js.native
  val ConfigConsumer: Consumer[ConfigContextPropsType] = js.native
  
  @JSImport("@ant-design/pro-provider", "ConfigProviderWrap")
  @js.native
  val ConfigProviderWrap: FC[AutoClearCache] = js.native
  
  @JSImport("@ant-design/pro-provider", "ProProvider")
  @js.native
  val ProProvider: Context[ConfigContextPropsType] = js.native
  
  @JSImport("@ant-design/pro-provider", "arEGIntl")
  @js.native
  val arEGIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "caESIntl")
  @js.native
  val caESIntl: IntlType = js.native
  
  inline def createIntl(locale: String, localeMap: Record[String, Any]): IntlType = (^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(locale.asInstanceOf[js.Any], localeMap.asInstanceOf[js.Any])).asInstanceOf[IntlType]
  
  @JSImport("@ant-design/pro-provider", "deDEIntl")
  @js.native
  val deDEIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "enGBIntl")
  @js.native
  val enGBIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "enUSIntl")
  @js.native
  val enUSIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "esESIntl")
  @js.native
  val esESIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "faIRIntl")
  @js.native
  val faIRIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "frFRIntl")
  @js.native
  val frFRIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "hrHRIntl")
  @js.native
  val hrHRIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "idIDIntl")
  @js.native
  val idIDIntl: IntlType = js.native
  
  object intlMap {
    
    @JSImport("@ant-design/pro-provider", "intlMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/pro-provider", "intlMap.ar-EG")
    @js.native
    def arEG: IntlType = js.native
    
    inline def arEG_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar-EG")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.ca-ES")
    @js.native
    def caES: IntlType = js.native
    
    inline def caES_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ca-ES")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.de-DE")
    @js.native
    def deDE: IntlType = js.native
    
    inline def deDE_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("de-DE")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.en-GB")
    @js.native
    def enGB: IntlType = js.native
    
    inline def enGB_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("en-GB")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.en-US")
    @js.native
    def enUS: IntlType = js.native
    
    inline def enUS_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("en-US")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.es-ES")
    @js.native
    def esES: IntlType = js.native
    
    inline def esES_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("es-ES")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.fa-IR")
    @js.native
    def faIR: IntlType = js.native
    
    inline def faIR_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fa-IR")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.fr-FR")
    @js.native
    def frFR: IntlType = js.native
    
    inline def frFR_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fr-FR")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.hr-HR")
    @js.native
    def hrHR: IntlType = js.native
    
    inline def hrHR_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hr-HR")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.id-ID")
    @js.native
    def idID: IntlType = js.native
    
    inline def idID_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id-ID")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.it-IT")
    @js.native
    def itIT: IntlType = js.native
    
    inline def itIT_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("it-IT")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.ja-JP")
    @js.native
    def jaJP: IntlType = js.native
    
    inline def jaJP_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ja-JP")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.ko-KR")
    @js.native
    def koKR: IntlType = js.native
    
    inline def koKR_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ko-KR")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.mn-MN")
    @js.native
    def mnMN: IntlType = js.native
    
    inline def mnMN_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mn-MN")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.ms-MY")
    @js.native
    def msMY: IntlType = js.native
    
    inline def msMY_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ms-MY")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.pl-PL")
    @js.native
    def plPL: IntlType = js.native
    
    inline def plPL_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pl-PL")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.pt-BR")
    @js.native
    def ptBR: IntlType = js.native
    
    inline def ptBR_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pt-BR")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.ru-RU")
    @js.native
    def ruRU: IntlType = js.native
    
    inline def ruRU_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ru-RU")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.sr-RS")
    @js.native
    def srRS: IntlType = js.native
    
    inline def srRS_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sr-RS")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.tr-TR")
    @js.native
    def trTR: IntlType = js.native
    
    inline def trTR_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tr-TR")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.vi-VN")
    @js.native
    def viVN: IntlType = js.native
    
    inline def viVN_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vi-VN")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.zh-CN")
    @js.native
    def zhCN: IntlType = js.native
    
    inline def zhCN_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zh-CN")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider", "intlMap.zh-TW")
    @js.native
    def zhTW: IntlType = js.native
    
    inline def zhTW_=(x: IntlType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zh-TW")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/pro-provider", "intlMapKeys")
  @js.native
  val intlMapKeys: js.Array[String] = js.native
  
  @JSImport("@ant-design/pro-provider", "itITIntl")
  @js.native
  val itITIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "jaJPIntl")
  @js.native
  val jaJPIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "koKRIntl")
  @js.native
  val koKRIntl: IntlType = js.native
  
  inline def lighten(baseColor: String, brightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(baseColor.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@ant-design/pro-provider", "mnMNIntl")
  @js.native
  val mnMNIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "msMYIntl")
  @js.native
  val msMYIntl: IntlType = js.native
  
  inline def operationUnit(token: ProAliasToken): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("operationUnit")(token.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  
  @JSImport("@ant-design/pro-provider", "plPLIntl")
  @js.native
  val plPLIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "ptBRIntl")
  @js.native
  val ptBRIntl: IntlType = js.native
  
  inline def resetComponent(token: ProAliasToken): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("resetComponent")(token.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  
  @JSImport("@ant-design/pro-provider", "ruRUIntl")
  @js.native
  val ruRUIntl: IntlType = js.native
  
  inline def setAlpha(baseColor: String, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setAlpha")(baseColor.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@ant-design/pro-provider", "srRSIntl")
  @js.native
  val srRSIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "trTRIntl")
  @js.native
  val trTRIntl: IntlType = js.native
  
  inline def useIntl(): IntlType = ^.asInstanceOf[js.Dynamic].applyDynamic("useIntl")().asInstanceOf[IntlType]
  
  inline def useStyle(componentName: String, styleFn: js.Function1[/* token */ ProAliasToken, CSSInterpolation]): UseStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(componentName.asInstanceOf[js.Any], styleFn.asInstanceOf[js.Any])).asInstanceOf[UseStyleResult]
  
  /**
    * 如果 antd 里面没有，就用我 mock 的，这样 antd@4 和 antd@5 可以兼容
    */
  inline def useToken(): HashId = ^.asInstanceOf[js.Dynamic].applyDynamic("useToken")().asInstanceOf[HashId]
  
  @JSImport("@ant-design/pro-provider", "viVNIntl")
  @js.native
  val viVNIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "zhCNIntl")
  @js.native
  val zhCNIntl: IntlType = js.native
  
  @JSImport("@ant-design/pro-provider", "zhTWIntl")
  @js.native
  val zhTWIntl: IntlType = js.native
  
  trait BaseProFieldFC extends StObject {
    
    /** 放置到组件上 props */
    var fieldProps: js.UndefOr[Any] = js.undefined
    
    /** Label */
    var label: js.UndefOr[ReactNode] = js.undefined
    
    /** 轻量模式 */
    var light: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 组件的渲染模式类型
      * @option read 渲染只读模式
      * @option edit 渲染编辑模式
      * */
    var mode: ProFieldFCMode
    
    /**
      * 简约模式
      */
    var plain: js.UndefOr[Boolean] = js.undefined
    
    /** 唯一的key，用于网络请求 */
    var proFieldKey: js.UndefOr[Key] = js.undefined
    
    /** 值的类型 */
    var text: ReactNode
    
    /** 映射值的类型 */
    var valueEnum: js.UndefOr[ProSchemaValueEnumObj | ProSchemaValueEnumMap] = js.undefined
  }
  object BaseProFieldFC {
    
    inline def apply(mode: ProFieldFCMode): BaseProFieldFC = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProFieldFC]
    }
    
    extension [Self <: BaseProFieldFC](x: Self) {
      
      inline def setFieldProps(value: Any): Self = StObject.set(x, "fieldProps", value.asInstanceOf[js.Any])
      
      inline def setFieldPropsUndefined: Self = StObject.set(x, "fieldProps", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setMode(value: ProFieldFCMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setProFieldKey(value: Key): Self = StObject.set(x, "proFieldKey", value.asInstanceOf[js.Any])
      
      inline def setProFieldKeyUndefined: Self = StObject.set(x, "proFieldKey", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValueEnum(value: ProSchemaValueEnumObj | ProSchemaValueEnumMap): Self = StObject.set(x, "valueEnum", value.asInstanceOf[js.Any])
      
      inline def setValueEnumUndefined: Self = StObject.set(x, "valueEnum", js.undefined)
    }
  }
  
  trait ConfigContextPropsType extends StObject {
    
    var hashId: js.UndefOr[String] = js.undefined
    
    var intl: IntlType
    
    var isDeps: Boolean
    
    var theme: Theme[Any, Any]
    
    var token: js.UndefOr[ProAliasToken] = js.undefined
    
    var valueTypeMap: Record[String, ProRenderFieldPropsType]
  }
  object ConfigContextPropsType {
    
    inline def apply(
      intl: IntlType,
      isDeps: Boolean,
      theme: Theme[Any, Any],
      valueTypeMap: Record[String, ProRenderFieldPropsType]
    ): ConfigContextPropsType = {
      val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], isDeps = isDeps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], valueTypeMap = valueTypeMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigContextPropsType]
    }
    
    extension [Self <: ConfigContextPropsType](x: Self) {
      
      inline def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
      
      inline def setHashIdUndefined: Self = StObject.set(x, "hashId", js.undefined)
      
      inline def setIntl(value: IntlType): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
      
      inline def setIsDeps(value: Boolean): Self = StObject.set(x, "isDeps", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme[Any, Any]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setToken(value: ProAliasToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setValueTypeMap(value: Record[String, ProRenderFieldPropsType]): Self = StObject.set(x, "valueTypeMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntlType extends StObject {
    
    def getMessage(id: String, defaultMessage: String): String
    
    var locale: String
  }
  object IntlType {
    
    inline def apply(getMessage: (String, String) => String, locale: String): IntlType = {
      val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction2(getMessage), locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlType]
    }
    
    extension [Self <: IntlType](x: Self) {
      
      inline def setGetMessage(value: (String, String) => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction2(value))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  type ParamsType = Record[String, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignProProvider.antDesignProProviderStrings.read
    - typings.antDesignProProvider.antDesignProProviderStrings.edit
    - typings.antDesignProProvider.antDesignProProviderStrings.update
  */
  trait ProFieldFCMode extends StObject
  object ProFieldFCMode {
    
    inline def edit: typings.antDesignProProvider.antDesignProProviderStrings.edit = "edit".asInstanceOf[typings.antDesignProProvider.antDesignProProviderStrings.edit]
    
    inline def read: typings.antDesignProProvider.antDesignProProviderStrings.read = "read".asInstanceOf[typings.antDesignProProvider.antDesignProProviderStrings.read]
    
    inline def update: typings.antDesignProProvider.antDesignProProviderStrings.update = "update".asInstanceOf[typings.antDesignProProvider.antDesignProProviderStrings.update]
  }
  
  trait ProFieldFCRenderProps
    extends StObject
       with BaseProFieldFC {
    
    @JSName("mode")
    var mode_ProFieldFCRenderProps: js.UndefOr[ProFieldFCMode] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object ProFieldFCRenderProps {
    
    inline def apply(): ProFieldFCRenderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProFieldFCRenderProps]
    }
    
    extension [Self <: ProFieldFCRenderProps](x: Self) {
      
      inline def setMode(value: ProFieldFCMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnChange(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlaceholder(value: String | js.Array[String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: String*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ProRenderFieldPropsType extends StObject {
    
    /**
      * 自定义只读模式的渲染器
      * @params props 关于dom的配置
      * @params dom 默认的 dom
      * @return 返回一个用于读的 dom
      */
    var render: js.UndefOr[
        js.Function3[/* text */ Any, /* props */ OmitProFieldFCRenderProps, /* dom */ Element, Element]
      ] = js.undefined
    
    /**
      * 一个自定义的编辑渲染器。
      * @params text 默认的值类型
      * @params props 关于dom的配置
      * @params dom 默认的 dom
      * @return 返回一个用于编辑的dom
      */
    var renderFormItem: js.UndefOr[
        js.Function3[/* text */ Any, /* props */ ProFieldFCRenderProps, /* dom */ Element, Element]
      ] = js.undefined
  }
  object ProRenderFieldPropsType {
    
    inline def apply(): ProRenderFieldPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProRenderFieldPropsType]
    }
    
    extension [Self <: ProRenderFieldPropsType](x: Self) {
      
      inline def setRender(value: (/* text */ Any, /* props */ OmitProFieldFCRenderProps, /* dom */ Element) => Element): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderFormItem(value: (/* text */ Any, /* props */ ProFieldFCRenderProps, /* dom */ Element) => Element): Self = StObject.set(x, "renderFormItem", js.Any.fromFunction3(value))
      
      inline def setRenderFormItemUndefined: Self = StObject.set(x, "renderFormItem", js.undefined)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  /**
    * 支持 Map 和 Object
    *
    * @name ValueEnum 的类型
    */
  type ProSchemaValueEnumMap = Map[ReactText, ProSchemaValueEnumType | ReactNode]
  
  type ProSchemaValueEnumObj = Record[String, ProSchemaValueEnumType | ReactNode]
  
  trait ProSchemaValueEnumType extends StObject {
    
    /** @name 自定义的颜色 */
    var color: js.UndefOr[String] = js.undefined
    
    /** @name 是否禁用 */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** @name 预定的颜色 */
    var status: js.UndefOr[String] = js.undefined
    
    /** @name 演示的文案 */
    var text: ReactNode
  }
  object ProSchemaValueEnumType {
    
    inline def apply(): ProSchemaValueEnumType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProSchemaValueEnumType]
    }
    
    extension [Self <: ProSchemaValueEnumType](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
