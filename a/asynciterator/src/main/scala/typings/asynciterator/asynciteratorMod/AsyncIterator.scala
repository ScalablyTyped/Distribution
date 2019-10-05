package typings.asynciterator.asynciteratorMod

import org.scalablytyped.runtime.StringDictionary
import typings.asynciterator.asynciteratorNumbers.`0`
import typings.asynciterator.asynciteratorNumbers.`1`
import typings.asynciterator.asynciteratorNumbers.`2`
import typings.asynciterator.asynciteratorNumbers.`3`
import typings.asynciterator.asynciteratorNumbers.`4`
import typings.asynciterator.asynciteratorStrings.CLOSED
import typings.asynciterator.asynciteratorStrings.CLOSING
import typings.asynciterator.asynciteratorStrings.ENDED
import typings.asynciterator.asynciteratorStrings.INIT
import typings.asynciterator.asynciteratorStrings.OPEN
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "AsyncIterator")
@js.native
abstract class AsyncIterator[T] () extends EventEmitter {
  var _destination: js.UndefOr[AsyncIterator[_]] = js.native
  var _readable: Boolean = js.native
  var _state: Double = js.native
  var closed: Boolean = js.native
  var ended: Boolean = js.native
  var readable: Boolean = js.native
  // tslint:disable-next-line ban-types
  /* private */ def _addSingleListener(eventName: String, listener: js.Function): Unit = js.native
  /* private */ def _addSingleListener(eventName: js.Symbol, listener: js.Function): Unit = js.native
  def _changeState(newState: Double): Unit = js.native
  def _changeState(newState: Double, eventAsync: Boolean): Unit = js.native
  def _end(): Unit = js.native
  /* private */ def _hasListeners(eventName: String): Boolean = js.native
  /* private */ def _hasListeners(eventName: js.Symbol): Boolean = js.native
  def _toStringDetails(): String = js.native
  def append[T](items: js.Array[T]): SimpleTransformIterator[T, T] = js.native
  def close(): Unit = js.native
  def copyProperties(source: AsyncIterator[_], propertyNames: js.Array[String]): Unit = js.native
  def each(callback: js.Function1[/* data */ T, Unit]): Unit = js.native
  def each(callback: js.Function1[/* data */ T, Unit], self: js.Any): Unit = js.native
  def filter(filter: js.Function1[/* item */ T, Boolean]): SimpleTransformIterator[T, T] = js.native
  def filter(filter: js.Function1[/* item */ T, Boolean], self: js.Object): SimpleTransformIterator[T, T] = js.native
  def getProperties(): StringDictionary[js.Any] = js.native
  def getProperty(propertyName: String): js.Any = js.native
  def getProperty(propertyName: String, callback: js.Function1[/* value */ js.Any, Unit]): js.Any = js.native
  def map[T2](mapper: js.Function1[/* item */ T, T2]): SimpleTransformIterator[T, T2] = js.native
  def map[T2](mapper: js.Function1[/* item */ T, T2], self: js.Object): SimpleTransformIterator[T, T2] = js.native
  def prepend(items: js.Array[T]): SimpleTransformIterator[T, T] = js.native
  def range[T](start: Double, end: Double): SimpleTransformIterator[T, T] = js.native
  def read(): T = js.native
  def setProperties(properties: StringDictionary[js.Any]): Unit = js.native
  def setProperty(propertyName: String, value: js.Any): Unit = js.native
  def skip[T](offset: Double): SimpleTransformIterator[T, T] = js.native
  def surround[T](prepend: js.Array[T], append: js.Array[T]): SimpleTransformIterator[T, T] = js.native
  def take[T](limit: Double): SimpleTransformIterator[T, T] = js.native
  def transform[T2](): SimpleTransformIterator[T, T2] = js.native
  def transform[T2](options: SimpleTransformIteratorOptions[T, T2]): SimpleTransformIterator[T, T2] = js.native
}

/* static members */
@JSImport("asynciterator", "AsyncIterator")
@js.native
object AsyncIterator extends js.Object {
  var CLOSED: `3` = js.native
  var CLOSING: `2` = js.native
  var ENDED: `4` = js.native
  var INIT: `0` = js.native
  var OPEN: `1` = js.native
  var STATES: js.Tuple5[INIT, OPEN, CLOSING, CLOSED, ENDED] = js.native
  def range(): IntegerIterator = js.native
  def range(start: Double): IntegerIterator = js.native
  def range(start: Double, end: Double): IntegerIterator = js.native
  def range(start: Double, end: Double, step: Double): IntegerIterator = js.native
}

