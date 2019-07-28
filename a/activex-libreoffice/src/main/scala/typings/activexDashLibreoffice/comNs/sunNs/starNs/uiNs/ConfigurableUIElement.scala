package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XFrame
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a configurable user interface element that supports persistence.
  *
  * Configurable user interface elements are: menubarpopupmenutoolbarstatusbar
  * @since OOo 2.0
  */
trait ConfigurableUIElement
  extends UIElement
     with XUIElementSettings {
  /**
    * specifies the configuration source of this user interface element.
    *
    * If the property {@link Persistent} is `TRUE` changes on the structure of the user interface element are written back to configuration source. When
    * this property is changed, afterwards {@link XUIElementSettings.updateSettings()} must be called so the user interface element tries to retrieve its
    * settings from the new user interface configuration manager.
    */
  var ConfigurationSource: XUIConfigurationManager
  /** specifies if the user interface element stores changes of its structure to its creator source defined by the property {@link ConfigurationSource} . */
  var Persistent: Boolean
}

object ConfigurableUIElement {
  @scala.inline
  def apply(
    ConfigurationSource: XUIConfigurationManager,
    Frame: XFrame,
    Persistent: Boolean,
    RealInterface: XInterface,
    ResourceURL: String,
    Type: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getRealInterface: () => XInterface,
    getSettings: Boolean => XIndexAccess,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setSettings: XIndexAccess => Unit,
    update: () => Unit,
    updateSettings: () => Unit
  ): ConfigurableUIElement = {
    val __obj = js.Dynamic.literal(ConfigurationSource = ConfigurationSource, Frame = Frame, Persistent = Persistent, RealInterface = RealInterface, ResourceURL = ResourceURL, Type = Type, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getRealInterface = js.Any.fromFunction0(getRealInterface), getSettings = js.Any.fromFunction1(getSettings), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setSettings = js.Any.fromFunction1(setSettings), update = js.Any.fromFunction0(update), updateSettings = js.Any.fromFunction0(updateSettings))
  
    __obj.asInstanceOf[ConfigurableUIElement]
  }
}

