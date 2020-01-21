package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/utils/schematics_prompt", JSImport.Namespace)
@js.native
object schematicsPromptMod extends js.Object {
  def getInquirer(): Inquirer = js.native
  def supportsPrompt(): Boolean = js.native
  type Inquirer = typings.inquirer.mod.Inquirer with TypeofimportedInquirer
}

