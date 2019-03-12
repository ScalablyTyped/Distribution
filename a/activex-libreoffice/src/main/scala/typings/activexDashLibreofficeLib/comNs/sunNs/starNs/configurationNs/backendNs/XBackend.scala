package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates an update handler for the owner entity layer for a component.
    * @param aComponent component whose data will be updated
    * @returns an object allowing manipulation of the component data for the current entity
    * @see com.sun.star.configuration.backend.XBackendEntities.getOwnerEntity()
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid
    * @throws com::sun::star::lang::NoSupportException if updates are not supported for this backend
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getOwnUpdateHandler(aComponent: java.lang.String): XUpdateHandler
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
  def getUpdateHandler(aComponent: java.lang.String, aEntity: java.lang.String): XUpdateHandler
  /**
    * retrieves the layers associated to an entity for a component.
    * @param aComponent component whose data will be accessed
    * @param aEntity entity whose data will be accessed
    * @returns a list of objects allowing access to the component data for each layer associated with the entity.
    * @see com.sun.star.configuration.backend.XBackendEntities.supportsEntity()
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid or if the entity doesn't exist.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def listLayers(aComponent: java.lang.String, aEntity: java.lang.String): stdLib.SafeArray[XLayer]
  /**
    * retrieves the layers associated to the owner entity for a component.
    * @param aComponent component whose data will be accessed
    * @returns a list of objects allowing access to the component data for each layer associated to the current entity
    * @see com.sun.star.configuration.backend.XBackendEntities.getOwnerEntity()
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def listOwnLayers(aComponent: java.lang.String): stdLib.SafeArray[XLayer]
}

object XBackend {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getOwnUpdateHandler: java.lang.String => XUpdateHandler,
    getUpdateHandler: (java.lang.String, java.lang.String) => XUpdateHandler,
    listLayers: (java.lang.String, java.lang.String) => stdLib.SafeArray[XLayer],
    listOwnLayers: java.lang.String => stdLib.SafeArray[XLayer],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XBackend = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getOwnUpdateHandler = js.Any.fromFunction1(getOwnUpdateHandler), getUpdateHandler = js.Any.fromFunction2(getUpdateHandler), listLayers = js.Any.fromFunction2(listLayers), listOwnLayers = js.Any.fromFunction1(listOwnLayers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBackend]
  }
}

