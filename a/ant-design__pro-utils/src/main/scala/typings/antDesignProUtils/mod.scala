package typings.antDesignProUtils

import typings.antDesignCssinjs.useStyleRegisterMod.CSSInterpolation
import typings.antDesignCssinjs.useStyleRegisterMod.CSSObject
import typings.antDesignProUtils.anon.ActionRender
import typings.antDesignProUtils.anon.Cancel
import typings.antDesignProUtils.anon.CancelEditable
import typings.antDesignProUtils.anon.Children
import typings.antDesignProUtils.anon.ChildrenColumnName
import typings.antDesignProUtils.anon.ColSize
import typings.antDesignProUtils.anon.Current
import typings.antDesignProUtils.anon.DataSource
import typings.antDesignProUtils.anon.DateFormat
import typings.antDesignProUtils.anon.Ellipsis
import typings.antDesignProUtils.anon.ErrorInfo
import typings.antDesignProUtils.anon.HashId
import typings.antDesignProUtils.anon.Id
import typings.antDesignProUtils.anon.Params
import typings.antDesignProUtils.anon.ProFormInstanceTypeanyfor
import typings.antDesignProUtils.anon.SetDataSource
import typings.antDesignProUtils.antDesignProUtilsBooleans.`false`
import typings.antDesignProUtils.antDesignProUtilsInts.`-1`
import typings.antDesignProUtils.antDesignProUtilsInts.`0`
import typings.antDesignProUtils.antDesignProUtilsInts.`1`
import typings.antDesignProUtils.antDesignProUtilsStrings.delete
import typings.antDesignProUtils.antDesignProUtilsStrings.top
import typings.antDesignProUtils.antDesignProUtilsStrings.update
import typings.antDesignProUtils.conversionMomentValueMod.DateFormatter
import typings.antDesignProUtils.dateArrayFormatterMod.FormatType
import typings.antDesignProUtils.dropdownFooterMod.DropdownFooterProps
import typings.antDesignProUtils.fieldLabelMod.FieldLabelProps
import typings.antDesignProUtils.filterDropdownMod.DropdownProps
import typings.antDesignProUtils.inlineErrorFormItemMod.InlineErrorFormItemProps
import typings.antDesignProUtils.parseValueToMomentMod.DateValue
import typings.antDesignProUtils.transformKeySubmitValueMod.DataFormatMapType
import typings.antDesignProUtils.typingMod.SearchTransformKeyFn
import typings.antDesignProUtils.useEditableArrayMod.RecordKey
import typings.antDesignProUtils.useEditableArrayMod.RowEditableConfig
import typings.antDesignProUtils.useSafeStateMod.SetState
import typings.antDesignProUtils.useStyleMod.ProAliasToken
import typings.antDesignProUtils.useStyleMod.UseStyleResult
import typings.antd.useFormMod.FormInstance
import typings.dayjs.mod.Dayjs
import typings.rcFieldForm.interfaceMod.NamePath
import typings.rcUtil.anon.DefaultValue
import typings.rcUtil.useMergedStateMod.Updater
import typings.react.mod.Context
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.Key
import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.Parameters
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/pro-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-utils", "DropdownFooter")
  @js.native
  val DropdownFooter: FC[DropdownFooterProps] = js.native
  
  @JSImport("@ant-design/pro-utils", "ErrorBoundary")
  @js.native
  open class ErrorBoundary protected ()
    extends typings.antDesignProUtils.errorBoundaryMod.ErrorBoundary {
    def this(props: Children) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Children, context: Any) = this()
  }
  object ErrorBoundary {
    
    @JSImport("@ant-design/pro-utils", "ErrorBoundary")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromError(error: js.Error): ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorInfo]
  }
  
  @JSImport("@ant-design/pro-utils", "FieldLabel")
  @js.native
  val FieldLabel: ForwardRefExoticComponent[FieldLabelProps & RefAttributes[Any]] = js.native
  
  @JSImport("@ant-design/pro-utils", "FilterDropdown")
  @js.native
  val FilterDropdown: FC[DropdownProps] = js.native
  
  inline def InlineErrorFormItem(props: InlineErrorFormItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InlineErrorFormItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@ant-design/pro-utils", "LabelIconTip")
  @js.native
  val LabelIconTip: FC[Ellipsis] = js.native
  
  @JSImport("@ant-design/pro-utils", "ProFormContext")
  @js.native
  val ProFormContext: Context[ProFormInstanceTypeanyfor] = js.native
  
  inline def arrayMoveImmutable[T](array: js.Array[T], fromIndex: Double, toIndex: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMoveImmutable")(array.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def compareVersions(v1: String, v2: String): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareVersions")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  
  inline def conversionMomentValue[T /* <: js.Object */](value: T, dateFormatter: DateFormatter, valueTypeMap: Record[String, DateFormat | Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionMomentValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conversionMomentValue[T /* <: js.Object */](
    value: T,
    dateFormatter: DateFormatter,
    valueTypeMap: Record[String, DateFormat | Any],
    omitNil: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionMomentValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], omitNil.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conversionMomentValue[T /* <: js.Object */](
    value: T,
    dateFormatter: DateFormatter,
    valueTypeMap: Record[String, DateFormat | Any],
    omitNil: Boolean,
    parentKey: NamePath
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionMomentValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], omitNil.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conversionMomentValue[T /* <: js.Object */](
    value: T,
    dateFormatter: DateFormatter,
    valueTypeMap: Record[String, DateFormat | Any],
    omitNil: Unit,
    parentKey: NamePath
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionMomentValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], omitNil.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def conversionSubmitValue[T /* <: js.Object */](value: T, dateFormatter: DateFormatter, valueTypeMap: Record[String, DateFormat | Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionSubmitValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conversionSubmitValue[T /* <: js.Object */](
    value: T,
    dateFormatter: DateFormatter,
    valueTypeMap: Record[String, DateFormat | Any],
    omitNil: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionSubmitValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], omitNil.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conversionSubmitValue[T /* <: js.Object */](
    value: T,
    dateFormatter: DateFormatter,
    valueTypeMap: Record[String, DateFormat | Any],
    omitNil: Boolean,
    parentKey: NamePath
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionSubmitValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], omitNil.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conversionSubmitValue[T /* <: js.Object */](
    value: T,
    dateFormatter: DateFormatter,
    valueTypeMap: Record[String, DateFormat | Any],
    omitNil: Unit,
    parentKey: NamePath
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionSubmitValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], omitNil.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def convertMoment(value: Dayjs, dateFormatter: String, valueType: String): String | Double | Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMoment")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueType.asInstanceOf[js.Any])).asInstanceOf[String | Double | Dayjs]
  inline def convertMoment(
    value: Dayjs,
    dateFormatter: js.Function2[/* value */ Dayjs, /* valueType */ String, String | Double],
    valueType: String
  ): String | Double | Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMoment")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueType.asInstanceOf[js.Any])).asInstanceOf[String | Double | Dayjs]
  
  inline def convertMoment_false(value: Dayjs, dateFormatter: `false`, valueType: String): String | Double | Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMoment")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueType.asInstanceOf[js.Any])).asInstanceOf[String | Double | Dayjs]
  
  inline def dateArrayFormatter(value: js.Array[Any], format: js.Array[FormatType]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateArrayFormatter")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateArrayFormatter(value: js.Array[Any], format: FormatType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateArrayFormatter")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object dateFormatterMap {
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap.date")
    @js.native
    def date: String = js.native
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap.dateMonth")
    @js.native
    def dateMonth: String = js.native
    inline def dateMonth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateMonth")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap.dateQuarter")
    @js.native
    def dateQuarter: String = js.native
    inline def dateQuarter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateQuarter")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap.dateRange")
    @js.native
    def dateRange: String = js.native
    inline def dateRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap.dateTime")
    @js.native
    def dateTime: String = js.native
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap.dateTimeRange")
    @js.native
    def dateTimeRange: String = js.native
    inline def dateTimeRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRange")(x.asInstanceOf[js.Any])
    
    inline def dateTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap.dateWeek")
    @js.native
    def dateWeek: String = js.native
    inline def dateWeek_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateWeek")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap.dateYear")
    @js.native
    def dateYear: String = js.native
    inline def dateYear_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateYear")(x.asInstanceOf[js.Any])
    
    inline def date_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap.time")
    @js.native
    def time: String = js.native
    
    @JSImport("@ant-design/pro-utils", "dateFormatterMap.timeRange")
    @js.native
    def timeRange: String = js.native
    inline def timeRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeRange")(x.asInstanceOf[js.Any])
    
    inline def time_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
  }
  
  inline def editableRowByKey[RecordType](keyProps: ChildrenColumnName[RecordType], action: update | top | delete): js.Array[RecordType] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableRowByKey")(keyProps.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Array[RecordType]]
  
  inline def genCopyable(dom: ReactNode, item: Any, text: String): js.UndefOr[String | Double | Boolean | ReactFragment | Element | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("genCopyable")(dom.asInstanceOf[js.Any], item.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Double | Boolean | ReactFragment | Element | Null]]
  
  inline def getFieldPropsOrFormItemProps(fieldProps: Any): (Record[String, Any]) & ColSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldPropsOrFormItemProps")(fieldProps.asInstanceOf[js.Any]).asInstanceOf[(Record[String, Any]) & ColSize]
  inline def getFieldPropsOrFormItemProps(fieldProps: Any, form: Null, extraProps: Any): (Record[String, Any]) & ColSize = (^.asInstanceOf[js.Dynamic].applyDynamic("getFieldPropsOrFormItemProps")(fieldProps.asInstanceOf[js.Any], form.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any])).asInstanceOf[(Record[String, Any]) & ColSize]
  inline def getFieldPropsOrFormItemProps(fieldProps: Any, form: Unit, extraProps: Any): (Record[String, Any]) & ColSize = (^.asInstanceOf[js.Dynamic].applyDynamic("getFieldPropsOrFormItemProps")(fieldProps.asInstanceOf[js.Any], form.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any])).asInstanceOf[(Record[String, Any]) & ColSize]
  inline def getFieldPropsOrFormItemProps(fieldProps: Any, form: FormInstance[Any]): (Record[String, Any]) & ColSize = (^.asInstanceOf[js.Dynamic].applyDynamic("getFieldPropsOrFormItemProps")(fieldProps.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[(Record[String, Any]) & ColSize]
  inline def getFieldPropsOrFormItemProps(fieldProps: Any, form: FormInstance[Any], extraProps: Any): (Record[String, Any]) & ColSize = (^.asInstanceOf[js.Dynamic].applyDynamic("getFieldPropsOrFormItemProps")(fieldProps.asInstanceOf[js.Any], form.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any])).asInstanceOf[(Record[String, Any]) & ColSize]
  
  inline def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  inline def isDeepEqualReact(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepEqualReact")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isDeepEqualReact(a: Any, b: Any, ignoreKeys: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepEqualReact")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isDeepEqualReact(a: Any, b: Any, ignoreKeys: js.Array[String], debug: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepEqualReact")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isDeepEqualReact(a: Any, b: Any, ignoreKeys: Unit, debug: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepEqualReact")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDropdownValueType(valueType: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDropdownValueType")(valueType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isImg(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImg")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNil(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUrl(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")().asInstanceOf[Boolean]
  inline def isUrl(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lighten(baseColor: String, brightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(baseColor.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def merge[T](rest: Any*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(rest.asInstanceOf[Seq[js.Any]]*).asInstanceOf[T]
  
  inline def nanoid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nanoid")().asInstanceOf[String]
  
  inline def omitBoolean[T](obj: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("omitBoolean")(obj.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def omitBoolean[T](obj: Boolean): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("omitBoolean")(obj.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def omitUndefined[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("omitUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def omitUndefinedAndEmptyArr[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("omitUndefinedAndEmptyArr")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def operationUnit(token: ProAliasToken): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("operationUnit")(token.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  
  inline def parseValueToDay(value: DateValue): js.UndefOr[Dayjs | js.Array[Dayjs] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValueToDay")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Dayjs | js.Array[Dayjs] | Null]]
  inline def parseValueToDay(value: DateValue, formatter: String): js.UndefOr[Dayjs | js.Array[Dayjs] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseValueToDay")(value.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Dayjs | js.Array[Dayjs] | Null]]
  
  inline def pickProFormItemProps(props: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("pickProFormItemProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def pickProProps(props: Record[String, Any]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("pickProProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def recordKeyToString(rowKey: RecordKey): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("recordKeyToString")(rowKey.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def resetComponent(token: ProAliasToken): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("resetComponent")(token.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  
  inline def runFunction[T /* <: js.Array[Any] */](
    valueEnum: Any,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runFunction")(valueEnum.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setAlpha(baseColor: String, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setAlpha")(baseColor.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def transformKeySubmitValue[T /* <: js.Object */](values: T, dataFormatMapRaw: Record[String, js.UndefOr[SearchTransformKeyFn | DataFormatMapType]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transformKeySubmitValue")(values.asInstanceOf[js.Any], dataFormatMapRaw.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def transformKeySubmitValue[T /* <: js.Object */](
    values: T,
    dataFormatMapRaw: Record[String, js.UndefOr[SearchTransformKeyFn | DataFormatMapType]],
    omit: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transformKeySubmitValue")(values.asInstanceOf[js.Any], dataFormatMapRaw.asInstanceOf[js.Any], omit.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useDebounceFn[T /* <: js.Array[Any] */, U](fn: js.Function1[/* args */ T, js.Promise[Any]]): Cancel[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceFn")(fn.asInstanceOf[js.Any]).asInstanceOf[Cancel[U]]
  inline def useDebounceFn[T /* <: js.Array[Any] */, U](fn: js.Function1[/* args */ T, js.Promise[Any]], wait: Double): Cancel[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceFn")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Cancel[U]]
  
  inline def useDebounceValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useDebounceValue[T](value: T, delay: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceValue")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def useDebounceValue[T](value: T, delay: Double, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceValue")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def useDebounceValue[T](value: T, delay: Unit, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceValue")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useDeepCompareEffect(effect: EffectCallback, dependencies: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffect")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDeepCompareEffect(effect: EffectCallback, dependencies: DependencyList, ignoreKeys: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffect")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDeepCompareEffectDebounce(effect: EffectCallback, dependencies: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffectDebounce")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDeepCompareEffectDebounce(effect: EffectCallback, dependencies: DependencyList, ignoreKeys: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffectDebounce")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDeepCompareEffectDebounce(
    effect: EffectCallback,
    dependencies: DependencyList,
    ignoreKeys: js.Array[String],
    waitTime: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffectDebounce")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any], waitTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDeepCompareEffectDebounce(effect: EffectCallback, dependencies: DependencyList, ignoreKeys: Unit, waitTime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffectDebounce")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any], waitTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDocumentTitle(titleInfo: Id, appDefaultTitle: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentTitle")(titleInfo.asInstanceOf[js.Any], appDefaultTitle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDocumentTitle_false(titleInfo: Id, appDefaultTitle: `false`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentTitle")(titleInfo.asInstanceOf[js.Any], appDefaultTitle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEditableArray[RecordType](props: RowEditableConfig[RecordType] & DataSource[RecordType]): ActionRender[RecordType] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEditableArray")(props.asInstanceOf[js.Any]).asInstanceOf[ActionRender[RecordType]]
  
  inline def useEditableMap[RecordType](props: RowEditableConfig[RecordType] & SetDataSource[RecordType]): CancelEditable[RecordType] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEditableMap")(props.asInstanceOf[js.Any]).asInstanceOf[CancelEditable[RecordType]]
  
  inline def useFetchData[T, U /* <: Record[String, Any] */](props: Params[U, T]): js.Array[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFetchData")(props.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.UndefOr[T]]]
  
  inline def useLatest[T](value: T): Current[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLatest")(value.asInstanceOf[js.Any]).asInstanceOf[Current[T]]
  
  inline def useMountMergeState[T, R](defaultStateValue: T): js.Tuple2[R, Updater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMountMergeState")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def useMountMergeState[T, R](defaultStateValue: T, option: DefaultValue[T]): js.Tuple2[R, Updater[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMountMergeState")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def useMountMergeState[T, R](defaultStateValue: js.Function0[T]): js.Tuple2[R, Updater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMountMergeState")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def useMountMergeState[T, R](defaultStateValue: js.Function0[T], option: DefaultValue[T]): js.Tuple2[R, Updater[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMountMergeState")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, Updater[T]]]
  
  inline def usePrevious[T](state: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def useRefFunction[T /* <: js.Function1[/* args */ Any, Any] */](reFunction: T): js.Function1[/* rest */ Parameters[T], ReturnType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefFunction")(reFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* rest */ Parameters[T], ReturnType[T]]]
  
  inline def useSafeState[T](): js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeState")().asInstanceOf[js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]]]
  inline def useSafeState[T](defaultValue: T): js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeState")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]]]
  inline def useSafeState[T](defaultValue: js.Function0[T]): js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeState")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]]]
  
  inline def useStyle(componentName: String, styleFn: js.Function1[/* token */ ProAliasToken, CSSInterpolation]): UseStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(componentName.asInstanceOf[js.Any], styleFn.asInstanceOf[js.Any])).asInstanceOf[UseStyleResult]
  
  /**
    * 如果 antd 里面没有，就用我 mock 的，这样 antd@4 和 antd@5 可以兼容
    */
  inline def useToken(): HashId = ^.asInstanceOf[js.Dynamic].applyDynamic("useToken")().asInstanceOf[HashId]
}
