package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The transferable source interface.
  * @see com.sun.star.datatransfer.XTransferable
  */
trait XTransferableSource extends XInterface {
  /** @returns A human presentable description of the source that created the transferable object. */
  val DataSourceDescription: String
  /** @returns A human presentable description of the source that created the transferable object. */
  def getDataSourceDescription(): String
}

object XTransferableSource {
  @scala.inline
  def apply(
    DataSourceDescription: String,
    acquire: () => Unit,
    getDataSourceDescription: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransferableSource = {
    val __obj = js.Dynamic.literal(DataSourceDescription = DataSourceDescription, acquire = js.Any.fromFunction0(acquire), getDataSourceDescription = js.Any.fromFunction0(getDataSourceDescription), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTransferableSource]
  }
}

