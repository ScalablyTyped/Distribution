package typings.activexLibreoffice.com_.sun.star.logging

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides possibilities to send LogRecords to an arbitrary output channel.
  * @see XLogger
  * @since OOo 2.3
  */
@js.native
trait XLogHandler extends XComponent {
  /**
    * specifies MIME charset name for the encoding to be used by this handler
    *
    * It depends on the concrete handler implementation whether or not this parameter is needed.
    * @see http://www.iana.org/assignments/character-sets
    */
  var Encoding: String = js.native
  /** specifies the formatter to be used by this handler. */
  var Formatter: XLogFormatter = js.native
  /**
    * specifies the log level of this handler
    *
    * Different handlers can have different log levels, which again might be different from the log level of the {@link XLogger} for which the handlers are
    * used.
    */
  var Level: Double = js.native
  /**
    * flushes all buffered output of the handler
    *
    * Log handlers are allowed to buffer their output. Upon `flush` being called, they must flush all their buffers.
    */
  def flush(): Unit = js.native
  /**
    * publish the given log record at the handler's output channel.
    * @returns `TRUE` if and only if the record was actually published. A handler will not publish a record if its log level doesn't meet the handler's log leve
    */
  def publish(Record: LogRecord): Boolean = js.native
}

object XLogHandler {
  @scala.inline
  def apply(
    Encoding: String,
    Formatter: XLogFormatter,
    Level: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    flush: () => Unit,
    publish: LogRecord => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XLogHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], Formatter = Formatter.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), flush = js.Any.fromFunction0(flush), publish = js.Any.fromFunction1(publish), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XLogHandler]
  }
  @scala.inline
  implicit class XLogHandlerOps[Self <: XLogHandler] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("Encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatter(value: XLogFormatter): Self = this.set("Formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("Level", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setPublish(value: LogRecord => Boolean): Self = this.set("publish", js.Any.fromFunction1(value))
  }
  
}

