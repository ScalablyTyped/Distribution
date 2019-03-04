package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives load-related events from a loadable object.
  *
  * The interface is typically implemented by data-bound components, which want to listen to the data source that contains their database form.
  * @see com.sun.star.form.XLoadable
  * @see DataAwareControlModel
  */
trait XLoadListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when the object has successfully connected to a datasource.
    * @param aEvent the event happened.
    */
  def loaded(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is invoked when the object has been reloaded.
    * @param aEvent the event happened.
    */
  def reloaded(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is invoked when the object is about to be reloaded.
    *
    * Components may use this to stop any other event processing related to the event source until they get the reloaded event.
    * @param aEvent the event happened.
    */
  def reloading(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is invoked after the object has disconnected from a datasource.
    * @param aEvent the event happened.
    */
  def unloaded(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is invoked when the object is about to be unloaded.
    *
    * Components may use this to stop any other event processing related to the event source before the object is unloaded.
    * @param aEvent the event happened.
    */
  def unloading(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XLoadListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    loaded: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reloaded: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    reloading: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    unloaded: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    unloading: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XLoadListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, loaded = loaded, queryInterface = queryInterface, release = release, reloaded = reloaded, reloading = reloading, unloaded = unloaded, unloading = unloading)
  
    __obj.asInstanceOf[XLoadListener]
  }
}

