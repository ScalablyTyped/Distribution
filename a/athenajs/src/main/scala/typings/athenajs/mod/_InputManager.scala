package typings.athenajs.mod

import typings.athenajs.anon.CTRL
import typings.athenajs.anon.`32`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _InputManager extends js.Object {
  
  /**
    * A list of common keyCodes
    */
  var KEYS: CTRL = js.native
  
  /**
    * List of common pad buttons
    */
  var PAD_BUTTONS: `32` = js.native
  
  var axes: JSObject = js.native
  
  def clearEvents(): Unit = js.native
  
  // virtual joystick instance
  var dPadJoystick: Null = js.native
  
  var enabled: Boolean = js.native
  
  var gamepadSupport: Boolean = js.native
  
  /**
    * Returns an object with the state of all keys
    */
  def getAllKeysStatus(): JSObject = js.native
  
  def getKeyStatus(key: String, latch: Boolean): Boolean = js.native
  
  /**
    * Initializes the InputManager with a reference to the game.
    *
    * This method prepares the InputManager by reseting keyboard states/handlers and
    * set current inputMode
    *
    */
  def init(): Unit = js.native
  
  var inputMode: String = js.native
  
  /**
    * Install callback that gets called when a key is pressed/released
    *
    */
  def installKeyCallback(key: String, event: String, callback: js.Function2[/* key */ String, /* event */ String, Unit]): Unit = js.native
  
  def isKeyDown(key: String): Boolean = js.native
  def isKeyDown(key: String, latch: Boolean): Boolean = js.native
  def isKeyDown(key: Double): Boolean = js.native
  def isKeyDown(key: Double, latch: Boolean): Boolean = js.native
  
  var jPollInterval: Double = js.native
  
  var keyCb: JSObject = js.native
  
  var keyPressed: JSObject = js.native
  
  var latches: JSObject = js.native
  
  var newGamepadPollDelay: Double = js.native
  
  /**
    * Sets next key states using recorded events
    *
    * TODO: add an optional callback to be called at the end of the playback
    * so that demo can be looped.
    */
  def nextRecordedEvents(): Unit = js.native
  
  /*recordedEvents: Array,*/
  var pad: Null = js.native
  
  var padPressed: JSObject = js.native
  
  /**
    * After events have been reccorded they can be played back using this method.
    */
  def playRecordedEvents(): Unit = js.native
  
  var playingEvents: Boolean = js.native
  
  var playingPos: Double = js.native
  
  var recording: Boolean = js.native
  
  def removeKeyCallback(key: String, event: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Saves current event state onto the recordedEvents stack
    */
  /**
    * Changes input mode
    *
    */
  def setInputMode(mode: String): Unit = js.native
  
  /**
    * Starts recording input events. They are stored into `InputManager.recordedEvents`
    */
  def startRecordingEvents(): Unit = js.native
  
  /**
    * Stops recording events.
    */
  def stopRecordingEvents(): Unit = js.native
}
