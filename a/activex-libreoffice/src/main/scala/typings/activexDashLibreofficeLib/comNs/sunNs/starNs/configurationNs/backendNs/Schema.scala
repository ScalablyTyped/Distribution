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

object Schema {
  @scala.inline
  def apply(
    URL: java.lang.String,
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readComponent: XSchemaHandler => scala.Unit,
    readSchema: XSchemaHandler => scala.Unit,
    readTemplates: XSchemaHandler => scala.Unit,
    release: () => scala.Unit
  ): Schema = {
    val __obj = js.Dynamic.literal(URL = URL, acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), readComponent = js.Any.fromFunction1(readComponent), readSchema = js.Any.fromFunction1(readSchema), readTemplates = js.Any.fromFunction1(readTemplates), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[Schema]
  }
}

