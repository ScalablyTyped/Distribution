package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A listener for configuration changes is called when it has been registered at the configuration controller and a configuration change occurs. */
trait XConfigurationChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * The exact time of when a listener is called (before the change takes place, during the change, or when the change has been made) depends on the change
    * event. The order in which listeners are called is the order in which they are registered (First registered, first called.)
    */
  def notifyConfigurationChange(aEvent: ConfigurationChangeEvent): scala.Unit
}

object XConfigurationChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    notifyConfigurationChange: js.Function1[ConfigurationChangeEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XConfigurationChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, notifyConfigurationChange = notifyConfigurationChange, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XConfigurationChangeListener]
  }
}

