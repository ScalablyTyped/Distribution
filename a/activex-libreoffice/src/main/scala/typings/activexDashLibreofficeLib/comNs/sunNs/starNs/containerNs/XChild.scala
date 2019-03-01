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
    acquire: js.Function0[scala.Unit],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XChild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setParent")(setParent)
    __obj.asInstanceOf[XChild]
  }
}

