package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decoration extends StObject {
  
  // Construction and Destruction
  /**
    *  Destroy this marker decoration.
    *  You can also destroy the marker if you own it, which will destroy this decoration.
    */
  def destroy(): Unit = js.native
  
  // Decoration Details
  /** An id unique across all Decoration objects. */
  def getId(): Double = js.native
  
  /** Returns the marker associated with this Decoration. */
  def getMarker(): DisplayMarker = js.native
  
  // Properties
  /** Returns the Decoration's properties. */
  def getProperties(): DecorationOptions = js.native
  
  /** The identifier for this Decoration. */
  val id: Double = js.native
  
  /**
    *  Check if this decoration is of the given type.
    *  @param type A decoration type, such as `line-number` or `line`. This may also
    *  be an array of decoration types, with isType returning true if the decoration's
    *  type matches any in the array.
    */
  def isType(`type`: String): Boolean = js.native
  def isType(`type`: js.Array[String]): Boolean = js.native
  
  // Event Subscription
  /** When the Decoration is updated via Decoration::setProperties. */
  def onDidChangeProperties(callback: js.Function1[/* event */ DecorationPropsChangedEvent, Unit]): Disposable = js.native
  
  /** Invoke the given callback when the Decoration is destroyed. */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  
  /**
    *  Update the marker with new Properties. Allows you to change the decoration's
    *  class.
    */
  def setProperties(newProperties: DecorationOptions): Unit = js.native
}
