package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decoration extends js.Object {
  /** The identifier for this Decoration. */
  val id: scala.Double = js.native
  // Construction and Destruction
  /**
    *  Destroy this marker decoration.
    *  You can also destroy the marker if you own it, which will destroy this decoration.
    */
  def destroy(): scala.Unit = js.native
  // Decoration Details
  /** An id unique across all Decoration objects. */
  def getId(): scala.Double = js.native
  /** Returns the marker associated with this Decoration. */
  def getMarker(): DisplayMarker = js.native
  // Properties
  /** Returns the Decoration's properties. */
  def getProperties(): DecorationOptions = js.native
  /**
    *  Check if this decoration is of the given type.
    *  @param type A decoration type, such as `line-number` or `line`. This may also
    *  be an array of decoration types, with isType returning true if the decoration's
    *  type matches any in the array.
    */
  def isType(`type`: java.lang.String): scala.Boolean = js.native
  def isType(`type`: js.Array[java.lang.String]): scala.Boolean = js.native
  // Event Subscription
  /** When the Decoration is updated via Decoration::setProperties. */
  def onDidChangeProperties(callback: js.Function1[/* event */ DecorationPropsChangedEvent, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when the Decoration is destroyed. */
  def onDidDestroy(callback: js.Function0[scala.Unit]): Disposable = js.native
  /**
    *  Update the marker with new Properties. Allows you to change the decoration's
    *  class.
    */
  def setProperties(newProperties: DecorationOptions): scala.Unit = js.native
}

