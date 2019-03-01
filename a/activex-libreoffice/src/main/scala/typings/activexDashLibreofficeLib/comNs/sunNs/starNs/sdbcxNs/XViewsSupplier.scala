package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of views, typically used for a database definition object. */
trait XViewsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of views.
    * @returns the views
    */
  val Views: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the container of views.
    * @returns the views
    */
  def getViews(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XViewsSupplier {
  @scala.inline
  def apply(
    Views: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getViews: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XViewsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Views")(Views)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getViews")(getViews)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XViewsSupplier]
  }
}

