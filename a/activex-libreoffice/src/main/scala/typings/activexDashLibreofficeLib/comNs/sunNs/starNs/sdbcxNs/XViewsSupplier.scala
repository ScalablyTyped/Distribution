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
    acquire: () => scala.Unit,
    getViews: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XViewsSupplier = {
    val __obj = js.Dynamic.literal(Views = Views, acquire = js.Any.fromFunction0(acquire), getViews = js.Any.fromFunction0(getViews), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XViewsSupplier]
  }
}

