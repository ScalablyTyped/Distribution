package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerDecoration extends js.Object {
  /** Destroys the decoration. */
  def destroy(): Unit = js.native
  /** Get this decoration's properties. */
  def getProperties(): DecorationLayerOptions = js.native
  /** Determine whether this decoration is destroyed. */
  def isDestroyed(): Boolean = js.native
  /** Set this decoration's properties. */
  def setProperties(newProperties: DecorationLayerOptions): Unit = js.native
  /** Override the decoration properties for a specific marker. */
  def setPropertiesForMarker(marker: DisplayMarker, properties: DecorationLayerOptions): Unit = js.native
  def setPropertiesForMarker(marker: Marker, properties: DecorationLayerOptions): Unit = js.native
}

