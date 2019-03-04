package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * to be implemented by components which wish to be notified about changes in the style of a component
  * @see XStyleSettings
  */
trait XStyleChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  def styleSettingsChanged(Event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XStyleChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    styleSettingsChanged: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XStyleChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, styleSettingsChanged = styleSettingsChanged)
  
    __obj.asInstanceOf[XStyleChangeListener]
  }
}

