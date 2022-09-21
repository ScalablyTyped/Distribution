package typings.asyncValidator

import typings.asyncValidator.interfaceMod.ExecuteValidator
import typings.asyncValidator.interfaceMod.InternalRuleItem
import typings.asyncValidator.interfaceMod.ValidateOption
import typings.asyncValidator.interfaceMod.Value
import typings.asyncValidator.interfaceMod.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorMod {
  
  object default {
    
    @JSImport("async-validator/dist-types/validator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("async-validator/dist-types/validator", "default.any")
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
    
    @JSImport("async-validator/dist-types/validator", "default.array")
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
    
    @JSImport("async-validator/dist-types/validator", "default.boolean")
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
    
    @JSImport("async-validator/dist-types/validator", "default.date")
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
    
    @JSImport("async-validator/dist-types/validator", "default.email")
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
    
    @JSImport("async-validator/dist-types/validator", "default.enum")
    @js.native
    val `enum`: ExecuteValidator = js.native
    inline def `enum`(
      rule: InternalRuleItem,
      value: Value,
      callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
      source: Values,
      options: ValidateOption
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enum")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("async-validator/dist-types/validator", "default.float")
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
    
    @JSImport("async-validator/dist-types/validator", "default.hex")
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
    
    @JSImport("async-validator/dist-types/validator", "default.integer")
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
    
    @JSImport("async-validator/dist-types/validator", "default.method")
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
    
    @JSImport("async-validator/dist-types/validator", "default.number")
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
    
    @JSImport("async-validator/dist-types/validator", "default.object")
    @js.native
    val `object`: ExecuteValidator = js.native
    inline def `object`(
      rule: InternalRuleItem,
      value: Value,
      callback: js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit],
      source: Values,
      options: ValidateOption
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("async-validator/dist-types/validator", "default.pattern")
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
    
    @JSImport("async-validator/dist-types/validator", "default.regexp")
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
    
    @JSImport("async-validator/dist-types/validator", "default.required")
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
    
    @JSImport("async-validator/dist-types/validator", "default.string")
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
    
    @JSImport("async-validator/dist-types/validator", "default.url")
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
}
