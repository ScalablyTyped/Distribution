package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMapUpdateFromOptions extends Object {
  /**
    * When `true`, the view's background will not be updated for the webmap. The default is `false` meaning the background will be updated for the webmap if there is a background.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var backgroundExcluded: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, the view's scale will be updated for the webmap. Defaults to `false` meaning view's scale will not be updated for the webmap. It is ignored when `viewpointExcluded` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var scalePreserved: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, the thumbnail will not be updated for the webmap. Defaults to `false` meaning the thumbnail will be updated for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var thumbnailExcluded: js.UndefOr[Boolean] = js.native
  /**
    * The size of the thumbnail. Defaults to 600x400 (ratio 1.5:1). Note that the thumbnail size may currently not be larger than the size of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var thumbnailSize: js.UndefOr[WebMapUpdateFromOptionsThumbnailSize] = js.native
  /**
    * When `true`, the initial [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint) of the view will not be updated for the webmap. Defaults to `false`, meaning the viewpoint will be updated for the webmap. Must set `scalePreserved` to `true` if the view's scale should be updated for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var viewpointExcluded: js.UndefOr[Boolean] = js.native
}

object WebMapUpdateFromOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebMapUpdateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebMapUpdateFromOptions]
  }
  @scala.inline
  implicit class WebMapUpdateFromOptionsOps[Self <: WebMapUpdateFromOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundExcluded(value: Boolean): Self = this.set("backgroundExcluded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundExcluded: Self = this.set("backgroundExcluded", js.undefined)
    @scala.inline
    def setScalePreserved(value: Boolean): Self = this.set("scalePreserved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalePreserved: Self = this.set("scalePreserved", js.undefined)
    @scala.inline
    def setThumbnailExcluded(value: Boolean): Self = this.set("thumbnailExcluded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailExcluded: Self = this.set("thumbnailExcluded", js.undefined)
    @scala.inline
    def setThumbnailSize(value: WebMapUpdateFromOptionsThumbnailSize): Self = this.set("thumbnailSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailSize: Self = this.set("thumbnailSize", js.undefined)
    @scala.inline
    def setViewpointExcluded(value: Boolean): Self = this.set("viewpointExcluded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewpointExcluded: Self = this.set("viewpointExcluded", js.undefined)
  }
  
}

