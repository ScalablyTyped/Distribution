package typings.adone.adoneNs.shaniNs.utilNs.INs

import typings.adone.Fn_Args
import typings.adone.Fn_Method
import typings.adone.Fn_Obj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sandbox extends js.Object {
  /**
    * A convenience reference for assert
    */
  var assert: Assert = js.native
  /**
    * Works exactly like mock, only also adds the returned spy to the internal collection of fakes
    */
  @JSName("mock")
  var mock_Original: Fn_Obj = js.native
  /**
    * Works exactly like spy, only also adds the returned spy to the internal collection of fakes
    */
  @JSName("spy")
  var spy_Original: Fn_Args = js.native
  /**
    * Works exactly like stub, only also adds the returned spy to the internal collection of fakes
    */
  @JSName("stub")
  var stub_Original: Fn_Method = js.native
  /**
    * Works exactly like mock, only also adds the returned spy to the internal collection of fakes
    */
  def mock(): Expectation = js.native
  /**
    * Works exactly like mock, only also adds the returned spy to the internal collection of fakes
    */
  def mock(obj: js.Any): Mock = js.native
  /**
    * Resets the internal state of all fakes created through sandbox
    */
  def reset(): Unit = js.native
  /**
    * Resets the behaviour of all stubs created through the sandbox
    */
  def resetBehavior(): Unit = js.native
  /**
    * Resets the history of all stubs created through the sandbox
    */
  def resetHistory(): Unit = js.native
  /**
    * Restores all fakes created through sandbox
    */
  def restore(): Unit = js.native
  /**
    * Works exactly like spy, only also adds the returned spy to the internal collection of fakes
    */
  def spy(): Spy = js.native
  def spy(func: js.Function1[/* repeated */ js.Any, Unit]): Spy = js.native
  /**
    * Works exactly like spy, only also adds the returned spy to the internal collection of fakes
    */
  def spy[T](`object`: T, method: String): Spy = js.native
  /**
    * Works exactly like stub, only also adds the returned spy to the internal collection of fakes
    */
  def stub(): Stub = js.native
  def stub(obj: js.Any): Stub = js.native
  /**
    * Works exactly like stub, only also adds the returned spy to the internal collection of fakes
    */
  def stub[T](obj: T, method: String): Stub = js.native
  /**
    * Causes all stubs created from the sandbox to return promises using a specific promise library
    */
  def usingPromise(promiseLibrary: js.Any): Sandbox = js.native
  /**
    * Verifies all mocks created through the sandbox
    */
  def verify(): Unit = js.native
  /**
    * Verifies all mocks and restores all fakes created through the sandbox
    */
  def verifyAndRestore(): Unit = js.native
}

