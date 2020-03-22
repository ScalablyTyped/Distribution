package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasPendingMappingsOptions extends js.Object {
  /**
    * If the clusters pending mapping state should be on the response.
    *
    * @default false
    *
    * @internal
    */
  val getClusters: js.UndefOr[Boolean] = js.undefined
  /**
    * If the clusters pending mapping state should be on the response.
    *
    * @default false
    */
  val retrieveMappings: js.UndefOr[Boolean] = js.undefined
}

object HasPendingMappingsOptions {
  @scala.inline
  def apply(
    getClusters: js.UndefOr[Boolean] = js.undefined,
    retrieveMappings: js.UndefOr[Boolean] = js.undefined
  ): HasPendingMappingsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(getClusters)) __obj.updateDynamic("getClusters")(getClusters.asInstanceOf[js.Any])
    if (!js.isUndefined(retrieveMappings)) __obj.updateDynamic("retrieveMappings")(retrieveMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasPendingMappingsOptions]
  }
}

