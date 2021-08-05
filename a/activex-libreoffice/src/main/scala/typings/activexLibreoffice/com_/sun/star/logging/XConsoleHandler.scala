package typings.activexLibreoffice.com_.sun.star.logging

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implemented by a log handler whose output channel is the processes console.
  *
  * Note that a console handler will ignore its formatter's head and tail, since it cannot decided whether they should be emitted on `stdout` or `stderr`
  * .
  * @since OOo 2.3
  */
trait XConsoleHandler
  extends StObject
     with XLogHandler {
  
  /**
    * denotes the {@link LogLevel} threshold used to determine to which console the events should be logged.
    *
    * Events with a level greater or equal to `Threshold` will be logged to `stderr` , all others to `stdout` .
    *
    * The default value for this attribute is {@link LogLevel.SEVERE} .
    */
  var Threshold: Double
}
object XConsoleHandler {
  
  inline def apply(
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
  
  extension [Self <: XConsoleHandler](x: Self) {
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
  }
}
