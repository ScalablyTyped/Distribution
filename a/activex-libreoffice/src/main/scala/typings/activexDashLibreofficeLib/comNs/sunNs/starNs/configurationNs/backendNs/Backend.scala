package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a configuration database composed of one or more storage backends containing settings used by software modules.
  *
  * Configuration data is organized into layers which are selected by components and entities.
  *
  * Components are characterized by configuration schemas. A component contains configuration data for a particular application domain or software module.
  *
  * Entities are organized hierarchically in organizations, groups, roles and individual users. Each element of the associated hierarchy corresponds to a
  * layer that applies to an entity.
  *
  * A layer contains data for multiple components associated to a single entity.
  * @since OOo 1.1.2
  */
trait Backend
  extends XSchemaSupplier
     with XBackend
     with XBackendEntities

object Backend {
  @scala.inline
  def apply(
    AdminEntity: java.lang.String,
    OwnerEntity: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getAdminEntity: js.Function0[java.lang.String],
    getComponentSchema: js.Function1[java.lang.String, XSchema],
    getOwnUpdateHandler: js.Function1[java.lang.String, XUpdateHandler],
    getOwnerEntity: js.Function0[java.lang.String],
    getUpdateHandler: js.Function2[java.lang.String, java.lang.String, XUpdateHandler],
    isEqualEntity: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    listLayers: js.Function2[java.lang.String, java.lang.String, activexDashInteropLib.SafeArray[XLayer]],
    listOwnLayers: js.Function1[java.lang.String, activexDashInteropLib.SafeArray[XLayer]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    supportsEntity: js.Function1[java.lang.String, scala.Boolean]
  ): Backend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdminEntity")(AdminEntity)
    __obj.updateDynamic("OwnerEntity")(OwnerEntity)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAdminEntity")(getAdminEntity)
    __obj.updateDynamic("getComponentSchema")(getComponentSchema)
    __obj.updateDynamic("getOwnUpdateHandler")(getOwnUpdateHandler)
    __obj.updateDynamic("getOwnerEntity")(getOwnerEntity)
    __obj.updateDynamic("getUpdateHandler")(getUpdateHandler)
    __obj.updateDynamic("isEqualEntity")(isEqualEntity)
    __obj.updateDynamic("listLayers")(listLayers)
    __obj.updateDynamic("listOwnLayers")(listOwnLayers)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("supportsEntity")(supportsEntity)
    __obj.asInstanceOf[Backend]
  }
}

