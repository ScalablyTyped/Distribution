package typings.activexLibreoffice.com_.sun.star.logging

import typings.activexLibreoffice.com_.sun.star.util.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * assembles the complete information about a to-be-logged event
  * @see XLogger
  * @since OOo 2.3
  */
trait LogRecord extends StObject {
  
  /**
    * specifies the level of the log event
    * @see LogLevel
    */
  var Level: Double
  
  var LogTime: DateTime
  
  var LoggerName: String
  
  var Message: String
  
  /**
    * specifies the number of the log event.
    *
    * Subsequent events get assigned increasing sequence numbers by the {@link XLogger} at which they're logged.
    */
  var SequenceNumber: Double
  
  /**
    * specifies the name of the class, in which the record was logged.
    *
    * This name might be empty, in case the caller to one of the various `log` methods of {@link XLogger} did not specify it.
    */
  var SourceClassName: String
  
  /**
    * specifies the name of the method, in which the record was logged.
    *
    * This name might be empty, in case the caller to one of the various `log` methods of {@link XLogger} did not specify it.
    */
  var SourceMethodName: String
  
  var ThreadID: String
}
object LogRecord {
  
  @scala.inline
  def apply(
    Level: Double,
    LogTime: DateTime,
    LoggerName: String,
    Message: String,
    SequenceNumber: Double,
    SourceClassName: String,
    SourceMethodName: String,
    ThreadID: String
  ): LogRecord = {
    val __obj = js.Dynamic.literal(Level = Level.asInstanceOf[js.Any], LogTime = LogTime.asInstanceOf[js.Any], LoggerName = LoggerName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], SourceClassName = SourceClassName.asInstanceOf[js.Any], SourceMethodName = SourceMethodName.asInstanceOf[js.Any], ThreadID = ThreadID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogRecord]
  }
  
  @scala.inline
  implicit class LogRecordMutableBuilder[Self <: LogRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTime(value: DateTime): Self = StObject.set(x, "LogTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerName(value: String): Self = StObject.set(x, "LoggerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: Double): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceClassName(value: String): Self = StObject.set(x, "SourceClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMethodName(value: String): Self = StObject.set(x, "SourceMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadID(value: String): Self = StObject.set(x, "ThreadID", value.asInstanceOf[js.Any])
  }
}
