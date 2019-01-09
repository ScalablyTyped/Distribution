package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _InputManager extends js.Object {
  /**
    * A list of common keyCodes
    */
  var KEYS: athenajsLib.Anon_13 = js.native
  /**
    * List of common pad buttons
    */
  var PAD_BUTTONS: athenajsLib.Anon_110 = js.native
  var axes: JSObject = js.native
  // virtual joystick instance
  var dPadJoystick: scala.Null = js.native
  var enabled: scala.Boolean = js.native
  var gamepadSupport: scala.Boolean = js.native
  var inputMode: java.lang.String = js.native
  var jPollInterval: scala.Double = js.native
  var keyCb: JSObject = js.native
  var keyPressed: JSObject = js.native
  var latches: JSObject = js.native
  var newGamepadPollDelay: scala.Double = js.native
  /*recordedEvents: Array,*/
  var pad: scala.Null = js.native
  var padPressed: JSObject = js.native
  var playingEvents: scala.Boolean = js.native
  var playingPos: scala.Double = js.native
  var recording: scala.Boolean = js.native
  def clearEvents(): scala.Unit = js.native
  /**
    * Returns an object with the state of all keys
    */
  def getAllKeysStatus(): JSObject = js.native
  def getKeyStatus(key: java.lang.String, latch: scala.Boolean): scala.Boolean = js.native
  /**
    * Initializes the InputManager with a reference to the game.
    *
    * This method prepares the InputManager by reseting keyboard states/handlers and
    * set current inputMode
    *
    */
  def init(): scala.Unit = js.native
  /**
    * Install callback that gets called when a key is pressed/released
    *
    */
  def installKeyCallback(
    key: java.lang.String,
    event: java.lang.String,
    callback: js.Function2[/* key */ java.lang.String, /* event */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def isKeyDown(key: java.lang.String): scala.Boolean = js.native
  def isKeyDown(key: java.lang.String, latch: scala.Boolean): scala.Boolean = js.native
  def isKeyDown(key: scala.Double): scala.Boolean = js.native
  def isKeyDown(key: scala.Double, latch: scala.Boolean): scala.Boolean = js.native
  /**
    * Sets next key states using recorded events
    *
    * TODO: add an optional callback to be called at the end of the playback
    * so that demo can be looped.
    */
  def nextRecordedEvents(): scala.Unit = js.native
  /**
    * After events have been reccorded they can be played back using this method.
    */
  def playRecordedEvents(): scala.Unit = js.native
  def removeKeyCallback(key: java.lang.String, event: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Saves current event state onto the recordedEvents stack
    */
  /**
    * Changes input mode
    *
    */
  def setInputMode(mode: java.lang.String): scala.Unit = js.native
  /**
    * Starts recording input events. They are stored into `InputManager.recordedEvents`
    */
  def startRecordingEvents(): scala.Unit = js.native
  /**
    * Stops recording events.
    */
  def stopRecordingEvents(): scala.Unit = js.native
}

