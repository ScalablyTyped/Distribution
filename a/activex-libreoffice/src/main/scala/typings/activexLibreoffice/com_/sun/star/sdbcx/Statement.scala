package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends the definition of the service {@link com.sun.star.sdbc.Statement} with a flag for the usage of bookmarks.
  * @see ResultSet
  * @see XRowLocate
  */
@js.native
trait Statement
  extends typings.activexLibreoffice.com_.sun.star.sdbc.Statement {
  
  /** returns `TRUE` if a result set should allow navigation with bookmarks or not. The default is `FALSE` . */
  var UseBookmarks: Boolean = js.native
}
object Statement {
  
  @scala.inline
  def apply(
    Connection: XConnection,
    CursorName: String,
    EscapeProcessing: Boolean,
    FetchDirection: Double,
    FetchSize: Double,
    MaxFieldSize: Double,
    MaxRows: Double,
    MoreResults: Boolean,
    PropertySetInfo: XPropertySetInfo,
    QueryTimeOut: Double,
    ResultSet: XResultSet,
    ResultSetConcurrency: Double,
    ResultSetType: Double,
    UpdateCount: Double,
    UseBookmarks: Boolean,
    Warnings: js.Any,
    acquire: () => Unit,
    addBatch: String => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    cancel: () => Unit,
    clearBatch: () => Unit,
    clearWarnings: () => Unit,
    close: () => Unit,
    dispose: () => Unit,
    execute: String => Boolean,
    executeBatch: () => SafeArray[Double],
    executeQuery: String => XResultSet,
    executeUpdate: String => Double,
    getConnection: () => XConnection,
    getMoreResults: () => Boolean,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getResultSet: () => XResultSet,
    getUpdateCount: () => Double,
    getWarnings: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Statement = {
    val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any], CursorName = CursorName.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], FetchDirection = FetchDirection.asInstanceOf[js.Any], FetchSize = FetchSize.asInstanceOf[js.Any], MaxFieldSize = MaxFieldSize.asInstanceOf[js.Any], MaxRows = MaxRows.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryTimeOut = QueryTimeOut.asInstanceOf[js.Any], ResultSet = ResultSet.asInstanceOf[js.Any], ResultSetConcurrency = ResultSetConcurrency.asInstanceOf[js.Any], ResultSetType = ResultSetType.asInstanceOf[js.Any], UpdateCount = UpdateCount.asInstanceOf[js.Any], UseBookmarks = UseBookmarks.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addBatch = js.Any.fromFunction1(addBatch), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cancel = js.Any.fromFunction0(cancel), clearBatch = js.Any.fromFunction0(clearBatch), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction1(execute), executeBatch = js.Any.fromFunction0(executeBatch), executeQuery = js.Any.fromFunction1(executeQuery), executeUpdate = js.Any.fromFunction1(executeUpdate), getConnection = js.Any.fromFunction0(getConnection), getMoreResults = js.Any.fromFunction0(getMoreResults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getResultSet = js.Any.fromFunction0(getResultSet), getUpdateCount = js.Any.fromFunction0(getUpdateCount), getWarnings = js.Any.fromFunction0(getWarnings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  implicit class StatementMutableBuilder[Self <: Statement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseBookmarks(value: Boolean): Self = StObject.set(x, "UseBookmarks", value.asInstanceOf[js.Any])
  }
}
