package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// based on https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/sinon
@js.native
trait SpyCallApi extends js.Object {
  /**
    * The call's arguments
    */
  var args: js.Array[_] = js.native
  /**
    * Exception throws if any
    */
  var exception: js.Any = js.native
  /**
    * Return value
    */
  var returnValue: js.Any = js.native
  /**
    * The call's this value
    */
  var thisValue: js.Any = js.native
  /**
    * Calls the argument at the given index
    */
  def callArg(pos: scala.Double): scala.Unit = js.native
  /**
    * Calls the argument at the given index on the given context
    */
  def callArgOn(pos: scala.Double, obj: js.Any): scala.Unit = js.native
  /**
    * Calls the argument at the given index on the given context and with the given arguments
    */
  def callArgOnWith(pos: scala.Double, obj: js.Any, args: js.Any*): scala.Unit = js.native
  /**
    * Calls the argument at the given index with arguments
    */
  def callArgWith(pos: scala.Double, args: js.Any*): scala.Unit = js.native
  /**
    * Whether the spy was called on obj (this value)
    */
  def calledOn(obj: js.Any): scala.Boolean = js.native
  /**
    * Whether the arguments were args (and possibly others)
    */
  def calledWith(args: js.Any*): scala.Boolean = js.native
  /**
    * Whether the arguments were exactly args (no others)
    */
  def calledWithExactly(args: js.Any*): scala.Boolean = js.native
  /**
    * Whether the call received matching args (and possibly others)
    */
  def calledWithMatch(args: js.Any*): scala.Boolean = js.native
  /**
    * Whether the call did not receive args
    */
  def notCalledWith(args: js.Any*): scala.Boolean = js.native
  /**
    * Whether the call did not receive matching args
    */
  def notCalledWithMatch(args: js.Any*): scala.Boolean = js.native
  /**
    * Whether the call returned the given value
    */
  def returned(value: js.Any): scala.Boolean = js.native
  /**
    * Whether the call threw an exception
    */
  def threw(): scala.Boolean = js.native
  /**
    * Whether the call threw obj
    */
  def threw(obj: js.Any): scala.Boolean = js.native
  /**
    * Whether the call threw an exception of provided type
    */
  def threw(`type`: java.lang.String): scala.Boolean = js.native
  /**
    * Calls a callback from the arguments with the given arguments
    */
  def `yield`(args: js.Any*): scala.Unit = js.native
  /**
    * Calls a callback from the arguments with the given arguments on the given context
    */
  def yieldOn(obj: js.Any, args: js.Any*): scala.Unit = js.native
  /**
    * Calls with the given arguments a callback that is a property of the call's argument with the given name
    */
  def yieldTo(property: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Calls on the given context with the given arguments a callback that
    * is a property of the call's argument with the given name
    */
  def yieldToOn(property: java.lang.String, obj: js.Any, args: js.Any*): scala.Unit = js.native
}

