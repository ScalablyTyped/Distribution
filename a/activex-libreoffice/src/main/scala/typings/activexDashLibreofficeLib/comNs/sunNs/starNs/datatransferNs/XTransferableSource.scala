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

object XTransferableSource {
  @scala.inline
  def apply(
    DataSourceDescription: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getDataSourceDescription: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTransferableSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DataSourceDescription")(DataSourceDescription)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDataSourceDescription")(getDataSourceDescription)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTransferableSource]
  }
}

