package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a configuration storage backends containing a complete configuration database, including user data, default or policy layers and schemata.
  *
  * Configuration data is organized into layers which are selected by components and entities.
  *
  * Components are characterized by configuration schemas. A component contains configuration data for a particular application domain or software module.
  *
  * Entities are organized hierarchically in organizations, groups, roles and individual users. Each element of the associated hierarchy corresponds to a
  * layer that applies to an entity.
  *
  * Layers contains data for multiple components associated to a single entity.
  * @since OOo 1.1.2
  */
trait SingleBackend
  extends XSchemaSupplier
     with XMultiLayerStratum
     with XBackendEntities

object SingleBackend {
  @scala.inline
  def apply(
    AdminEntity: java.lang.String,
    OwnerEntity: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getAdminEntity: js.Function0[java.lang.String],
    getComponentSchema: js.Function1[java.lang.String, XSchema],
    getLayer: js.Function2[java.lang.String, java.lang.String, XLayer],
    getLayers: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      activexDashInteropLib.SafeArray[XLayer]
    ],
    getMultipleLayers: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[XLayer]
    ],
    getOwnerEntity: js.Function0[java.lang.String],
    getUpdatableLayer: js.Function1[java.lang.String, XUpdatableLayer],
    getUpdateLayerId: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    isEqualEntity: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    listLayerIds: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    supportsEntity: js.Function1[java.lang.String, scala.Boolean]
  ): SingleBackend = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity, OwnerEntity = OwnerEntity, acquire = acquire, getAdminEntity = getAdminEntity, getComponentSchema = getComponentSchema, getLayer = getLayer, getLayers = getLayers, getMultipleLayers = getMultipleLayers, getOwnerEntity = getOwnerEntity, getUpdatableLayer = getUpdatableLayer, getUpdateLayerId = getUpdateLayerId, isEqualEntity = isEqualEntity, listLayerIds = listLayerIds, queryInterface = queryInterface, release = release, supportsEntity = supportsEntity)
  
    __obj.asInstanceOf[SingleBackend]
  }
}

