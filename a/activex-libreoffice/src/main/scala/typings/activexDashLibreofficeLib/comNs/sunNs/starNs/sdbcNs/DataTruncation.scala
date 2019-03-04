package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * reports a {@link DataTruncation} warning, on reads, or is thrown as a {@link DataTruncation} exception, on writes, when a data value is unexpectedly
  * truncated.
  *
  * The SQL state for a `DataTruncation` is `01004` .
  */
trait DataTruncation extends SQLException {
  /**
    * contains the number of bytes of data that should have been transferred. This number may be approximate if data conversions were being performed. The
    * value may be `-1` if the size is unknown.
    */
  var DataSize: scala.Double
  /** is `TRUE` if a read was truncated. */
  var DuringRead: scala.Boolean
  /** is the index of the parameter or column value. */
  var Index: scala.Double
  /** is `TRUE` if a parameter value is truncated. */
  var IsParameter: scala.Boolean
  /** contains the number of bytes of data actually transferred. The value may be `-1` if the size is unknown. */
  var TransferSize: scala.Double
}

object DataTruncation {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    DataSize: scala.Double,
    DuringRead: scala.Boolean,
    ErrorCode: scala.Double,
    Index: scala.Double,
    IsParameter: scala.Boolean,
    Message: java.lang.String,
    NextException: js.Any,
    SQLState: java.lang.String,
    TransferSize: scala.Double
  ): DataTruncation = {
    val __obj = js.Dynamic.literal(Context = Context, DataSize = DataSize, DuringRead = DuringRead, ErrorCode = ErrorCode, Index = Index, IsParameter = IsParameter, Message = Message, NextException = NextException, SQLState = SQLState, TransferSize = TransferSize)
  
    __obj.asInstanceOf[DataTruncation]
  }
}

