package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to handle a volatile function result.
  * @see com.sun.star.sheet.VolatileResult
  * @see com.sun.star.sheet.ResultEvent
  */
trait XVolatileResult
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds a listener to be notified when a new value is available. */
  def addResultListener(aListener: XResultListener): scala.Unit
  /** removes the specified listener. */
  def removeResultListener(aListener: XResultListener): scala.Unit
}

object XVolatileResult {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addResultListener: XResultListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeResultListener: XResultListener => scala.Unit
  ): XVolatileResult = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addResultListener = js.Any.fromFunction1(addResultListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeResultListener = js.Any.fromFunction1(removeResultListener))
  
    __obj.asInstanceOf[XVolatileResult]
  }
}

