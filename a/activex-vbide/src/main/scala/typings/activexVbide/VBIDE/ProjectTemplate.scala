package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectTemplate extends js.Object {
  val Application: typings.activexVbide.VBIDE.Application
  val Parent: typings.activexVbide.VBIDE.Application
  @JSName("VBIDE.ProjectTemplate_typekey")
  var VBIDEDotProjectTemplate_typekey: ProjectTemplate
}

object ProjectTemplate {
  @scala.inline
  def apply(Application: Application, Parent: Application, VBIDEDotProjectTemplate_typekey: ProjectTemplate): ProjectTemplate = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.ProjectTemplate_typekey")(VBIDEDotProjectTemplate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectTemplate]
  }
}

