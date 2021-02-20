package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Backend
  extends XSchemaSupplier
     with XBackend
     with XBackendEntities
object Backend {
  
  @scala.inline
  def apply(
    AdminEntity: String,
    OwnerEntity: String,
    acquire: () => Unit,
    getAdminEntity: () => String,
    getComponentSchema: String => XSchema,
    getOwnUpdateHandler: String => XUpdateHandler,
    getOwnerEntity: () => String,
    getUpdateHandler: (String, String) => XUpdateHandler,
    isEqualEntity: (String, String) => Boolean,
    listLayers: (String, String) => SafeArray[XLayer],
    listOwnLayers: String => SafeArray[XLayer],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    supportsEntity: String => Boolean
  ): Backend = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity.asInstanceOf[js.Any], OwnerEntity = OwnerEntity.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAdminEntity = js.Any.fromFunction0(getAdminEntity), getComponentSchema = js.Any.fromFunction1(getComponentSchema), getOwnUpdateHandler = js.Any.fromFunction1(getOwnUpdateHandler), getOwnerEntity = js.Any.fromFunction0(getOwnerEntity), getUpdateHandler = js.Any.fromFunction2(getUpdateHandler), isEqualEntity = js.Any.fromFunction2(isEqualEntity), listLayers = js.Any.fromFunction2(listLayers), listOwnLayers = js.Any.fromFunction1(listOwnLayers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsEntity = js.Any.fromFunction1(supportsEntity))
    __obj.asInstanceOf[Backend]
  }
}
