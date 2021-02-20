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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("afterEach")
  @js.native
  def afterEach: RunFunction = js.native
  @scala.inline
  def afterEach_=(x: RunFunction): Unit = js.Dynamic.global.updateDynamic("afterEach")(x.asInstanceOf[js.Any])
  
  @JSGlobal("angular")
  @js.native
  def angular: IAngularStatic = js.native
  @scala.inline
  def angular_=(x: IAngularStatic): Unit = js.Dynamic.global.updateDynamic("angular")(x.asInstanceOf[js.Any])
  
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach: RunFunction = js.native
  @scala.inline
  def beforeEach_=(x: RunFunction): Unit = js.Dynamic.global.updateDynamic("beforeEach")(x.asInstanceOf[js.Any])
  
  @JSGlobal("binding")
  @js.native
  def binding: BindingFunction = js.native
  @scala.inline
  def binding_=(x: BindingFunction): Unit = js.Dynamic.global.updateDynamic("binding")(x.asInstanceOf[js.Any])
  
  @JSGlobal("browser")
  @js.native
  def browser(): Browser = js.native
  
  @JSGlobal("ddescribe")
  @js.native
  def ddescribe: RunFunctionWithDescription = js.native
  @scala.inline
  def ddescribe_=(x: RunFunctionWithDescription): Unit = js.Dynamic.global.updateDynamic("ddescribe")(x.asInstanceOf[js.Any])
  
  @JSGlobal("describe")
  @js.native
  def describe: RunFunctionWithDescription = js.native
  @scala.inline
  def describe_=(x: RunFunctionWithDescription): Unit = js.Dynamic.global.updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  @JSGlobal("element")
  @js.native
  def element(selector: String): Element = js.native
  @JSGlobal("element")
  @js.native
  def element(selector: String, elementDescription: String): Element = js.native
  
  @JSGlobal("expect")
  @js.native
  def expect(expectation: Future): Expect = js.native
  
  @JSGlobal("iit")
  @js.native
  def iit: RunFunctionWithDescription = js.native
  @scala.inline
  def iit_=(x: RunFunctionWithDescription): Unit = js.Dynamic.global.updateDynamic("iit")(x.asInstanceOf[js.Any])
  
  @JSGlobal("input")
  @js.native
  def input(ngModelBinding: String): Input = js.native
  
  @JSGlobal("it")
  @js.native
  def it: RunFunctionWithDescription = js.native
  @scala.inline
  def it_=(x: RunFunctionWithDescription): Unit = js.Dynamic.global.updateDynamic("it")(x.asInstanceOf[js.Any])
  
  @JSGlobal("pause")
  @js.native
  def pause: PauseFunction = js.native
  @scala.inline
  def pause_=(x: PauseFunction): Unit = js.Dynamic.global.updateDynamic("pause")(x.asInstanceOf[js.Any])
  
  @JSGlobal("repeater")
  @js.native
  def repeater(selector: String): Repeater = js.native
  @JSGlobal("repeater")
  @js.native
  def repeater(selector: String, repeaterDescription: String): Repeater = js.native
  
  @JSGlobal("select")
  @js.native
  def select(ngModelBinding: String): Select = js.native
  
  @JSGlobal("sleep")
  @js.native
  def sleep: SleepFunction = js.native
  @scala.inline
  def sleep_=(x: SleepFunction): Unit = js.Dynamic.global.updateDynamic("sleep")(x.asInstanceOf[js.Any])
  
  @JSGlobal("using")
  @js.native
  def using: UsingFunction = js.native
  @scala.inline
  def using_=(x: UsingFunction): Unit = js.Dynamic.global.updateDynamic("using")(x.asInstanceOf[js.Any])
  
  @JSGlobal("xdescribe")
  @js.native
  def xdescribe: RunFunctionWithDescription = js.native
  @scala.inline
  def xdescribe_=(x: RunFunctionWithDescription): Unit = js.Dynamic.global.updateDynamic("xdescribe")(x.asInstanceOf[js.Any])
  
  @JSGlobal("xit")
  @js.native
  def xit: RunFunctionWithDescription = js.native
  @scala.inline
  def xit_=(x: RunFunctionWithDescription): Unit = js.Dynamic.global.updateDynamic("xit")(x.asInstanceOf[js.Any])
}
