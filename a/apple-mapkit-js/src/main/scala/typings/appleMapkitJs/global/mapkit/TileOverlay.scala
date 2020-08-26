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
}

