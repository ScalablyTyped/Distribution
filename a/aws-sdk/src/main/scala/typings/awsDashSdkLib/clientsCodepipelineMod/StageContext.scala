package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageContext extends js.Object {
  /**
    * The name of the stage.
    */
  var name: js.UndefOr[StageName] = js.undefined
}

object StageContext {
  @scala.inline
  def apply(name: StageName = null): StageContext = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[StageContext]
  }
}

