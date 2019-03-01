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
    CollectedLog: activexDashInteropLib.SafeArray[java.lang.String],
    create: js.Function0[scala.Unit],
    createWithSize: js.Function1[scala.Double, scala.Unit],
    getCollectedLog: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    logString: js.Function1[java.lang.String, scala.Unit]
  ): SimpleLogRing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CollectedLog")(CollectedLog)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("createWithSize")(createWithSize)
    __obj.updateDynamic("getCollectedLog")(getCollectedLog)
    __obj.updateDynamic("logString")(logString)
    __obj.asInstanceOf[SimpleLogRing]
  }
}

