package typings.activexLibreoffice.com_.sun.star.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the interface to be used for formatting log records
  * @see XLogHandler
  * @since OOo 2.3
  */
@js.native
trait XLogFormatter extends js.Object {
  /**
    * returns the header string for the log
    *
    * This can be used to generate a header string, which by the {@link XLogHandler} is emitted to its output channel before actually logging any concrete
    * {@link LogRecord} .
    *
    * For instance, a formatter might produce table-like plain text output, and could return a table-head string (potentially including line breaks) here.
    */
  val Head: String = js.native
  /**
    * returns the footer string for the log
    *
    * This can be used to generate a footer string, which by the {@link XLogHandler} is emitted to its output channel before it is finally being closed.
    */
  val Tail: String = js.native
  /**
    * formats the given log record for output
    *
    * A {@link XLogHandler} will call this method to format a given log record. The resulting string will be emitted to the handler's output channel,
    * without processing it any further (except possibly encoding it with the handler's `Encoding` ).
    */
  def format(Record: LogRecord): String = js.native
  /**
    * returns the header string for the log
    *
    * This can be used to generate a header string, which by the {@link XLogHandler} is emitted to its output channel before actually logging any concrete
    * {@link LogRecord} .
    *
    * For instance, a formatter might produce table-like plain text output, and could return a table-head string (potentially including line breaks) here.
    */
  def getHead(): String = js.native
  /**
    * returns the footer string for the log
    *
    * This can be used to generate a footer string, which by the {@link XLogHandler} is emitted to its output channel before it is finally being closed.
    */
  def getTail(): String = js.native
}

object XLogFormatter {
  @scala.inline
  def apply(
    Head: String,
    Tail: String,
    format: LogRecord => String,
    getHead: () => String,
    getTail: () => String
  ): XLogFormatter = {
    val __obj = js.Dynamic.literal(Head = Head.asInstanceOf[js.Any], Tail = Tail.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), getHead = js.Any.fromFunction0(getHead), getTail = js.Any.fromFunction0(getTail))
    __obj.asInstanceOf[XLogFormatter]
  }
  @scala.inline
  implicit class XLogFormatterOps[Self <: XLogFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHead(value: String): Self = this.set("Head", value.asInstanceOf[js.Any])
    @scala.inline
    def setTail(value: String): Self = this.set("Tail", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: LogRecord => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHead(value: () => String): Self = this.set("getHead", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTail(value: () => String): Self = this.set("getTail", js.Any.fromFunction0(value))
  }
  
}

