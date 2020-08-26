package typings.activexLibreoffice.com_.sun.star.logging

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
@js.native
trait PlainTextFormatter extends XLogFormatter {
  def create(): Unit = js.native
}

object PlainTextFormatter {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class PlainTextFormatterOps[Self <: PlainTextFormatter] (val x: Self) extends AnyVal {
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
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
  }
  
}

