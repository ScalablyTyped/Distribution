package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Assert extends js.Object {
  var AssertionError: org.scalablytyped.runtime.Instantiable3[
    /* message */ js.UndefOr[/* message */ java.lang.String], 
    /* props */ js.UndefOr[/* props */ js.Object], 
    /* ssf */ js.UndefOr[/* ssf */ js.Object], 
    adoneLib.adoneNs.assertionNs.AssertionError
  ] = js.native
  val INs: js.Any = js.native
  @JSName("assert")
  val assert_Original: adoneLib.adoneNs.assertionNs.INs.AssertFunction = js.native
  val config: adoneLib.adoneNs.assertionNs.INs.Config = js.native
  @JSName("expect")
  val expect_Original: adoneLib.adoneNs.assertionNs.INs.ExpectFunction = js.native
  /**
    * Asserts that value is truthy
    */
  def assert(value: js.Any): scala.Unit = js.native
  def assert(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def expect(value: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy): adoneLib.adoneNs.assertionNs.INs.MockAssertions = js.native
  def expect(value: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy, message: java.lang.String): adoneLib.adoneNs.assertionNs.INs.MockAssertions = js.native
  def expect(value: js.Any): adoneLib.adoneNs.assertionNs.INs.Assertion = js.native
  def expect(value: js.Any, message: java.lang.String): adoneLib.adoneNs.assertionNs.INs.Assertion = js.native
  def loadAssertInterface(): adoneLib.adoneNs.assertionNs.INs.assertion = js.native
  def loadExpectInterface(): adoneLib.adoneNs.assertionNs.INs.assertion = js.native
  def loadMockInterface(): adoneLib.adoneNs.assertionNs.INs.assertion = js.native
  def use(fn: js.Function0[scala.Unit]): adoneLib.adoneNs.assertionNs.INs.assertion = js.native
}

