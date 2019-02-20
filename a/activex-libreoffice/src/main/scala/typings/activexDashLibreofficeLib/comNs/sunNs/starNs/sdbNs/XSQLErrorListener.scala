package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** the listener interface for receiving "errorOccured" events posted by any database object. */
trait XSQLErrorListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * invoked when a database error occurs, just before a {@link com.sun.star.sdbc.SQLException} is thrown to the application.
    * @param aEvent the event which occurred
    */
  def errorOccured(aEvent: SQLErrorEvent): scala.Unit
}

