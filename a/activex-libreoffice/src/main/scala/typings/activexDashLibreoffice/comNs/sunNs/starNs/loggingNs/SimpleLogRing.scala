package typings.activexDashLibreoffice.comNs.sunNs.starNs.loggingNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service allows to log the events in a ring of specified size.
  * @since OOo 3.2
  */
trait SimpleLogRing extends XSimpleLogRing {
  /** creates a ring of default size - 256 messages */
  def create(): Unit
  /**
    * creates a ring of specified size
    * @param nSize the number of messages in a ring
    */
  def createWithSize(nSize: Double): Unit
}

object SimpleLogRing {
  @scala.inline
  def apply(
    CollectedLog: SafeArray[String],
    create: () => Unit,
    createWithSize: Double => Unit,
    getCollectedLog: () => SafeArray[String],
    logString: String => Unit
  ): SimpleLogRing = {
    val __obj = js.Dynamic.literal(CollectedLog = CollectedLog, create = js.Any.fromFunction0(create), createWithSize = js.Any.fromFunction1(createWithSize), getCollectedLog = js.Any.fromFunction0(getCollectedLog), logString = js.Any.fromFunction1(logString))
  
    __obj.asInstanceOf[SimpleLogRing]
  }
}

