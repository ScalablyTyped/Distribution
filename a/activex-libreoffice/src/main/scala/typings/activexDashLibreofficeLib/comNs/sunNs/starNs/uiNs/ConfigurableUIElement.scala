package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

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
  var Persistent: scala.Boolean
}

object ConfigurableUIElement {
  @scala.inline
  def apply(
    ConfigurationSource: XUIConfigurationManager,
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    Persistent: scala.Boolean,
    RealInterface: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ResourceURL: java.lang.String,
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getRealInterface: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getSettings: js.Function1[
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
    ],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setSettings: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, scala.Unit],
    update: js.Function0[scala.Unit],
    updateSettings: js.Function0[scala.Unit]
  ): ConfigurableUIElement = {
    val __obj = js.Dynamic.literal(ConfigurationSource = ConfigurationSource, Frame = Frame, Persistent = Persistent, RealInterface = RealInterface, ResourceURL = ResourceURL, Type = Type, acquire = acquire, addEventListener = addEventListener, dispose = dispose, getRealInterface = getRealInterface, getSettings = getSettings, initialize = initialize, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setSettings = setSettings, update = update, updateSettings = updateSettings)
  
    __obj.asInstanceOf[ConfigurableUIElement]
  }
}

