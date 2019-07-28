package typings.angularDashScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularScenarioNs {
  type BindingFunction = js.Function1[/* bracketBindingExpression */ String, Future]
  type CustomMatchers = Matchers
  type PauseFunction = js.Function0[js.Any]
  type RunFunction = js.Function1[/* functionToRun */ js.Any, js.Any]
  type RunFunctionWithDescription = js.Function2[/* description */ String, /* functionToRun */ js.Any, js.Any]
  type SleepFunction = js.Function1[/* seconds */ Double, js.Any]
  type UsingFunction = js.Function2[/* selector */ String, /* selectorDescription */ js.UndefOr[String], Unit]
}
