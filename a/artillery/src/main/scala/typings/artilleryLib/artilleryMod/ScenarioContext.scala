package typings
package artilleryLib.artilleryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioContext extends js.Object {
  var vars: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object ScenarioContext {
  @scala.inline
  def apply(vars: org.scalablytyped.runtime.StringDictionary[js.Any]): ScenarioContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("vars")(vars)
    __obj.asInstanceOf[ScenarioContext]
  }
}

