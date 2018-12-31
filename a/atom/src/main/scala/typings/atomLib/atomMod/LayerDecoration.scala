package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerDecoration extends js.Object {
  /** Destroys the decoration. */
  def destroy(): scala.Unit = js.native
  /** Get this decoration's properties. */
  def getProperties(): DecorationLayerOptions = js.native
  /** Determine whether this decoration is destroyed. */
  def isDestroyed(): scala.Boolean = js.native
  /** Set this decoration's properties. */
  def setProperties(newProperties: DecorationLayerOptions): scala.Unit = js.native
  /** Override the decoration properties for a specific marker. */
  def setPropertiesForMarker(marker: DisplayMarker, properties: DecorationLayerOptions): scala.Unit = js.native
  def setPropertiesForMarker(marker: Marker, properties: DecorationLayerOptions): scala.Unit = js.native
}

