package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XFrame
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XUpdatable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a user interface element.
  *
  * A user interface element consists of a unique identifier and a type specifier. It provides an interface to retrieve a special purpose interface which
  * depends on the specific user interface element type. Every user interface must be initialized before it can be used.
  * @since OOo 2.0
  */
trait UIElement
  extends XUIElement
     with XInitialization
     with XUpdatable
     with XComponent

object UIElement {
  @scala.inline
  def apply(
    Frame: XFrame,
    RealInterface: XInterface,
    ResourceURL: String,
    Type: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getRealInterface: () => XInterface,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    update: () => Unit
  ): UIElement = {
    val __obj = js.Dynamic.literal(Frame = Frame, RealInterface = RealInterface, ResourceURL = ResourceURL, Type = Type, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getRealInterface = js.Any.fromFunction0(getRealInterface), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[UIElement]
  }
}

