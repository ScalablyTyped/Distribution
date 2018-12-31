package typings
package adoneLib.adoneNs.shaniNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.shani.util")
@js.native
object utilNsMembers extends js.Object {
  val assert: adoneLib.adoneNs.shaniNs.utilNs.INs.Assert = js.native
  val expectation: adoneLib.adoneNs.shaniNs.utilNs.INs.ExpectationStatic = js.native
  val `match`: adoneLib.adoneNs.shaniNs.utilNs.INs.Match = js.native
  val sandbox: adoneLib.adoneNs.shaniNs.utilNs.INs.SandboxStatic = js.native
  /**
    * Creates a fake method (like spy) with pre-programmed behavior (like stub)
    */
  def mock(): adoneLib.adoneNs.shaniNs.utilNs.INs.Expectation = js.native
  def mock(obj: js.Any): adoneLib.adoneNs.shaniNs.utilNs.INs.Mock = js.native
  /**
    * Assertion tool for http server responses
    */
  def request(server: js.Any): adoneLib.adoneNs.shaniNs.utilNs.INs.Request = js.native
  /**
    * Return a function that records arguments, return value, the value of this and exception thrown (if any) for all its calls
    */
  def spy(): adoneLib.adoneNs.shaniNs.utilNs.INs.Spy = js.native
  def spy(func: js.Function1[/* repeated */ js.Any, scala.Unit]): adoneLib.adoneNs.shaniNs.utilNs.INs.Spy = js.native
  def spy[T](`object`: T, method: java.lang.String): adoneLib.adoneNs.shaniNs.utilNs.INs.Spy = js.native
  /**
    * Creates a function (spy) with pre-programmed behavior
    */
  def stub(): adoneLib.adoneNs.shaniNs.utilNs.INs.Stub = js.native
  def stub(obj: js.Any): adoneLib.adoneNs.shaniNs.utilNs.INs.Stub = js.native
  def stub[T](obj: T, method: java.lang.String): adoneLib.adoneNs.shaniNs.utilNs.INs.Stub = js.native
}

