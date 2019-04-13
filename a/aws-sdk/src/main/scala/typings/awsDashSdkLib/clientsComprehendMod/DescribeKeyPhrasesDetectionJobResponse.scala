package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeKeyPhrasesDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a key phrases detection job. 
    */
  var KeyPhrasesDetectionJobProperties: js.UndefOr[KeyPhrasesDetectionJobProperties] = js.undefined
}

object DescribeKeyPhrasesDetectionJobResponse {
  @scala.inline
  def apply(KeyPhrasesDetectionJobProperties: KeyPhrasesDetectionJobProperties = null): DescribeKeyPhrasesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyPhrasesDetectionJobProperties != null) __obj.updateDynamic("KeyPhrasesDetectionJobProperties")(KeyPhrasesDetectionJobProperties)
    __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobResponse]
  }
}

