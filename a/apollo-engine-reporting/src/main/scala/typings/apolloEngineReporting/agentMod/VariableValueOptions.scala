package typings.apolloEngineReporting.agentMod

import typings.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloEngineReporting.AnonTransform
  - typings.apolloEngineReporting.agentMod.SendValuesBaseOptions
*/
trait VariableValueOptions extends js.Object

object VariableValueOptions {
  @scala.inline
  def AnonNone(none: `true`): VariableValueOptions = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def AnonOnlyNames(onlyNames: js.Array[String]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def AnonAll(all: `true`): VariableValueOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def AnonTransform(transform: VariableValueTransformOptions => Record[String, _]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def AnonExceptNames(exceptNames: js.Array[String]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValueOptions]
  }
}

