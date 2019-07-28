package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationRuleAndOperator extends js.Object {
  /**
    * 
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.undefined
  /**
    * 
    */
  var Tags: js.UndefOr[TagSet] = js.undefined
}

object ReplicationRuleAndOperator {
  @scala.inline
  def apply(Prefix: Prefix = null, Tags: TagSet = null): ReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ReplicationRuleAndOperator]
  }
}

