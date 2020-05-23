package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the possibility of receiving database error events.
  *
  * Please do **not** use anymore, this interface is superseded by {@link com.sun.star.sdb.XSQLErrorBroadcaster} .
  * @deprecated Deprecated
  */
trait XErrorBroadcaster extends XInterface {
  /** adds the specified listener to be notified of errors. */
  def addErrorListener(aListener: XErrorListener): Unit
  /** removes the specified listener. */
  def removeErrorListener(aListener: XErrorListener): Unit
}

object XErrorBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addErrorListener: XErrorListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeErrorListener: XErrorListener => Unit
  ): XErrorBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addErrorListener = js.Any.fromFunction1(addErrorListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeErrorListener = js.Any.fromFunction1(removeErrorListener))
    __obj.asInstanceOf[XErrorBroadcaster]
  }
}

