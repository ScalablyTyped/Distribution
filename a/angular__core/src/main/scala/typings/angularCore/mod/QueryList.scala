package typings.angularCore.mod

import typings.rxjs.mod.Observable_
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "QueryList")
@js.native
/**
  * @param emitDistinctChangesOnly Whether `QueryList.changes` should fire only when actual change
  *     has occurred. Or if it should fire when query is recomputed. (recomputing could resolve in
  *     the same result)
  */
open class QueryList[T] ()
  extends StObject
     with Iterable[T] {
  def this(_emitDistinctChangesOnly: Boolean) = this()
  
  /* private */ var _changes: Any = js.native
  
  /* private */ var _changesDetected: Any = js.native
  
  /* private */ var _emitDistinctChangesOnly: Any = js.native
  
  /* private */ var _results: Any = js.native
  
  /**
    * Returns `Observable` of `QueryList` notifying the subscriber of changes.
    */
  def changes: Observable_[Any] = js.native
  
  /** internal */
  def destroy(): Unit = js.native
  
  val dirty: /* true */ Boolean = js.native
  
  def filter(predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Any]): js.Array[T] = js.native
  /**
    * See
    * [Array.filter](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter)
    */
  @JSName("filter")
  def filter_S[S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], /* is S */ Boolean]
  ): js.Array[S] = js.native
  
  /**
    * See
    * [Array.find](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/find)
    */
  def find(fn: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): js.UndefOr[T] = js.native
  
  val first: T = js.native
  
  /**
    * See
    * [Array.forEach](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach)
    */
  def forEach(fn: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
  
  /**
    * Returns the QueryList entry at `index`.
    */
  def get(index: Double): js.UndefOr[T] = js.native
  
  val last: T = js.native
  
  val length: Double = js.native
  
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
    * @param identityAccessor Optional function for extracting stable object identity from a value
    *    in the array. This function is executed for each element of the query result list while
    *    comparing current query list with the new one (provided as a first argument of the `reset`
    *    function) to detect if the lists are different. If the function is not provided, elements
    *    are compared as is (without any pre-processing).
    */
  def reset(resultsTree: js.Array[T | js.Array[Any]]): Unit = js.native
  def reset(resultsTree: js.Array[T | js.Array[Any]], identityAccessor: js.Function1[/* value */ T, Any]): Unit = js.native
  
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
