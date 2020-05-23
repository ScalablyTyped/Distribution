package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay that covers an area of the map with bitmap tiles.
  */
trait TileOverlay extends js.Object {
  /**
    * Custom data used to populate the URL template.
    */
  var data: js.Object
  /**
    * Maximum zoom level of the overlay.
    */
  var maximumZ: Double
  /**
    * Minimum zoom level of the overlay.
    */
  var minimumZ: Double
  /**
    * Opacity level of the overlay.
    */
  var opacity: Double
  /**
    * A string, or callback function that returns a string, with a URL that
    * provides the requested tile.
    */
  var urlTemplate: String | URLTemplateCallback
  /**
    * Reloads the tile overlay for the displayed map region with the latest
    * data values.
    */
  def reload(): Unit
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
}

