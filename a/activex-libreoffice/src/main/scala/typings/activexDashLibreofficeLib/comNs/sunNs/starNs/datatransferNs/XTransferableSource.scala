package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The transferable source interface.
  * @see com.sun.star.datatransfer.XTransferable
  */
trait XTransferableSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns A human presentable description of the source that created the transferable object. */
  val DataSourceDescription: java.lang.String
  /** @returns A human presentable description of the source that created the transferable object. */
  def getDataSourceDescription(): java.lang.String
}

