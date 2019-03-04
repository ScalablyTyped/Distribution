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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readComponent: js.Function1[XSchemaHandler, scala.Unit],
    readSchema: js.Function1[XSchemaHandler, scala.Unit],
    readTemplates: js.Function1[XSchemaHandler, scala.Unit],
    release: js.Function0[scala.Unit]
  ): Schema = {
    val __obj = js.Dynamic.literal(URL = URL, acquire = acquire, queryInterface = queryInterface, readComponent = readComponent, readSchema = readSchema, readTemplates = readTemplates, release = release)
  
    __obj.asInstanceOf[Schema]
  }
}

