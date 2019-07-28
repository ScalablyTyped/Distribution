package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XFrame
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XUIElement extends XInterface {
  /**
    * determines the document frame to which this element is bound to.
    *
    * The life time of a user interface element does not explicitly depend on the frame itself but on the visible component attached to the frame. It is
    * possible to exchange the visible component of a frame and that will lead to the end of life of all user interface elements.
    */
  var Frame: XFrame
  /**
    * returns an interface to get access to user interface type specific functions.
    * @returns a special purpose interface which depends on the type of the user interface element.
    */
  val RealInterface: XInterface
  /** a resource URL which is a unique identifier of a user interface element. */
  var ResourceURL: String
  /**
    * determines the type of the user interface element.
    * @see UIElementType
    */
  var Type: Double
  /**
    * returns an interface to get access to user interface type specific functions.
    * @returns a special purpose interface which depends on the type of the user interface element.
    */
  def getRealInterface(): XInterface
}

object XUIElement {
  @scala.inline
  def apply(
    Frame: XFrame,
    RealInterface: XInterface,
    ResourceURL: String,
    Type: Double,
    acquire: () => Unit,
    getRealInterface: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUIElement = {
    val __obj = js.Dynamic.literal(Frame = Frame, RealInterface = RealInterface, ResourceURL = ResourceURL, Type = Type, acquire = js.Any.fromFunction0(acquire), getRealInterface = js.Any.fromFunction0(getRealInterface), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUIElement]
  }
}

