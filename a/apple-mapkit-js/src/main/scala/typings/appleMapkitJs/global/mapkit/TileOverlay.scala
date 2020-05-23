package typings.appleMapkitJs.global.mapkit

import typings.appleMapkitJs.mapkit.TileOverlayConstructorOptions
import typings.appleMapkitJs.mapkit.URLTemplateCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay that covers an area of the map with bitmap tiles.
  */
@JSGlobal("mapkit.TileOverlay")
@js.native
class TileOverlay protected ()
  extends typings.appleMapkitJs.mapkit.TileOverlay {
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
  /* CompleteClass */
  override var data: js.Object = js.native
  /**
    * Maximum zoom level of the overlay.
    */
  /* CompleteClass */
  override var maximumZ: Double = js.native
  /**
    * Minimum zoom level of the overlay.
    */
  /* CompleteClass */
  override var minimumZ: Double = js.native
  /**
    * Opacity level of the overlay.
    */
  /* CompleteClass */
  override var opacity: Double = js.native
  /**
    * A string, or callback function that returns a string, with a URL that
    * provides the requested tile.
    */
  /* CompleteClass */
  override var urlTemplate: String | URLTemplateCallback = js.native
  /**
    * Reloads the tile overlay for the displayed map region with the latest
    * data values.
    */
  /* CompleteClass */
  override def reload(): Unit = js.native
}

