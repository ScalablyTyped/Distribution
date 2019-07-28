package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChefConfiguration extends js.Object {
  /**
    * The Berkshelf version.
    */
  var BerkshelfVersion: js.UndefOr[String] = js.undefined
  /**
    * Whether to enable Berkshelf.
    */
  var ManageBerkshelf: js.UndefOr[Boolean] = js.undefined
}

object ChefConfiguration {
  @scala.inline
  def apply(BerkshelfVersion: String = null, ManageBerkshelf: js.UndefOr[Boolean] = js.undefined): ChefConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BerkshelfVersion != null) __obj.updateDynamic("BerkshelfVersion")(BerkshelfVersion)
    if (!js.isUndefined(ManageBerkshelf)) __obj.updateDynamic("ManageBerkshelf")(ManageBerkshelf)
    __obj.asInstanceOf[ChefConfiguration]
  }
}

