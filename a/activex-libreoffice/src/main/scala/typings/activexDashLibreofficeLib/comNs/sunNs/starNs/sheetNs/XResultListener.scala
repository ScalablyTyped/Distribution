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

object XResultListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    modified: js.Function1[ResultEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, modified = modified, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XResultListener]
  }
}

