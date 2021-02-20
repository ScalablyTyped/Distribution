package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.frame.XFrame
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a configurable user interface element that supports persistence.
  *
  * Configurable user interface elements are: menubarpopupmenutoolbarstatusbar
  * @since OOo 2.0
  */
@js.native
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
  var ConfigurationSource: XUIConfigurationManager = js.native
  
  /** specifies if the user interface element stores changes of its structure to its creator source defined by the property {@link ConfigurationSource} . */
  var Persistent: Boolean = js.native
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
    val __obj = js.Dynamic.literal(ConfigurationSource = ConfigurationSource.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Persistent = Persistent.asInstanceOf[js.Any], RealInterface = RealInterface.asInstanceOf[js.Any], ResourceURL = ResourceURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getRealInterface = js.Any.fromFunction0(getRealInterface), getSettings = js.Any.fromFunction1(getSettings), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setSettings = js.Any.fromFunction1(setSettings), update = js.Any.fromFunction0(update), updateSettings = js.Any.fromFunction0(updateSettings))
    __obj.asInstanceOf[ConfigurableUIElement]
  }
  
  @scala.inline
  implicit class ConfigurableUIElementMutableBuilder[Self <: ConfigurableUIElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSource(value: XUIConfigurationManager): Self = StObject.set(x, "ConfigurationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "Persistent", value.asInstanceOf[js.Any])
  }
}
