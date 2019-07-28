package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** interface for notifying potential listeners of {@link com.sun.star.sdbc.SQLException} s posted by any database object. */
trait XSQLErrorBroadcaster extends XInterface {
  /** adds the specified listener to receive the event "errorOccurred" */
  def addSQLErrorListener(Listener: XSQLErrorListener): Unit
  /** removes the specified listener. */
  def removeSQLErrorListener(Listener: XSQLErrorListener): Unit
}

object XSQLErrorBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSQLErrorListener: XSQLErrorListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSQLErrorListener: XSQLErrorListener => Unit
  ): XSQLErrorBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSQLErrorListener = js.Any.fromFunction1(addSQLErrorListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSQLErrorListener = js.Any.fromFunction1(removeSQLErrorListener))
  
    __obj.asInstanceOf[XSQLErrorBroadcaster]
  }
}

