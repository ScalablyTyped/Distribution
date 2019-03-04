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
    create: js.Function0[scala.Unit],
    format: js.Function1[LogRecord, java.lang.String],
    getHead: js.Function0[java.lang.String],
    getTail: js.Function0[java.lang.String]
  ): PlainTextFormatter = {
    val __obj = js.Dynamic.literal(Head = Head, Tail = Tail, create = create, format = format, getHead = getHead, getTail = getTail)
  
    __obj.asInstanceOf[PlainTextFormatter]
  }
}

