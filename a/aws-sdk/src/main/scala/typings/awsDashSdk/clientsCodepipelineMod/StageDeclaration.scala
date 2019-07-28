package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageDeclaration extends js.Object {
  /**
    * The actions included in a stage.
    */
  var actions: StageActionDeclarationList
  /**
    * Reserved for future use.
    */
  var blockers: js.UndefOr[StageBlockerDeclarationList] = js.undefined
  /**
    * The name of the stage.
    */
  var name: StageName
}

object StageDeclaration {
  @scala.inline
  def apply(actions: StageActionDeclarationList, name: StageName, blockers: StageBlockerDeclarationList = null): StageDeclaration = {
    val __obj = js.Dynamic.literal(actions = actions, name = name)
    if (blockers != null) __obj.updateDynamic("blockers")(blockers)
    __obj.asInstanceOf[StageDeclaration]
  }
}

