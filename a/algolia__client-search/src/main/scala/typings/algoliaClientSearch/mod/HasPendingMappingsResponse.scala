package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasPendingMappingsResponse extends js.Object {
  /**
    * Describe cluster pending (migrating, creating, deleting) mapping state.
    */
  val clusters: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  /**
    * If there is any clusters with pending mapping state.
    */
  val pending: Boolean
}

object HasPendingMappingsResponse {
  @scala.inline
  def apply(pending: Boolean, clusters: StringDictionary[js.Array[String]] = null): HasPendingMappingsResponse = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any])
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasPendingMappingsResponse]
  }
}

