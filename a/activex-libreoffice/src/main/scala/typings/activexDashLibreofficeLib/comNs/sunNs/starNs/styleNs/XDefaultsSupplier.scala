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

