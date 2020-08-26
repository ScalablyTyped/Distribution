package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay that covers an area of the map with bitmap tiles.
  */
@js.native
trait TileOverlay extends js.Object {
  /**
    * Custom data used to populate the URL template.
    */
  var data: js.Object = js.native
  /**
    * Maximum zoom level of the overlay.
    */
  var maximumZ: Double = js.native
  /**
    * Minimum zoom level of the overlay.
    */
  var minimumZ: Double = js.native
  /**
    * Opacity level of the overlay.
    */
  var opacity: Double = js.native
  /**
    * A string, or callback function that returns a string, with a URL that
    * provides the requested tile.
    */
  var urlTemplate: String | URLTemplateCallback = js.native
  /**
    * Reloads the tile overlay for the displayed map region with the latest
    * data values.
    */
  def reload(): Unit = js.native
}

object TileOverlay {
  @scala.inline
  def apply(
    data: js.Object,
    maximumZ: Double,
    minimumZ: Double,
    opacity: Double,
    reload: () => Unit,
    urlTemplate: String | URLTemplateCallback
  ): TileOverlay = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maximumZ = maximumZ.asInstanceOf[js.Any], minimumZ = minimumZ.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), urlTemplate = urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOverlay]
  }
  @scala.inline
  implicit class TileOverlayOps[Self <: TileOverlay] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumZ(value: Double): Self = this.set("maximumZ", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumZ(value: Double): Self = this.set("minimumZ", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setReload(value: () => Unit): Self = this.set("reload", js.Any.fromFunction0(value))
    @scala.inline
    def setUrlTemplateFunction5(
      value: (/* x */ Double, /* y */ Double, /* z */ Double, /* scale */ Double, /* data */ js.Object) => String
    ): Self = this.set("urlTemplate", js.Any.fromFunction5(value))
    @scala.inline
    def setUrlTemplate(value: String | URLTemplateCallback): Self = this.set("urlTemplate", value.asInstanceOf[js.Any])
  }
  
}

