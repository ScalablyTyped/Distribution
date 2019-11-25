package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSceneUpdateFromOptions extends Object {
  /**
    * Do not update the initial environment from the view, defaults to false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var environmentExcluded: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not update the thumbnail from the view. Defaults to true, unless viewpointExcluded is set to true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var thumbnailExcluded: js.UndefOr[Boolean] = js.undefined
  /**
    * The size of the thumbnail. Defaults to 600x400 (ratio 1.5:1). Note that the thumbnail size may currently not be larger than the size of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var thumbnailSize: js.UndefOr[WebSceneUpdateFromOptionsThumbnailSize] = js.undefined
  /**
    * Do not update the initial viewpoint from the view, defaults to false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var viewpointExcluded: js.UndefOr[Boolean] = js.undefined
}

object WebSceneUpdateFromOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    environmentExcluded: js.UndefOr[Boolean] = js.undefined,
    thumbnailExcluded: js.UndefOr[Boolean] = js.undefined,
    thumbnailSize: WebSceneUpdateFromOptionsThumbnailSize = null,
    viewpointExcluded: js.UndefOr[Boolean] = js.undefined
  ): WebSceneUpdateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(environmentExcluded)) __obj.updateDynamic("environmentExcluded")(environmentExcluded.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnailExcluded)) __obj.updateDynamic("thumbnailExcluded")(thumbnailExcluded.asInstanceOf[js.Any])
    if (thumbnailSize != null) __obj.updateDynamic("thumbnailSize")(thumbnailSize.asInstanceOf[js.Any])
    if (!js.isUndefined(viewpointExcluded)) __obj.updateDynamic("viewpointExcluded")(viewpointExcluded.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSceneUpdateFromOptions]
  }
}

