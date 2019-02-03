package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "AsyncIterator")
@js.native
abstract class AsyncIterator[T] ()
  extends nodeLib.NodeJSNs.EventEmitter {
  var _destination: js.UndefOr[AsyncIterator[_]] = js.native
  var _readable: scala.Boolean = js.native
  var _state: scala.Double = js.native
  var closed: scala.Boolean = js.native
  var ended: scala.Boolean = js.native
  var readable: scala.Boolean = js.native
  // tslint:disable-next-line ban-types
  /* private */ def _addSingleListener(eventName: java.lang.String, listener: js.Function): scala.Unit = js.native
  /* private */ def _addSingleListener(eventName: js.Symbol, listener: js.Function): scala.Unit = js.native
  def _changeState(newState: scala.Double): scala.Unit = js.native
  def _changeState(newState: scala.Double, eventAsync: scala.Boolean): scala.Unit = js.native
  def _end(): scala.Unit = js.native
  /* private */ def _hasListeners(eventName: java.lang.String): scala.Boolean = js.native
  /* private */ def _hasListeners(eventName: js.Symbol): scala.Boolean = js.native
  def _toStringDetails(): java.lang.String = js.native
  def append[T](items: js.Array[T]): SimpleTransformIterator[T, T] = js.native
  def close(): scala.Unit = js.native
  def copyProperties(source: AsyncIterator[_], propertyNames: js.Array[java.lang.String]): scala.Unit = js.native
  def each(callback: js.Function1[/* data */ T, scala.Unit]): scala.Unit = js.native
  def each(callback: js.Function1[/* data */ T, scala.Unit], self: js.Any): scala.Unit = js.native
  def filter(filter: js.Function1[/* item */ T, scala.Boolean]): SimpleTransformIterator[T, T] = js.native
  def filter(filter: js.Function1[/* item */ T, scala.Boolean], self: js.Object): SimpleTransformIterator[T, T] = js.native
  def getProperties(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def getProperty(propertyName: java.lang.String): js.Any = js.native
  def getProperty(propertyName: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Unit]): js.Any = js.native
  def map[T2](mapper: js.Function1[/* item */ T, T2]): SimpleTransformIterator[T, T2] = js.native
  def map[T2](mapper: js.Function1[/* item */ T, T2], self: js.Object): SimpleTransformIterator[T, T2] = js.native
  def prepend(items: js.Array[T]): SimpleTransformIterator[T, T] = js.native
  def range[T](start: scala.Double, end: scala.Double): SimpleTransformIterator[T, T] = js.native
  def read(): T = js.native
  def setProperties(properties: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def setProperty(propertyName: java.lang.String, value: js.Any): scala.Unit = js.native
  def skip[T](offset: scala.Double): SimpleTransformIterator[T, T] = js.native
  def surround[T](prepend: js.Array[T], append: js.Array[T]): SimpleTransformIterator[T, T] = js.native
  def take[T](limit: scala.Double): SimpleTransformIterator[T, T] = js.native
  def transform[T2](): SimpleTransformIterator[T, T2] = js.native
  def transform[T2](options: SimpleTransformIteratorOptions[T, T2]): SimpleTransformIterator[T, T2] = js.native
}

/* static members */
@JSImport("asynciterator", "AsyncIterator")
@js.native
object AsyncIterator extends js.Object {
  var CLOSED: asynciteratorLib.asynciteratorLibNumbers.`3` = js.native
  var CLOSING: asynciteratorLib.asynciteratorLibNumbers.`2` = js.native
  var ENDED: asynciteratorLib.asynciteratorLibNumbers.`4` = js.native
  var INIT: asynciteratorLib.asynciteratorLibNumbers.`0` = js.native
  var OPEN: asynciteratorLib.asynciteratorLibNumbers.`1` = js.native
  var STATES: js.Tuple5[
    asynciteratorLib.asynciteratorLibStrings.INIT, 
    asynciteratorLib.asynciteratorLibStrings.OPEN, 
    asynciteratorLib.asynciteratorLibStrings.CLOSING, 
    asynciteratorLib.asynciteratorLibStrings.CLOSED, 
    asynciteratorLib.asynciteratorLibStrings.ENDED
  ] = js.native
  def range(): asynciteratorLib.asynciteratorMod.IntegerIterator = js.native
  def range(start: scala.Double): asynciteratorLib.asynciteratorMod.IntegerIterator = js.native
  def range(start: scala.Double, end: scala.Double): asynciteratorLib.asynciteratorMod.IntegerIterator = js.native
  def range(start: scala.Double, end: scala.Double, step: scala.Double): asynciteratorLib.asynciteratorMod.IntegerIterator = js.native
}

