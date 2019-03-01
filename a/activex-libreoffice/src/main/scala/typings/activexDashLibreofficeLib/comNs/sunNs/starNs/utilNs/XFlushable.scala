package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects with data that can be flushed to a data source. */
trait XFlushable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified listener to receive event "flushed." */
  def addFlushListener(l: XFlushListener): scala.Unit
  /** flushes the data of the object to the connected data source. */
  def flush(): scala.Unit
  /** removes the specified listener. */
  def removeFlushListener(l: XFlushListener): scala.Unit
}

object XFlushable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addFlushListener: js.Function1[XFlushListener, scala.Unit],
    flush: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeFlushListener: js.Function1[XFlushListener, scala.Unit]
  ): XFlushable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addFlushListener")(addFlushListener)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeFlushListener")(removeFlushListener)
    __obj.asInstanceOf[XFlushable]
  }
}

