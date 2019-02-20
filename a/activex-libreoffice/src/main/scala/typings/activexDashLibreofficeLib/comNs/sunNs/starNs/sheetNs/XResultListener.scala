package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows notification when a new volatile function result is available.
  * @see com.sun.star.sheet.XVolatileResult
  */
trait XResultListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called when a new value is available. */
  def modified(aEvent: ResultEvent): scala.Unit
}

