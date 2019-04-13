package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketAclOutput extends js.Object {
  /**
    * A list of grants.
    */
  var Grants: js.UndefOr[Grants] = js.undefined
  /**
    * 
    */
  var Owner: js.UndefOr[Owner] = js.undefined
}

object GetBucketAclOutput {
  @scala.inline
  def apply(Grants: Grants = null, Owner: Owner = null): GetBucketAclOutput = {
    val __obj = js.Dynamic.literal()
    if (Grants != null) __obj.updateDynamic("Grants")(Grants)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    __obj.asInstanceOf[GetBucketAclOutput]
  }
}

