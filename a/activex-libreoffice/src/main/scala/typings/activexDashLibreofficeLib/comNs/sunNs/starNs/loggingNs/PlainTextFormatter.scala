package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a service which formats log records as single line plain text
  *
  * Every log record, as passed to {@link XLogFormatter.format()} , will be formatted into a single text line, assembling the sequence number, the thread
  * ID, the time of the logged event, the source class/method name (if applicable), and the log message.
  * @since OOo 2.3
  */
trait PlainTextFormatter extends XLogFormatter {
  def create(): scala.Unit
}

object PlainTextFormatter {
  @scala.inline
  def apply(
    Head: java.lang.String,
    Tail: java.lang.String,
    create: () => scala.Unit,
    format: LogRecord => java.lang.String,
    getHead: () => java.lang.String,
    getTail: () => java.lang.String
  ): PlainTextFormatter = {
    val __obj = js.Dynamic.literal(Head = Head, Tail = Tail, create = js.Any.fromFunction0(create), format = js.Any.fromFunction1(format), getHead = js.Any.fromFunction0(getHead), getTail = js.Any.fromFunction0(getTail))
  
    __obj.asInstanceOf[PlainTextFormatter]
  }
}

