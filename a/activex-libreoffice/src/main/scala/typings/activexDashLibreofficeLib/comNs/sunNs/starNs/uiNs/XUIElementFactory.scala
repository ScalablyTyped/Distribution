package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a user interface element factory that can create and initialize user interface elements.
  *
  * User interface element factories must be registered at a {@link UIElementFactoryManager} service to provide access to itself.
  *
  * Currently the following user interface element types are defined: **menubar** A configurable user interface element.**popupmenu** A configurable user
  * interface element.**toolbar** A configurable user interface element.**statusbar** A configurable user interface element.**floater** A basic user
  * interface element.
  * @since OOo 2.0
  */
trait XUIElementFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a new instances of a specific user interface element.
    * @param ResourceURL specifies which unique user interface element should be created by the factory. A resource URL must meet the following syntax: "priva
    * @param Args The following arguments are supported: **Frame**;  specifies the {@link com.sun.star.frame.XFrame} instance to which the user interface elem
    * @see ConfigurableUIElement
    * @see UIElement
    */
  def createUIElement(
    ResourceURL: java.lang.String,
    Args: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): XUIElement
}

object XUIElementFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createUIElement: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XUIElement
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUIElementFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire, createUIElement = createUIElement, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XUIElementFactory]
  }
}

