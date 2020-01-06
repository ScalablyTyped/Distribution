package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeKeyPhrasesDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a key phrases detection job. 
    */
  var KeyPhrasesDetectionJobProperties: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.KeyPhrasesDetectionJobProperties] = js.native
}

object DescribeKeyPhrasesDetectionJobResponse {
  @scala.inline
  def apply(KeyPhrasesDetectionJobProperties: KeyPhrasesDetectionJobProperties = null): DescribeKeyPhrasesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyPhrasesDetectionJobProperties != null) __obj.updateDynamic("KeyPhrasesDetectionJobProperties")(KeyPhrasesDetectionJobProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobResponse]
  }
}

