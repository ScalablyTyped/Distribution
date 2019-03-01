package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a function to retrieve a special purpose interface dependent on the user interface element type.
  *
  * The type of the interface depends on the real type of the user interface element. A menubar user interface element provides access to its
  * com::sun::star::awt::XSystemDependentMenuBarPeer which supports to retrieve the system dependent menu handle. A floating window or a toolbar user
  * interface element return a {@link com.sun.star.awt.XWindow} interface.
  */
trait XUIElement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * determines the document frame to which this element is bound to.
    *
    * The life time of a user interface element does not explicitly depend on the frame itself but on the visible component attached to the frame. It is
    * possible to exchange the visible component of a frame and that will lead to the end of life of all user interface elements.
    */
  var Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame
  /**
    * returns an interface to get access to user interface type specific functions.
    * @returns a special purpose interface which depends on the type of the user interface element.
    */
  val RealInterface: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** a resource URL which is a unique identifier of a user interface element. */
  var ResourceURL: java.lang.String
  /**
    * determines the type of the user interface element.
    * @see UIElementType
    */
  var Type: scala.Double
  /**
    * returns an interface to get access to user interface type specific functions.
    * @returns a special purpose interface which depends on the type of the user interface element.
    */
  def getRealInterface(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

object XUIElement {
  @scala.inline
  def apply(
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    RealInterface: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ResourceURL: java.lang.String,
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    getRealInterface: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUIElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Frame")(Frame)
    __obj.updateDynamic("RealInterface")(RealInterface)
    __obj.updateDynamic("ResourceURL")(ResourceURL)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getRealInterface")(getRealInterface)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XUIElement]
  }
}

