package typings
package atAngularCoreLib.srcRender3QueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LQuery[T] extends js.Object {
  /**
    * A pointer to an array that stores collected values from views. This is necessary so we know a
    * container into which to insert nodes collected from views.
    */
  var containerValues: js.Array[_] | scala.Null
  /**
    * Destination to which the value should be added.
    */
  var list: QueryList[T]
  /**
    * Next query. Used when queries are stored as a linked list in `LQueries`.
    */
  var next: LQuery[_] | scala.Null
  /**
    * A predicate which determines if a given element/directive should be included in the query
    * results.
    */
  var predicate: QueryPredicate[T]
  /**
    * Values which have been located.
    *
    * This is what builds up the `QueryList._valuesTree`.
    */
  var values: js.Array[_]
}

object LQuery {
  @scala.inline
  def apply[T](
    list: QueryList[T],
    predicate: QueryPredicate[T],
    values: js.Array[_],
    containerValues: js.Array[_] = null,
    next: LQuery[_] = null
  ): LQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("predicate")(predicate)
    __obj.updateDynamic("values")(values)
    if (containerValues != null) __obj.updateDynamic("containerValues")(containerValues)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[LQuery[T]]
  }
}

