package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
  var DataSize: Double
  /** is `TRUE` if a read was truncated. */
  var DuringRead: Boolean
  /** is the index of the parameter or column value. */
  var Index: Double
  /** is `TRUE` if a parameter value is truncated. */
  var IsParameter: Boolean
  /** contains the number of bytes of data actually transferred. The value may be `-1` if the size is unknown. */
  var TransferSize: Double
}

object DataTruncation {
  @scala.inline
  def apply(
    Context: XInterface,
    DataSize: Double,
    DuringRead: Boolean,
    ErrorCode: Double,
    Index: Double,
    IsParameter: Boolean,
    Message: String,
    NextException: js.Any,
    SQLState: String,
    TransferSize: Double
  ): DataTruncation = {
    val __obj = js.Dynamic.literal(Context = Context, DataSize = DataSize, DuringRead = DuringRead, ErrorCode = ErrorCode, Index = Index, IsParameter = IsParameter, Message = Message, NextException = NextException, SQLState = SQLState, TransferSize = TransferSize)
  
    __obj.asInstanceOf[DataTruncation]
  }
}

