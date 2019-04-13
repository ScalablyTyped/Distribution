package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRule extends js.Object {
  var AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload] = js.undefined
  /**
    * 
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.undefined
  var Filter: js.UndefOr[LifecycleRuleFilter] = js.undefined
  /**
    * Unique identifier for the rule. The value cannot be longer than 255 characters.
    */
  var ID: js.UndefOr[ID] = js.undefined
  var NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] = js.undefined
  /**
    * 
    */
  var NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList] = js.undefined
  /**
    * Prefix identifying one or more objects to which the rule applies. This is No longer used; use Filter instead.
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
    */
  var Status: ExpirationStatus
  /**
    * 
    */
  var Transitions: js.UndefOr[TransitionList] = js.undefined
}

object LifecycleRule {
  @scala.inline
  def apply(
    Status: ExpirationStatus,
    AbortIncompleteMultipartUpload: AbortIncompleteMultipartUpload = null,
    Expiration: LifecycleExpiration = null,
    Filter: LifecycleRuleFilter = null,
    ID: ID = null,
    NoncurrentVersionExpiration: NoncurrentVersionExpiration = null,
    NoncurrentVersionTransitions: NoncurrentVersionTransitionList = null,
    Prefix: Prefix = null,
    Transitions: TransitionList = null
  ): LifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration)
    if (NoncurrentVersionTransitions != null) __obj.updateDynamic("NoncurrentVersionTransitions")(NoncurrentVersionTransitions)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Transitions != null) __obj.updateDynamic("Transitions")(Transitions)
    __obj.asInstanceOf[LifecycleRule]
  }
}

