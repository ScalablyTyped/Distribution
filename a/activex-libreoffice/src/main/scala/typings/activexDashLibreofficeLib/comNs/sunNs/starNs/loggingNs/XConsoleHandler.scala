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

