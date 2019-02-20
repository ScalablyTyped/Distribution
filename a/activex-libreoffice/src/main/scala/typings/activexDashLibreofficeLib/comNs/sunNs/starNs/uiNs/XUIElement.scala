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

