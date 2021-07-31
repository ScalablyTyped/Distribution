package typings.activexLibreoffice.com_.sun.star.logging

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a service which formats log records for RFC4180-style CSV-Files
  *
  * Every log record, as passed to {@link XCsvLogFormatter.format()} , will be formatted into a single row for a CSV file. The sequence number, the thread
  * ID, the time of the logged event, the source class/method name will get logged alongside the message, if this is not disabled. The Formatter also
  * supports logging an arbitrary number of user-defined columns. If the Formatter is configured to have more than one (user-defined) column the data to
  * log has to be preformatted with the formatMultiColumn method.
  * @since OOo 3.0
  */
trait CsvLogFormatter
  extends StObject
     with XCsvLogFormatter {
  
  def create(): Unit
}
object CsvLogFormatter {
  
  @scala.inline
  def apply(
    Columnnames: SafeArray[String],
    Head: String,
    LogEventNo: Boolean,
    LogSource: Boolean,
    LogThread: Boolean,
    LogTimestamp: Boolean,
    Tail: String,
    create: () => Unit,
    format: LogRecord => String,
    formatMultiColumn: SeqEquiv[String] => String,
    getHead: () => String,
    getTail: () => String
  ): CsvLogFormatter = {
    val __obj = js.Dynamic.literal(Columnnames = Columnnames.asInstanceOf[js.Any], Head = Head.asInstanceOf[js.Any], LogEventNo = LogEventNo.asInstanceOf[js.Any], LogSource = LogSource.asInstanceOf[js.Any], LogThread = LogThread.asInstanceOf[js.Any], LogTimestamp = LogTimestamp.asInstanceOf[js.Any], Tail = Tail.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), format = js.Any.fromFunction1(format), formatMultiColumn = js.Any.fromFunction1(formatMultiColumn), getHead = js.Any.fromFunction0(getHead), getTail = js.Any.fromFunction0(getTail))
    __obj.asInstanceOf[CsvLogFormatter]
  }
  
  @scala.inline
  implicit class CsvLogFormatterMutableBuilder[Self <: CsvLogFormatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
