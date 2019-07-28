package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.SQLException
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides special information about the context where a {@link com.sun.star.sdbc.SQLException} occurred. As usual for SQLExceptions, several
  * SQLContext-objects may be chained, then the most recent context is appended to the list's tail.
  * @see com.sun.star.sdbc.XConnection.getWarnings
  * @see com.sun.star.sdbc.XResultSet.getWarnings
  * @see com.sun.star.sdbc.XStatement.getWarnings
  */
trait SQLContext extends SQLException {
  /**
    * provides special info about the details where a {@link com.sun.star.sdbc.SQLException} occurred. As usual for SQLExceptions, several
    * SQLContext-objects may be chained, then the most recent context is appended to the list's tail
    */
  var Details: String
}

object SQLContext {
  @scala.inline
  def apply(
    Context: XInterface,
    Details: String,
    ErrorCode: Double,
    Message: String,
    NextException: js.Any,
    SQLState: String
  ): SQLContext = {
    val __obj = js.Dynamic.literal(Context = Context, Details = Details, ErrorCode = ErrorCode, Message = Message, NextException = NextException, SQLState = SQLState)
  
    __obj.asInstanceOf[SQLContext]
  }
}

