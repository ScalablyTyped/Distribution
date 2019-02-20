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

