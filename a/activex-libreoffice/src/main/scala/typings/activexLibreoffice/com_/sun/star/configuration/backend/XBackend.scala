package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles access to layered data stored in a repository.
  *
  * Data can be retrieved on behalf of one or more entities.
  *
  * There is an implied owner entity associated to the object when it is created. This entity should be used for normal data access. For administrative
  * operations data of other entities can be accessed.
  * @see com.sun.star.configuration.backend.XBackendEntities
  * @see com.sun.star.configuration.backend.XSchemaSupplier
  * @since OOo 1.1.2
  */
trait XBackend
  extends StObject
     with XInterface {
  
  /**
    * creates an update handler for the owner entity layer for a component.
    * @param aComponent component whose data will be updated
    * @returns an object allowing manipulation of the component data for the current entity
    * @see com.sun.star.configuration.backend.XBackendEntities.getOwnerEntity()
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid
    * @throws com::sun::star::lang::NoSupportException if updates are not supported for this backend
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getOwnUpdateHandler(aComponent: String): XUpdateHandler
  
  /**
    * creates an update handler on an entity's layer for a component.
    * @param aComponent component whose data will be updated
    * @param aEntity entity whose data will be updated
    * @returns an object allowing manipulation of the component data for the entity
    * @see com.sun.star.configuration.backend.XBackendEntities.supportsEntity()
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid or if the entity doesn't exist.
    * @throws com::sun::star::lang::NoSupportException if updates are not supported for this backend
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getUpdateHandler(aComponent: String, aEntity: String): XUpdateHandler
  
  /**
    * retrieves the layers associated to an entity for a component.
    * @param aComponent component whose data will be accessed
    * @param aEntity entity whose data will be accessed
    * @returns a list of objects allowing access to the component data for each layer associated with the entity.
    * @see com.sun.star.configuration.backend.XBackendEntities.supportsEntity()
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid or if the entity doesn't exist.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def listLayers(aComponent: String, aEntity: String): SafeArray[XLayer]
  
  /**
    * retrieves the layers associated to the owner entity for a component.
    * @param aComponent component whose data will be accessed
    * @returns a list of objects allowing access to the component data for each layer associated to the current entity
    * @see com.sun.star.configuration.backend.XBackendEntities.getOwnerEntity()
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def listOwnLayers(aComponent: String): SafeArray[XLayer]
}
object XBackend {
  
  inline def apply(
    acquire: () => Unit,
    getOwnUpdateHandler: String => XUpdateHandler,
    getUpdateHandler: (String, String) => XUpdateHandler,
    listLayers: (String, String) => SafeArray[XLayer],
    listOwnLayers: String => SafeArray[XLayer],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBackend = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getOwnUpdateHandler = js.Any.fromFunction1(getOwnUpdateHandler), getUpdateHandler = js.Any.fromFunction2(getUpdateHandler), listLayers = js.Any.fromFunction2(listLayers), listOwnLayers = js.Any.fromFunction1(listOwnLayers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBackend]
  }
  
  extension [Self <: XBackend](x: Self) {
    
    inline def setGetOwnUpdateHandler(value: String => XUpdateHandler): Self = StObject.set(x, "getOwnUpdateHandler", js.Any.fromFunction1(value))
    
    inline def setGetUpdateHandler(value: (String, String) => XUpdateHandler): Self = StObject.set(x, "getUpdateHandler", js.Any.fromFunction2(value))
    
    inline def setListLayers(value: (String, String) => SafeArray[XLayer]): Self = StObject.set(x, "listLayers", js.Any.fromFunction2(value))
    
    inline def setListOwnLayers(value: String => SafeArray[XLayer]): Self = StObject.set(x, "listOwnLayers", js.Any.fromFunction1(value))
  }
}
