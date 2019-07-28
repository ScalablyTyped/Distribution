package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects with data that can be flushed to a data source. */
trait XFlushable extends XInterface {
  /** adds the specified listener to receive event "flushed." */
  def addFlushListener(l: XFlushListener): Unit
  /** flushes the data of the object to the connected data source. */
  def flush(): Unit
  /** removes the specified listener. */
  def removeFlushListener(l: XFlushListener): Unit
}

object XFlushable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addFlushListener: XFlushListener => Unit,
    flush: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeFlushListener: XFlushListener => Unit
  ): XFlushable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFlushListener = js.Any.fromFunction1(removeFlushListener))
  
    __obj.asInstanceOf[XFlushable]
  }
}

