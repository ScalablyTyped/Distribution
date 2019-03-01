package typings
package adoneLib.adoneNs.streamNs.coreNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions[S, T] extends js.Object {
  /**
    * Whether the initial stream is asynchronous
    */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The initial flush function
    */
  var flush: js.UndefOr[FlushFunction[T]] = js.undefined
  /**
    * Whether the initial stream is synchronous
    */
  var sync: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The initial transform (passthrough is default)
    */
  var transform: js.UndefOr[TransformFunction[S, T]] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply[S, T](
    async: js.UndefOr[scala.Boolean] = js.undefined,
    flush: FlushFunction[T] = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined,
    transform: TransformFunction[S, T] = null
  ): ConstructorOptions[S, T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (flush != null) __obj.updateDynamic("flush")(flush)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[ConstructorOptions[S, T]]
  }
}

