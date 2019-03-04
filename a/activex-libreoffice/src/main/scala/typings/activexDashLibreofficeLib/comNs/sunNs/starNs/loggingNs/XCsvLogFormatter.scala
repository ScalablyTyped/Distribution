package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the interface used for formatting log records for RFC4180 CSV output
  * @see XLogFormatter, XLogHandler
  * @since OOo 3.0
  */
trait XCsvLogFormatter extends XLogFormatter {
  /**
    * Defines the names of the additional columns this defaults to only one row titled "message". if this is set to more than one column, the messages need
    * to be preformatted using `formatMultiColumn`
    */
  var Columnnames: activexDashInteropLib.SafeArray[java.lang.String]
  /** Defines if the EventNo should be logged */
  var LogEventNo: scala.Boolean
  /** Defines if the Source should be logged */
  var LogSource: scala.Boolean
  /** Defines if the ThreadId should be logged */
  var LogThread: scala.Boolean
  /** Defines if the Timestamp should be logged */
  var LogTimestamp: scala.Boolean
  /**
    * if the {@link CsvLogFormatter} is set to have more than one column, any logged information has to be send through this method before calling log().
    * E.g.:
    *
    * `XLoggerInstance.log(1000, XCsvLogFormatterInstance.formatMultiColumn(columnData))`
    */
  def formatMultiColumn(columnData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): java.lang.String
}

object XCsvLogFormatter {
  @scala.inline
  def apply(
    Columnnames: activexDashInteropLib.SafeArray[java.lang.String],
    Head: java.lang.String,
    LogEventNo: scala.Boolean,
    LogSource: scala.Boolean,
    LogThread: scala.Boolean,
    LogTimestamp: scala.Boolean,
    Tail: java.lang.String,
    format: js.Function1[LogRecord, java.lang.String],
    formatMultiColumn: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String
    ],
    getHead: js.Function0[java.lang.String],
    getTail: js.Function0[java.lang.String]
  ): XCsvLogFormatter = {
    val __obj = js.Dynamic.literal(Columnnames = Columnnames, Head = Head, LogEventNo = LogEventNo, LogSource = LogSource, LogThread = LogThread, LogTimestamp = LogTimestamp, Tail = Tail, format = format, formatMultiColumn = formatMultiColumn, getHead = getHead, getTail = getTail)
  
    __obj.asInstanceOf[XCsvLogFormatter]
  }
}

