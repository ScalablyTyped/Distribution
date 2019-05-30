package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for tracking queries (e.g. ViewChild, ContentChild). */
@js.native
trait LQueries extends js.Object {
  /**
    * The parent LQueries instance.
    *
    * When there is a content query, a new LQueries instance is created to avoid mutating any
    * existing LQueries. After we are done searching content children, the parent property allows
    * us to traverse back up to the original LQueries instance to continue to search for matches
    * in the main view.
    */
  var parent: LQueries | scala.Null = js.native
  def addNode(tNode: TContainerNode): scala.Unit = js.native
  def addNode(tNode: TElementContainerNode): scala.Unit = js.native
  /**
    * Notify `LQueries` that a new `TNode` has been created and needs to be added to query results
    * if matching query predicate.
    */
  def addNode(tNode: ɵangular_packages_core_core_bg): scala.Unit = js.native
  /**
    * Notify `LQueries` that a new LContainer was added to ivy data structures. As a result we need
    * to prepare room for views that might be inserted into this container.
    */
  def container(): LQueries | scala.Null = js.native
  /**
    * Notify `LQueries` that a new `LView` has been created. As a result we need to prepare room
    * and collect nodes that match query predicate.
    */
  def createView(): LQueries | scala.Null = js.native
  def insertNodeBeforeViews(tNode: TContainerNode): scala.Unit = js.native
  def insertNodeBeforeViews(tNode: TElementContainerNode): scala.Unit = js.native
  /**
    * Notify `LQueries` that a new `TNode` has been created and needs to be added to query results
    * if matching query predicate. This is a special mode invoked if the query container has to
    * be created out of order (e.g. view created in the constructor of a directive).
    */
  def insertNodeBeforeViews(tNode: ɵangular_packages_core_core_bg): scala.Unit = js.native
  /**
    * Notify `LQueries` that a new `LView` has been added to `LContainer`. As a result all
    * the matching nodes from this view should be added to container's queries.
    */
  def insertView(newViewIndex: scala.Double): scala.Unit = js.native
  /**
    * Notify `LQueries` that an `LView` has been removed from `LContainer`. As a result all
    * the matching nodes from this view should be removed from container's queries.
    */
  def removeView(): scala.Unit = js.native
  /**
    * Add additional `QueryList` to track.
    *
    * @param queryList `QueryList` to update with changes.
    * @param predicate Either `Type` or selector array of [key, value] predicates.
    * @param descend If true the query will recursively apply to the children.
    * @param read Indicates which token should be read from DI for this query.
    */
  def track[T](queryList: QueryList[T], predicate: Type[_]): scala.Unit = js.native
  def track[T](queryList: QueryList[T], predicate: Type[_], descend: scala.Boolean): scala.Unit = js.native
  def track[T](queryList: QueryList[T], predicate: Type[_], descend: scala.Boolean, read: Type[T]): scala.Unit = js.native
  def track[T](queryList: QueryList[T], predicate: js.Array[java.lang.String]): scala.Unit = js.native
  def track[T](queryList: QueryList[T], predicate: js.Array[java.lang.String], descend: scala.Boolean): scala.Unit = js.native
  def track[T](
    queryList: QueryList[T],
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean,
    read: Type[T]
  ): scala.Unit = js.native
}

