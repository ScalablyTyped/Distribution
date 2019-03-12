package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the parent of the object.
  *
  * This interface normally is only supported if the objects all have exactly one dedicated parent container.
  */
trait XChild
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** grants access to the object containing this content. */
  var Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** grants access to the object containing this content. */
  def getParent(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * sets the parent to this object.
    * @throws com::sun::star::lang::NoSupportException if the name of this object cannot be changed.
    */
  def setParent(Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
}

object XChild {
  @scala.inline
  def apply(
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    acquire: () => scala.Unit,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit
  ): XChild = {
    val __obj = js.Dynamic.literal(Parent = Parent, acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[XChild]
  }
}

