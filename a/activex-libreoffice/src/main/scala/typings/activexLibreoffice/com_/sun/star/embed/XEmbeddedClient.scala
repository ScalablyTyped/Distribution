package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.XCloseable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents common functionality for embedded clients. */
trait XEmbeddedClient
  extends StObject
     with XComponentSupplier {
  
  /**
    * asks client to let the object store itself.
    * @throws com::sun::star::uno::ObjectSaveVetoException in case container chants to avoid saving of object
    * @throws com::sun::star::uno::Exception in case of problems during saving
    */
  def saveObject(): Unit
  
  /**
    * An object can use this method to notify the client when the object outplace window becomes visible or invisible.
    * @param bVisible visibility state of the window
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def visibilityChanged(bVisible: Boolean): Unit
}
object XEmbeddedClient {
  
  inline def apply(
    Component: XCloseable,
    acquire: () => Unit,
    getComponent: () => XCloseable,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    saveObject: () => Unit,
    visibilityChanged: Boolean => Unit
  ): XEmbeddedClient = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getComponent = js.Any.fromFunction0(getComponent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), saveObject = js.Any.fromFunction0(saveObject), visibilityChanged = js.Any.fromFunction1(visibilityChanged))
    __obj.asInstanceOf[XEmbeddedClient]
  }
  
  extension [Self <: XEmbeddedClient](x: Self) {
    
    inline def setSaveObject(value: () => Unit): Self = StObject.set(x, "saveObject", js.Any.fromFunction0(value))
    
    inline def setVisibilityChanged(value: Boolean => Unit): Self = StObject.set(x, "visibilityChanged", js.Any.fromFunction1(value))
  }
}
