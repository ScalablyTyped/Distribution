package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * to be implemented by components which wish to be notified about changes in the style of a component
  * @see XStyleSettings
  */
trait XStyleChangeListener extends XEventListener {
  def styleSettingsChanged(Event: EventObject): Unit
}

object XStyleChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    styleSettingsChanged: EventObject => Unit
  ): XStyleChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), styleSettingsChanged = js.Any.fromFunction1(styleSettingsChanged))
  
    __obj.asInstanceOf[XStyleChangeListener]
  }
}

