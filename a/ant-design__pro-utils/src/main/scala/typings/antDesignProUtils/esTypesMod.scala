package typings.antDesignProUtils

import typings.antDesignProUtils.anon.Colors
import typings.antDesignProUtils.anon.RowIndex
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
import typings.antDesignProUtils.antDesignProUtilsStrings.fromNow
import typings.antDesignProUtils.antDesignProUtilsStrings.image
import typings.antDesignProUtils.antDesignProUtilsStrings.index
import typings.antDesignProUtils.antDesignProUtilsStrings.indexBorder
import typings.antDesignProUtils.antDesignProUtilsStrings.jsonCode
import typings.antDesignProUtils.antDesignProUtilsStrings.money
import typings.antDesignProUtils.antDesignProUtilsStrings.option
import typings.antDesignProUtils.antDesignProUtilsStrings.password
import typings.antDesignProUtils.antDesignProUtilsStrings.percent
import typings.antDesignProUtils.antDesignProUtilsStrings.progress
import typings.antDesignProUtils.antDesignProUtilsStrings.radio
import typings.antDesignProUtils.antDesignProUtilsStrings.radioButton
import typings.antDesignProUtils.antDesignProUtilsStrings.rate
import typings.antDesignProUtils.antDesignProUtilsStrings.second
import typings.antDesignProUtils.antDesignProUtilsStrings.segmented
import typings.antDesignProUtils.antDesignProUtilsStrings.select
import typings.antDesignProUtils.antDesignProUtilsStrings.slider
import typings.antDesignProUtils.antDesignProUtilsStrings.switch
import typings.antDesignProUtils.antDesignProUtilsStrings.text
import typings.antDesignProUtils.antDesignProUtilsStrings.textarea
import typings.antDesignProUtils.antDesignProUtilsStrings.time
import typings.antDesignProUtils.antDesignProUtilsStrings.timeRange
import typings.antDesignProUtils.antDesignProUtilsStrings.treeSelect
import typings.antDesignProUtils.esTypingMod.ProSchema
import typings.antDesignProUtils.esTypingMod.ProSchemaComponentTypes
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
import typings.rcImage.libImageMod.ImageProps
import typings.rcInputNumber.esUtilsMiniDecimalMod.ValueType
import typings.rcSelect.libSelectMod.DefaultOptionType
import typings.std.Extract
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypesMod {
  
  type FieldPropsTypeBase[Entity, ComponentsType, ExtraProps, FieldPropsType] = (js.Function2[
    /* form */ FormInstance[Any], 
    /* config */ (ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any]) & (RowIndex[ComponentsType, Entity]), 
    FieldPropsType | (Record[String, Any])
  ]) | FieldPropsType | (Record[String, Any])
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Type extends 'progress' | 'money' | 'percent' | 'image' ? {  type :Type,   status :'normal' | 'active' | 'success' | 'exception' | undefined,   locale :string | undefined,   showSymbol :(value : any): boolean | boolean | undefined,   showColor :boolean | undefined,   precision :number | undefined,   moneySymbol :boolean | undefined,   request :@ant-design/pro-utils.@ant-design/pro-utils/es/typing.ProFieldRequestData<any> | undefined,   width :number | undefined} : never
    }}}
    */
  @js.native
  trait ProFieldValueObject[Type] extends StObject
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Type extends any ? Type extends @ant-design/pro-utils.@ant-design/pro-utils/es/types.ProFieldValueType ? never : Type : never
    }}}
    */
  @js.native
  trait UnionSameValueType[Type] extends StObject
  
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
          /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-utils.@ant-design/pro-utils/es/types.ProFieldValueTypeWithFieldProps[@ant-design/pro-utils.@ant-design/pro-utils/es/types.ProFieldValueType] */ js.Any
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
              /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-utils.@ant-design/pro-utils/es/types.ProFieldValueTypeWithFieldProps[@ant-design/pro-utils.@ant-design/pro-utils/es/types.ProFieldValueType] */ js.Any
            ]
      ): Self = StObject.set(x, "fieldProps", value.asInstanceOf[js.Any])
      
      inline def setFieldPropsFunction2(
        value: (/* form */ FormInstance[Any], /* config */ (ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any]) & (RowIndex[ComponentsType, Entity])) => (/* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-utils.@ant-design/pro-utils/es/types.ProFieldValueTypeWithFieldProps[@ant-design/pro-utils.@ant-design/pro-utils/es/types.ProFieldValueType] */ js.Any) | (Record[String, Any])
      ): Self = StObject.set(x, "fieldProps", js.Any.fromFunction2(value))
      
      inline def setFieldPropsUndefined: Self = StObject.set(x, "fieldProps", js.undefined)
      
      inline def setValueType(
        value: Type | ProFieldValueObject[Type] | (js.Function2[/* entity */ Entity, /* type */ ComponentsType, Type | ProFieldValueObject[Type]])
      ): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeFunction2(value: (/* entity */ Entity, /* type */ ComponentsType) => Type | ProFieldValueObject[Type]): Self = StObject.set(x, "valueType", js.Any.fromFunction2(value))
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    }
  }
}
