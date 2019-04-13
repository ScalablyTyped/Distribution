package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionContext extends js.Object {
  /**
    * The name of the action within the context of a job.
    */
  var name: js.UndefOr[ActionName] = js.undefined
}

object ActionContext {
  @scala.inline
  def apply(name: ActionName = null): ActionContext = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ActionContext]
  }
}

