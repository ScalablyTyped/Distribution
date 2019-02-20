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

