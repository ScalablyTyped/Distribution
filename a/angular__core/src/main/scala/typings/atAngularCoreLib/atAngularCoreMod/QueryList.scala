package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "QueryList")
@js.native
class QueryList[T] () extends js.Object {
  var _results: js.Any = js.native
  val changes: rxjsLib.rxjsMod.Observable[_] = js.native
  val dirty: atAngularCoreLib.atAngularCoreLibNumbers.`true` = js.native
  val first: T = js.native
  val last: T = js.native
  val length: scala.Double = js.native
  /** internal */
  def destroy(): scala.Unit = js.native
  /**
    * See
    * [Array.filter](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter)
    */
  def filter(fn: js.Function3[/* item */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]): js.Array[T] = js.native
  /**
    * See
    * [Array.find](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/find)
    */
  def find(fn: js.Function3[/* item */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]): js.UndefOr[T] = js.native
  /**
    * See
    * [Array.forEach](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach)
    */
  def forEach(fn: js.Function3[/* item */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]): scala.Unit = js.native
  /**
    * See
    * [Array.map](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/map)
    */
  def map[U](fn: js.Function3[/* item */ T, /* index */ scala.Double, /* array */ js.Array[T], U]): js.Array[U] = js.native
  /**
    * Triggers a change event by emitting on the `changes` {@link EventEmitter}.
    */
  def notifyOnChanges(): scala.Unit = js.native
  /**
    * See
    * [Array.reduce](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/reduce)
    */
  def reduce[U](
    fn: js.Function4[
      /* prevValue */ U, 
      /* curValue */ T, 
      /* curIndex */ scala.Double, 
      /* array */ js.Array[T], 
      U
    ],
    init: U
  ): U = js.native
  /**
    * Updates the stored data of the query list, and resets the `dirty` flag to `false`, so that
    * on change detection, it will not notify of changes to the queries, unless a new change
    * occurs.
    *
    * @param resultsTree The results tree to store
    */
  def reset(resultsTree: js.Array[T | js.Array[_]]): scala.Unit = js.native
  /** internal */
  def setDirty(): scala.Unit = js.native
  /**
    * See
    * [Array.some](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/some)
    */
  def some(fn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]): scala.Boolean = js.native
  /**
    * Returns a copy of the internal results list as an Array.
    */
  def toArray(): js.Array[T] = js.native
}

