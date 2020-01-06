package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageDeclaration extends js.Object {
  /**
    * The actions included in a stage.
    */
  var actions: StageActionDeclarationList = js.native
  /**
    * Reserved for future use.
    */
  var blockers: js.UndefOr[StageBlockerDeclarationList] = js.native
  /**
    * The name of the stage.
    */
  var name: StageName = js.native
}

object StageDeclaration {
  @scala.inline
  def apply(actions: StageActionDeclarationList, name: StageName, blockers: StageBlockerDeclarationList = null): StageDeclaration = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (blockers != null) __obj.updateDynamic("blockers")(blockers.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageDeclaration]
  }
}

