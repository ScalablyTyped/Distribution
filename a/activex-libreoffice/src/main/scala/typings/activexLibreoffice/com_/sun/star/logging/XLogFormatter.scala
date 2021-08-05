package typings.activexLibreoffice.com_.sun.star.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the interface to be used for formatting log records
  * @see XLogHandler
  * @since OOo 2.3
  */
trait XLogFormatter extends StObject {
  
  /**
    * returns the header string for the log
    *
    * This can be used to generate a header string, which by the {@link XLogHandler} is emitted to its output channel before actually logging any concrete
    * {@link LogRecord} .
    *
    * For instance, a formatter might produce table-like plain text output, and could return a table-head string (potentially including line breaks) here.
    */
  val Head: String
  
  /**
    * returns the footer string for the log
    *
    * This can be used to generate a footer string, which by the {@link XLogHandler} is emitted to its output channel before it is finally being closed.
    */
  val Tail: String
  
  /**
    * formats the given log record for output
    *
    * A {@link XLogHandler} will call this method to format a given log record. The resulting string will be emitted to the handler's output channel,
    * without processing it any further (except possibly encoding it with the handler's `Encoding` ).
    */
  def format(Record: LogRecord): String
  
  /**
    * returns the header string for the log
    *
    * This can be used to generate a header string, which by the {@link XLogHandler} is emitted to its output channel before actually logging any concrete
    * {@link LogRecord} .
    *
    * For instance, a formatter might produce table-like plain text output, and could return a table-head string (potentially including line breaks) here.
    */
  def getHead(): String
  
  /**
    * returns the footer string for the log
    *
    * This can be used to generate a footer string, which by the {@link XLogHandler} is emitted to its output channel before it is finally being closed.
    */
  def getTail(): String
}
object XLogFormatter {
  
  inline def apply(
    Head: String,
    Tail: String,
    format: LogRecord => String,
    getHead: () => String,
    getTail: () => String
  ): XLogFormatter = {
    val __obj = js.Dynamic.literal(Head = Head.asInstanceOf[js.Any], Tail = Tail.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), getHead = js.Any.fromFunction0(getHead), getTail = js.Any.fromFunction0(getTail))
    __obj.asInstanceOf[XLogFormatter]
  }
  
  extension [Self <: XLogFormatter](x: Self) {
    
    inline def setFormat(value: LogRecord => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setGetHead(value: () => String): Self = StObject.set(x, "getHead", js.Any.fromFunction0(value))
    
    inline def setGetTail(value: () => String): Self = StObject.set(x, "getTail", js.Any.fromFunction0(value))
    
    inline def setHead(value: String): Self = StObject.set(x, "Head", value.asInstanceOf[js.Any])
    
    inline def setTail(value: String): Self = StObject.set(x, "Tail", value.asInstanceOf[js.Any])
  }
}
