package typings.adone.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends js.Object {
  /**
    * Default error type thrown by .fail
    */
  var failException: String = js.native
  /**
    * Passes if spy was always called with obj as its this value
    */
  def alwaysCalledOn(spy: Spy, obj: js.Any): Unit = js.native
  /**
    * Passes if spy was always called with the provided arguments
    */
  def alwaysCalledWith(spy: Spy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was always called with the provided arguments and no others
    */
  def alwaysCalledWithExactly(spy: Spy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was always called with matching arguments
    */
  def alwaysCalledWithMatch(spy: Spy, args: js.Any*): Unit = js.native
  /**
    * Passes if always spy threw
    */
  def alwaysThrew(spy: Spy): Unit = js.native
  /**
    * Passes if spy always threw the given exception type
    */
  def alwaysThrew(spy: Spy, exception: String): Unit = js.native
  /**
    * Passes if spy always threw the given object
    */
  def alwaysThrew(spy: Spy, exception: js.Any): Unit = js.native
  /**
    * Passes if spy was called exactly count times
    */
  def callCount(spy: Spy, count: Double): Unit = js.native
  /**
    * Passes if provided spies were called in the specified order
    */
  def callOrder(spies: Spy*): Unit = js.native
  /**
    * Passes if spy was called at least once
    */
  def called(spy: Spy): Unit = js.native
  /**
    * Passes if spy was ever called with obj as its this value
    */
  def calledOn(spy: Spy, obj: js.Any): Unit = js.native
  /**
    * Passes if spy was called once and only once
    */
  def calledOnce(spy: Spy): Unit = js.native
  /**
    * Passes if spy was called exactly three times
    */
  def calledThrice(spy: Spy): Unit = js.native
  /**
    * Passes if spy was called exactly twice
    */
  def calledTwice(spy: Spy): Unit = js.native
  /**
    * Passes if spy was called with the provided arguments
    */
  def calledWith(spy: Spy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was called with the provided arguments and no others
    */
  def calledWithExactly(spy: Spy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was called with matching arguments.
    */
  def calledWithMatch(spy: Spy, args: js.Any*): Unit = js.native
  /**
    * Exposes assertions into another object, to better integrate with the test framework
    */
  def expose(obj: js.Any): Unit = js.native
  def expose(obj: js.Any, options: ExposeOptions): Unit = js.native
  /**
    * Every assertion fails by calling this method
    */
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  /**
    * Passes if spy was never called with the provided arguments
    */
  def neverCalledWith(spy: Spy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was never called with matching arguments
    */
  def neverCalledWithMatch(spy: Spy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was never called
    */
  def notCalled(spy: Spy): Unit = js.native
  /**
    * Called every time assertion passes
    */
  def pass(assertion: js.Any): Unit = js.native
  /**
    * Passes if spy threw
    */
  def threw(spy: Spy): Unit = js.native
  /**
    * Passes if spy threw the given exception type
    */
  def threw(spy: Spy, exception: String): Unit = js.native
  /**
    * Passes if spy threw the given object
    */
  def threw(spy: Spy, exception: js.Any): Unit = js.native
}

