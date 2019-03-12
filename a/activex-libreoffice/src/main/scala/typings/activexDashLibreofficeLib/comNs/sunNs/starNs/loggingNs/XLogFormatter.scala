package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the interface to be used for formatting log records
  * @see XLogHandler
  * @since OOo 2.3
  */
trait XLogFormatter extends js.Object {
  /**
    * returns the header string for the log
    *
    * This can be used to generate a header string, which by the {@link XLogHandler} is emitted to its output channel before actually logging any concrete
    * {@link LogRecord} .
    *
    * For instance, a formatter might produce table-like plain text output, and could return a table-head string (potentially including line breaks) here.
    */
  val Head: java.lang.String
  /**
    * returns the footer string for the log
    *
    * This can be used to generate a footer string, which by the {@link XLogHandler} is emitted to its output channel before it is finally being closed.
    */
  val Tail: java.lang.String
  /**
    * formats the given log record for output
    *
    * A {@link XLogHandler} will call this method to format a given log record. The resulting string will be emitted to the handler's output channel,
    * without processing it any further (except possibly encoding it with the handler's `Encoding` ).
    */
  def format(Record: LogRecord): java.lang.String
  /**
    * returns the header string for the log
    *
    * This can be used to generate a header string, which by the {@link XLogHandler} is emitted to its output channel before actually logging any concrete
    * {@link LogRecord} .
    *
    * For instance, a formatter might produce table-like plain text output, and could return a table-head string (potentially including line breaks) here.
    */
  def getHead(): java.lang.String
  /**
    * returns the footer string for the log
    *
    * This can be used to generate a footer string, which by the {@link XLogHandler} is emitted to its output channel before it is finally being closed.
    */
  def getTail(): java.lang.String
}

object XLogFormatter {
  @scala.inline
  def apply(
    Head: java.lang.String,
    Tail: java.lang.String,
    format: LogRecord => java.lang.String,
    getHead: () => java.lang.String,
    getTail: () => java.lang.String
  ): XLogFormatter = {
    val __obj = js.Dynamic.literal(Head = Head, Tail = Tail, format = js.Any.fromFunction1(format), getHead = js.Any.fromFunction0(getHead), getTail = js.Any.fromFunction0(getTail))
  
    __obj.asInstanceOf[XLogFormatter]
  }
}

