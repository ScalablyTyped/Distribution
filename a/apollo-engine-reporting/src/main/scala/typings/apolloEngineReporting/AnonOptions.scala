package typings.apolloEngineReporting

import typings.apolloEngineReporting.agentMod.VariableValueOptions
import typings.apolloEngineReporting.agentMod.VariableValueTransformOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends VariableValueOptions {
  def transform(options: VariableValueTransformOptions): Record[String, _]
}

object AnonOptions {
  @scala.inline
  def apply(transform: VariableValueTransformOptions => Record[String, _]): AnonOptions = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
  
    __obj.asInstanceOf[AnonOptions]
  }
}

