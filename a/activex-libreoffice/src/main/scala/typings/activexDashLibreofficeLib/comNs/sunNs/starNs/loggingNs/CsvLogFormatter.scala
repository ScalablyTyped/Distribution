package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a service which formats log records for RFC4180-style CSV-Files
  *
  * Every log record, as passed to {@link XCsvLogFormatter.format()} , will be formatted into a single row for a CSV file. The sequence number, the thread
  * ID, the time of the logged event, the source class/method name will get logged alongside the message, if this is not disabled. The Formatter also
  * supports logging an arbitrary number of user-defined columns. If the Formatter is configured to have more than one (user-defined) column the data to
  * log has to be preformatted with the formatMultiColumn method.
  * @since OOo 3.0
  */
trait CsvLogFormatter extends XCsvLogFormatter {
  def create(): scala.Unit
}

object CsvLogFormatter {
  @scala.inline
  def apply(
    Columnnames: stdLib.SafeArray[java.lang.String],
    Head: java.lang.String,
    LogEventNo: scala.Boolean,
    LogSource: scala.Boolean,
    LogThread: scala.Boolean,
    LogTimestamp: scala.Boolean,
    Tail: java.lang.String,
    create: () => scala.Unit,
    format: LogRecord => java.lang.String,
    formatMultiColumn: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => java.lang.String,
    getHead: () => java.lang.String,
    getTail: () => java.lang.String
  ): CsvLogFormatter = {
    val __obj = js.Dynamic.literal(Columnnames = Columnnames, Head = Head, LogEventNo = LogEventNo, LogSource = LogSource, LogThread = LogThread, LogTimestamp = LogTimestamp, Tail = Tail, create = js.Any.fromFunction0(create), format = js.Any.fromFunction1(format), formatMultiColumn = js.Any.fromFunction1(formatMultiColumn), getHead = js.Any.fromFunction0(getHead), getTail = js.Any.fromFunction0(getTail))
  
    __obj.asInstanceOf[CsvLogFormatter]
  }
}

