package typings
package adoneLib.adoneNs.collectionNs.INs.LRUNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions[K, V] extends js.Object {
  /**
    * Function that is called on items when they are dropped from the cache
    */
  var dispose: js.UndefOr[js.Function2[/* key */ K, /* value */ V, scala.Unit]] = js.undefined
  /**
    * Function that is used to calculate the length of stored items
    */
  var length: js.UndefOr[LengthCalculator[K, V]] = js.undefined
  /**
    * Maximum age in ms. Items are not pro-actively pruned out as they age,
    * but if you try to get an item that is too old,
    * it'll drop it and return undefined instead of giving it to you
    */
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum size of the cache, checked by applying the length function to all values in the cache.
    * Default is Infinity
    */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Dispose will only be called when a key falls out of the cache, not when it is overwritten
    */
  var noDisposeOnSet: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to return the stale value before deleting it
    */
  var stale: js.UndefOr[scala.Boolean] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply[K, V](
    dispose: js.Function2[/* key */ K, /* value */ V, scala.Unit] = null,
    length: LengthCalculator[K, V] = null,
    maxAge: scala.Int | scala.Double = null,
    maxSize: scala.Int | scala.Double = null,
    noDisposeOnSet: js.UndefOr[scala.Boolean] = js.undefined,
    stale: js.UndefOr[scala.Boolean] = js.undefined
  ): ConstructorOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    if (dispose != null) __obj.updateDynamic("dispose")(dispose)
    if (length != null) __obj.updateDynamic("length")(length)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (!js.isUndefined(noDisposeOnSet)) __obj.updateDynamic("noDisposeOnSet")(noDisposeOnSet)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    __obj.asInstanceOf[ConstructorOptions[K, V]]
  }
}

