package typings.adone.adoneNs.shaniNs.utilNs

import typings.adone.adoneNs.shaniNs.utilNs.INs.Assert
import typings.adone.adoneNs.shaniNs.utilNs.INs.Expectation
import typings.adone.adoneNs.shaniNs.utilNs.INs.ExpectationStatic
import typings.adone.adoneNs.shaniNs.utilNs.INs.Match
import typings.adone.adoneNs.shaniNs.utilNs.INs.Mock
import typings.adone.adoneNs.shaniNs.utilNs.INs.Request
import typings.adone.adoneNs.shaniNs.utilNs.INs.SandboxStatic
import typings.adone.adoneNs.shaniNs.utilNs.INs.Spy
import typings.adone.adoneNs.shaniNs.utilNs.INs.Stub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.shani.util")
@js.native
object ^ extends js.Object {
  val assert: Assert = js.native
  val expectation: ExpectationStatic = js.native
  val `match`: Match = js.native
  val sandbox: SandboxStatic = js.native
  /**
    * Creates a fake method (like spy) with pre-programmed behavior (like stub)
    */
  def mock(): Expectation = js.native
  def mock(obj: js.Any): Mock = js.native
  /**
    * Assertion tool for http server responses
    */
  def request(server: js.Any): Request = js.native
  /**
    * Return a function that records arguments, return value, the value of this and exception thrown (if any) for all its calls
    */
  def spy(): Spy = js.native
  def spy(func: js.Function1[/* repeated */ js.Any, Unit]): Spy = js.native
  def spy[T](`object`: T, method: String): Spy = js.native
  /**
    * Creates a function (spy) with pre-programmed behavior
    */
  def stub(): Stub = js.native
  def stub(obj: js.Any): Stub = js.native
  def stub[T](obj: T, method: String): Stub = js.native
}

