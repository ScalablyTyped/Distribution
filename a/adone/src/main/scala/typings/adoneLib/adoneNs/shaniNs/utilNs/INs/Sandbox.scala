package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

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
  var mock_Original: js.Function1[/* obj */ js.Any, Mock] = js.native
  /**
                       * Works exactly like spy, only also adds the returned spy to the internal collection of fakes
                       */
  @JSName("spy")
  var spy_Original: js.Function2[/* object */ js.Any, /* method */ java.lang.String, Spy] = js.native
  /**
                       * Works exactly like stub, only also adds the returned spy to the internal collection of fakes
                       */
  @JSName("stub")
  var stub_Original: js.Function2[/* obj */ js.Any, /* method */ java.lang.String, Stub] = js.native
  /**
                       * Works exactly like mock, only also adds the returned spy to the internal collection of fakes
                       */
  def mock(obj: js.Any): Mock = js.native
  /**
                       * Resets the internal state of all fakes created through sandbox
                       */
  def reset(): scala.Unit = js.native
  /**
                       * Resets the behaviour of all stubs created through the sandbox
                       */
  def resetBehavior(): scala.Unit = js.native
  /**
                       * Resets the history of all stubs created through the sandbox
                       */
  def resetHistory(): scala.Unit = js.native
  /**
                       * Restores all fakes created through sandbox
                       */
  def restore(): scala.Unit = js.native
  /**
                       * Works exactly like spy, only also adds the returned spy to the internal collection of fakes
                       */
  def spy[T](`object`: T, method: java.lang.String): Spy = js.native
  /**
                       * Works exactly like stub, only also adds the returned spy to the internal collection of fakes
                       */
  def stub[T](obj: T, method: java.lang.String): Stub = js.native
  /**
                       * Causes all stubs created from the sandbox to return promises using a specific promise library
                       */
  def usingPromise(promiseLibrary: js.Any): Sandbox = js.native
  /**
                       * Verifies all mocks created through the sandbox
                       */
  def verify(): scala.Unit = js.native
  /**
                       * Verifies all mocks and restores all fakes created through the sandbox
                       */
  def verifyAndRestore(): scala.Unit = js.native
}

