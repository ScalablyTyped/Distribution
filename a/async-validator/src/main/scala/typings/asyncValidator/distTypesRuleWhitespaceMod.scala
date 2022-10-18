package typings.asyncValidator

import org.scalablytyped.runtime.Shortcut
import typings.asyncValidator.distTypesInterfaceMod.ExecuteRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuleWhitespaceMod extends Shortcut {
  
  /**
    *  Rule for validating whitespace.
    *
    *  @param rule The validation rule.
    *  @param value The value of the field on the source object.
    *  @param source The source object being validated.
    *  @param errors An array of errors that this rule may add
    *  validation errors to.
    *  @param options The validation options.
    *  @param options.messages The validation messages.
    */
  @JSImport("async-validator/dist-types/rule/whitespace", JSImport.Default)
  @js.native
  val default: ExecuteRule = js.native
  
  type _To = ExecuteRule
  
  /* This means you don't have to write `default`, but can instead just say `distTypesRuleWhitespaceMod.foo` */
  override def _to: ExecuteRule = default
}
