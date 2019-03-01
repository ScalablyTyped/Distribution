package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndSourceOptions[S, T] extends js.Object {
  /**
    * Whether to end the stream when all the given streams end
    */
  var end: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Options for the initial core stream
    */
  var sourceOptions: js.UndefOr[adoneLib.adoneNs.streamNs.coreNs.INs.ConstructorOptions[S, T]] = js.undefined
}

object Anon_EndSourceOptions {
  @scala.inline
  def apply[S, T](
    end: js.UndefOr[scala.Boolean] = js.undefined,
    sourceOptions: adoneLib.adoneNs.streamNs.coreNs.INs.ConstructorOptions[S, T] = null
  ): Anon_EndSourceOptions[S, T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (sourceOptions != null) __obj.updateDynamic("sourceOptions")(sourceOptions)
    __obj.asInstanceOf[Anon_EndSourceOptions[S, T]]
  }
}

