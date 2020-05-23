package typings.apolloEngineReporting.agentMod

import typings.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloEngineReporting.anon.Transform
  - typings.apolloEngineReporting.agentMod.SendValuesBaseOptions
*/
trait VariableValueOptions extends js.Object

object VariableValueOptions {
  @scala.inline
  def ExceptNames(exceptNames: js.Array[String]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def Transform(transform: VariableValueTransformOptions => Record[String, _]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def OnlyNames(onlyNames: js.Array[String]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def None(none: `true`): VariableValueOptions = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def All(all: `true`): VariableValueOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValueOptions]
  }
}

