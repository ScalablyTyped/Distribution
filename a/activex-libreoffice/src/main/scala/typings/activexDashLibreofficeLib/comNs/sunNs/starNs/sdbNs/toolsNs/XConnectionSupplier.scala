package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to access the active connection
  * @see com.sun.star.sdbcx.XConnection
  * @since OOo 3.3
  */
trait XConnectionSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /** returns the source connection. */
  var ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
}

object XConnectionSupplier {
  @scala.inline
  def apply(
    ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    acquire: js.Function0[scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XConnectionSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveConnection")(ActiveConnection)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XConnectionSupplier]
  }
}

