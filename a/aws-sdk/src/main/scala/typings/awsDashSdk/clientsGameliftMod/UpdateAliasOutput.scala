package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAliasOutput extends js.Object {
  /**
    * Object that contains the updated alias configuration.
    */
  var Alias: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.Alias] = js.undefined
}

object UpdateAliasOutput {
  @scala.inline
  def apply(Alias: Alias = null): UpdateAliasOutput = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias)
    __obj.asInstanceOf[UpdateAliasOutput]
  }
}

