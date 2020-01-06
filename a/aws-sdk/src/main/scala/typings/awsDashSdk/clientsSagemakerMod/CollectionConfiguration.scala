package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionConfiguration extends js.Object {
  /**
    * The name of the tensor collection.
    */
  var CollectionName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CollectionName] = js.native
  /**
    * Parameter values for the tensor collection. The allowed parameters are "name", "include_regex", "reduction_config", "save_config", "tensor_names", and "save_histogram".
    */
  var CollectionParameters: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CollectionParameters] = js.native
}

object CollectionConfiguration {
  @scala.inline
  def apply(CollectionName: CollectionName = null, CollectionParameters: CollectionParameters = null): CollectionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CollectionName != null) __obj.updateDynamic("CollectionName")(CollectionName.asInstanceOf[js.Any])
    if (CollectionParameters != null) __obj.updateDynamic("CollectionParameters")(CollectionParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionConfiguration]
  }
}

