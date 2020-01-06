package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FargateProfileSelector extends js.Object {
  /**
    * The Kubernetes labels that the selector should match. A pod must contain all of the labels that are specified in the selector for it to be considered a match.
    */
  var labels: js.UndefOr[FargateProfileLabel] = js.native
  /**
    * The Kubernetes namespace that the selector should match.
    */
  var namespace: js.UndefOr[String] = js.native
}

object FargateProfileSelector {
  @scala.inline
  def apply(labels: FargateProfileLabel = null, namespace: String = null): FargateProfileSelector = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[FargateProfileSelector]
  }
}

