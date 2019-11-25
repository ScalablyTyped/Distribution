package typings.apolloDashEngineDashReporting.distAgentMod

import typings.apolloDashEngineDashReporting.apolloDashEngineDashReportingNumbers.`true`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloDashEngineDashReporting.Anon_Options
  - typings.apolloDashEngineDashReporting.distAgentMod.SendValuesBaseOptions
*/
trait VariableValueOptions extends js.Object

object VariableValueOptions {
  @scala.inline
  def Anon_None(none: `true`): VariableValueOptions = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def Anon_ExceptNames(exceptNames: js.Array[String]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def Anon_All(all: `true`): VariableValueOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def Anon_OnlyNames(onlyNames: js.Array[String]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def Anon_Options(transform: VariableValueTransformOptions => Record[String, _]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
  
    __obj.asInstanceOf[VariableValueOptions]
  }
}

