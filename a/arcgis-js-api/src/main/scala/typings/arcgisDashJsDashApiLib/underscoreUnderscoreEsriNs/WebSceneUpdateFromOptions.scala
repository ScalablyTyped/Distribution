package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSceneUpdateFromOptions
  extends stdLib.Object {
  /**
    * do not update the initial environment from the view, defaults to false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var environmentExcluded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * do not update the thumbnail from the view, defaults to viewpointExcluded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var thumbnailExcluded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * the size of the thumbnail. Defaults to 600x400 (ratio 1.5:1). Note that the thumbnail size may currently not be larger than the size of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var thumbnailSize: js.UndefOr[WebSceneUpdateFromOptionsThumbnailSize] = js.undefined
  /**
    * do not update the initial viewpoint from the view, defaults to false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var viewpointExcluded: js.UndefOr[scala.Boolean] = js.undefined
}

object WebSceneUpdateFromOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    environmentExcluded: js.UndefOr[scala.Boolean] = js.undefined,
    thumbnailExcluded: js.UndefOr[scala.Boolean] = js.undefined,
    thumbnailSize: WebSceneUpdateFromOptionsThumbnailSize = null,
    viewpointExcluded: js.UndefOr[scala.Boolean] = js.undefined
  ): WebSceneUpdateFromOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (!js.isUndefined(environmentExcluded)) __obj.updateDynamic("environmentExcluded")(environmentExcluded)
    if (!js.isUndefined(thumbnailExcluded)) __obj.updateDynamic("thumbnailExcluded")(thumbnailExcluded)
    if (thumbnailSize != null) __obj.updateDynamic("thumbnailSize")(thumbnailSize)
    if (!js.isUndefined(viewpointExcluded)) __obj.updateDynamic("viewpointExcluded")(viewpointExcluded)
    __obj.asInstanceOf[WebSceneUpdateFromOptions]
  }
}

