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

