package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** the listener interface for receiving "errorOccured" events posted by any database object. */
@js.native
trait XSQLErrorListener extends XEventListener {
  /**
    * invoked when a database error occurs, just before a {@link com.sun.star.sdbc.SQLException} is thrown to the application.
    * @param aEvent the event which occurred
    */
  def errorOccured(aEvent: SQLErrorEvent): Unit = js.native
}

object XSQLErrorListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    errorOccured: SQLErrorEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSQLErrorListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), errorOccured = js.Any.fromFunction1(errorOccured), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSQLErrorListener]
  }
  @scala.inline
  implicit class XSQLErrorListenerOps[Self <: XSQLErrorListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorOccured(value: SQLErrorEvent => Unit): Self = this.set("errorOccured", js.Any.fromFunction1(value))
  }
  
}

