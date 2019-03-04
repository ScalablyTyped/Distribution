package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a component. */
trait XComponentSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows to get access to a component.
    *
    * The component may not support {@link com.sun.star.lang.XComponent} interface.
    * @returns component representation
    */
  val Component: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable
  /**
    * allows to get access to a component.
    *
    * The component may not support {@link com.sun.star.lang.XComponent} interface.
    * @returns component representation
    */
  def getComponent(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable
}

object XComponentSupplier {
  @scala.inline
  def apply(
    Component: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable,
    acquire: js.Function0[scala.Unit],
    getComponent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XComponentSupplier = {
    val __obj = js.Dynamic.literal(Component = Component, acquire = acquire, getComponent = getComponent, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XComponentSupplier]
  }
}

