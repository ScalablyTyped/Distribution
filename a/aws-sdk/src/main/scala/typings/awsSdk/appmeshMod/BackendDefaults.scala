package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendDefaults extends js.Object {
  /**
    * A reference to an object that represents a client policy.
    */
  var clientPolicy: js.UndefOr[ClientPolicy] = js.native
}

object BackendDefaults {
  @scala.inline
  def apply(clientPolicy: ClientPolicy = null): BackendDefaults = {
    val __obj = js.Dynamic.literal()
    if (clientPolicy != null) __obj.updateDynamic("clientPolicy")(clientPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendDefaults]
  }
}

