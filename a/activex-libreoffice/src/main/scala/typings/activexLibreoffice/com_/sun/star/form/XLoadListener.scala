package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives load-related events from a loadable object.
  *
  * The interface is typically implemented by data-bound components, which want to listen to the data source that contains their database form.
  * @see com.sun.star.form.XLoadable
  * @see DataAwareControlModel
  */
@js.native
trait XLoadListener extends XEventListener {
  
  /**
    * is invoked when the object has successfully connected to a datasource.
    * @param aEvent the event happened.
    */
  def loaded(aEvent: EventObject): Unit = js.native
  
  /**
    * is invoked when the object has been reloaded.
    * @param aEvent the event happened.
    */
  def reloaded(aEvent: EventObject): Unit = js.native
  
  /**
    * is invoked when the object is about to be reloaded.
    *
    * Components may use this to stop any other event processing related to the event source until they get the reloaded event.
    * @param aEvent the event happened.
    */
  def reloading(aEvent: EventObject): Unit = js.native
  
  /**
    * is invoked after the object has disconnected from a datasource.
    * @param aEvent the event happened.
    */
  def unloaded(aEvent: EventObject): Unit = js.native
  
  /**
    * is invoked when the object is about to be unloaded.
    *
    * Components may use this to stop any other event processing related to the event source before the object is unloaded.
    * @param aEvent the event happened.
    */
  def unloading(aEvent: EventObject): Unit = js.native
}
object XLoadListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    loaded: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reloaded: EventObject => Unit,
    reloading: EventObject => Unit,
    unloaded: EventObject => Unit,
    unloading: EventObject => Unit
  ): XLoadListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), loaded = js.Any.fromFunction1(loaded), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reloaded = js.Any.fromFunction1(reloaded), reloading = js.Any.fromFunction1(reloading), unloaded = js.Any.fromFunction1(unloaded), unloading = js.Any.fromFunction1(unloading))
    __obj.asInstanceOf[XLoadListener]
  }
  
  @scala.inline
  implicit class XLoadListenerOps[Self <: XLoadListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoaded(value: EventObject => Unit): Self = this.set("loaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReloaded(value: EventObject => Unit): Self = this.set("reloaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReloading(value: EventObject => Unit): Self = this.set("reloading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnloaded(value: EventObject => Unit): Self = this.set("unloaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnloading(value: EventObject => Unit): Self = this.set("unloading", js.Any.fromFunction1(value))
  }
}
