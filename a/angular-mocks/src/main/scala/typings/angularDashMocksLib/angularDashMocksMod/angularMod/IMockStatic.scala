package typings
package angularDashMocksLib.angularDashMocksMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMockStatic extends js.Object {
  @JSName("inject")
  var inject_Original: IInjectStatic = js.native
  // see https://docs.angularjs.org/api/ngMock/function/angular.mock.module
  @JSName("module")
  var module_Original: angularDashMocksLib.Anon_Modules = js.native
  def TzDate(offset: scala.Double, timestamp: java.lang.String): stdLib.Date = js.native
  // see https://docs.angularjs.org/api/ngMock/type/angular.mock.TzDate
  def TzDate(offset: scala.Double, timestamp: scala.Double): stdLib.Date = js.native
  // see https://docs.angularjs.org/api/ngMock/function/angular.mock.dump
  def dump(obj: js.Any): java.lang.String = js.native
  def inject(fns: (angularLib.angularMod.angularNs.Injectable[js.Function1[/* repeated */ _, scala.Unit]])*): js.Any = js.native
  // see https://docs.angularjs.org/api/ngMock/function/angular.mock.module
  def module(modules: js.Any*): js.Any = js.native
}

