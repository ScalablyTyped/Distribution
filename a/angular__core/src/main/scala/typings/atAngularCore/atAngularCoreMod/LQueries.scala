package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for tracking queries (e.g. ViewChild, ContentChild). */
@js.native
trait LQueries extends js.Object {
  /**
    * The index of the node on which this LQueries instance was created / cloned in a given LView.
    *
    * This index is stored to minimize LQueries cloning: we can observe that LQueries can be mutated
    * only under 2 conditions:
    * - we are crossing an element that has directives with content queries (new queries are added);
    * - we are descending into element hierarchy (creating a child element of an existing element)
    * and the current LQueries object is tracking shallow queries (shallow queries are removed).
    *
    * Since LQueries are not cloned systematically we need to know exactly where (on each element)
    * cloning occurred, so we can properly restore the set of tracked queries when going up the
    * elements hierarchy.
    *
    * Always set to -1 for view queries as view queries are created before we process any node in a
    * given view.
    */
  var nodeIndex: Double = js.native
  /**
    * The parent LQueries instance.
    *
    * When there is a content query, a new LQueries instance is created to avoid mutating any
    * existing LQueries. After we are done searching content children, the parent property allows
    * us to traverse back up to the original LQueries instance to continue to search for matches
    * in the main view.
    */
  var parent: LQueries | Null = js.native
  def addNode(tNode: TContainerNode): Unit = js.native
  def addNode(tNode: TElementContainerNode): Unit = js.native
  /**
    * Notify `LQueries` that a new `TNode` has been created and needs to be added to query results
    * if matching query predicate.
    */
  def addNode(tNode: ɵangular_packages_core_core_bg): Unit = js.native
  /**
    * Ask queries to prepare a copy of itself. This ensures that:
    * - tracking new queries on content nodes doesn't mutate list of queries tracked on a parent
    * node;
    * - we don't track shallow queries when descending into elements hierarchy.
    *
    * We will clone LQueries before constructing content queries
    */
  def clone(tNode: TNode): LQueries = js.native
  /**
    * Notify `LQueries` that a new LContainer was added to ivy data structures. As a result we need
    * to prepare room for views that might be inserted into this container.
    */
  def container(): LQueries | Null = js.native
  /**
    * Notify `LQueries` that a new `LView` has been created. As a result we need to prepare room
    * and collect nodes that match query predicate.
    */
  def createView(): LQueries | Null = js.native
  def insertNodeBeforeViews(tNode: TContainerNode): Unit = js.native
  def insertNodeBeforeViews(tNode: TElementContainerNode): Unit = js.native
  /**
    * Notify `LQueries` that a new `TNode` has been created and needs to be added to query results
    * if matching query predicate. This is a special mode invoked if the query container has to
    * be created out of order (e.g. view created in the constructor of a directive).
    */
  def insertNodeBeforeViews(tNode: ɵangular_packages_core_core_bg): Unit = js.native
  /**
    * Notify `LQueries` that a new `LView` has been added to `LContainer`. As a result all
    * the matching nodes from this view should be added to container's queries.
    */
  def insertView(newViewIndex: Double): Unit = js.native
  /**
    * Notify `LQueries` that an `LView` has been removed from `LContainer`. As a result all
    * the matching nodes from this view should be removed from container's queries.
    */
  def removeView(): Unit = js.native
  def track[T](queryList: QueryList[T], predicate: js.Array[String]): Unit = js.native
  def track[T](queryList: QueryList[T], predicate: js.Array[String], descend: Boolean): Unit = js.native
  def track[T](queryList: QueryList[T], predicate: js.Array[String], descend: Boolean, read: Type[T]): Unit = js.native
  /**
    * Add additional `QueryList` to track.
    *
    * @param queryList `QueryList` to update with changes.
    * @param predicate Either `Type` or selector array of [key, value] predicates.
    * @param descend If true the query will recursively apply to the children.
    * @param read Indicates which token should be read from DI for this query.
    */
  def track[T](queryList: QueryList[T], predicate: Type[_]): Unit = js.native
  def track[T](queryList: QueryList[T], predicate: Type[_], descend: Boolean): Unit = js.native
  def track[T](queryList: QueryList[T], predicate: Type[_], descend: Boolean, read: Type[T]): Unit = js.native
}

