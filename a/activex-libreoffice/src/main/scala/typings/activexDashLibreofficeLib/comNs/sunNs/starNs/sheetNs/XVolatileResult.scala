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

