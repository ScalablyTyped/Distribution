package typings.activexLibreoffice.com_.sun.star.logging

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a simple log ring allowing to collect a limited number of last events
  *
  * The intention of this interface is to provide a simple possibility for developer to collect the most important events without affecting the
  * performance. For this reasons the messages related API is quite simple, the strings should be produced by the preprocessor mainly.
  * @since OOo 3.2
  */
trait XSimpleLogRing extends StObject {
  
  /**
    * allows to get the collected messages from the logger
    *
    * It is up to logger implementation to provide only the limited number of last messages.
    */
  val CollectedLog: SafeArray[String]
  
  /**
    * allows to get the collected messages from the logger
    *
    * It is up to logger implementation to provide only the limited number of last messages.
    */
  def getCollectedLog(): SafeArray[String]
  
  /** allows to add a message to the logger */
  def logString(aMessage: String): Unit
}
object XSimpleLogRing {
  
  @scala.inline
  def apply(
    CollectedLog: SafeArray[String],
    getCollectedLog: () => SafeArray[String],
    logString: String => Unit
  ): XSimpleLogRing = {
    val __obj = js.Dynamic.literal(CollectedLog = CollectedLog.asInstanceOf[js.Any], getCollectedLog = js.Any.fromFunction0(getCollectedLog), logString = js.Any.fromFunction1(logString))
    __obj.asInstanceOf[XSimpleLogRing]
  }
  
  @scala.inline
  implicit class XSimpleLogRingMutableBuilder[Self <: XSimpleLogRing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectedLog(value: SafeArray[String]): Self = StObject.set(x, "CollectedLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCollectedLog(value: () => SafeArray[String]): Self = StObject.set(x, "getCollectedLog", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogString(value: String => Unit): Self = StObject.set(x, "logString", js.Any.fromFunction1(value))
  }
}
