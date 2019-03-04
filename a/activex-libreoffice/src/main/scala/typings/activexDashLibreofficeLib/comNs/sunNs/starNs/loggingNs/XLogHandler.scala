package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides possibilities to send LogRecords to an arbitrary output channel.
  * @see XLogger
  * @since OOo 2.3
  */
trait XLogHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * specifies MIME charset name for the encoding to be used by this handler
    *
    * It depends on the concrete handler implementation whether or not this parameter is needed.
    * @see http://www.iana.org/assignments/character-sets
    */
  var Encoding: java.lang.String
  /** specifies the formatter to be used by this handler. */
  var Formatter: XLogFormatter
  /**
    * specifies the log level of this handler
    *
    * Different handlers can have different log levels, which again might be different from the log level of the {@link XLogger} for which the handlers are
    * used.
    */
  var Level: scala.Double
  /**
    * flushes all buffered output of the handler
    *
    * Log handlers are allowed to buffer their output. Upon `flush` being called, they must flush all their buffers.
    */
  def flush(): scala.Unit
  /**
    * publish the given log record at the handler's output channel.
    * @returns `TRUE` if and only if the record was actually published. A handler will not publish a record if its log level doesn't meet the handler's log leve
    */
  def publish(Record: LogRecord): scala.Boolean
}

object XLogHandler {
  @scala.inline
  def apply(
    Encoding: java.lang.String,
    Formatter: XLogFormatter,
    Level: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    publish: js.Function1[LogRecord, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XLogHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding, Formatter = Formatter, Level = Level, acquire = acquire, addEventListener = addEventListener, dispose = dispose, flush = flush, publish = publish, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XLogHandler]
  }
}

