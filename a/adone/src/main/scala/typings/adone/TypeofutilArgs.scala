package typings.adone

import typings.adone.adoneNs.shaniNs.utilNs.INs.Assert
import typings.adone.adoneNs.shaniNs.utilNs.INs.Expectation
import typings.adone.adoneNs.shaniNs.utilNs.INs.ExpectationStatic
import typings.adone.adoneNs.shaniNs.utilNs.INs.Match
import typings.adone.adoneNs.shaniNs.utilNs.INs.Matcher
import typings.adone.adoneNs.shaniNs.utilNs.INs.Mock
import typings.adone.adoneNs.shaniNs.utilNs.INs.Request
import typings.adone.adoneNs.shaniNs.utilNs.INs.SandboxStatic
import typings.adone.adoneNs.shaniNs.utilNs.INs.Spy
import typings.adone.adoneNs.shaniNs.utilNs.INs.Stub
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofutilArgs extends js.Object {
  val FSNs: js.Any = js.native
  val INs: js.Any = js.native
  val assert: Assert = js.native
  val expectation: ExpectationStatic = js.native
  @JSName("match")
  val match_Original: Match = js.native
  val nockNs: js.Any = js.native
  val sandbox: SandboxStatic = js.native
  /**
    * Specify a custom matcher
    */
  def `match`(callback: js.Function1[/* value */ js.Any, Boolean]): Matcher = js.native
  def `match`(callback: js.Function1[/* value */ js.Any, Boolean], message: String): Matcher = js.native
  /**
    * Requires the value to be a string and match the given regular expression
    */
  def `match`(expr: RegExp): Matcher = js.native
  /**
    * Requires the value to be not null or undefined and have at least the same properties as expectation
    */
  def `match`(obj: js.Any): Matcher = js.native
  /**
    * Requires the value to be a string and have the expectation as a substring
    */
  def `match`(value: String): Matcher = js.native
  /**
    * Requires the value to be == to the given number
    */
  def `match`(value: Double): Matcher = js.native
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

