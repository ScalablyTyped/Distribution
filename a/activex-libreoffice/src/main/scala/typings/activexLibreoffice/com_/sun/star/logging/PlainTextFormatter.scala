package typings.activexLibreoffice.com_.sun.star.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a service which formats log records as single line plain text
  *
  * Every log record, as passed to {@link XLogFormatter.format()} , will be formatted into a single text line, assembling the sequence number, the thread
  * ID, the time of the logged event, the source class/method name (if applicable), and the log message.
  * @since OOo 2.3
  */
trait PlainTextFormatter
  extends StObject
     with XLogFormatter {
  
  def create(): Unit
}
object PlainTextFormatter {
  
  inline def apply(
    Head: String,
    Tail: String,
    create: () => Unit,
    format: LogRecord => String,
    getHead: () => String,
    getTail: () => String
  ): PlainTextFormatter = {
    val __obj = js.Dynamic.literal(Head = Head.asInstanceOf[js.Any], Tail = Tail.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), format = js.Any.fromFunction1(format), getHead = js.Any.fromFunction0(getHead), getTail = js.Any.fromFunction0(getTail))
    __obj.asInstanceOf[PlainTextFormatter]
  }
  
  extension [Self <: PlainTextFormatter](x: Self) {
    
    inline def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
