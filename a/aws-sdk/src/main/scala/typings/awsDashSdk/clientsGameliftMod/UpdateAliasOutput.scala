package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAliasOutput extends js.Object {
  /**
    * The updated alias resource.
    */
  var Alias: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.Alias] = js.native
}

object UpdateAliasOutput {
  @scala.inline
  def apply(Alias: Alias = null): UpdateAliasOutput = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAliasOutput]
  }
}

