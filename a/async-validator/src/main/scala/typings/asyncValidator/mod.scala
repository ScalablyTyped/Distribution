package typings.asyncValidator

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-validator", JSImport.Default)
  @js.native
  class default protected () extends StObject {
    def this(rule: Rules) = this()
    
    /**
      * Validate source
      * @param source The object to validate (required)
      * @param options An object describing processing options for the validation
      * @param callback A callback function to invoke when validation completes
      * @returns Promise
      */
    def validate(source: ValidateSource): js.Promise[Unit] = js.native
    def validate(
      source: ValidateSource,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* errors */ ErrorList, /* fields */ FieldErrorList, Unit]
    ): js.Promise[Unit] = js.native
    def validate(source: ValidateSource, options: ValidateOption): js.Promise[Unit] = js.native
    def validate(
      source: ValidateSource,
      options: ValidateOption,
      callback: js.Function2[/* errors */ ErrorList, /* fields */ FieldErrorList, Unit]
    ): js.Promise[Unit] = js.native
  }
  
  type ErrorList = js.Array[ValidateError]
  
  type FieldErrorList = StringDictionary[js.Array[ValidateError]]
  
  @js.native
  trait RuleItem extends StObject {
    
    var asyncValidator: js.UndefOr[
        js.Function5[
          /* rule */ Rules, 
          /* value */ js.Any, 
          /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], 
          /* source */ ValidateSource, 
          /* options */ ValidateOption, 
          Unit | js.Promise[Unit]
        ]
      ] = js.native
    
    var defaultField: js.UndefOr[RuleItem] = js.native
    
    // Length of type 'string' and 'array'
    var enum: js.UndefOr[js.Array[js.UndefOr[String | Double | Boolean | Null]]] = js.native
    
    var fields: js.UndefOr[Rules] = js.native
    
    // Range of type 'string' and 'array'
    var len: js.UndefOr[Double] = js.native
    
    // Range of type 'string' and 'array'
    var max: js.UndefOr[Double] = js.native
    
    var message: js.UndefOr[String | js.Function0[String]] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    // ignore when without required
    var options: js.UndefOr[ValidateOption] = js.native
    
    var pattern: js.UndefOr[RegExp | String] = js.native
    
    // default type is 'string'
    var required: js.UndefOr[Boolean] = js.native
    
    // 'object' or 'array' containing validation rules
    var transform: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
    
    var `type`: js.UndefOr[RuleType] = js.native
    
    var validator: js.UndefOr[
        js.Function5[
          /* rule */ Rules, 
          /* value */ js.Any, 
          /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], 
          /* source */ ValidateSource, 
          /* options */ ValidateOption, 
          Unit
        ]
      ] = js.native
    
    // possible values of type 'enum'
    var whitespace: js.UndefOr[Boolean] = js.native
  }
  object RuleItem {
    
    @scala.inline
    def apply(): RuleItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleItem]
    }
    
    @scala.inline
    implicit class RuleItemMutableBuilder[Self <: RuleItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncValidator(
        value: (/* rule */ Rules, /* value */ js.Any, /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], /* source */ ValidateSource, /* options */ ValidateOption) => Unit | js.Promise[Unit]
      ): Self = StObject.set(x, "asyncValidator", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAsyncValidatorUndefined: Self = StObject.set(x, "asyncValidator", js.undefined)
      
      @scala.inline
      def setDefaultField(value: RuleItem): Self = StObject.set(x, "defaultField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFieldUndefined: Self = StObject.set(x, "defaultField", js.undefined)
      
      @scala.inline
      def setEnum(value: js.Array[js.UndefOr[String | Double | Boolean | Null]]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: (js.UndefOr[String | Double | Boolean | Null])*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setFields(value: Rules): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMessage(value: String | js.Function0[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFunction0(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOptions(value: ValidateOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPattern(value: RegExp | String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setTransform(value: /* value */ js.Any => _): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValidator(
        value: (/* rule */ Rules, /* value */ js.Any, /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], /* source */ ValidateSource, /* options */ ValidateOption) => Unit
      ): Self = StObject.set(x, "validator", js.Any.fromFunction5(value))
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      @scala.inline
      def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
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
    - typings.asyncValidator.asyncValidatorStrings.enum
    - typings.asyncValidator.asyncValidatorStrings.date
    - typings.asyncValidator.asyncValidatorStrings.url
    - typings.asyncValidator.asyncValidatorStrings.hex
    - typings.asyncValidator.asyncValidatorStrings.email
    - typings.asyncValidator.asyncValidatorStrings.any
  */
  trait RuleType extends StObject
  object RuleType {
    
    @scala.inline
    def any: typings.asyncValidator.asyncValidatorStrings.any = "any".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.any]
    
    @scala.inline
    def array: typings.asyncValidator.asyncValidatorStrings.array = "array".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.array]
    
    @scala.inline
    def boolean: typings.asyncValidator.asyncValidatorStrings.boolean = "boolean".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.boolean]
    
    @scala.inline
    def date: typings.asyncValidator.asyncValidatorStrings.date = "date".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.date]
    
    @scala.inline
    def email: typings.asyncValidator.asyncValidatorStrings.email = "email".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.email]
    
    @scala.inline
    def enum: typings.asyncValidator.asyncValidatorStrings.enum = "enum".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.enum]
    
    @scala.inline
    def float: typings.asyncValidator.asyncValidatorStrings.float = "float".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.float]
    
    @scala.inline
    def hex: typings.asyncValidator.asyncValidatorStrings.hex = "hex".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.hex]
    
    @scala.inline
    def integer: typings.asyncValidator.asyncValidatorStrings.integer = "integer".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.integer]
    
    @scala.inline
    def method: typings.asyncValidator.asyncValidatorStrings.method = "method".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.method]
    
    @scala.inline
    def number: typings.asyncValidator.asyncValidatorStrings.number = "number".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.number]
    
    @scala.inline
    def `object`: typings.asyncValidator.asyncValidatorStrings.`object` = "object".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.`object`]
    
    @scala.inline
    def regexp: typings.asyncValidator.asyncValidatorStrings.regexp = "regexp".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.regexp]
    
    @scala.inline
    def string: typings.asyncValidator.asyncValidatorStrings.string = "string".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.string]
    
    @scala.inline
    def url: typings.asyncValidator.asyncValidatorStrings.url = "url".asInstanceOf[typings.asyncValidator.asyncValidatorStrings.url]
  }
  
  type Rules = StringDictionary[RuleItem | js.Array[RuleItem]]
  
  @js.native
  trait ValidateError extends StObject {
    
    var field: String = js.native
    
    var message: String = js.native
  }
  object ValidateError {
    
    @scala.inline
    def apply(field: String, message: String): ValidateError = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateError]
    }
    
    @scala.inline
    implicit class ValidateErrorMutableBuilder[Self <: ValidateError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidateOption extends StObject {
    
    // when the first validation rule generates an error stop processed
    var first: js.UndefOr[Boolean] = js.native
    
    // when the first validation rule of the specified field generates an error stop the field processed, 'true' means all fields.
    var firstFields: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    // whether to suppress internal warning
    var suppressWarning: js.UndefOr[Boolean] = js.native
  }
  object ValidateOption {
    
    @scala.inline
    def apply(): ValidateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidateOption]
    }
    
    @scala.inline
    implicit class ValidateOptionMutableBuilder[Self <: ValidateOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFields(value: Boolean | js.Array[String]): Self = StObject.set(x, "firstFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFieldsUndefined: Self = StObject.set(x, "firstFields", js.undefined)
      
      @scala.inline
      def setFirstFieldsVarargs(value: String*): Self = StObject.set(x, "firstFields", js.Array(value :_*))
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setSuppressWarning(value: Boolean): Self = StObject.set(x, "suppressWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressWarningUndefined: Self = StObject.set(x, "suppressWarning", js.undefined)
    }
  }
  
  type ValidateSource = StringDictionary[js.Any]
}
