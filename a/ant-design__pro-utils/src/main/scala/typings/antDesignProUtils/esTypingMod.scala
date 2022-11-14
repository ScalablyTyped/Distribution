package typings.antDesignProUtils

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProUtils.anon.ClearSelected
import typings.antDesignProUtils.anon.Colors
import typings.antDesignProUtils.anon.DataIndex
import typings.antDesignProUtils.anon.OmitRequestOptionsTypechi
import typings.antDesignProUtils.anon.PartialInputProps
import typings.antDesignProUtils.anon.RowIndex
import typings.antDesignProUtils.antDesignProUtilsStrings.actionRender
import typings.antDesignProUtils.antDesignProUtilsStrings.active
import typings.antDesignProUtils.antDesignProUtilsStrings.avatar
import typings.antDesignProUtils.antDesignProUtilsStrings.cascader
import typings.antDesignProUtils.antDesignProUtilsStrings.checkbox
import typings.antDesignProUtils.antDesignProUtilsStrings.code
import typings.antDesignProUtils.antDesignProUtilsStrings.color
import typings.antDesignProUtils.antDesignProUtilsStrings.date
import typings.antDesignProUtils.antDesignProUtilsStrings.dateMonth
import typings.antDesignProUtils.antDesignProUtilsStrings.dateQuarter
import typings.antDesignProUtils.antDesignProUtilsStrings.dateRange
import typings.antDesignProUtils.antDesignProUtilsStrings.dateTime
import typings.antDesignProUtils.antDesignProUtilsStrings.dateTimeRange
import typings.antDesignProUtils.antDesignProUtilsStrings.dateWeek
import typings.antDesignProUtils.antDesignProUtilsStrings.dateYear
import typings.antDesignProUtils.antDesignProUtilsStrings.digit
import typings.antDesignProUtils.antDesignProUtilsStrings.digitRange
import typings.antDesignProUtils.antDesignProUtilsStrings.edit
import typings.antDesignProUtils.antDesignProUtilsStrings.editableKeys
import typings.antDesignProUtils.antDesignProUtilsStrings.exception
import typings.antDesignProUtils.antDesignProUtilsStrings.fromNow
import typings.antDesignProUtils.antDesignProUtilsStrings.image
import typings.antDesignProUtils.antDesignProUtilsStrings.index
import typings.antDesignProUtils.antDesignProUtilsStrings.indexBorder
import typings.antDesignProUtils.antDesignProUtilsStrings.jsonCode
import typings.antDesignProUtils.antDesignProUtilsStrings.money
import typings.antDesignProUtils.antDesignProUtilsStrings.newLineRecord
import typings.antDesignProUtils.antDesignProUtilsStrings.normal
import typings.antDesignProUtils.antDesignProUtilsStrings.optGroup
import typings.antDesignProUtils.antDesignProUtilsStrings.option
import typings.antDesignProUtils.antDesignProUtilsStrings.password
import typings.antDesignProUtils.antDesignProUtilsStrings.percent
import typings.antDesignProUtils.antDesignProUtilsStrings.progress
import typings.antDesignProUtils.antDesignProUtilsStrings.radio
import typings.antDesignProUtils.antDesignProUtilsStrings.radioButton
import typings.antDesignProUtils.antDesignProUtilsStrings.rate
import typings.antDesignProUtils.antDesignProUtilsStrings.read
import typings.antDesignProUtils.antDesignProUtilsStrings.second
import typings.antDesignProUtils.antDesignProUtilsStrings.segmented
import typings.antDesignProUtils.antDesignProUtilsStrings.select
import typings.antDesignProUtils.antDesignProUtilsStrings.setEditableRowKeys
import typings.antDesignProUtils.antDesignProUtilsStrings.slider
import typings.antDesignProUtils.antDesignProUtilsStrings.success
import typings.antDesignProUtils.antDesignProUtilsStrings.switch
import typings.antDesignProUtils.antDesignProUtilsStrings.text
import typings.antDesignProUtils.antDesignProUtilsStrings.textarea
import typings.antDesignProUtils.antDesignProUtilsStrings.time
import typings.antDesignProUtils.antDesignProUtilsStrings.timeRange
import typings.antDesignProUtils.antDesignProUtilsStrings.treeSelect
import typings.antDesignProUtils.esUseEditableArrayMod.UseEditableUtilType
import typings.antd.libAvatarAvatarMod.AvatarProps
import typings.antd.libCascaderMod.CascaderProps
import typings.antd.libCheckboxCheckboxMod.CheckboxProps
import typings.antd.libDatePickerMod.DatePickerProps
import typings.antd.libDatePickerMod.RangePickerProps
import typings.antd.libFormHooksUseFormMod.FormInstance
import typings.antd.libInputInputMod.InputProps
import typings.antd.libInputNumberMod.InputNumberProps
import typings.antd.libInputPasswordMod.PasswordProps
import typings.antd.libInputTextAreaMod.TextAreaProps
import typings.antd.libProgressProgressMod.ProgressProps
import typings.antd.libRadioInterfaceMod.RadioProps
import typings.antd.libRateMod.RateProps
import typings.antd.libSegmentedMod.SegmentedProps
import typings.antd.libSelectMod.SelectProps
import typings.antd.libSliderMod.SliderRangeProps
import typings.antd.libSliderMod.SliderSingleProps
import typings.antd.libSwitchMod.SwitchProps
import typings.antd.libTimePickerMod.TimeRangePickerProps
import typings.antd.libTreeSelectMod.TreeSelectProps
import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.rcImage.libImageMod.ImageProps
import typings.rcInputNumber.esUtilsMiniDecimalMod.ValueType
import typings.rcSelect.libSelectMod.DefaultOptionType
import typings.react.mod.ReactNode
import typings.react.mod.ReactText
import typings.std.Extract
import typings.std.Map
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypingMod {
  
  type FieldPropsTypeBase[Entity, ComponentsType, ExtraProps, FieldPropsType] = (js.Function2[
    /* form */ FormInstance[Any], 
    /* config */ (ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any]) & (RowIndex[ComponentsType, Entity]), 
    FieldPropsType | (Record[String, Any])
  ]) | FieldPropsType | (Record[String, Any])
  
  trait PageInfo extends StObject {
    
    var current: Double
    
    var pageSize: Double
    
    var total: Double
  }
  object PageInfo {
    
    inline def apply(current: Double, pageSize: Double, total: Double): PageInfo = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInfo]
    }
    
    extension [Self <: PageInfo](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type ProCoreActionType[T] = ClearSelected & (Omit[
    UseEditableUtilType, 
    newLineRecord | editableKeys | actionRender | setEditableRowKeys
  ]) & T
  
  trait ProFieldProps extends StObject {
    
    var emptyText: js.UndefOr[ReactNode] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[read | edit] = js.undefined
    
    /** 这个属性可以设置useSwr的key */
    var proFieldKey: js.UndefOr[String] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var render: js.UndefOr[Any] = js.undefined
  }
  object ProFieldProps {
    
    inline def apply(): ProFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProFieldProps]
    }
    
    extension [Self <: ProFieldProps](x: Self) {
      
      inline def setEmptyText(value: ReactNode): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setMode(value: read | edit): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setProFieldKey(value: String): Self = StObject.set(x, "proFieldKey", value.asInstanceOf[js.Any])
      
      inline def setProFieldKeyUndefined: Self = StObject.set(x, "proFieldKey", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRender(value: Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  type ProFieldRequestData[U] = js.Function2[/* params */ U, /* props */ Any, js.Promise[js.Array[RequestOptionsType]]]
  
  type ProFieldTextType = ReactNode | (js.Array[ReactNode | (Record[String, Any])]) | (Record[String, Any])
  
  type ProFieldValueEnumType = ProSchemaValueEnumMap | ProSchemaValueEnumObj
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Type extends 'progress' | 'money' | 'percent' | 'image' ? {  type :Type,   status :'normal' | 'active' | 'success' | 'exception' | undefined,   locale :string | undefined,   showSymbol :(value : any): boolean | boolean | undefined,   showColor :boolean | undefined,   precision :number | undefined,   moneySymbol :boolean | undefined,   request :@ant-design/pro-utils.@ant-design/pro-utils/es/typing.ProFieldRequestData<any> | undefined,   width :number | undefined} : never
    }}}
    */
  @js.native
  trait ProFieldValueObject[Type] extends StObject
  
  trait ProFieldValueObjectType extends StObject {
    
    var locale: js.UndefOr[String] = js.undefined
    
    var moneySymbol: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var request: js.UndefOr[ProFieldRequestData[Any]] = js.undefined
    
    var showColor: js.UndefOr[Boolean] = js.undefined
    
    /** Percent */
    var showSymbol: js.UndefOr[(js.Function1[/* value */ Any, Boolean]) | Boolean] = js.undefined
    
    var status: js.UndefOr[normal | active | success | exception] = js.undefined
    
    var `type`: progress | money | percent | image
    
    /** Image */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ProFieldValueObjectType {
    
    inline def apply(`type`: progress | money | percent | image): ProFieldValueObjectType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProFieldValueObjectType]
    }
    
    extension [Self <: ProFieldValueObjectType](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMoneySymbol(value: Boolean): Self = StObject.set(x, "moneySymbol", value.asInstanceOf[js.Any])
      
      inline def setMoneySymbolUndefined: Self = StObject.set(x, "moneySymbol", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRequest(value: (Any, /* props */ Any) => js.Promise[js.Array[RequestOptionsType]]): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setShowColor(value: Boolean): Self = StObject.set(x, "showColor", value.asInstanceOf[js.Any])
      
      inline def setShowColorUndefined: Self = StObject.set(x, "showColor", js.undefined)
      
      inline def setShowSymbol(value: (js.Function1[/* value */ Any, Boolean]) | Boolean): Self = StObject.set(x, "showSymbol", value.asInstanceOf[js.Any])
      
      inline def setShowSymbolFunction1(value: /* value */ Any => Boolean): Self = StObject.set(x, "showSymbol", js.Any.fromFunction1(value))
      
      inline def setShowSymbolUndefined: Self = StObject.set(x, "showSymbol", js.undefined)
      
      inline def setStatus(value: normal | active | success | exception): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: progress | money | percent | image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ProFieldValueType = Extract[
    text | password | money | index | indexBorder | option | textarea | date | dateWeek | dateMonth | dateQuarter | dateYear | dateTime | fromNow | dateRange | dateTimeRange | time | timeRange | select | checkbox | rate | slider | radio | radioButton | progress | percent | digit | digitRange | second | code | jsonCode | avatar | switch | image | cascader | treeSelect | color | segmented, 
    Any
  ]
  
  trait ProFieldValueTypeWithFieldProps extends StObject {
    
    var avatar: AvatarProps
    
    var cascader: CascaderProps[Any]
    
    var checkbox: CheckboxProps
    
    var code: InputProps | TextAreaProps
    
    var color: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SketchPickerProps */ Any) & Colors
    
    var date: DatePickerProps
    
    var dateMonth: DatePickerProps
    
    var dateQuarter: DatePickerProps
    
    var dateRange: RangePickerProps
    
    var dateTime: DatePickerProps
    
    var dateTimeRange: RangePickerProps
    
    var dateWeek: DatePickerProps
    
    var dateYear: DatePickerProps
    
    var digit: InputNumberProps[ValueType]
    
    var digitRange: InputNumberProps[ValueType]
    
    var fromNow: DatePickerProps
    
    var image: ImageProps | InputProps
    
    var index: Record[String, Any]
    
    var indexBorder: Record[String, Any]
    
    var jsonCode: InputProps | TextAreaProps
    
    var money: Record[String, Any]
    
    var option: Record[String, Any]
    
    var password: PasswordProps
    
    var percent: InputNumberProps[ValueType]
    
    var progress: ProgressProps
    
    var radio: RadioProps
    
    var radioButton: RadioProps
    
    var rate: RateProps
    
    var second: InputNumberProps[ValueType]
    
    var segmented: SegmentedProps
    
    var select: SelectProps[Any, DefaultOptionType]
    
    var slider: SliderSingleProps | SliderRangeProps
    
    var switch: SwitchProps
    
    var text: InputProps
    
    var textarea: TextAreaProps
    
    var time: TimeRangePickerProps
    
    var timeRange: TimeRangePickerProps
    
    var treeSelect: TreeSelectProps[Any, typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType]
  }
  object ProFieldValueTypeWithFieldProps {
    
    inline def apply(
      avatar: AvatarProps,
      cascader: CascaderProps[Any],
      checkbox: CheckboxProps,
      code: InputProps | TextAreaProps,
      color: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SketchPickerProps */ Any) & Colors,
      date: DatePickerProps,
      dateMonth: DatePickerProps,
      dateQuarter: DatePickerProps,
      dateRange: RangePickerProps,
      dateTime: DatePickerProps,
      dateTimeRange: RangePickerProps,
      dateWeek: DatePickerProps,
      dateYear: DatePickerProps,
      digit: InputNumberProps[ValueType],
      digitRange: InputNumberProps[ValueType],
      fromNow: DatePickerProps,
      image: ImageProps | InputProps,
      index: Record[String, Any],
      indexBorder: Record[String, Any],
      jsonCode: InputProps | TextAreaProps,
      money: Record[String, Any],
      option: Record[String, Any],
      password: PasswordProps,
      percent: InputNumberProps[ValueType],
      progress: ProgressProps,
      radio: RadioProps,
      radioButton: RadioProps,
      rate: RateProps,
      second: InputNumberProps[ValueType],
      segmented: SegmentedProps,
      select: SelectProps[Any, DefaultOptionType],
      slider: SliderSingleProps | SliderRangeProps,
      switch: SwitchProps,
      text: InputProps,
      textarea: TextAreaProps,
      time: TimeRangePickerProps,
      timeRange: TimeRangePickerProps,
      treeSelect: TreeSelectProps[Any, typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType]
    ): ProFieldValueTypeWithFieldProps = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], cascader = cascader.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dateMonth = dateMonth.asInstanceOf[js.Any], dateQuarter = dateQuarter.asInstanceOf[js.Any], dateRange = dateRange.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], dateTimeRange = dateTimeRange.asInstanceOf[js.Any], dateWeek = dateWeek.asInstanceOf[js.Any], dateYear = dateYear.asInstanceOf[js.Any], digit = digit.asInstanceOf[js.Any], digitRange = digitRange.asInstanceOf[js.Any], fromNow = fromNow.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexBorder = indexBorder.asInstanceOf[js.Any], jsonCode = jsonCode.asInstanceOf[js.Any], money = money.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], radioButton = radioButton.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], segmented = segmented.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeRange = timeRange.asInstanceOf[js.Any], treeSelect = treeSelect.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProFieldValueTypeWithFieldProps]
    }
    
    extension [Self <: ProFieldValueTypeWithFieldProps](x: Self) {
      
      inline def setAvatar(value: AvatarProps): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setCascader(value: CascaderProps[Any]): Self = StObject.set(x, "cascader", value.asInstanceOf[js.Any])
      
      inline def setCheckbox(value: CheckboxProps): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setCode(value: InputProps | TextAreaProps): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setColor(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SketchPickerProps */ Any) & Colors
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDate(value: DatePickerProps): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateMonth(value: DatePickerProps): Self = StObject.set(x, "dateMonth", value.asInstanceOf[js.Any])
      
      inline def setDateQuarter(value: DatePickerProps): Self = StObject.set(x, "dateQuarter", value.asInstanceOf[js.Any])
      
      inline def setDateRange(value: RangePickerProps): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
      
      inline def setDateTime(value: DatePickerProps): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      inline def setDateTimeRange(value: RangePickerProps): Self = StObject.set(x, "dateTimeRange", value.asInstanceOf[js.Any])
      
      inline def setDateWeek(value: DatePickerProps): Self = StObject.set(x, "dateWeek", value.asInstanceOf[js.Any])
      
      inline def setDateYear(value: DatePickerProps): Self = StObject.set(x, "dateYear", value.asInstanceOf[js.Any])
      
      inline def setDigit(value: InputNumberProps[ValueType]): Self = StObject.set(x, "digit", value.asInstanceOf[js.Any])
      
      inline def setDigitRange(value: InputNumberProps[ValueType]): Self = StObject.set(x, "digitRange", value.asInstanceOf[js.Any])
      
      inline def setFromNow(value: DatePickerProps): Self = StObject.set(x, "fromNow", value.asInstanceOf[js.Any])
      
      inline def setImage(value: ImageProps | InputProps): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Record[String, Any]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexBorder(value: Record[String, Any]): Self = StObject.set(x, "indexBorder", value.asInstanceOf[js.Any])
      
      inline def setJsonCode(value: InputProps | TextAreaProps): Self = StObject.set(x, "jsonCode", value.asInstanceOf[js.Any])
      
      inline def setMoney(value: Record[String, Any]): Self = StObject.set(x, "money", value.asInstanceOf[js.Any])
      
      inline def setOption(value: Record[String, Any]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: PasswordProps): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: InputNumberProps[ValueType]): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: ProgressProps): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setRadio(value: RadioProps): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRadioButton(value: RadioProps): Self = StObject.set(x, "radioButton", value.asInstanceOf[js.Any])
      
      inline def setRate(value: RateProps): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: InputNumberProps[ValueType]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSegmented(value: SegmentedProps): Self = StObject.set(x, "segmented", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: SelectProps[Any, DefaultOptionType]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSlider(value: SliderSingleProps | SliderRangeProps): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSwitch(value: SwitchProps): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
      
      inline def setText(value: InputProps): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextarea(value: TextAreaProps): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      inline def setTime(value: TimeRangePickerProps): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeRange(value: TimeRangePickerProps): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
      
      inline def setTreeSelect(value: TreeSelectProps[Any, typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType]): Self = StObject.set(x, "treeSelect", value.asInstanceOf[js.Any])
    }
  }
  
  type ProSchema[Entity, ExtraProps, ComponentsType, ValueType, ExtraFormItemProps] = (DataIndex[Entity, ExtraProps, ComponentsType, ExtraFormItemProps, ValueType]) & ExtraProps & (ValueTypeWithFieldProps[Entity, ComponentsType, ExtraProps, ValueType])
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignProUtils.antDesignProUtilsStrings.form
    - typings.antDesignProUtils.antDesignProUtilsStrings.list
    - typings.antDesignProUtils.antDesignProUtilsStrings.descriptions
    - typings.antDesignProUtils.antDesignProUtilsStrings.table
    - typings.antDesignProUtils.antDesignProUtilsStrings.cardList
    - scala.Unit
  */
  type ProSchemaComponentTypes = js.UndefOr[_ProSchemaComponentTypes]
  
  type ProSchemaFieldProps[T] = (Record[String, Any]) | T | PartialInputProps
  
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
  
  type ProSchemaValueType[ValueType] = ValueType | ProFieldValueType | ProFieldValueObjectType
  
  type ProTableEditableFnType[T] = js.Function3[/* value */ Any, /* record */ T, /* index */ Double, Boolean]
  
  trait RequestOptionsType
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    /** 渲染的节点类型 */
    var optionType: js.UndefOr[optGroup | option] = js.undefined
    
    var options: js.UndefOr[js.Array[OmitRequestOptionsTypechi]] = js.undefined
    
    var value: js.UndefOr[ReactText] = js.undefined
  }
  object RequestOptionsType {
    
    inline def apply(): RequestOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptionsType]
    }
    
    extension [Self <: RequestOptionsType](x: Self) {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOptionType(value: optGroup | option): Self = StObject.set(x, "optionType", value.asInstanceOf[js.Any])
      
      inline def setOptionTypeUndefined: Self = StObject.set(x, "optionType", js.undefined)
      
      inline def setOptions(value: js.Array[OmitRequestOptionsTypechi]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: OmitRequestOptionsTypechi*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setValue(value: ReactText): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type SearchConvertKeyFn = js.Function2[/* value */ Any, /* field */ NamePath, String | (Record[String, Any])]
  
  type SearchTransformKeyFn = js.Function3[
    /* value */ Any, 
    /* namePath */ String, 
    /* allValues */ Any, 
    String | (Record[String, Any])
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Type extends any ? Type extends @ant-design/pro-utils.@ant-design/pro-utils/es/typing.ProFieldValueType ? never : Type : never
    }}}
    */
  type UnionSameValueType[Type] = Type
  
  type ValueTypeWithFieldProps[Entity, ComponentsType, ExtraProps, ValueType] = ValueTypeWithFieldPropsBase[
    Entity, 
    ComponentsType, 
    ExtraProps, 
    js.UndefOr[ProFieldValueType | UnionSameValueType[ValueType]]
  ]
  
  trait ValueTypeWithFieldPropsBase[Entity, ComponentsType, ExtraProps, Type] extends StObject {
    
    var fieldProps: js.UndefOr[
        FieldPropsTypeBase[
          Entity, 
          ComponentsType, 
          ExtraProps, 
          /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-utils.@ant-design/pro-utils/es/typing.ProFieldValueTypeWithFieldProps[@ant-design/pro-utils.@ant-design/pro-utils/es/typing.ProFieldValueType] */ js.Any
        ]
      ] = js.undefined
    
    var valueType: js.UndefOr[
        Type | ProFieldValueObject[Type] | (js.Function2[/* entity */ Entity, /* type */ ComponentsType, Type | ProFieldValueObject[Type]])
      ] = js.undefined
  }
  object ValueTypeWithFieldPropsBase {
    
    inline def apply[Entity, ComponentsType, ExtraProps, Type](): ValueTypeWithFieldPropsBase[Entity, ComponentsType, ExtraProps, Type] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueTypeWithFieldPropsBase[Entity, ComponentsType, ExtraProps, Type]]
    }
    
    extension [Self <: ValueTypeWithFieldPropsBase[?, ?, ?, ?], Entity, ComponentsType, ExtraProps, Type](x: Self & (ValueTypeWithFieldPropsBase[Entity, ComponentsType, ExtraProps, Type])) {
      
      inline def setFieldProps(
        value: FieldPropsTypeBase[
              Entity, 
              ComponentsType, 
              ExtraProps, 
              /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-utils.@ant-design/pro-utils/es/typing.ProFieldValueTypeWithFieldProps[@ant-design/pro-utils.@ant-design/pro-utils/es/typing.ProFieldValueType] */ js.Any
            ]
      ): Self = StObject.set(x, "fieldProps", value.asInstanceOf[js.Any])
      
      inline def setFieldPropsFunction2(
        value: (/* form */ FormInstance[Any], /* config */ (ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any]) & (RowIndex[ComponentsType, Entity])) => (/* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-utils.@ant-design/pro-utils/es/typing.ProFieldValueTypeWithFieldProps[@ant-design/pro-utils.@ant-design/pro-utils/es/typing.ProFieldValueType] */ js.Any) | (Record[String, Any])
      ): Self = StObject.set(x, "fieldProps", js.Any.fromFunction2(value))
      
      inline def setFieldPropsUndefined: Self = StObject.set(x, "fieldProps", js.undefined)
      
      inline def setValueType(
        value: Type | ProFieldValueObject[Type] | (js.Function2[/* entity */ Entity, /* type */ ComponentsType, Type | ProFieldValueObject[Type]])
      ): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeFunction2(value: (/* entity */ Entity, /* type */ ComponentsType) => Type | ProFieldValueObject[Type]): Self = StObject.set(x, "valueType", js.Any.fromFunction2(value))
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    }
  }
  
  trait _ProSchemaComponentTypes extends StObject
}
