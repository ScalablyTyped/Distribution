package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def addItem(id: String, item: Drawable): Unit = js.native
  
  /**
    * checks of conditions of specified trigger are valid
    *
    */
  def checkConditions(trigger: JSObject): Boolean = js.native
  
  def endWave(): Unit = js.native
  
  /**
    * Returns an item
    *
    */
  def getItem(id: String): js.UndefOr[Drawable] = js.native
  
  /**
    * Retrieves a switch from the map using its id
    *
    */
  def getSwitch(id: String): js.Any = js.native
  
  def handleAction(options: JSObject): Unit = js.native
  
  def handleEvent(options: JSObject): Boolean = js.native
  
  /**
    * Add a new wave of objects to the map
    * Used for example when the player triggers apparition of several enemies or bonuses
    *
    * @related {Wave}
    */
  def handleWave(options: JSObject): Boolean = js.native
  
  def isEventTriggered(id: String): Boolean = js.native
  
  /**
    * Resets the MapEvent switches, events and items
    */
  def reset(): Unit = js.native
  
  /**
    * Schedule adding a new object to the map
    */
  def scheduleSprite(spriteId: String, spriteOptions: JSObject, delay: Double): Drawable = js.native
  
  // TODO: ability to trigger an event once a switch has been modified
  def setSwitch(id: String, bool: Boolean): Unit = js.native
  
  def toggleSwitch(id: String): Unit = js.native
  
  def triggerEvent(id: String): Unit = js.native
}
