package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay that covers an area of the map with bitmap tiles.
  */
@JSGlobal("mapkit.TileOverlay")
@js.native
class TileOverlay protected () extends js.Object {
  /**
    * Creates a tile overlay with a URL template and style options.
    */
  def this(urlTemplate: String) = this()
  def this(urlTemplate: URLTemplateCallback) = this()
  def this(urlTemplate: String, options: TileOverlayConstructorOptions) = this()
  def this(urlTemplate: URLTemplateCallback, options: TileOverlayConstructorOptions) = this()
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

