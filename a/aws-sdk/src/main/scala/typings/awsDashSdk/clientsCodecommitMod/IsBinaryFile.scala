package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsBinaryFile extends js.Object {
  /**
    * The binary or non-binary status of a file in the base of a merge or pull request.
    */
  var base: js.UndefOr[CapitalBoolean] = js.undefined
  /**
    * The binary or non-binary status of a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[CapitalBoolean] = js.undefined
  /**
    * The binary or non-binary status of file in the source of a merge or pull request.
    */
  var source: js.UndefOr[CapitalBoolean] = js.undefined
}

object IsBinaryFile {
  @scala.inline
  def apply(
    base: js.UndefOr[Boolean] = js.undefined,
    destination: js.UndefOr[Boolean] = js.undefined,
    source: js.UndefOr[Boolean] = js.undefined
  ): IsBinaryFile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base)) __obj.updateDynamic("base")(base)
    if (!js.isUndefined(destination)) __obj.updateDynamic("destination")(destination)
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[IsBinaryFile]
  }
}

