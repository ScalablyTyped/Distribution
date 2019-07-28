package typings.adone

import org.scalablytyped.runtime.Instantiable3
import typings.adone.adoneNs.assertionNs.INs.AssertFunction
import typings.adone.adoneNs.assertionNs.INs.Assertion
import typings.adone.adoneNs.assertionNs.INs.Config
import typings.adone.adoneNs.assertionNs.INs.ExpectFunction
import typings.adone.adoneNs.assertionNs.INs.MockAssertions
import typings.adone.adoneNs.assertionNs.INs.assertion
import typings.adone.adoneNs.shaniNs.utilNs.INs.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofassertion extends js.Object {
  var AssertionError: Instantiable3[
    js.UndefOr[/* message */ String], 
    js.UndefOr[/* props */ js.Object], 
    js.UndefOr[/* ssf */ js.Object], 
    typings.adone.adoneNs.assertionNs.AssertionError
  ] = js.native
  val INs: js.Any = js.native
  @JSName("assert")
  val assert_Original: AssertFunction = js.native
  val config: Config = js.native
  @JSName("expect")
  val expect_Original: ExpectFunction = js.native
  /**
    * Asserts that value is truthy
    */
  def assert(value: js.Any): Unit = js.native
  def assert(value: js.Any, message: String): Unit = js.native
  def expect(value: js.Any): Assertion = js.native
  def expect(value: js.Any, message: String): Assertion = js.native
  def expect(value: Spy): MockAssertions = js.native
  def expect(value: Spy, message: String): MockAssertions = js.native
  def loadAssertInterface(): assertion = js.native
  def loadExpectInterface(): assertion = js.native
  def loadMockInterface(): assertion = js.native
  def use(fn: js.Function0[Unit]): assertion = js.native
}

