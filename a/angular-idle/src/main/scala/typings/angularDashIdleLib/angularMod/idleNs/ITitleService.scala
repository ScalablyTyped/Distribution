package typings
package angularDashIdleLib.angularMod.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITitleService extends js.Object {
  /**
    * Gets the text to use as the message displayed when the user is idle.
    */
  def idleMessage(): java.lang.String = js.native
  /**
    * Sets the text to use as the message displayed when the user is idle.
    */
  def idleMessage(`val`: java.lang.String): scala.Unit = js.native
  /**
    * Returns whether or not the title functionality has been enabled.
    */
  def isEnabled(): scala.Boolean = js.native
  /**
    * Returns the "original" title value that has been previously set.
    *
    * Tracking the original title is important when restoring the title after displaying, for example, the idle warning message.
    */
  def original(): java.lang.String = js.native
  /**
    * Will store val as the "original" title of the document.
    *
    * Tracking the original title is important when restoring the title after displaying, for example, the idle warning message.
    */
  def original(`val`: java.lang.String): scala.Unit = js.native
  /**
    * Sets the title to the original value (if it was stored or set previously).
    */
  def restore(): scala.Unit = js.native
  /**
    * Stores the original title if it hasn't been already, determines the number minutes, seconds,
    * and total seconds from countdown, and displays the idleMessage with the aforementioned values interpolated.
    */
  def setAsIdle(countdown: scala.Double): scala.Unit = js.native
  /**
    * Stores the original title if it hasn't been already, and displays the timedOutMessage.
    */
  def setAsTimedOut(): scala.Unit = js.native
  /**
    * Allows the title functionality to be enabled or disabled on the fly.
    */
  def setEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /**
    * If overwrite is false or unspecified, updates the "original" title with the current document title
    * if it has not already been stored. If overwrite is true, the current document title is stored regardless.
    */
  def store(): scala.Unit = js.native
  def store(overwrite: scala.Boolean): scala.Unit = js.native
  /**
    * Gets the text to use as the message displayed when the user is timed out.
    */
  def timedOutMessage(): java.lang.String = js.native
  /**
    * Sets the text to use as the message displayed when the user is timed out.
    */
  def timedOutMessage(`val`: java.lang.String): scala.Unit = js.native
  /**
    * Returns the current document title.
    */
  def value(): java.lang.String = js.native
  /**
    * Changes the actual title of the document.
    */
  def value(`val`: java.lang.String): scala.Unit = js.native
}

