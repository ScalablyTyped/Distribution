package typings.angularCore.analyzeTemplateMod

import typings.angularCompiler.astMod.PropertyWrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateVariableAssignment extends js.Object {
  var end: Double = js.native
  var node: PropertyWrite = js.native
  var start: Double = js.native
}

object TemplateVariableAssignment {
  @scala.inline
  def apply(end: Double, node: PropertyWrite, start: Double): TemplateVariableAssignment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateVariableAssignment]
  }
  @scala.inline
  implicit class TemplateVariableAssignmentOps[Self <: TemplateVariableAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: PropertyWrite): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

