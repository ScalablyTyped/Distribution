package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides read only access to a configuration component schema.
  *
  * A component is a set of hierarchically organized and semantically related configuration settings, e.g StarWriter settings.
  *
  * A component schema contains two separate sections, one which describes the templates to be used in the dynamic containers (sets) of the component and
  * one which describes the component's data structure.
  * @see com.sun.star.configuration.backend.Layer Service providing access to individual configuration data for an entity.
  * @since OOo 1.1.2
  */
trait Schema extends XSchema {
  /**
    * The URL of the layer data.
    * @since OOo 2.0
    */
  var URL: java.lang.String
}

