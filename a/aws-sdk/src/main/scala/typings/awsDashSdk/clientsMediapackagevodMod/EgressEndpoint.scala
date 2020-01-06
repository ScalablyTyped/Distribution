package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressEndpoint extends js.Object {
  /**
    * The ID of the PackagingConfiguration being applied to the Asset.
    */
  var PackagingConfigurationId: js.UndefOr[__string] = js.native
  /**
    * The URL of the parent manifest for the repackaged Asset.
    */
  var Url: js.UndefOr[__string] = js.native
}

object EgressEndpoint {
  @scala.inline
  def apply(PackagingConfigurationId: __string = null, Url: __string = null): EgressEndpoint = {
    val __obj = js.Dynamic.literal()
    if (PackagingConfigurationId != null) __obj.updateDynamic("PackagingConfigurationId")(PackagingConfigurationId.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EgressEndpoint]
  }
}

