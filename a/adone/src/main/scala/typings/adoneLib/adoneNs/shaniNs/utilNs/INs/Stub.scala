package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stub extends Spy {
  /**
    * Causes the original method wrapped into the stub to be called when none of the conditional stubs are matched
    */
  def callThrough(): Stub = js.native
  /**
    * Causes the stub to call the argument at the provided index as a callback function
    */
  def callsArg(index: scala.Double): Stub = js.native
  /**
    * Causes the stub to asynchronously call the argument at the provided index as a callback function
    */
  def callsArgAsync(index: scala.Double): Stub = js.native
  /**
    * Causes the stub to call the argument at the provided index as a callback function on the given context
    */
  def callsArgOn(index: scala.Double, context: js.Any): Stub = js.native
  /**
    * Causes the stub to asynchronously call the argument at the provided index as a callback function on the given context
    */
  def callsArgOnAsync(index: scala.Double, context: js.Any): Stub = js.native
  /**
    * Causes the stub to call the argument at the provided index as a callback function on the given context with the given arguments
    */
  def callsArgOnWith(index: scala.Double, context: js.Any, args: js.Any*): Stub = js.native
  /**
    * Causes the stub to asynchronously call the argument at the provided index as a callback function on the given context with the given arguments
    */
  def callsArgOnWithAsync(index: scala.Double, context: js.Any, args: js.Any*): Stub = js.native
  /**
    * Causes the stub to call the argument at the provided index as a callback function with the given arguments
    */
  def callsArgWith(index: scala.Double, args: js.Any*): Stub = js.native
  /**
    * Causes the stub to asynchronously call the argument at the provided index as a callback function on the given context with the given arguments
    */
  def callsArgWithAsync(index: scala.Double, args: js.Any*): Stub = js.native
  /**
    * Makes the stub call the provided fake function
    */
  def callsFake(func: js.Function1[/* repeated */ js.Any, scala.Unit]): Stub = js.native
  /**
    * Replaces a new getter with this stub
    */
  def get(func: js.Function0[_]): Stub = js.native
  /**
    * Defines the behavior of the stub on the call with the given index
    */
  def onCall(n: scala.Double): Stub = js.native
  /**
    * Defines the behavior of the stub on the first call
    */
  def onFirstCall(): Stub = js.native
  /**
    * Defines the behavior of the stub on the second call
    */
  def onSecondCall(): Stub = js.native
  /**
    * Defines the behavior of the stub on the third call
    */
  def onThirdCall(): Stub = js.native
  /**
    * Causes the stub to reject
    */
  def rejects(): Stub = js.native
  /**
    * Causes the stub to reject with the given type
    */
  def rejects(errorType: java.lang.String): Stub = js.native
  /**
    * Causes the stub to reject with the given value
    */
  def rejects(value: js.Any): Stub = js.native
  /**
    * Resets the stub's behavior to the default behavior
    */
  def resetBehavior(): scala.Unit = js.native
  /**
    * Resets the stub's history
    */
  def resetHistory(): scala.Unit = js.native
  /**
    * Causes the stub to return a promise that resolves to the given value
    */
  def resolves(): Stub = js.native
  def resolves(value: js.Any): Stub = js.native
  /**
    * Makes the stub return the given object
    */
  def returns(obj: js.Any): Stub = js.native
  /**
    * Causes the stub to return the argument at the given index
    */
  def returnsArg(index: scala.Double): Stub = js.native
  /**
    * Causes the stub to return its this value
    */
  def returnsThis(): Stub = js.native
  /**
    * Replaces a new getter with this stub
    */
  def set(func: js.Function1[/* v */ js.Any, scala.Unit]): Stub = js.native
  /*
    * Causes the stub to throw an exception of the given type
    */
  def throws(): Stub = js.native
  /**
    * Causes the stub to throw the given object
    */
  def throws(obj: js.Any): Stub = js.native
  def throws(`type`: java.lang.String): Stub = js.native
  /**
    * Causes the stub to throw the argument at the given index
    */
  def throwsArg(index: scala.Double): Stub = js.native
  /*
    * Causes the stub to throw an exception of the given type
    */
  def throwsException(): Stub = js.native
  /**
    * Causes the stub to throw the argument at the given index
    */
  def throwsException(obj: js.Any): Stub = js.native
  def throwsException(`type`: java.lang.String): Stub = js.native
  /**
    * Causes the stub to return promises using the given promise library
    */
  def usingPromise(promiseLibrary: js.Any): Stub = js.native
  /**
    * Defines a new value for this stub
    */
  def value(`val`: js.Any): Stub = js.native
  /**
    * Causes the stub to call the first callback it receives with the provided arguments
    */
  def yields(args: js.Any*): Stub = js.native
  /**
    * Causes the stub to asynchronously call the first callback it receives with the provided arguments
    */
  def yieldsAsync(args: js.Any*): Stub = js.native
  /**
    * Causes the stub to call the first callback it receives with the provided arguments on the given context
    */
  def yieldsOn(context: js.Any, args: js.Any*): Stub = js.native
  /**
    * Causes the stub to asynchronously call the first callback it receives with the provided arguments on the given context
    */
  def yieldsOnAsync(context: js.Any, args: js.Any*): Stub = js.native
  /**
    * Causes the stub to call the last callback it receives with the provided arguments
    */
  def yieldsRight(args: js.Any*): Stub = js.native
  /**
    * Causes the stub to invoke a callback passed as a property of an object to the spy
    */
  def yieldsTo(property: java.lang.String, args: js.Any*): Stub = js.native
  /**
    * Causes the stub to asynchronously invoke a callback passed as a property of an object to the spy
    */
  def yieldsToAsync(property: java.lang.String, args: js.Any*): Stub = js.native
  /**
    * Causes the stub to invoke a callback passed as a property of an object to the spy on the given context
    */
  def yieldsToOn(property: java.lang.String, context: js.Any, args: js.Any*): Stub = js.native
  /**
    * Causes the stub to asynchronously invoke a callback passed as a property of an object to the spy on the given context
    */
  def yieldsToOnAsync(property: java.lang.String, context: js.Any, args: js.Any*): Stub = js.native
}

