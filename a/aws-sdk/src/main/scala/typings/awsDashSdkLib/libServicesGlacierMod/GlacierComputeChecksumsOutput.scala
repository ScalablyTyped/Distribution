package typings
package awsDashSdkLib.libServicesGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlacierComputeChecksumsOutput extends js.Object {
  var linearHash: java.lang.String
  var treeHash: java.lang.String
}

object GlacierComputeChecksumsOutput {
  @scala.inline
  def apply(linearHash: java.lang.String, treeHash: java.lang.String): GlacierComputeChecksumsOutput = {
    val __obj = js.Dynamic.literal(linearHash = linearHash, treeHash = treeHash)
  
    __obj.asInstanceOf[GlacierComputeChecksumsOutput]
  }
}

