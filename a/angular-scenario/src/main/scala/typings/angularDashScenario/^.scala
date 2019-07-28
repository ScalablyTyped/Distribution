package typings.angularDashScenario

import typings.angularDashScenario.angularScenarioNs.BindingFunction
import typings.angularDashScenario.angularScenarioNs.Browser
import typings.angularDashScenario.angularScenarioNs.Element
import typings.angularDashScenario.angularScenarioNs.Expect
import typings.angularDashScenario.angularScenarioNs.Future
import typings.angularDashScenario.angularScenarioNs.Input
import typings.angularDashScenario.angularScenarioNs.PauseFunction
import typings.angularDashScenario.angularScenarioNs.Repeater
import typings.angularDashScenario.angularScenarioNs.RunFunction
import typings.angularDashScenario.angularScenarioNs.RunFunctionWithDescription
import typings.angularDashScenario.angularScenarioNs.Select
import typings.angularDashScenario.angularScenarioNs.SleepFunction
import typings.angularDashScenario.angularScenarioNs.UsingFunction
import typings.angularDashScenario.ngNs.IAngularStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var afterEach: RunFunction = js.native
  var angular: IAngularStatic = js.native
  var beforeEach: RunFunction = js.native
  var binding: BindingFunction = js.native
  var ddescribe: RunFunctionWithDescription = js.native
  var describe: RunFunctionWithDescription = js.native
  var iit: RunFunctionWithDescription = js.native
  var it: RunFunctionWithDescription = js.native
  var pause: PauseFunction = js.native
  var sleep: SleepFunction = js.native
  var using: UsingFunction = js.native
  var xdescribe: RunFunctionWithDescription = js.native
  var xit: RunFunctionWithDescription = js.native
  def browser(): Browser = js.native
  def element(selector: String): Element = js.native
  def element(selector: String, elementDescription: String): Element = js.native
  def expect(expectation: Future): Expect = js.native
  def input(ngModelBinding: String): Input = js.native
  def repeater(selector: String): Repeater = js.native
  def repeater(selector: String, repeaterDescription: String): Repeater = js.native
  def select(ngModelBinding: String): Select = js.native
}

