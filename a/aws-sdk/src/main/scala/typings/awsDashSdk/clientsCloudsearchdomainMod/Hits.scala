package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hits extends js.Object {
  /**
    * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large result set.
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * The total number of documents that match the search request.
    */
  var found: js.UndefOr[Long] = js.undefined
  /**
    * A document that matches the search request.
    */
  var hit: js.UndefOr[HitList] = js.undefined
  /**
    * The index of the first matching document.
    */
  var start: js.UndefOr[Long] = js.undefined
}

object Hits {
  @scala.inline
  def apply(
    cursor: String = null,
    found: Int | scala.Double = null,
    hit: HitList = null,
    start: Int | scala.Double = null
  ): Hits = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (found != null) __obj.updateDynamic("found")(found.asInstanceOf[js.Any])
    if (hit != null) __obj.updateDynamic("hit")(hit)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hits]
  }
}

