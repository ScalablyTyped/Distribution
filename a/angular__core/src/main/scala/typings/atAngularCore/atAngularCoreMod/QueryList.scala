package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.atAngularCoreBooleans.`true`
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "QueryList")
@js.native
class QueryList[T] () extends js.Object {
  var _results: js.Any = js.native
  val changes: Observable[_] = js.native
  val dirty: `true` = js.native
  val first: T = js.native
  val last: T = js.native
  val length: Double = js.native
  /** internal */
  def destroy(): Unit = js.native
  /**
    * See
    * [Array.filter](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter)
    */
  def filter(fn: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): js.Array[T] = js.native
  /**
    * See
    * [Array.find](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/find)
    */
  def find(fn: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): js.UndefOr[T] = js.native
  /**
    * See
    * [Array.forEach](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach)
    */
  def forEach(fn: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
  /**
    * See
    * [Array.map](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/map)
    */
  def map[U](fn: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], U]): js.Array[U] = js.native
  /**
    * Triggers a change event by emitting on the `changes` {@link EventEmitter}.
    */
  def notifyOnChanges(): Unit = js.native
  /**
    * See
    * [Array.reduce](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/reduce)
    */
  def reduce[U](
    fn: js.Function4[/* prevValue */ U, /* curValue */ T, /* curIndex */ Double, /* array */ js.Array[T], U],
    init: U
  ): U = js.native
  /**
    * Updates the stored data of the query list, and resets the `dirty` flag to `false`, so that
    * on change detection, it will not notify of changes to the queries, unless a new change
    * occurs.
    *
    * @param resultsTree The query results to store
    */
  def reset(resultsTree: js.Array[T | js.Array[_]]): Unit = js.native
  /** internal */
  def setDirty(): Unit = js.native
  /**
    * See
    * [Array.some](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/some)
    */
  def some(fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
  /**
    * Returns a copy of the internal results list as an Array.
    */
  def toArray(): js.Array[T] = js.native
}

