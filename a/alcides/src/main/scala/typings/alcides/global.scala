package typings.alcides

import typings.chai.Chai.AssertStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("assert")
  @js.native
  def assert: AssertStatic = js.native
  inline def assert_=(x: AssertStatic): Unit = js.Dynamic.global.updateDynamic("assert")(x.asInstanceOf[js.Any])
  
  @JSGlobal("setUp")
  @js.native
  def setUp: SetUpHook = js.native
  inline def setUp_=(x: SetUpHook): Unit = js.Dynamic.global.updateDynamic("setUp")(x.asInstanceOf[js.Any])
  
  @JSGlobal("suite")
  @js.native
  def suite: SuiteFunction = js.native
  inline def suite_=(x: SuiteFunction): Unit = js.Dynamic.global.updateDynamic("suite")(x.asInstanceOf[js.Any])
  
  @JSGlobal("tearDown")
  @js.native
  def tearDown: TearDownHook = js.native
  inline def tearDown_=(x: TearDownHook): Unit = js.Dynamic.global.updateDynamic("tearDown")(x.asInstanceOf[js.Any])
  
  @JSGlobal("test")
  @js.native
  def test: TestFunction = js.native
  inline def test_=(x: TestFunction): Unit = js.Dynamic.global.updateDynamic("test")(x.asInstanceOf[js.Any])
}
