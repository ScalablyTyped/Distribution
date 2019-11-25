package typings.appDashBuilderDashLib.outAsarIntegrityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsarIntegrityOptions extends js.Object {
  /**
    * Allows external asar files.
    *
    * @default false
    */
  val externalAllowed: js.UndefOr[Boolean] = js.undefined
}

object AsarIntegrityOptions {
  @scala.inline
  def apply(externalAllowed: js.UndefOr[Boolean] = js.undefined): AsarIntegrityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(externalAllowed)) __obj.updateDynamic("externalAllowed")(externalAllowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsarIntegrityOptions]
  }
}

