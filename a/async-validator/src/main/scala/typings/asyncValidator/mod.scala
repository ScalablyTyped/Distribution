package typings.asyncValidator

import typings.asyncValidator.distTypesInterfaceMod.ExecuteValidator
import typings.asyncValidator.distTypesInterfaceMod.InternalRuleItem
import typings.asyncValidator.distTypesInterfaceMod.InternalValidateMessages
import typings.asyncValidator.distTypesInterfaceMod.RuleItem
import typings.asyncValidator.distTypesInterfaceMod.RuleType
import typings.asyncValidator.distTypesInterfaceMod.Rules
import typings.asyncValidator.distTypesInterfaceMod.SyncErrorType
import typings.asyncValidator.distTypesInterfaceMod.SyncValidateResult
import typings.asyncValidator.distTypesInterfaceMod.ValidateCallback
import typings.asyncValidator.distTypesInterfaceMod.ValidateMessages
import typings.asyncValidator.distTypesInterfaceMod.ValidateOption
import typings.asyncValidator.distTypesInterfaceMod.Value
import typings.asyncValidator.distTypesInterfaceMod.Values
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *  Encapsulates a validation schema.
    *
    *  @param descriptor An object declaring validation rules
    *  for this schema.
    */
  @JSImport("async-validator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Schema {
    def this(descriptor: Rules) = this()
  }
  object default {
    
    @JSImport("async-validator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("async-validator", "default.messages")
    @js.native
    def messages: InternalValidateMessages = js.native
    inline def messages_=(x: InternalValidateMessages): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("async-validator", "default.register")
    @js.native
    def register: js.Function2[/* type */ String, /* validator */ Any, Unit] = js.native
    inline def register_=(x: js.Function2[/* type */ String, /* validator */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
    
    /* static member */
    object validators {
      
      @JSImport("async-validator", "default.validators")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("async-validator", "default.validators.any")
      @js.native
      def any: ExecuteValidator = js.native
      inline def any(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def any_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.array")
      @js.native
      def array: ExecuteValidator = js.native
      inline def array(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def array_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.boolean")
      @js.native
      def boolean: ExecuteValidator = js.native
      inline def boolean(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def boolean_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.date")
      @js.native
      def date: ExecuteValidator = js.native
      inline def date(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def date_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.email")
      @js.native
      def email: ExecuteValidator = js.native
      inline def email(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("email")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def email_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("email")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.enum")
      @js.native
      val `enum`: ExecuteValidator = js.native
      inline def `enum`(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enum")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("async-validator", "default.validators.float")
      @js.native
      def float: ExecuteValidator = js.native
      inline def float(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def float_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.hex")
      @js.native
      def hex: ExecuteValidator = js.native
      inline def hex(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hex")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def hex_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hex")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.integer")
      @js.native
      def integer: ExecuteValidator = js.native
      inline def integer(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("integer")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def integer_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.method")
      @js.native
      def method: ExecuteValidator = js.native
      inline def method(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("method")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def method_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("method")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.number")
      @js.native
      def number: ExecuteValidator = js.native
      inline def number(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def number_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.object")
      @js.native
      val `object`: ExecuteValidator = js.native
      inline def `object`(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("async-validator", "default.validators.pattern")
      @js.native
      def pattern: ExecuteValidator = js.native
      inline def pattern(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def pattern_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pattern")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.regexp")
      @js.native
      def regexp: ExecuteValidator = js.native
      inline def regexp(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def regexp_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.required")
      @js.native
      def required: ExecuteValidator = js.native
      inline def required(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("required")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def required_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.string")
      @js.native
      def string: ExecuteValidator = js.native
      inline def string(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("string")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def string_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
      
      @JSImport("async-validator", "default.validators.url")
      @js.native
      def url: ExecuteValidator = js.native
      inline def url(
        rule: InternalRuleItem,
        value: Value,
        callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
        source: Values,
        options: ValidateOption
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def url_=(x: ExecuteValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("async-validator", "default.warning")
    @js.native
    def warning: js.Function2[/* type */ String, /* errors */ js.Array[SyncErrorType], Unit] = js.native
    inline def warning_=(x: js.Function2[/* type */ String, /* errors */ js.Array[SyncErrorType], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  /**
    *  Encapsulates a validation schema.
    *
    *  @param descriptor An object declaring validation rules
    *  for this schema.
    */
  @js.native
  trait Schema extends StObject {
    
    var _messages: InternalValidateMessages = js.native
    
    def define(rules: Rules): Unit = js.native
    
    def getType(rule: InternalRuleItem): RuleType = js.native
    
    def getValidationMethod(rule: InternalRuleItem): (js.Function5[
        /* rule */ InternalRuleItem, 
        /* value */ Any, 
        /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
        /* source */ Values, 
        /* options */ ValidateOption, 
        Unit | SyncValidateResult
      ]) | ExecuteValidator = js.native
    
    def messages(): InternalValidateMessages = js.native
    def messages(messages: ValidateMessages): InternalValidateMessages = js.native
    
    var rules: Record[String, js.Array[RuleItem]] = js.native
    
    def validate(source: Values): js.Promise[Values] = js.native
    def validate(source: Values, callback: ValidateCallback): js.Promise[Values] = js.native
    def validate(source: Values, option: Unit, callback: ValidateCallback): js.Promise[Values] = js.native
    def validate(source: Values, option: ValidateOption): js.Promise[Values] = js.native
    def validate(source: Values, option: ValidateOption, callback: ValidateCallback): js.Promise[Values] = js.native
  }
}
