package typings.angularScenario

import typings.angularScenario.angularScenario.BindingFunction
import typings.angularScenario.angularScenario.Browser
import typings.angularScenario.angularScenario.Element
import typings.angularScenario.angularScenario.Expect
import typings.angularScenario.angularScenario.Future
import typings.angularScenario.angularScenario.Input
import typings.angularScenario.angularScenario.PauseFunction
import typings.angularScenario.angularScenario.Repeater
import typings.angularScenario.angularScenario.RunFunction
import typings.angularScenario.angularScenario.RunFunctionWithDescription
import typings.angularScenario.angularScenario.Select
import typings.angularScenario.angularScenario.SleepFunction
import typings.angularScenario.angularScenario.UsingFunction
import typings.angularScenario.ng.IAngularStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
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

