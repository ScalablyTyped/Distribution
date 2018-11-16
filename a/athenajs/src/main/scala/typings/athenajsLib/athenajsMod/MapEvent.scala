package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "MapEvent")
@js.native
class MapEvent protected () extends js.Object {
  /**
       * Creates a new MapEvent
       *
       */
  def this(map: Map) = this()
  /**
       * Adds a new [`Drawable`]{#item} onto the map
       *
       */
  def addItem(id: java.lang.String, item: Drawable): scala.Unit = js.native
  /**
       * checks of conditions of specified trigger are valid
       *
       */
  def checkConditions(trigger: JSObject): scala.Boolean = js.native
  def endWave(): scala.Unit = js.native
  /**
       * Returns an item
       *
       */
  def getItem(id: java.lang.String): js.UndefOr[Drawable] = js.native
  /**
       * Retrieves a switch from the map using its id
       *
       */
  def getSwitch(id: java.lang.String): js.Any = js.native
  def handleAction(options: JSObject): scala.Unit = js.native
  def handleEvent(options: JSObject): scala.Boolean = js.native
  /**
       * Add a new wave of objects to the map
       * Used for example when the player triggers apparition of several enemies or bonuses
       *
       * @related {Wave}
       */
  def handleWave(options: JSObject): scala.Boolean = js.native
  def isEventTriggered(id: java.lang.String): scala.Boolean = js.native
  /**
       * Resets the MapEvent switches, events and items
       */
  def reset(): scala.Unit = js.native
  /**
       * Schedule adding a new object to the map
       */
  def scheduleSprite(spriteId: java.lang.String, spriteOptions: JSObject, delay: scala.Double): Drawable = js.native
  // TODO: ability to trigger an event once a switch has been modified
  def setSwitch(id: java.lang.String, bool: scala.Boolean): scala.Unit = js.native
  def toggleSwitch(id: java.lang.String): scala.Unit = js.native
  def triggerEvent(id: java.lang.String): scala.Unit = js.native
}

