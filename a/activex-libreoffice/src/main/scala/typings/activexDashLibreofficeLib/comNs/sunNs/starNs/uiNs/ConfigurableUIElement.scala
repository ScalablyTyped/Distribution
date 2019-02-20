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

