package typings.appleMapkitJsBrowser.global.mapkit

import typings.appleMapkitJsBrowser.anon.Adaptive
import typings.appleMapkitJsBrowser.anon.Dark
import typings.appleMapkitJsBrowser.anon.Hybrid
import typings.appleMapkitJsBrowser.mapkit.MapConstructorOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An embeddable interactive map that you add to a webpage.
  */
@JSGlobal("mapkit.Map")
@js.native
class Map protected ()
  extends typings.appleMapkitJsBrowser.mapkit.Map {
  /**
    * Creates a map that you embed on a webpage, and initializes its display
    * properties and other options.
    *
    * @parent parent A DOM element or the ID of a DOM element to use as this
    * map's container.
    * @param options An object that contains options for initializing a map's
    * features.
    */
  def this(parent: String) = this()
  def this(parent: Element) = this()
  def this(parent: String, options: MapConstructorOptions) = this()
  def this(parent: Element, options: MapConstructorOptions) = this()
}
/* static members */
@JSGlobal("mapkit.Map")
@js.native
object Map extends js.Object {
  
  // Configuring the Map's Appearance
  /**
    * Constants indicating the color scheme of the map.
    */
  val ColorSchemes: Dark = js.native
  
  /**
    * Constants indicating the system of measurement displayed on the map.
    */
  val Distances: Adaptive = js.native
  
  /**
    * Constants representing the type of map to display.
    */
  val MapTypes: Hybrid = js.native
}
