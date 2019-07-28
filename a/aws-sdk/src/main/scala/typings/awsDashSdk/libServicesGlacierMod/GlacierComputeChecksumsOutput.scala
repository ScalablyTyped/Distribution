package typings.awsDashSdk.libServicesGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlacierComputeChecksumsOutput extends js.Object {
  var linearHash: String
  var treeHash: String
}

object GlacierComputeChecksumsOutput {
  @scala.inline
  def apply(linearHash: String, treeHash: String): GlacierComputeChecksumsOutput = {
    val __obj = js.Dynamic.literal(linearHash = linearHash, treeHash = treeHash)
  
    __obj.asInstanceOf[GlacierComputeChecksumsOutput]
  }
}

