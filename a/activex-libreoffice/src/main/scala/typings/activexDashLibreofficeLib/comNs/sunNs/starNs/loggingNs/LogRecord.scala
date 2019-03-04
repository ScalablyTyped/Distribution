package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * assembles the complete information about a to-be-logged event
  * @see XLogger
  * @since OOo 2.3
  */
trait LogRecord extends js.Object {
  /**
    * specifies the level of the log event
    * @see LogLevel
    */
  var Level: scala.Double
  var LogTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  var LoggerName: java.lang.String
  var Message: java.lang.String
  /**
    * specifies the number of the log event.
    *
    * Subsequent events get assigned increasing sequence numbers by the {@link XLogger} at which they're logged.
    */
  var SequenceNumber: scala.Double
  /**
    * specifies the name of the class, in which the record was logged.
    *
    * This name might be empty, in case the caller to one of the various `log` methods of {@link XLogger} did not specify it.
    */
  var SourceClassName: java.lang.String
  /**
    * specifies the name of the method, in which the record was logged.
    *
    * This name might be empty, in case the caller to one of the various `log` methods of {@link XLogger} did not specify it.
    */
  var SourceMethodName: java.lang.String
  var ThreadID: java.lang.String
}

object LogRecord {
  @scala.inline
  def apply(
    Level: scala.Double,
    LogTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    LoggerName: java.lang.String,
    Message: java.lang.String,
    SequenceNumber: scala.Double,
    SourceClassName: java.lang.String,
    SourceMethodName: java.lang.String,
    ThreadID: java.lang.String
  ): LogRecord = {
    val __obj = js.Dynamic.literal(Level = Level, LogTime = LogTime, LoggerName = LoggerName, Message = Message, SequenceNumber = SequenceNumber, SourceClassName = SourceClassName, SourceMethodName = SourceMethodName, ThreadID = ThreadID)
  
    __obj.asInstanceOf[LogRecord]
  }
}

