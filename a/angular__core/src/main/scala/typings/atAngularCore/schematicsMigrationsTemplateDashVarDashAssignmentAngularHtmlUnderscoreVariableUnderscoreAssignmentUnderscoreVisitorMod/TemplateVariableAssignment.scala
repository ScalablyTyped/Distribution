package typings.atAngularCore.schematicsMigrationsTemplateDashVarDashAssignmentAngularHtmlUnderscoreVariableUnderscoreAssignmentUnderscoreVisitorMod

import typings.atAngularCompiler.atAngularCompilerMod.PropertyWrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateVariableAssignment extends js.Object {
  var end: Double
  var node: PropertyWrite
  var start: Double
}

object TemplateVariableAssignment {
  @scala.inline
  def apply(end: Double, node: PropertyWrite, start: Double): TemplateVariableAssignment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TemplateVariableAssignment]
  }
}

