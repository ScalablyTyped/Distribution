package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofutilArgs extends js.Object {
  val FSNs: js.Any = js.native
  val INs: js.Any = js.native
  val assert: adoneLib.adoneNs.shaniNs.utilNs.INs.Assert = js.native
  val expectation: adoneLib.adoneNs.shaniNs.utilNs.INs.ExpectationStatic = js.native
  @JSName("match")
  val match_Original: adoneLib.adoneNs.shaniNs.utilNs.INs.Match = js.native
  val nockNs: js.Any = js.native
  val sandbox: adoneLib.adoneNs.shaniNs.utilNs.INs.SandboxStatic = js.native
  /**
    * Specify a custom matcher
    */
  def `match`(callback: js.Function1[/* value */ js.Any, scala.Boolean]): adoneLib.adoneNs.shaniNs.utilNs.INs.Matcher = js.native
  def `match`(callback: js.Function1[/* value */ js.Any, scala.Boolean], message: java.lang.String): adoneLib.adoneNs.shaniNs.utilNs.INs.Matcher = js.native
  /**
    * Requires the value to be a string and match the given regular expression
    */
  def `match`(expr: stdLib.RegExp): adoneLib.adoneNs.shaniNs.utilNs.INs.Matcher = js.native
  /**
    * Requires the value to be not null or undefined and have at least the same properties as expectation
    */
  def `match`(obj: js.Any): adoneLib.adoneNs.shaniNs.utilNs.INs.Matcher = js.native
  /**
    * Requires the value to be a string and have the expectation as a substring
    */
  def `match`(value: java.lang.String): adoneLib.adoneNs.shaniNs.utilNs.INs.Matcher = js.native
  /**
    * Requires the value to be == to the given number
    */
  def `match`(value: scala.Double): adoneLib.adoneNs.shaniNs.utilNs.INs.Matcher = js.native
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

