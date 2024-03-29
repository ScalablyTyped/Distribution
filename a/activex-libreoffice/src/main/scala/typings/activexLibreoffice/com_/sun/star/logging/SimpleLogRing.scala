package typings.activexLibreoffice.com_.sun.star.logging

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service allows to log the events in a ring of specified size.
  * @since OOo 3.2
  */
trait SimpleLogRing
  extends StObject
     with XSimpleLogRing {
  
  /** creates a ring of default size - 256 messages */
  def create(): Unit
  
  /**
    * creates a ring of specified size
    * @param nSize the number of messages in a ring
    */
  def createWithSize(nSize: Double): Unit
}
object SimpleLogRing {
  
  inline def apply(
    CollectedLog: SafeArray[String],
    create: () => Unit,
    createWithSize: Double => Unit,
    getCollectedLog: () => SafeArray[String],
    logString: String => Unit
  ): SimpleLogRing = {
    val __obj = js.Dynamic.literal(CollectedLog = CollectedLog.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), createWithSize = js.Any.fromFunction1(createWithSize), getCollectedLog = js.Any.fromFunction0(getCollectedLog), logString = js.Any.fromFunction1(logString))
    __obj.asInstanceOf[SimpleLogRing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleLogRing] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setCreateWithSize(value: Double => Unit): Self = StObject.set(x, "createWithSize", js.Any.fromFunction1(value))
  }
}
