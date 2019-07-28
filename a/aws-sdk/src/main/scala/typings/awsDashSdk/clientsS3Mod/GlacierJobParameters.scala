package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlacierJobParameters extends js.Object {
  /**
    * Glacier retrieval tier at which the restore will be processed.
    */
  var Tier: typings.awsDashSdk.clientsS3Mod.Tier
}

object GlacierJobParameters {
  @scala.inline
  def apply(Tier: Tier): GlacierJobParameters = {
    val __obj = js.Dynamic.literal(Tier = Tier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlacierJobParameters]
  }
}

