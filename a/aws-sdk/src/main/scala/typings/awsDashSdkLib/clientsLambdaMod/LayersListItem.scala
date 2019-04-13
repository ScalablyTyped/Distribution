package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersListItem extends js.Object {
  /**
    * The newest version of the layer.
    */
  var LatestMatchingVersion: js.UndefOr[LayerVersionsListItem] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var LayerArn: js.UndefOr[LayerArn] = js.undefined
  /**
    * The name of the layer.
    */
  var LayerName: js.UndefOr[LayerName] = js.undefined
}

object LayersListItem {
  @scala.inline
  def apply(
    LatestMatchingVersion: LayerVersionsListItem = null,
    LayerArn: LayerArn = null,
    LayerName: LayerName = null
  ): LayersListItem = {
    val __obj = js.Dynamic.literal()
    if (LatestMatchingVersion != null) __obj.updateDynamic("LatestMatchingVersion")(LatestMatchingVersion)
    if (LayerArn != null) __obj.updateDynamic("LayerArn")(LayerArn)
    if (LayerName != null) __obj.updateDynamic("LayerName")(LayerName)
    __obj.asInstanceOf[LayersListItem]
  }
}

