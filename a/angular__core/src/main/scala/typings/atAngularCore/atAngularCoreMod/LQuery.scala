package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface that represents query-related information specific to a view instance. Most notably
  * it contains:
  * - materialized query matches;
  * - a pointer to a QueryList where materialized query results should be reported.
  */
trait LQuery[T] extends js.Object {
  /**
    * Materialized query matches for a given view only (!). Results are initialized lazily so the
    * array of matches is set to `null` initially.
    */
  var matches: (js.Array[T | Null]) | Null
  /**
    * A QueryList where materialized query results should be reported.
    */
  var queryList: QueryList[T]
  /**
    * Called when an embedded view, impacting results of this query, is inserted or removed.
    */
  def setDirty(): Unit
}

object LQuery {
  @scala.inline
  def apply[T](queryList: QueryList[T], setDirty: () => Unit, matches: js.Array[T | Null] = null): LQuery[T] = {
    val __obj = js.Dynamic.literal(queryList = queryList.asInstanceOf[js.Any], setDirty = js.Any.fromFunction0(setDirty))
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[LQuery[T]]
  }
}

