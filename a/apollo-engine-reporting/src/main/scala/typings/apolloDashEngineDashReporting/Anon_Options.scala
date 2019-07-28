package typings.apolloDashEngineDashReporting

import typings.apolloDashEngineDashReporting.distAgentMod.VariableValueOptions
import typings.apolloDashEngineDashReporting.distAgentMod.VariableValueTransformOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends VariableValueOptions {
  def transform(options: VariableValueTransformOptions): Record[String, _]
}

object Anon_Options {
  @scala.inline
  def apply(transform: VariableValueTransformOptions => Record[String, _]): Anon_Options = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
  
    __obj.asInstanceOf[Anon_Options]
  }
}

