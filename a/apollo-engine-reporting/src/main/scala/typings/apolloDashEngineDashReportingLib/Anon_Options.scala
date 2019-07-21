package typings
package apolloDashEngineDashReportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options
  extends apolloDashEngineDashReportingLib.distAgentMod.VariableValueOptions {
  def transform(options: apolloDashEngineDashReportingLib.distAgentMod.VariableValueTransformOptions): stdLib.Record[java.lang.String, _]
}

object Anon_Options {
  @scala.inline
  def apply(
    transform: apolloDashEngineDashReportingLib.distAgentMod.VariableValueTransformOptions => stdLib.Record[java.lang.String, _]
  ): Anon_Options = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
  
    __obj.asInstanceOf[Anon_Options]
  }
}

