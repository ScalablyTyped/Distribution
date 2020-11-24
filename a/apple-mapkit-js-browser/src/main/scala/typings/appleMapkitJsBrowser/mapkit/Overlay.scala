package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract base object that defines the methods and attributes for map overlays.
  */
@js.native
trait Overlay extends js.Object {
  
  /**
    * Starts listening for the specified type of event.
    */
  def addEventListener(`type`: OverlayEventType, listener: js.Function1[/* event */ EventBase[this.type], Unit]): Unit = js.native
  def addEventListener(
    `type`: OverlayEventType,
    listener: js.Function1[/* event */ EventBase[this.type], Unit],
    thisObject: js.Any
  ): Unit = js.native
  
  /**
    * Custom data to associate with this overlay.
    */
  var data: js.Object = js.native
  
  /**
    * A Boolean value that determines whether the overlay responds to user interaction.
    */
  var enabled: Boolean = js.native
  
  /**
    * The map to which the overlay is added.
    */
  val map: Map | Null = js.native
  
  /**
    * Stops listening for the specified type of event.
    */
  def removeEventListener(`type`: OverlayEventType, listener: js.Function1[/* event */ EventBase[this.type], Unit]): Unit = js.native
  def removeEventListener(
    `type`: OverlayEventType,
    listener: js.Function1[/* event */ EventBase[this.type], Unit],
    thisObject: js.Any
  ): Unit = js.native
  
  /**
    * A Boolean value that indicates whether the overlay is selected.
    */
  var selected: Boolean = js.native
  
  /**
    * Style properties to apply to the overlay.
    */
  var style: Style = js.native
  
  /**
    * A Boolean value that determines if an overlay is visible.
    */
  var visible: Boolean = js.native
}
