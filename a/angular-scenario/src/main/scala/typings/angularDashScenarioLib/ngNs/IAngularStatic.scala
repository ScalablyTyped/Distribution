package typings
package angularDashScenarioLib.ngNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAngularStatic extends js.Object {
  var scenario: js.Any
}

object IAngularStatic {
  @scala.inline
  def apply(scenario: js.Any): IAngularStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scenario")(scenario)
    __obj.asInstanceOf[IAngularStatic]
  }
}

