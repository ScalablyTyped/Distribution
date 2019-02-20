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

