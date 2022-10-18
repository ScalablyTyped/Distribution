package typings.asyncValidator

import typings.asyncValidator.distTypesInterfaceMod.ExecuteRule
import typings.asyncValidator.distTypesInterfaceMod.InternalRuleItem
import typings.asyncValidator.distTypesInterfaceMod.ValidateOption
import typings.asyncValidator.distTypesInterfaceMod.Value
import typings.asyncValidator.distTypesInterfaceMod.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuleMod {
  
  object default {
    
    @JSImport("async-validator/dist-types/rule", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("async-validator/dist-types/rule", "default.enum")
    @js.native
    val `enum`: ExecuteRule = js.native
    inline def `enum`(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enum")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `enum`(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption,
      `type`: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enum")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("async-validator/dist-types/rule", "default.pattern")
    @js.native
    def pattern: ExecuteRule = js.native
    inline def pattern(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def pattern(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption,
      `type`: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def pattern_=(x: ExecuteRule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("async-validator/dist-types/rule", "default.range")
    @js.native
    def range: ExecuteRule = js.native
    inline def range(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def range(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption,
      `type`: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def range_=(x: ExecuteRule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
    
    @JSImport("async-validator/dist-types/rule", "default.required")
    @js.native
    def required: ExecuteRule = js.native
    inline def required(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("required")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def required(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption,
      `type`: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("required")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def required_=(x: ExecuteRule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
    
    @JSImport("async-validator/dist-types/rule", "default.type")
    @js.native
    val `type`: ExecuteRule = js.native
    inline def `type`(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `type`(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption,
      `type`: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("async-validator/dist-types/rule", "default.whitespace")
    @js.native
    def whitespace: ExecuteRule = js.native
    inline def whitespace(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("whitespace")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def whitespace(
      rule: InternalRuleItem,
      value: Value,
      source: Values,
      errors: js.Array[String],
      options: ValidateOption,
      `type`: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("whitespace")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any], source.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def whitespace_=(x: ExecuteRule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(x.asInstanceOf[js.Any])
  }
}
