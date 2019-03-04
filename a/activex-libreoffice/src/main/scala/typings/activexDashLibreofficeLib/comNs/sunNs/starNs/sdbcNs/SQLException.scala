package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an exception that provides information on a database access error.
  *
  * Each {@link com.sun.star.sdbc.SQLException} provides several kinds of information:
  *
  * a string describing the error. This is used as the {@link com.sun.star.uno.Exception} message.
  */
trait SQLException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /**
    * returns an integer error code that is specific to each vendor. Normally this will be the actual error code returned by the underlying database. A
    * chain to the next Exception. This can be used to provide additional error information.
    */
  var ErrorCode: scala.Double
  /** returns a chain to the next Exception. This can be used to provide additional error information. */
  var NextException: js.Any
  /** returns a string, which uses the XOPEN SQLState conventions. The values of the SQLState string are described in the XOPEN SQL spec. */
  var SQLState: java.lang.String
}

object SQLException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ErrorCode: scala.Double,
    Message: java.lang.String,
    NextException: js.Any,
    SQLState: java.lang.String
  ): SQLException = {
    val __obj = js.Dynamic.literal(Context = Context, ErrorCode = ErrorCode, Message = Message, NextException = NextException, SQLState = SQLState)
  
    __obj.asInstanceOf[SQLException]
  }
}

