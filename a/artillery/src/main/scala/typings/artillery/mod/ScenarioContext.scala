package typings.artillery.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioContext extends js.Object {
  var vars: StringDictionary[js.Any]
}

object ScenarioContext {
  @scala.inline
  def apply(vars: StringDictionary[js.Any]): ScenarioContext = {
    val __obj = js.Dynamic.literal(vars = vars.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScenarioContext]
  }
}

