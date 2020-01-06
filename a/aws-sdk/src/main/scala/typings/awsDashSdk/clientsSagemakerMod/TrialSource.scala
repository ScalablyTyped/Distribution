package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: TrialSourceArn = js.native
  /**
    * The source job type.
    */
  var SourceType: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SourceType] = js.native
}

object TrialSource {
  @scala.inline
  def apply(SourceArn: TrialSourceArn, SourceType: SourceType = null): TrialSource = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialSource]
  }
}

