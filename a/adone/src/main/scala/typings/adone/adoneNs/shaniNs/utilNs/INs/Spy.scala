package typings.adone.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spy extends SpyCallApi {
  /**
    * Array of the calls arguments
    */
  @JSName("args")
  var args_Spy: js.Array[js.Array[_]] = js.native
  /**
    * The number of recorded calls
    */
  var callCount: Double = js.native
  /**
    * Whether the spy was called
    */
  var called: Boolean = js.native
  /**
    * Whether the spy was called once
    */
  var calledOnce: Boolean = js.native
  /**
    * Whether the spy was called thrice
    */
  var calledThrice: Boolean = js.native
  /**
    * Whether the spy was called twice
    */
  var calledTwice: Boolean = js.native
  /**
    * Array of the calls exceptions
    */
  var exceptions: js.Array[_] = js.native
  /**
    * The first call
    */
  var firstCall: SpyCall = js.native
  /**
    * The last call
    */
  var lastCall: SpyCall = js.native
  /**
    * Whether the spy was not called
    */
  var notCalled: Boolean = js.native
  /**
    * Array of the calls return values
    */
  var returnValues: js.Array[_] = js.native
  /**
    * The second call
    */
  var secondCall: SpyCall = js.native
  /**
    * The third call
    */
  var thirdCall: SpyCall = js.native
  /**
    * Array of the calls contexts
    */
  var thisValues: js.Array[_] = js.native
  def apply(args: js.Any*): js.Any = js.native
  /**
    * Whether the spy was called on the given context (this value)
    */
  def alwaysCalledOn(obj: js.Any): Boolean = js.native
  /**
    * Whether the spy was called with the given arguments (and possibly others)
    */
  def alwaysCalledWith(args: js.Any*): Boolean = js.native
  /**
    * Whether the spy was called exactly with the given arguments (no others)
    */
  def alwaysCalledWithExactly(args: js.Any*): Boolean = js.native
  /**
    * Whether the spy was called with the matching arguments (and possibly others)
    */
  def alwaysCalledWithMatch(args: js.Any*): Boolean = js.native
  /**
    * Whether the spy always returned the given object
    */
  def alwaysReturned(obj: js.Any): Boolean = js.native
  /**
    * Whether the spy always threw exceptions
    */
  def alwaysThrew(): Boolean = js.native
  /**
    * Whether the spy always threw the given object
    */
  def alwaysThrew(obj: js.Any): Boolean = js.native
  /**
    * Whether the spy always threw exceptions of the given types
    */
  def alwaysThrew(`type`: String): Boolean = js.native
  /**
    * Whether the spy was called after another spy
    */
  def calledAfter(anotherSpy: Spy): Boolean = js.native
  /**
    * Whether the spy was called before another spy
    */
  def calledBefore(anotherSpy: Spy): Boolean = js.native
  /**
    * Whether the spy was called after another spy and no spies occured between them
    */
  def calledImmediatelyAfter(anotherSpy: Spy): Boolean = js.native
  /**
    * Whether the spy was called before another spy and no spies occured between them
    */
  def calledImmediatelyBefore(anotherSpy: Spy): Boolean = js.native
  /**
    * Whether the spy was called using the new operator
    */
  def calledWithNew(): Boolean = js.native
  /**
    * Returns the call with the given index
    */
  def getCall(n: Double): SpyCall = js.native
  /**
    * Returns all the calls
    */
  def getCalls(): js.Array[SpyCall] = js.native
  /**
    * Invokes the callbacks passed in the arguments with the given arguments
    */
  def invokeCallback(args: js.Any*): Unit = js.native
  /**
    * Whether the spy was never called with the given arguments
    */
  def neverCalledWith(args: js.Any*): Boolean = js.native
  /**
    * Whether the spy was neven called with the matching arguments
    */
  def neverCalledWithMatch(args: js.Any*): Boolean = js.native
  /**
    * Returns the passed format string with the given replacements
    */
  def printf(format: String, args: js.Any*): String = js.native
  /**
    * Resets the state of the spy
    */
  def reset(): Unit = js.native
  /**
    * Replaces the spy with the original method if the spy replaced an original method
    */
  def restore(): Unit = js.native
  /**
    * Waits for the call where the given match function returns true
    */
  def waitFor(`match`: js.Function1[/* call */ SpyCall, Boolean]): js.Promise[SpyCall] = js.native
  def waitFor[T](`match`: js.Function1[/* call */ SpyCall, Boolean], ret: js.Function1[/* call */ SpyCall, T]): js.Promise[T] = js.native
  /**
    * Waits for the call with the given value at the given index (deep equal)
    */
  def waitForArg(index: Double, value: js.Any): js.Promise[SpyCall] = js.native
  /**
    * Waits for the call where the first args are deeply equal to the given, it can have more args than given
    */
  def waitForArgs(args: js.Any*): js.Promise[SpyCall] = js.native
  /**
    * Waits for a call
    */
  def waitForCall(): js.Promise[SpyCall] = js.native
  /**
    * Waits for n calls
    */
  def waitForNCalls(n: Double): js.Promise[js.Array[SpyCall]] = js.native
  /**
    * Creates a spy that record calls only with the given arguments
    */
  def withArgs(args: js.Any*): Spy = js.native
}

