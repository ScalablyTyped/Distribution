package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** receives events which get fired whenever the state of a bound property is changed. */
trait XPropertyStateChangeListener extends XEventListener {
  /**
    * is called when a bound property's state is changed.
    * @param aEvent describes the event source and the property that has changed.
    */
  def propertyStateChange(aEvent: PropertyStateChangeEvent): Unit
}

object XPropertyStateChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    propertyStateChange: PropertyStateChangeEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertyStateChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), propertyStateChange = js.Any.fromFunction1(propertyStateChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPropertyStateChangeListener]
  }
}

