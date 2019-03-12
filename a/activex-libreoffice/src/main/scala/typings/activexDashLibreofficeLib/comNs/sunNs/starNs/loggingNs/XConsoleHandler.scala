package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

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
trait XConsoleHandler extends XLogHandler {
  /**
    * denotes the {@link LogLevel} threshold used to determine to which console the events should be logged.
    *
    * Events with a level greater or equal to `Threshold` will be logged to `stderr` , all others to `stdout` .
    *
    * The default value for this attribute is {@link LogLevel.SEVERE} .
    */
  var Threshold: scala.Double
}

object XConsoleHandler {
  @scala.inline
  def apply(
    Encoding: java.lang.String,
    Formatter: XLogFormatter,
    Level: scala.Double,
    Threshold: scala.Double,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    flush: () => scala.Unit,
    publish: LogRecord => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): XConsoleHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding, Formatter = Formatter, Level = Level, Threshold = Threshold, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), flush = js.Any.fromFunction0(flush), publish = js.Any.fromFunction1(publish), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XConsoleHandler]
  }
}

