package typings.activexLibreoffice.com_.sun.star.logging

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the interface used for formatting log records for RFC4180 CSV output
  * @see XLogFormatter, XLogHandler
  * @since OOo 3.0
  */
@js.native
trait XCsvLogFormatter extends XLogFormatter {
  
  /**
    * Defines the names of the additional columns this defaults to only one row titled "message". if this is set to more than one column, the messages need
    * to be preformatted using `formatMultiColumn`
    */
  var Columnnames: SafeArray[String] = js.native
  
  /** Defines if the EventNo should be logged */
  var LogEventNo: Boolean = js.native
  
  /** Defines if the Source should be logged */
  var LogSource: Boolean = js.native
  
  /** Defines if the ThreadId should be logged */
  var LogThread: Boolean = js.native
  
  /** Defines if the Timestamp should be logged */
  var LogTimestamp: Boolean = js.native
  
  /**
    * if the {@link CsvLogFormatter} is set to have more than one column, any logged information has to be send through this method before calling log().
    * E.g.:
    *
    * `XLoggerInstance.log(1000, XCsvLogFormatterInstance.formatMultiColumn(columnData))`
    */
  def formatMultiColumn(columnData: SeqEquiv[String]): String = js.native
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
    val __obj = js.Dynamic.literal(Columnnames = Columnnames.asInstanceOf[js.Any], Head = Head.asInstanceOf[js.Any], LogEventNo = LogEventNo.asInstanceOf[js.Any], LogSource = LogSource.asInstanceOf[js.Any], LogThread = LogThread.asInstanceOf[js.Any], LogTimestamp = LogTimestamp.asInstanceOf[js.Any], Tail = Tail.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), formatMultiColumn = js.Any.fromFunction1(formatMultiColumn), getHead = js.Any.fromFunction0(getHead), getTail = js.Any.fromFunction0(getTail))
    __obj.asInstanceOf[XCsvLogFormatter]
  }
  
  @scala.inline
  implicit class XCsvLogFormatterMutableBuilder[Self <: XCsvLogFormatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnnames(value: SafeArray[String]): Self = StObject.set(x, "Columnnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatMultiColumn(value: SeqEquiv[String] => String): Self = StObject.set(x, "formatMultiColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogEventNo(value: Boolean): Self = StObject.set(x, "LogEventNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogSource(value: Boolean): Self = StObject.set(x, "LogSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogThread(value: Boolean): Self = StObject.set(x, "LogThread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTimestamp(value: Boolean): Self = StObject.set(x, "LogTimestamp", value.asInstanceOf[js.Any])
  }
}
