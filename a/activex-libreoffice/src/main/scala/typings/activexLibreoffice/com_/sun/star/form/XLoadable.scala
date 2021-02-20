package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to implement objects which may be loaded.
  *
  * The object is typically implemented by high-level objects which can connect to a data source.
  * @see XLoadListener
  */
@js.native
trait XLoadable extends XInterface {
  
  /**
    * adds the specified listener to receive load-related events
    * @param aListener the listener to add.
    */
  def addLoadListener(aListener: XLoadListener): Unit = js.native
  
  /** returns if the object is in loaded state. */
  def isLoaded(): Boolean = js.native
  
  /**
    * loads the data.
    *
    * If the data is already loaded (->isLoaded), then the method returns silently. In this case, you should use ->reload.
    */
  def load(): Unit = js.native
  
  /**
    * does a smart refresh of the object.
    *
    * The final state will be the same as if unload and load were called, but reload is the more efficient way to do the same. If the object isn't loaded,
    * nothing happens.
    */
  def reload(): Unit = js.native
  
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    */
  def removeLoadListener(aListener: XLoadListener): Unit = js.native
  
  /** unloads the data. */
  def unload(): Unit = js.native
}
object XLoadable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addLoadListener: XLoadListener => Unit,
    isLoaded: () => Boolean,
    load: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: () => Unit,
    removeLoadListener: XLoadListener => Unit,
    unload: () => Unit
  ): XLoadable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addLoadListener = js.Any.fromFunction1(addLoadListener), isLoaded = js.Any.fromFunction0(isLoaded), load = js.Any.fromFunction0(load), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeLoadListener = js.Any.fromFunction1(removeLoadListener), unload = js.Any.fromFunction0(unload))
    __obj.asInstanceOf[XLoadable]
  }
  
  @scala.inline
  implicit class XLoadableMutableBuilder[Self <: XLoadable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLoadListener(value: XLoadListener => Unit): Self = StObject.set(x, "addLoadListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLoaded(value: () => Boolean): Self = StObject.set(x, "isLoaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveLoadListener(value: XLoadListener => Unit): Self = StObject.set(x, "removeLoadListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnload(value: () => Unit): Self = StObject.set(x, "unload", js.Any.fromFunction0(value))
  }
}
