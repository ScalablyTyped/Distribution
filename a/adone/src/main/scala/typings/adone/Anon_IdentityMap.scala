package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentityMap extends js.Object {
  /**
    * Whether to generate initial sourcemaps instead of using empty sourcemap
    */
  var identityMap: js.UndefOr[Boolean] = js.undefined
  var largeFile: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to load existing sourcemaps
    */
  var loadMaps: js.UndefOr[Boolean] = js.undefined
}

object Anon_IdentityMap {
  @scala.inline
  def apply(
    identityMap: js.UndefOr[Boolean] = js.undefined,
    largeFile: js.UndefOr[Boolean] = js.undefined,
    loadMaps: js.UndefOr[Boolean] = js.undefined
  ): Anon_IdentityMap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(identityMap)) __obj.updateDynamic("identityMap")(identityMap)
    if (!js.isUndefined(largeFile)) __obj.updateDynamic("largeFile")(largeFile)
    if (!js.isUndefined(loadMaps)) __obj.updateDynamic("loadMaps")(loadMaps)
    __obj.asInstanceOf[Anon_IdentityMap]
  }
}

