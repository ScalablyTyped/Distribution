package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

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
trait SQLContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.SQLException {
  /**
    * provides special info about the details where a {@link com.sun.star.sdbc.SQLException} occurred. As usual for SQLExceptions, several
    * SQLContext-objects may be chained, then the most recent context is appended to the list's tail
    */
  var Details: java.lang.String
}

