package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to an XPropertySet of defaults. This can either be the parent of an XPropertySet or the global property defaults for a
  * document.
  */
trait XDefaultsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** This method returns an XPropertySet of defaults. */
  val Defaults: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** This method returns an XPropertySet of defaults. */
  def getDefaults(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XDefaultsSupplier {
  @scala.inline
  def apply(
    Defaults: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: () => scala.Unit,
    getDefaults: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDefaultsSupplier = {
    val __obj = js.Dynamic.literal(Defaults = Defaults, acquire = js.Any.fromFunction0(acquire), getDefaults = js.Any.fromFunction0(getDefaults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDefaultsSupplier]
  }
}

