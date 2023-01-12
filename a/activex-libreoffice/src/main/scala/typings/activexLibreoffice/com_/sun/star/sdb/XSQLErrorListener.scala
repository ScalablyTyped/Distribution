package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** the listener interface for receiving "errorOccured" events posted by any database object. */
trait XSQLErrorListener
  extends StObject
     with XEventListener {
  
  /**
    * invoked when a database error occurs, just before a {@link com.sun.star.sdbc.SQLException} is thrown to the application.
    * @param aEvent the event which occurred
    */
  def errorOccured(aEvent: SQLErrorEvent): Unit
}
object XSQLErrorListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    errorOccured: SQLErrorEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSQLErrorListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), errorOccured = js.Any.fromFunction1(errorOccured), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSQLErrorListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSQLErrorListener] (val x: Self) extends AnyVal {
    
    inline def setErrorOccured(value: SQLErrorEvent => Unit): Self = StObject.set(x, "errorOccured", js.Any.fromFunction1(value))
  }
}
