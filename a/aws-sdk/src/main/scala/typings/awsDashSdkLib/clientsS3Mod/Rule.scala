package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload] = js.undefined
  /**
    * 
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.undefined
  /**
    * Unique identifier for the rule. The value cannot be longer than 255 characters.
    */
  var ID: js.UndefOr[ID] = js.undefined
  var NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] = js.undefined
  var NoncurrentVersionTransition: js.UndefOr[NoncurrentVersionTransition] = js.undefined
  /**
    * Prefix identifying one or more objects to which the rule applies.
    */
  var Prefix: awsDashSdkLib.clientsS3Mod.Prefix
  /**
    * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
    */
  var Status: ExpirationStatus
  /**
    * 
    */
  var Transition: js.UndefOr[Transition] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    Prefix: Prefix,
    Status: ExpirationStatus,
    AbortIncompleteMultipartUpload: AbortIncompleteMultipartUpload = null,
    Expiration: LifecycleExpiration = null,
    ID: ID = null,
    NoncurrentVersionExpiration: NoncurrentVersionExpiration = null,
    NoncurrentVersionTransition: NoncurrentVersionTransition = null,
    Transition: Transition = null
  ): Rule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix, Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration)
    if (NoncurrentVersionTransition != null) __obj.updateDynamic("NoncurrentVersionTransition")(NoncurrentVersionTransition)
    if (Transition != null) __obj.updateDynamic("Transition")(Transition)
    __obj.asInstanceOf[Rule]
  }
}

