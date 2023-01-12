package typings.activexLibreoffice.com_.sun.star.logging

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides possibilities to send LogRecords to an arbitrary output channel.
  * @see XLogger
  * @since OOo 2.3
  */
trait XLogHandler
  extends StObject
     with XComponent {
  
  /**
    * specifies MIME charset name for the encoding to be used by this handler
    *
    * It depends on the concrete handler implementation whether or not this parameter is needed.
    * @see http://www.iana.org/assignments/character-sets
    */
  var Encoding: String
  
  /** specifies the formatter to be used by this handler. */
  var Formatter: XLogFormatter
  
  /**
    * specifies the log level of this handler
    *
    * Different handlers can have different log levels, which again might be different from the log level of the {@link XLogger} for which the handlers are
    * used.
    */
  var Level: Double
  
  /**
    * flushes all buffered output of the handler
    *
    * Log handlers are allowed to buffer their output. Upon `flush` being called, they must flush all their buffers.
    */
  def flush(): Unit
  
  /**
    * publish the given log record at the handler's output channel.
    * @returns `TRUE` if and only if the record was actually published. A handler will not publish a record if its log level doesn't meet the handler's log leve
    */
  def publish(Record: LogRecord): Boolean
}
object XLogHandler {
  
  inline def apply(
    Encoding: String,
    Formatter: XLogFormatter,
    Level: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    flush: () => Unit,
    publish: LogRecord => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XLogHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], Formatter = Formatter.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), flush = js.Any.fromFunction0(flush), publish = js.Any.fromFunction1(publish), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XLogHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XLogHandler] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setFormatter(value: XLogFormatter): Self = StObject.set(x, "Formatter", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setPublish(value: LogRecord => Boolean): Self = StObject.set(x, "publish", js.Any.fromFunction1(value))
  }
}
