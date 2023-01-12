package typings.asyncValidator

import typings.asyncValidator.anon.Array
import typings.asyncValidator.anon.Format
import typings.asyncValidator.anon.Len
import typings.asyncValidator.anon.Mismatch
import typings.asyncValidator.anon.PartialValidateMessages
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInterfaceMod {
  
  type EnumString = js.UndefOr[String]
  
  type ExecuteRule = js.Function6[
    /* rule */ InternalRuleItem, 
    /* value */ Value, 
    /* source */ Values, 
    /* errors */ js.Array[String], 
    /* options */ ValidateOption, 
    /* type */ js.UndefOr[String], 
    Unit
  ]
  
  type ExecuteValidator = js.Function5[
    /* rule */ InternalRuleItem, 
    /* value */ Value, 
    /* callback */ js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit], 
    /* source */ Values, 
    /* options */ ValidateOption, 
    Unit
  ]
  
  type FullField = js.UndefOr[String]
  
  /* Inlined parent std.Omit<async-validator.async-validator/dist-types/interface.RuleItem, 'validator'> */
  trait InternalRuleItem extends StObject {
    
    var asyncValidator: js.UndefOr[
        js.Function5[
          /* rule */ this.type, 
          /* value */ Value, 
          /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
          /* source */ Values, 
          /* options */ ValidateOption, 
          Unit | js.Promise[Unit]
        ]
      ] = js.undefined
    
    var defaultField: js.UndefOr[Rule] = js.undefined
    
    var `enum`: js.UndefOr[js.Array[js.UndefOr[String | Double | Boolean | Null]]] = js.undefined
    
    var field: js.UndefOr[String] = js.undefined
    
    var fields: js.UndefOr[Record[String, Rule]] = js.undefined
    
    var fullField: js.UndefOr[String] = js.undefined
    
    var fullFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var len: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String | (js.Function1[/* a */ js.UndefOr[String], String])] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var options: js.UndefOr[ValidateOption] = js.undefined
    
    var pattern: js.UndefOr[js.RegExp | String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* value */ Value, Value]] = js.undefined
    
    var `type`: js.UndefOr[RuleType] = js.undefined
    
    var validator: js.UndefOr[
        (js.Function5[
          /* rule */ InternalRuleItem, 
          /* value */ Value, 
          /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
          /* source */ Values, 
          /* options */ ValidateOption, 
          SyncValidateResult | Unit
        ]) | ExecuteValidator
      ] = js.undefined
    
    var whitespace: js.UndefOr[Boolean] = js.undefined
  }
  object InternalRuleItem {
    
    inline def apply(): InternalRuleItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalRuleItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalRuleItem] (val x: Self) extends AnyVal {
      
      inline def setAsyncValidator(
        value: (InternalRuleItem, /* value */ Value, /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], /* source */ Values, /* options */ ValidateOption) => Unit | js.Promise[Unit]
      ): Self = StObject.set(x, "asyncValidator", js.Any.fromFunction5(value))
      
      inline def setAsyncValidatorUndefined: Self = StObject.set(x, "asyncValidator", js.undefined)
      
      inline def setDefaultField(value: Rule): Self = StObject.set(x, "defaultField", value.asInstanceOf[js.Any])
      
      inline def setDefaultFieldUndefined: Self = StObject.set(x, "defaultField", js.undefined)
      
      inline def setDefaultFieldVarargs(value: RuleItem*): Self = StObject.set(x, "defaultField", js.Array(value*))
      
      inline def setEnum(value: js.Array[js.UndefOr[String | Double | Boolean | Null]]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: (js.UndefOr[String | Double | Boolean | Null])*): Self = StObject.set(x, "enum", js.Array(value*))
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFields(value: Record[String, Rule]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFullField(value: String): Self = StObject.set(x, "fullField", value.asInstanceOf[js.Any])
      
      inline def setFullFieldUndefined: Self = StObject.set(x, "fullField", js.undefined)
      
      inline def setFullFields(value: js.Array[String]): Self = StObject.set(x, "fullFields", value.asInstanceOf[js.Any])
      
      inline def setFullFieldsUndefined: Self = StObject.set(x, "fullFields", js.undefined)
      
      inline def setFullFieldsVarargs(value: String*): Self = StObject.set(x, "fullFields", js.Array(value*))
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMessage(value: String | (js.Function1[/* a */ js.UndefOr[String], String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* a */ js.UndefOr[String] => String): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOptions(value: ValidateOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPattern(value: js.RegExp | String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTransform(value: /* value */ Value => Value): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidator(
        value: (/* rule */ InternalRuleItem, /* value */ Value, /* callback */ js.Function1[js.UndefOr[js.Array[String] | js.Error | String], Unit], /* source */ Values, /* options */ ValidateOption) => SyncValidateResult | Unit
      ): Self = StObject.set(x, "validator", js.Any.fromFunction5(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      inline def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
  
  trait InternalValidateMessages
    extends StObject
       with ValidateMessages
  object InternalValidateMessages {
    
    inline def apply(): InternalValidateMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalValidateMessages]
    }
  }
  
  type Pattern = js.UndefOr[String | js.RegExp]
  
  type Range = js.UndefOr[Double]
  
  type Rule = RuleItem | js.Array[RuleItem]
  
  trait RuleItem extends StObject {
    
    var asyncValidator: js.UndefOr[
        js.Function5[
          /* rule */ InternalRuleItem, 
          /* value */ Value, 
          /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
          /* source */ Values, 
          /* options */ ValidateOption, 
          Unit | js.Promise[Unit]
        ]
      ] = js.undefined
    
    var defaultField: js.UndefOr[Rule] = js.undefined
    
    var `enum`: js.UndefOr[js.Array[js.UndefOr[String | Double | Boolean | Null]]] = js.undefined
    
    var fields: js.UndefOr[Record[String, Rule]] = js.undefined
    
    var len: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String | (js.Function1[/* a */ js.UndefOr[String], String])] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var options: js.UndefOr[ValidateOption] = js.undefined
    
    var pattern: js.UndefOr[js.RegExp | String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* value */ Value, Value]] = js.undefined
    
    var `type`: js.UndefOr[RuleType] = js.undefined
    
    var validator: js.UndefOr[
        js.Function5[
          /* rule */ InternalRuleItem, 
          /* value */ Value, 
          /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
          /* source */ Values, 
          /* options */ ValidateOption, 
          SyncValidateResult | Unit
        ]
      ] = js.undefined
    
    var whitespace: js.UndefOr[Boolean] = js.undefined
  }
  object RuleItem {
    
    inline def apply(): RuleItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleItem] (val x: Self) extends AnyVal {
      
      inline def setAsyncValidator(
        value: (/* rule */ InternalRuleItem, /* value */ Value, /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], /* source */ Values, /* options */ ValidateOption) => Unit | js.Promise[Unit]
      ): Self = StObject.set(x, "asyncValidator", js.Any.fromFunction5(value))
      
      inline def setAsyncValidatorUndefined: Self = StObject.set(x, "asyncValidator", js.undefined)
      
      inline def setDefaultField(value: Rule): Self = StObject.set(x, "defaultField", value.asInstanceOf[js.Any])
      
      inline def setDefaultFieldUndefined: Self = StObject.set(x, "defaultField", js.undefined)
      
      inline def setDefaultFieldVarargs(value: RuleItem*): Self = StObject.set(x, "defaultField", js.Array(value*))
      
      inline def setEnum(value: js.Array[js.UndefOr[String | Double | Boolean | Null]]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: (js.UndefOr[String | Double | Boolean | Null])*): Self = StObject.set(x, "enum", js.Array(value*))
      
      inline def setFields(value: Record[String, Rule]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMessage(value: String | (js.Function1[/* a */ js.UndefOr[String], String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* a */ js.UndefOr[String] => String): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOptions(value: ValidateOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPattern(value: js.RegExp | String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTransform(value: /* value */ Value => Value): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidator(
        value: (/* rule */ InternalRuleItem, /* value */ Value, /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], /* source */ Values, /* options */ ValidateOption) => SyncValidateResult | Unit
      ): Self = StObject.set(x, "validator", js.Any.fromFunction5(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      inline def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.asyncValidator.asyncValidatorStrings.string
    - typings.asyncValidator.asyncValidatorStrings.number
    - typings.asyncValidator.asyncValidatorStrings.boolean
    - typings.asyncValidator.asyncValidatorStrings.method
    - typings.asyncValidator.asyncValidatorStrings.regexp
    - typings.asyncValidator.asyncValidatorStrings.integer
    - typings.asyncValidator.asyncValidatorStrings.float
    - typings.asyncValidator.asyncValidatorStrings.array
    - typings.asyncValidator.asyncValidatorStrings.`object`
    - typings.asyncValidator.asyncValidatorStrings.`enum`
    - typings.asyncValidator.asyncValidatorStrings.date
    - typings.asyncValidator.asyncValidatorStrings.url
    - typings.asyncValidator.asyncValidatorStrings.hex
    - typings.asyncValidator.asyncValidatorStrings.email
    - typings.asyncValidator.asyncValidatorStrings.pattern
    - typings.asyncValidator.asyncValidatorStrings.any
  */
  trait RuleType extends StObject
  object RuleType {
    
    inline def any: typings.asyncValidator.asyncValidatorStrings.any = "any".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.any]
    
    inline def array: typings.asyncValidator.asyncValidatorStrings.array = "array".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.array]
    
    inline def boolean: typings.asyncValidator.asyncValidatorStrings.boolean = "boolean".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.boolean]
    
    inline def date: typings.asyncValidator.asyncValidatorStrings.date = "date".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.date]
    
    inline def email: typings.asyncValidator.asyncValidatorStrings.email = "email".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.email]
    
    inline def `enum`: typings.asyncValidator.asyncValidatorStrings.`enum` = "enum".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.`enum`]
    
    inline def float: typings.asyncValidator.asyncValidatorStrings.float = "float".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.float]
    
    inline def hex: typings.asyncValidator.asyncValidatorStrings.hex = "hex".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.hex]
    
    inline def integer: typings.asyncValidator.asyncValidatorStrings.integer = "integer".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.integer]
    
    inline def method: typings.asyncValidator.asyncValidatorStrings.method = "method".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.method]
    
    inline def number: typings.asyncValidator.asyncValidatorStrings.number = "number".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.number]
    
    inline def `object`: typings.asyncValidator.asyncValidatorStrings.`object` = "object".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.`object`]
    
    inline def pattern: typings.asyncValidator.asyncValidatorStrings.pattern = "pattern".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.pattern]
    
    inline def regexp: typings.asyncValidator.asyncValidatorStrings.regexp = "regexp".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.regexp]
    
    inline def string: typings.asyncValidator.asyncValidatorStrings.string = "string".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.string]
    
    inline def url: typings.asyncValidator.asyncValidatorStrings.url = "url".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.url]
  }
  
  trait RuleValuePackage extends StObject {
    
    var field: String
    
    var rule: InternalRuleItem
    
    var source: Values
    
    var value: Value
  }
  object RuleValuePackage {
    
    inline def apply(field: String, rule: InternalRuleItem, source: Values, value: Value): RuleValuePackage = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleValuePackage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleValuePackage] (val x: Self) extends AnyVal {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setRule(value: InternalRuleItem): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Values): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Rules = Record[String, Rule]
  
  type SyncErrorType = js.Error | String
  
  type SyncValidateResult = Boolean | SyncErrorType | js.Array[SyncErrorType]
  
  type Type = js.UndefOr[String]
  
  type ValidateCallback = js.Function2[
    /* errors */ js.Array[ValidateError] | Null, 
    /* fields */ ValidateFieldsError | Values, 
    Unit
  ]
  
  trait ValidateError extends StObject {
    
    var field: js.UndefOr[String] = js.undefined
    
    var fieldValue: js.UndefOr[Value] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object ValidateError {
    
    inline def apply(): ValidateError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidateError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidateError] (val x: Self) extends AnyVal {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFieldValue(value: Value): Self = StObject.set(x, "fieldValue", value.asInstanceOf[js.Any])
      
      inline def setFieldValueUndefined: Self = StObject.set(x, "fieldValue", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  type ValidateFieldsError = Record[String, js.Array[ValidateError]]
  
  type ValidateMessage[T /* <: js.Array[Any] */] = String | (js.Function1[/* args */ T, String])
  
  trait ValidateMessages extends StObject {
    
    var default: js.UndefOr[ValidateMessage[js.Array[Any]]] = js.undefined
    
    var array: js.UndefOr[Len] = js.undefined
    
    var date: js.UndefOr[Format] = js.undefined
    
    var `enum`: js.UndefOr[ValidateMessage[js.Tuple2[FullField, EnumString]]] = js.undefined
    
    var number: js.UndefOr[Len] = js.undefined
    
    var pattern: js.UndefOr[Mismatch] = js.undefined
    
    var required: js.UndefOr[ValidateMessage[js.Array[FullField]]] = js.undefined
    
    var string: js.UndefOr[Len] = js.undefined
    
    var types: js.UndefOr[Array] = js.undefined
    
    var whitespace: js.UndefOr[ValidateMessage[js.Array[FullField]]] = js.undefined
  }
  object ValidateMessages {
    
    inline def apply(): ValidateMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidateMessages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidateMessages] (val x: Self) extends AnyVal {
      
      inline def setArray(value: Len): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      inline def setDate(value: Format): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDefault(value: ValidateMessage[js.Array[Any]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultFunction1(value: js.Array[Any] => String): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEnum(value: ValidateMessage[js.Tuple2[FullField, EnumString]]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumFunction1(value: js.Tuple2[FullField, EnumString] => String): Self = StObject.set(x, "enum", js.Any.fromFunction1(value))
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setNumber(value: Len): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setPattern(value: Mismatch): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRequired(value: ValidateMessage[js.Array[FullField]]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredFunction1(value: js.Array[FullField] => String): Self = StObject.set(x, "required", js.Any.fromFunction1(value))
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setString(value: Len): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setTypes(value: Array): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setWhitespace(value: ValidateMessage[js.Array[FullField]]): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      inline def setWhitespaceFunction1(value: js.Array[FullField] => String): Self = StObject.set(x, "whitespace", js.Any.fromFunction1(value))
      
      inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
  
  trait ValidateOption extends StObject {
    
    var error: js.UndefOr[js.Function2[/* rule */ InternalRuleItem, /* message */ String, ValidateError]] = js.undefined
    
    var first: js.UndefOr[Boolean] = js.undefined
    
    var firstFields: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /** The name of rules need to be trigger. Will validate all rules if leave empty */
    var keys: js.UndefOr[js.Array[String]] = js.undefined
    
    var messages: js.UndefOr[PartialValidateMessages] = js.undefined
    
    var suppressValidatorError: js.UndefOr[Boolean] = js.undefined
    
    var suppressWarning: js.UndefOr[Boolean] = js.undefined
  }
  object ValidateOption {
    
    inline def apply(): ValidateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidateOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidateOption] (val x: Self) extends AnyVal {
      
      inline def setError(value: (/* rule */ InternalRuleItem, /* message */ String) => ValidateError): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstFields(value: Boolean | js.Array[String]): Self = StObject.set(x, "firstFields", value.asInstanceOf[js.Any])
      
      inline def setFirstFieldsUndefined: Self = StObject.set(x, "firstFields", js.undefined)
      
      inline def setFirstFieldsVarargs(value: String*): Self = StObject.set(x, "firstFields", js.Array(value*))
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setMessages(value: PartialValidateMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setSuppressValidatorError(value: Boolean): Self = StObject.set(x, "suppressValidatorError", value.asInstanceOf[js.Any])
      
      inline def setSuppressValidatorErrorUndefined: Self = StObject.set(x, "suppressValidatorError", js.undefined)
      
      inline def setSuppressWarning(value: Boolean): Self = StObject.set(x, "suppressWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressWarningUndefined: Self = StObject.set(x, "suppressWarning", js.undefined)
    }
  }
  
  type ValidateResult = Unit | js.Promise[Unit] | SyncValidateResult
  
  type Value = Any
  
  type Values = Record[String, Value]
}
