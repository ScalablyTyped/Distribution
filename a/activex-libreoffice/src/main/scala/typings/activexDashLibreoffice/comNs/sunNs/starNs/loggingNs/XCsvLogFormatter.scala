package typings.activexDashLibreoffice.comNs.sunNs.starNs.loggingNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.std.SafeArray
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
  var Columnnames: SafeArray[String]
  /** Defines if the EventNo should be logged */
  var LogEventNo: Boolean
  /** Defines if the Source should be logged */
  var LogSource: Boolean
  /** Defines if the ThreadId should be logged */
  var LogThread: Boolean
  /** Defines if the Timestamp should be logged */
  var LogTimestamp: Boolean
  /**
    * if the {@link CsvLogFormatter} is set to have more than one column, any logged information has to be send through this method before calling log().
    * E.g.:
    *
    * `XLoggerInstance.log(1000, XCsvLogFormatterInstance.formatMultiColumn(columnData))`
    */
  def formatMultiColumn(columnData: SeqEquiv[String]): String
}

object XCsvLogFormatter {
  @scala.inline
  def apply(
    Columnnames: SafeArray[String],
    Head: String,
    LogEventNo: Boolean,
    LogSource: Boolean,
    LogThread: Boolean,
    LogTimestamp: Boolean,
    Tail: String,
    format: LogRecord => String,
    formatMultiColumn: SeqEquiv[String] => String,
    getHead: () => String,
    getTail: () => String
  ): XCsvLogFormatter = {
    val __obj = js.Dynamic.literal(Columnnames = Columnnames, Head = Head, LogEventNo = LogEventNo, LogSource = LogSource, LogThread = LogThread, LogTimestamp = LogTimestamp, Tail = Tail, format = js.Any.fromFunction1(format), formatMultiColumn = js.Any.fromFunction1(formatMultiColumn), getHead = js.Any.fromFunction0(getHead), getTail = js.Any.fromFunction0(getTail))
  
    __obj.asInstanceOf[XCsvLogFormatter]
  }
}

