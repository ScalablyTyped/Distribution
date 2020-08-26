package typings.activexLibreoffice.com_.sun.star.logging

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implemented by a log handler whose output channel is the processes console.
  *
  * Note that a console handler will ignore its formatter's head and tail, since it cannot decided whether they should be emitted on `stdout` or `stderr`
  * .
  * @since OOo 2.3
  */
@js.native
trait XConsoleHandler extends XLogHandler {
  /**
    * denotes the {@link LogLevel} threshold used to determine to which console the events should be logged.
    *
    * Events with a level greater or equal to `Threshold` will be logged to `stderr` , all others to `stdout` .
    *
    * The default value for this attribute is {@link LogLevel.SEVERE} .
    */
  var Threshold: Double = js.native
}

object XConsoleHandler {
  @scala.inline
  def apply(
    Encoding: String,
    Formatter: XLogFormatter,
    Level: Double,
    Threshold: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    flush: () => Unit,
    publish: LogRecord => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XConsoleHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], Formatter = Formatter.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), flush = js.Any.fromFunction0(flush), publish = js.Any.fromFunction1(publish), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XConsoleHandler]
  }
  @scala.inline
  implicit class XConsoleHandlerOps[Self <: XConsoleHandler] (val x: Self) extends AnyVal {
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
    def setThreshold(value: Double): Self = this.set("Threshold", value.asInstanceOf[js.Any])
  }
  
}

