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
    acquire: () => scala.Unit,
    addFlushListener: XFlushListener => scala.Unit,
    flush: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeFlushListener: XFlushListener => scala.Unit
  ): XFlushable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFlushListener = js.Any.fromFunction1(removeFlushListener))
  
    __obj.asInstanceOf[XFlushable]
  }
}

