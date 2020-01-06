package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessControlTranslation extends js.Object {
  /**
    * Specifies the replica ownership. For default and valid values, see PUT bucket replication in the Amazon Simple Storage Service API Reference.
    */
  var Owner: OwnerOverride = js.native
}

object AccessControlTranslation {
  @scala.inline
  def apply(Owner: OwnerOverride): AccessControlTranslation = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccessControlTranslation]
  }
}

