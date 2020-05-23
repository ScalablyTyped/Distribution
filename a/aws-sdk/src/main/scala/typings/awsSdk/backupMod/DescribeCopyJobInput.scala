package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCopyJobInput extends js.Object {
  /**
    * Uniquely identifies a copy job.
    */
  var CopyJobId: String = js.native
}

object DescribeCopyJobInput {
  @scala.inline
  def apply(CopyJobId: String): DescribeCopyJobInput = {
    val __obj = js.Dynamic.literal(CopyJobId = CopyJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCopyJobInput]
  }
}

