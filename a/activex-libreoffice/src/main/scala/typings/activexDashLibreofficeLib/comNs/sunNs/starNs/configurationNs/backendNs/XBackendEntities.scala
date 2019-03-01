package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality relating to common and supported entities for a configuration data backend.
  * @see com.sun.star.configuration.backend.XBackend
  * @see com.sun.star.configuration.backend.XMultiLayerStratum
  * @since OOo 1.1.2
  */
trait XBackendEntities
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides the entity id of an entity for general administrative access.
    *
    * The admin entity is an entity that should be used to read and manage configuration data that applies to all entities within the backend.
    * @returns an entity identifier for the admin entity or an empty string, if there is no entity that can be used for general administrative access.
    */
  val AdminEntity: java.lang.String
  /**
    * provides the entity id of the owner entity of the backend.
    * @returns an entity identifier for the owner entity. The owner entity is the default entity for the backend. For normal configuration data access the owner
    * @see com.sun.star.configuration.backend.XBackend.listOwnLayers()
    * @see com.sun.star.configuration.backend.XBackend.getOwnUpdateHandler()
    */
  val OwnerEntity: java.lang.String
  /**
    * provides the entity id of an entity for general administrative access.
    *
    * The admin entity is an entity that should be used to read and manage configuration data that applies to all entities within the backend.
    * @returns an entity identifier for the admin entity or an empty string, if there is no entity that can be used for general administrative access.
    */
  def getAdminEntity(): java.lang.String
  /**
    * provides the entity id of the owner entity of the backend.
    * @returns an entity identifier for the owner entity. The owner entity is the default entity for the backend. For normal configuration data access the owner
    * @see com.sun.star.configuration.backend.XBackend.listOwnLayers()
    * @see com.sun.star.configuration.backend.XBackend.getOwnUpdateHandler()
    */
  def getOwnerEntity(): java.lang.String
  /**
    * determines, if two given entity ids denote the same entity.
    * @param aEntity The name of an entity.
    * @param aOtherEntity The name of another entity.
    * @returns `TRUE` , if aEntity and aOtherEntity denote the same entity within this backend, `FALSE` otherwise.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the backend.
    * @throws com::sun::star::lang::IllegalArgumentException if either entity does not exist.
    */
  def isEqualEntity(aEntity: java.lang.String, aOtherEntity: java.lang.String): scala.Boolean
  /**
    * determines, if a given entity id exists in this backend.
    * @param aEntity The name of an entity.
    * @returns `TRUE` , if aEntity is a valid, existing entity for this backend, `FALSE` otherwise.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the backend.
    */
  def supportsEntity(aEntity: java.lang.String): scala.Boolean
}

object XBackendEntities {
  @scala.inline
  def apply(
    AdminEntity: java.lang.String,
    OwnerEntity: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getAdminEntity: js.Function0[java.lang.String],
    getOwnerEntity: js.Function0[java.lang.String],
    isEqualEntity: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    supportsEntity: js.Function1[java.lang.String, scala.Boolean]
  ): XBackendEntities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdminEntity")(AdminEntity)
    __obj.updateDynamic("OwnerEntity")(OwnerEntity)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAdminEntity")(getAdminEntity)
    __obj.updateDynamic("getOwnerEntity")(getOwnerEntity)
    __obj.updateDynamic("isEqualEntity")(isEqualEntity)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("supportsEntity")(supportsEntity)
    __obj.asInstanceOf[XBackendEntities]
  }
}

