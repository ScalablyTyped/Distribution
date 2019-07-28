package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloseable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a component. */
trait XComponentSupplier extends XInterface {
  /**
    * allows to get access to a component.
    *
    * The component may not support {@link com.sun.star.lang.XComponent} interface.
    * @returns component representation
    */
  val Component: XCloseable
  /**
    * allows to get access to a component.
    *
    * The component may not support {@link com.sun.star.lang.XComponent} interface.
    * @returns component representation
    */
  def getComponent(): XCloseable
}

object XComponentSupplier {
  @scala.inline
  def apply(
    Component: XCloseable,
    acquire: () => Unit,
    getComponent: () => XCloseable,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentSupplier = {
    val __obj = js.Dynamic.literal(Component = Component, acquire = js.Any.fromFunction0(acquire), getComponent = js.Any.fromFunction0(getComponent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XComponentSupplier]
  }
}

