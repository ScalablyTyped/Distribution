package typings.angularDashIdle.angularMod.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITitleService extends js.Object {
  /**
    * Gets the text to use as the message displayed when the user is idle.
    */
  def idleMessage(): String = js.native
  /**
    * Sets the text to use as the message displayed when the user is idle.
    */
  def idleMessage(`val`: String): Unit = js.native
  /**
    * Returns whether or not the title functionality has been enabled.
    */
  def isEnabled(): Boolean = js.native
  /**
    * Returns the "original" title value that has been previously set.
    *
    * Tracking the original title is important when restoring the title after displaying, for example, the idle warning message.
    */
  def original(): String = js.native
  /**
    * Will store val as the "original" title of the document.
    *
    * Tracking the original title is important when restoring the title after displaying, for example, the idle warning message.
    */
  def original(`val`: String): Unit = js.native
  /**
    * Sets the title to the original value (if it was stored or set previously).
    */
  def restore(): Unit = js.native
  /**
    * Stores the original title if it hasn't been already, determines the number minutes, seconds,
    * and total seconds from countdown, and displays the idleMessage with the aforementioned values interpolated.
    */
  def setAsIdle(countdown: Double): Unit = js.native
  /**
    * Stores the original title if it hasn't been already, and displays the timedOutMessage.
    */
  def setAsTimedOut(): Unit = js.native
  /**
    * Allows the title functionality to be enabled or disabled on the fly.
    */
  def setEnabled(enabled: Boolean): Unit = js.native
  /**
    * If overwrite is false or unspecified, updates the "original" title with the current document title
    * if it has not already been stored. If overwrite is true, the current document title is stored regardless.
    */
  def store(): Unit = js.native
  def store(overwrite: Boolean): Unit = js.native
  /**
    * Gets the text to use as the message displayed when the user is timed out.
    */
  def timedOutMessage(): String = js.native
  /**
    * Sets the text to use as the message displayed when the user is timed out.
    */
  def timedOutMessage(`val`: String): Unit = js.native
  /**
    * Returns the current document title.
    */
  def value(): String = js.native
  /**
    * Changes the actual title of the document.
    */
  def value(`val`: String): Unit = js.native
}

