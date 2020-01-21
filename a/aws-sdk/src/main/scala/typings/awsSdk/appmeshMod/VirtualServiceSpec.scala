package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceSpec extends js.Object {
  /**
    * The App Mesh object that is acting as the provider for a virtual service. You can specify
    a single virtual node or virtual router.
    */
  var provider: js.UndefOr[VirtualServiceProvider] = js.native
}

object VirtualServiceSpec {
  @scala.inline
  def apply(provider: VirtualServiceProvider = null): VirtualServiceSpec = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceSpec]
  }
}

