package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterRequest extends js.Object {
  /**
    * The name of your cluster. If you do not specify a name for your cluster, you create a cluster named default. Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed. 
    */
  var clusterName: js.UndefOr[String] = js.undefined
  /**
    * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object CreateClusterRequest {
  @scala.inline
  def apply(clusterName: String = null, tags: Tags = null): CreateClusterRequest = {
    val __obj = js.Dynamic.literal()
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

