package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functionality relating to common and supported entities for a configuration data backend.
  * @see com.sun.star.configuration.backend.XBackend
  * @see com.sun.star.configuration.backend.XMultiLayerStratum
  * @since OOo 1.1.2
  */
trait XBackendEntities
  extends StObject
     with XInterface {
  
  /**
    * provides the entity id of an entity for general administrative access.
    *
    * The admin entity is an entity that should be used to read and manage configuration data that applies to all entities within the backend.
    * @returns an entity identifier for the admin entity or an empty string, if there is no entity that can be used for general administrative access.
    */
  val AdminEntity: String
  
  /**
    * provides the entity id of the owner entity of the backend.
    * @returns an entity identifier for the owner entity. The owner entity is the default entity for the backend. For normal configuration data access the owner
    * @see com.sun.star.configuration.backend.XBackend.listOwnLayers()
    * @see com.sun.star.configuration.backend.XBackend.getOwnUpdateHandler()
    */
  val OwnerEntity: String
  
  /**
    * provides the entity id of an entity for general administrative access.
    *
    * The admin entity is an entity that should be used to read and manage configuration data that applies to all entities within the backend.
    * @returns an entity identifier for the admin entity or an empty string, if there is no entity that can be used for general administrative access.
    */
  def getAdminEntity(): String
  
  /**
    * provides the entity id of the owner entity of the backend.
    * @returns an entity identifier for the owner entity. The owner entity is the default entity for the backend. For normal configuration data access the owner
    * @see com.sun.star.configuration.backend.XBackend.listOwnLayers()
    * @see com.sun.star.configuration.backend.XBackend.getOwnUpdateHandler()
    */
  def getOwnerEntity(): String
  
  /**
    * determines, if two given entity ids denote the same entity.
    * @param aEntity The name of an entity.
    * @param aOtherEntity The name of another entity.
    * @returns `TRUE` , if aEntity and aOtherEntity denote the same entity within this backend, `FALSE` otherwise.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the backend.
    * @throws com::sun::star::lang::IllegalArgumentException if either entity does not exist.
    */
  def isEqualEntity(aEntity: String, aOtherEntity: String): Boolean
  
  /**
    * determines, if a given entity id exists in this backend.
    * @param aEntity The name of an entity.
    * @returns `TRUE` , if aEntity is a valid, existing entity for this backend, `FALSE` otherwise.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the backend.
    */
  def supportsEntity(aEntity: String): Boolean
}
object XBackendEntities {
  
  @scala.inline
  def apply(
    AdminEntity: String,
    OwnerEntity: String,
    acquire: () => Unit,
    getAdminEntity: () => String,
    getOwnerEntity: () => String,
    isEqualEntity: (String, String) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    supportsEntity: String => Boolean
  ): XBackendEntities = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity.asInstanceOf[js.Any], OwnerEntity = OwnerEntity.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAdminEntity = js.Any.fromFunction0(getAdminEntity), getOwnerEntity = js.Any.fromFunction0(getOwnerEntity), isEqualEntity = js.Any.fromFunction2(isEqualEntity), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsEntity = js.Any.fromFunction1(supportsEntity))
    __obj.asInstanceOf[XBackendEntities]
  }
  
  @scala.inline
  implicit class XBackendEntitiesMutableBuilder[Self <: XBackendEntities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminEntity(value: String): Self = StObject.set(x, "AdminEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAdminEntity(value: () => String): Self = StObject.set(x, "getAdminEntity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnerEntity(value: () => String): Self = StObject.set(x, "getOwnerEntity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEqualEntity(value: (String, String) => Boolean): Self = StObject.set(x, "isEqualEntity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOwnerEntity(value: String): Self = StObject.set(x, "OwnerEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsEntity(value: String => Boolean): Self = StObject.set(x, "supportsEntity", js.Any.fromFunction1(value))
  }
}
