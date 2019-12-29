package typings.apolloDashEngineDashReporting.distAgentMod

import typings.apolloDashEngineDashReporting.apolloDashEngineDashReportingBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloDashEngineDashReporting.Anon_OnlyNames
  - typings.apolloDashEngineDashReporting.Anon_ExceptNames
  - typings.apolloDashEngineDashReporting.Anon_All
  - typings.apolloDashEngineDashReporting.Anon_None
*/
trait SendValuesBaseOptions extends VariableValueOptions

object SendValuesBaseOptions {
  @scala.inline
  def Anon_OnlyNames(onlyNames: js.Array[String]): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
  @scala.inline
  def Anon_ExceptNames(exceptNames: js.Array[String]): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
  @scala.inline
  def Anon_All(all: `true`): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
  @scala.inline
  def Anon_None(none: `true`): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
}

