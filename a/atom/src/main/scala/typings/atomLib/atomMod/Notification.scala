package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "Notification")
@js.native
class Notification protected () extends js.Object {
  def this(`type`: atomLib.atomLibStrings.error, message: java.lang.String) = this()
  def this(`type`: atomLib.atomLibStrings.fatal, message: java.lang.String) = this()
  def this(`type`: atomLib.atomLibStrings.info, message: java.lang.String) = this()
  def this(`type`: atomLib.atomLibStrings.success, message: java.lang.String) = this()
  def this(`type`: atomLib.atomLibStrings.warning, message: java.lang.String) = this()
  def this(`type`: atomLib.atomLibStrings.error, message: java.lang.String, options: ErrorNotificationOptions) = this()
  def this(`type`: atomLib.atomLibStrings.fatal, message: java.lang.String, options: ErrorNotificationOptions) = this()
  def this(`type`: atomLib.atomLibStrings.info, message: java.lang.String, options: NotificationOptions) = this()
  def this(`type`: atomLib.atomLibStrings.success, message: java.lang.String, options: NotificationOptions) = this()
  def this(`type`: atomLib.atomLibStrings.warning, message: java.lang.String, options: NotificationOptions) = this()
  /**
    *  Dismisses the notification, removing it from the UI. Calling this
    *  programmatically will call all callbacks added via onDidDismiss.
    */
  def dismiss(): scala.Unit = js.native
  /** Returns the Notification's message. */
  def getMessage(): java.lang.String = js.native
  // Methods
  /** Returns the Notification's type. */
  def getType(): java.lang.String = js.native
  // Event Subscription
  /** Invoke the given callback when the notification is dismissed. */
  def onDidDismiss(callback: js.Function1[/* notification */ this.type, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when the notification is displayed. */
  def onDidDisplay(callback: js.Function1[/* notification */ this.type, scala.Unit]): Disposable = js.native
}

