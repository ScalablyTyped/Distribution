package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service allows to log the events in a ring of specified size.
  * @since OOo 3.2
  */
trait SimpleLogRing extends XSimpleLogRing {
  /** creates a ring of default size - 256 messages */
  def create(): scala.Unit
  /**
    * creates a ring of specified size
    * @param nSize the number of messages in a ring
    */
  def createWithSize(nSize: scala.Double): scala.Unit
}

object SimpleLogRing {
  @scala.inline
  def apply(
    CollectedLog: stdLib.SafeArray[java.lang.String],
    create: () => scala.Unit,
    createWithSize: scala.Double => scala.Unit,
    getCollectedLog: () => stdLib.SafeArray[java.lang.String],
    logString: java.lang.String => scala.Unit
  ): SimpleLogRing = {
    val __obj = js.Dynamic.literal(CollectedLog = CollectedLog, create = js.Any.fromFunction0(create), createWithSize = js.Any.fromFunction1(createWithSize), getCollectedLog = js.Any.fromFunction0(getCollectedLog), logString = js.Any.fromFunction1(logString))
  
    __obj.asInstanceOf[SimpleLogRing]
  }
}

